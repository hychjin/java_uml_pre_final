package pre_final_Qz03_prac4;
import java.util.Scanner;

public class LManager {
	Scanner scan;
	Lab larr[];
	int index=0;
	public LManager(int n) {
		larr = new Lab[n];
		scan = new Scanner(System.in);
	}
	public void ini() {
		larr[index++] = new Lab(1, "OO Lab");
		larr[index++] = new Lab(2, "THEONE");
		larr[index++] = new Lab(3, "MEVIUS");
		larr[index++] = new Lab(4, "MALBORO");
		sortById();
	}
	public Lab findById(int n) {
		for(int i=0; i<index; i++) {
			if(larr[i].id==n) {
				return larr[i];
			}
		}return null;
	}
	public void sortById() {
		for(int i=0; i<index; i++) {
			for(int j=index-1; j>0; j--) {
				if(larr[j].id<larr[j-1].id) {
					Lab l = larr[j];
					larr[j] = larr[j-1];
					larr[j-1] = l;
				}
			}
		}
	}
	public void showAll() {
		for(int i = 0; i < index; i++) {
			larr[i].showData();
		}
	}
	public void addLab() {
		String name;
		int id = index+1;
		System.out.println("GENERATED ID = "+id);
		System.out.print("NAME : "); name = scan.next();
		larr[index++] = new Lab(id, name);
		System.out.println("ADD SUCCESS");
	}
}
