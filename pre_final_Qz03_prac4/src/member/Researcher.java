package member;
import lab.Lab;

public class Researcher extends Member{
	int id;
	String name, org;
	Lab lab;
	String iden;
	
	public Researcher(String _iden, int _id, String _name, Lab _lab, String _org) {
		super(_iden,_id, _name, _lab);
		org = _org;
	}
	public String getOrg() {return org;}
	public String getIden() {return iden;}
	public void showData() {
		System.out.println(getId()+"\t"+getName()+"\t"+getLab().getName()+"\t"+getOrg());
	}
	public void showIden() {
		System.out.println(getIden()+"\t"+getId()+"\t"+getName()+"\t"+getLab().getName()+"\t"+getOrg());
	}
}
