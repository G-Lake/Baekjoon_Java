import java.util.Scanner;

public class 직사각형에서의탈출_1085 { //제출 시 Main으로 클래스명 변경

	public static void main(String[] args) {
		int x, y, w, h;
		Scanner sc=new Scanner(System.in);
		
		x=sc.nextInt();
		y=sc.nextInt();
		w=sc.nextInt();
		h=sc.nextInt();
		sc.close();
		//가로세로 길이가 w,h인 직사각형 안 x,y좌표에 있는 사람이 직사각형을 벗어날 최단거리
		//한수가 선택가능한 최단거리 값은 4가지(x, y, w-x, h-y)
		if(1<=w && h<=1000 && 1<=x && x<=w-1 && 1<=y && y<=h-1) {
			if(w-x>=x && h-y>=x && y>=x) { //x
				System.out.print(x);
			}
			else if(w-x>=y && h-y>=y && x>=y){ //y
				System.out.print(y);
			}
			else if(x>=w-x && h-y>=w-x && y>=w-x){ //w-x
				System.out.print(w-x);
			}
			else{ //h-y
				System.out.print(h-y);
			}
		}
	}
}