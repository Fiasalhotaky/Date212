
//Fiasal Hotaky
public abstract class DateList {
	//first node in the linked list
	  protected DateNode first;
	//last node in the linked list
	    protected DateNode last;
    public DateList() {
	      DateNode example = new DateNode( new Date212( "20120101"));
	      first = example;
	      last = example;
	}
  public abstract void add(Date212 d);
  
}
