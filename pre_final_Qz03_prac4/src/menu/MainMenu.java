package menu;
import java.util.Scanner;

public class MainMenu {
	int sel;
	Scanner scan;
	
	public MainMenu() {
		scan = new Scanner(System.in);
	}

	public int issue() {
		System.out.println("--------menu-------");
		System.out.println("1.학생 멤버 추가");
		System.out.println("2.학생 멤버 목록 출력");
		System.out.println("3.연구원 멤버 추가");
		System.out.println("4.연구원 멤버 목록 출력");
		System.out.println("5.멤버 조회");
		System.out.println("6.전체 멤버 목록 출력");
		System.out.println("7.LAB 추가");
		System.out.println("8.LAB 목록 출력");
		System.out.println("9.LAB별 멤버 목록 출력");

		System.out.println("0.종료");
		System.out.println("-------------------");
		System.out.print("선택>> ");	sel = scan.nextInt();
		return sel;
	}
}
