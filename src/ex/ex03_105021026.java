package ex;
import java.util.Scanner;
/*
 * Topic: 假設某個停車場的費率是停車2小時以內，每半小時30元，超過2小時，但未滿4小時的部份，
 * 	每半小時40元，超過4小時以上的部份，每半小時60元，未滿半小時部分不計費。
 * 	如果您從早上10點23分停到下午3點20分，請撰寫程式計算共需繳交的停車費。
 * Date: 2016/09/26
 * Author: 105021026 周永振老師
 */

public class ex03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入時間");
		Scanner scn =new Scanner(System.in);
		int a= scn.nextInt()*60 +scn.nextInt();
		int b= scn.nextInt()*60 +scn.nextInt();
		int c= (b-a)/30;
		if(c<=4){
			System.out.print(c*30+"$");
		}
		else if(c>4 && c<=8){
			System.out.print(((c-4)*40+120)+"$");
		}
		else{
			System.out.print(((c-8)*60+280)+"$");
		}
	}

}
