package member;

import lab.Lab;

public class Member {
	int id;
	String name;
	Lab lab;
	String iden;
	
	public Member(String _iden, int _id, String _name, Lab _lab) {
		iden = _iden;
		id = _id;
		name = _name;
		lab = _lab;
	}
	public int getId() {return id;}
	public String getName() {return name;}
	public Lab getLab() {return lab;}
	public void showData() {
		
	}
}
