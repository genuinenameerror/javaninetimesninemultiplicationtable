package ninetimesninemultiplicationtable;
import java.util.Scanner;
// 자바는 메서드명은 소문자 클래스명은 대문자로 시작 권장 
public class ninetimesninemultiplicationtableMain {
	public static void main(String[] args) {	
		System.out.println("");
		System.out.println("몇 단을 출력할까요? ");
		Scanner scanner = new Scanner(System.in); 
//		int newnumber = scanner.nextInt(); // 입력된 정수값 저장 
		String inputStr = scanner.nextLine();
		
		System.out.println("입력된 수 : " + inputStr);
		String[] splitValues = inputStr.split(",");
		int newnumber = Integer.parseInt(splitValues[0]);
		int newnumber1 = Integer.parseInt(splitValues[1]);
		
//		if (newnumber <2) {
//			System.out.println("잘못 입력했습니다");
//			
//		}
//		else if (newnumber>9) {
//			System.out.println("잘못 입력했습니다");
//		}
//		else {
//			int[] k = ninetimesninemultiplicationtable.calculate(newnumber);
//			ninetimesninemultiplicationtable.print(k);
//			System.out.println(" ");
			System.out.println(newnumber + " x " + newnumber1 + "단 출력");
			for (int i=2;i<newnumber+1;i++) {
				int[] general = ninetimesninemultiplicationtable.calculate(i,newnumber1);
				ninetimesninemultiplicationtable.print(general);
			}
//		}
	}	
}
