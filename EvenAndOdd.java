package LastLab;

import java.util.ArrayList;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] Num= {1,2,3,4,5,6,7,8,9,10};
		for(int i = 0; i<Num.length; i++) {
		if(0 == Num[i] % 2) {
			System.out.println("Even Number: " + Num[i]);
		}
		else{
			System.out.println("Odd Number: " + Num[i]);
		}
		}

		
	}

}
