public class Hello { //나비 별찍기
	public static void main(String[] args) {

		int cnt=3;
		int center=2;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<4*2-2;j++) {
				if(j>center-cnt+1 && j<center+cnt)
					System.out.print("+");
				else
					System.out.print("*");
			}
			System.out.println();
			cnt--;
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<4*2-2;j++) {
				if(j>center-cnt+1 && j<center+cnt)
					System.out.print("-");
				else
					System.out.print("*");
			}
			System.out.println();
			cnt++;
		}
	}
}
