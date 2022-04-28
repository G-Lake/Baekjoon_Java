import java.util.Scanner;

public class ¸·´ë±â_1094 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int[] binArr = new int[7];
		int cnt =0;
		
		for(int i = 0; i<7; i++) {
			binArr[i]=num %2;
			num/=2;
		}
		
		for(int i=0; i<7; i++) {
			if(binArr[i] == 1)
				cnt++;
		}
		System.out.print(cnt);

	}

}
