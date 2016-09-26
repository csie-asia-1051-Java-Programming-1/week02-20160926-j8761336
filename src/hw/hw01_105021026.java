package hw;
import java.util.Scanner;
public class hw01_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("請輸入小明的$");
		System.out.println("&幾顆蘋果,幾顆柳丁,幾顆桃子?");
		Scanner scn = new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		int c =scn.nextInt();
		int d =scn.nextInt();
		int e =a-b*15-c*20-d*30;
		int f =e/50;
		int g =(e-f*50)/5;
		int h =e-f*50-g*5;
		if(a<b*15+c*20+d*30){
			System.out.print("0");
		}
		else{
		System.out.println("50元找"+ f +"個");
		System.out.println("5元找"+ g +"個");
		System.out.println("1元找"+ h +"個");
		
	}}

}
