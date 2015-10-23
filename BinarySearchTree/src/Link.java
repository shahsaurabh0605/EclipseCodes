
public class Link {
	public Link left;
	public Link right;
	public Link parent;
	int data;
	public Link(int val){
		data= val;
	}
	public void display(int val){
		System.out.println(val);
	}
}
