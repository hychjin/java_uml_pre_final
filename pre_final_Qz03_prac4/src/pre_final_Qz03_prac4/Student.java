package pre_final_Qz03_prac4;

public class Student extends Member{
	String name,major;
	int id;
	Lab lab;
	String iden;
	public Student(String _iden, int _id, String _name, Lab _lab, String _major) {
		super(_iden, _id,_name,_lab);
		major = _major;
	}
	public String getMajor() {return major;}
	public String getIden() {return iden;}
	public void showIden() {
		System.out.println(getIden()+"\t"+getId()+"\t"+getName()+"\t"+getLab().name+"\t"+getMajor());
	}
	public void showData() {
		System.out.println(getId()+"\t"+getName()+"\t"+getLab().name+"\t"+getMajor());
	}
}
