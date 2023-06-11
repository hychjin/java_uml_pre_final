package pre_final_Qz03_prac4;
import java.util.Scanner;

public class SManager {
	Scanner scan;
	int index=0;
	Member sarr[];
	
	public SManager(int n) {
		sarr = new Member[n];
		scan = new Scanner(System.in);
	}
	public void ini(LManager lm) {
		sarr[index++] = new Student("Student", index,	"JinHC",	lm.findById(1),	"Computer Science");
		sarr[index++] = new Student("Student", index,	"KimAD",	lm.findById(3),	"Medical");
		sarr[index++] = new Student("Student", index,	"ChoiSJ",	lm.findById(4),	"Physic");
		sarr[index++] = new Student("Student", index,	"KimKY",	lm.findById(2),	"Mechatronic");
		sarr[index++] = new Researcher("Researcher",index, "FUCKIN", lm.findById(2), "TUKOREA");
	}
	public void showAll() {
		for(int i=0; i<index; i++) {
			sarr[i].showData();
		}
	}
	public void showResearcher() {
		for(int i=0; i<index; i++) {
			if(sarr[i].iden.equals("Researcher")) {
				sarr[i].showData();
			}
		}
	}
	public void showStudent() {
		for(int i=0; i<index; i++) {
			if(sarr[i].iden.equals("Student")) {
				sarr[i].showData();
			}
		}
	}
	public void addStudent(LManager lm) {
		String name, major;
		int lid;
		System.out.println("자동생성된 ID : "+(index+1));
		System.out.print("NAME : "); 				name = scan.next();
		System.out.print("LAB (0 FOR NO LAB) : "); 			
		lm.showAll();								lid = scan.nextInt();
		System.out.print("MAJOR : "); 				major = scan.next();
		if(lid != 0) {
			Lab lab = lm.findById(lid);
			if(lab != null) {
				sarr[index++] = new Student("Student", index, name, lab, major);
				return;
			}
			System.out.println("WRONG LAB ID, CONSIDER YOU DO NOT BELONG TO THE LAB");
		}
		sarr[index++] = new Student("Student", index, name, null, major);
	}
	public void addResearcher(LManager lm) {
		String name, org;
		int lid;
		System.out.println("자동생성된 ID : "+(index+1));
		System.out.print("NAME : "); 				name = scan.next();
		System.out.print("LAB (0 FOR NO LAB) : "); 			
		lm.showAll();								lid = scan.nextInt();
		System.out.print("ORGANIZATION : "); 		org = scan.next();
		if(lid != 0) {
			Lab lab = lm.findById(lid);
			if(lab != null) {
				sarr[index++] = new Researcher("Researcher", index, name, lab, org);
				return;
			}
			System.out.println("WRONG LAB ID, CONSIDER YOU DO NOT BELONG TO THE LAB");
		}
		sarr[index++] = new Researcher("Researcher", index, name, null, org);
	}
	public void searchMemberByName() {
		String name;
		int a=0;
		System.out.print("NAME : "); name = scan.next();
		for(int i=0;i<index;i++) {
			if(sarr[i].name.equals(name)) {
				sarr[i].showData();
				a=1;
				break;
			}
			else a=2;
		}
		if(a==2) {
			System.out.println("NO SUCH STUDENT");
		}
	}
	public void showByLab(LManager lm) {
		int lid;
		int a=0;
		lm.showAll();
		System.out.print("LAB ID : ");	lid = scan.nextInt();
		for(int i=0;i<index;i++) {
			if(sarr[i].lab.equals(lm.findById(lid))) {
				sarr[i].showData();
				a=1;
			}
		}
		if(a!=1) System.out.println("NO MEMBER EXIST");
	}
}
