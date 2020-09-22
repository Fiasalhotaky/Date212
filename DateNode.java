
public class DateNode {
	Date212 data;
	DateNode next;
	  public DateNode(Date212 d) {
		 this.data = d;
		 this.next = null;
	}
	public String toString() {
		return this.data.getDate();
	} 
	

}
