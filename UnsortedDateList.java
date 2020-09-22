public class UnsortedDateList extends DateList {
	//adds new node to the list
	public void  add(String date) {
		Date212 x = new Date212(date);
		add(x);
	}
	public String toString() {
		String result = "";
		for (DateNode i = first.next; i != null; i = i.next)
		{
			result += i.toString() + "\n";
		}
		return result;
	}

	public void add(Date212 d) {
		DateNode x = new DateNode(d); 
		last.next = x;
		last = x;
	}
}
