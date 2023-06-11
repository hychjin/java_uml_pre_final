package pre_final_Qz03_prac4;

public class Qz03 {
	public static void main(String[] args) {
		int sel;
		MainMenu mm = new MainMenu();
		LManager lm = new LManager(10);	lm.ini();
		MemberManager sm = new MemberManager(50);	sm.ini(lm);
		while(true) {
			switch(sel = mm.issue()) {
			case 1:
				sm.addStudent(lm);//done
				break;
			case 2:
				sm.showStudent();//done
				break;
			case 3://연구원 추가
				sm.addResearcher(lm);
				break;
			case 4://연구원 목록 출력
				sm.showResearcher();
				break;
			case 5:
				sm.searchMemberByName();
				break;
			case 6:
				sm.showAll();//done
				break;
			case 7:
				lm.addLab();
				break;
			case 8:
				lm.showAll();//done
				break;
			case 9:
				sm.showByLab(lm);
				break;
			case 0:
				System.out.println("==>EXIT...");
				return;
			default:
					System.out.println("==>"+sel+": illegal selection.");
					break;
				
			}
		}
	}
}
