package fibonacciSeries;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz:  ");
		int number = input.nextInt();
		System.out.println("Girdiğiniz sayı: " + number);
		 int  t1 = 0, t2 = 1;
       
       
       

        System.out.print("Fibonacci Serisi: ");
        for (int i = 1; i <= number; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
		}
		
	}


