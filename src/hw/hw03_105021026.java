package hw;
import java.util.Scanner;
public class hw03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入西洋年份");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		if(a%400==0){
			System.out.print("這是閏年");
		}
		else if(a%100==0){
			System.out.print("這是平年");
		}
		else if(a%4==0){
			System.out.print("這是閏年");
		}
		else{
			System.out.print("這是平年");
		}
	}

}
