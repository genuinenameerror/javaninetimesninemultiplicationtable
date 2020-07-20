package ninetimesninemultiplicationtable;
import java.util.Scanner;
// 자바는 메서드명은 소문자 클래스명은 대문자로 시작 권장 
public class ninetimesninemultiplicationtableMain {
	public static void main(String[] args) {	
		System.out.println("");
		System.out.println("몇 단부터 출력할까요? ");
		Scanner scanner = new Scanner(System.in); 
		int newnumber = scanner.nextInt(); // 입력된 정수값 저장 
		System.out.println("입력된 수 : " + newnumber);
		if (newnumber <2) {
			System.out.println("잘못 입력했습니다");
			
		}
		else if (newnumber>9) {
			System.out.println("잘못 입력했습니다");
		}
		else {
			int[] k = ninetimesninemultiplicationtable.calculate(newnumber);
			ninetimesninemultiplicationtable.print(k);
			System.out.println(" ");
			System.out.println("전체 구구단");
			for (int i=2;i<10;i++) {
				int[] general = ninetimesninemultiplicationtable.calculate(i);
				ninetimesninemultiplicationtable.print(general);
			}
		}
	}	

}
