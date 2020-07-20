package ninetimesninemultiplicationtable;


public class ninetimesninemultiplicationtable {
	public static int[] calculate(int times) { // 계산 저장
		int[] result = new int[9];		
		for (int n=0; n<result.length;n++) {
			result[n]= times * (n+1);
//				s[n]= m + " x " + (n+1) + " = " + k[n];							
		}		
		return result;		
	}
	public static void print(int[] result) { // 화면에 출력
		String[] st = new String[9];
		for (int n=0; n<result.length;n++) {
			st[n] = result[n]/(n+1) + " x " + (n+1) + " = " + result[n];
			System.out.println(st[n]);
		}		
	}

}
