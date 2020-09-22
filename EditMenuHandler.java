
import javax.swing.*;
import java.awt.event.*;
public class EditMenuHandler implements ActionListener {
	DateGui jframe;
	SortedDateList sorted;
	UnsortedDateList unsorted;
	public EditMenuHandler (DateGui jf) {
		jframe = jf;
	}
	public void actionPerformed(ActionEvent event) {
		String  menuName;
		menuName = event.getActionCommand();
		if (menuName.equals("Input"))
			insert(); //calls the insert method if input is selected
		else if (menuName.equals("Quit"))
			System.exit(0);

	} //actionPerformed 
	public void insert() {
		String Date = JOptionPane.showInputDialog( "Please insert a date:");
		try { //works only if date is valid
			jframe.sorted.add(Date);
			jframe.unsorted.add(Date);
			jframe.printToRight();
			jframe.printToLeft(); 
		} catch (Date212Exception e) { //if date is invalid
			System.err.println("Hey bad date: " + Date); //err makes the letters in console red (like an error)
		}
	}

}