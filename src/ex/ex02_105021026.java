package ex;
import java.util.Scanner;
/*
 * Topic: 有一圓形，直徑為200，且中心座標為(0,0)。
 * 	請寫一支程式可以輸入「點」的座標，並判斷「點」是否在圓形的範圍內。
 * 	如果「點」的位置剛好在邊界的話也算是在圓形範圍內(例：x=100，y=0)。
 * Date: 2016/09/26
 * Author: 105021026 周永振老師
 */

public class ex02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入x.y");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		if(a*a+b*b>10000){
			System.out.print("在圓形外面");
		}
		else if(a*a+b*b==10000){
			System.out.print("在圓形上面");
		}
		if(a*a+b*b<10000){
			System.out.print("在圓形裏面");
		}
	}

}
