package j0801;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// 실습01
		
       Scanner s1 = new Scanner (System.in);
       
   	    System.out.print("요소수 :  ");
	    int n=s1.nextInt();
       
		int a[] = new int[n];
	
		
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] :", i);
			a[i]=s1.nextInt();
		}

		System.out.print("찾을 숫자 : ");
		int data=s1.nextInt();
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == data) {
				System.out.printf("그 값은 a[%d]에 있습니다\n", i);
				
			}
		}

	} 

}
