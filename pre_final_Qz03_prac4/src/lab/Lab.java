package lab;

public class Lab {
	int id;
	String name;
	
	public Lab() {}
	public Lab(int _id, String _name) {
		id = _id;
		name = _name;
	}
	public String getName() {return name;}
	public int getId() {return id;}
	public void showData() {
		System.out.println(getId()+"\t"+getName());
	}
}
