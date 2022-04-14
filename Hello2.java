import java.util.Scanner;

public class Hello2 { //빈 삼각형 별찍기
	public static void main(String[] args) {
		int inputNumber;
		int cnt=1;
		int center;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("높이 입력 : ");
		inputNumber=sc.nextInt();
		sc.close();
		center=inputNumber-1;
		
		for(int i=0;i<inputNumber;i++) {
			for(int j=0;j<inputNumber*2-1;j++) {
				if(j>center-cnt && j<center+cnt) {
					if(inputNumber==cnt) //마지막 줄 출력
						System.out.print("*");
					else if(j>center-cnt+1 && j<center+cnt-1) //별 내부 출력
						System.out.print(" ");
					else //별 표면 출력
						System.out.print("*");
				}
				else //별 외부 출력
					System.out.print(" ");
			}
			System.out.println();
			cnt++;
		}
	}
}
