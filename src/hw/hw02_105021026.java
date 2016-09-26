package hw;
import java.util.Scanner;
public class hw02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入身高及性別(男為1女為2)");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b =scn.nextInt();
		if(b==1){
			System.out.print("標準體重為"+(a-80)*0.7);
		}
		else if(b==2){
			System.out.print("標準體重為"+(a-70)*0.6);
		}
		
	}

}
