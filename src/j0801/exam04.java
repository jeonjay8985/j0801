package j0801;

import java.util.Scanner;

public class exam04 {

	public static void main(String[] args) {
		// 실습02
		Scanner s1 = new Scanner (System.in);
		
   	    System.out.print("요소수 :  ");
	    double n=s1.nextDouble();

		double a[] = new double[(int)n];
		for(int i=0; i<a.length; i++) {
			System.out.printf("a[%d] :", i);
			a[i]=s1.nextDouble();
		}
		
		double sum = 0;
		double avg = 0;
		for(int i=0; i<a.length; i++) {
			sum +=a[i];
		}
		    avg = sum/a.length;
		    
		    System.out.printf("모든 요소의 합은 %.2f입니다\n", sum);
		    System.out.printf("모든 요소의 평균은 %.2f입니다", avg);
	}    
}
		
		/*
		System.out.print("요소수: ");
		double num = s1.nextDouble(); 
		
		double a[] = new double[5];
		
		double sum = 0;
		double avg = 0;
		
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]);
		
		*/
		