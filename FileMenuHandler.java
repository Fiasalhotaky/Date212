
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
public class FileMenuHandler implements ActionListener {
   DateGui jframe;
   SortedDateList sorted;
	UnsortedDateList unsorted;
   public FileMenuHandler (DateGui jf) {
      jframe = jf;
   }
   public void actionPerformed(ActionEvent event) {
      String  menuName;
      menuName = event.getActionCommand();
      if (menuName.equals("Open"))
         openFile(); 
      else if (menuName.equals("Quit"))
         System.exit(0);
   } //actionPerformed

    private void openFile( ) {
       JFileChooser chooser;
       int          status;
       chooser = new JFileChooser( );
       status = chooser.showOpenDialog(null);
       if (status == JFileChooser.APPROVE_OPTION) 
          readSource(chooser.getSelectedFile());
       else 
          JOptionPane.showMessageDialog(null, "Open File dialog canceled");
    } //openFile
   
    private void readSource(File chosenFile) {
    		jframe.readFile(chosenFile.getAbsolutePath());
    		// now call print to left
    		jframe.printToLeft();
    		// print to right
    		jframe.printToRight();
    		
    		jframe.setVisible(true);  
    } //while
   //   jframe.setVisible(true);
     
    }
