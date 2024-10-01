package Praktikum1;

import java.util.Scanner;

public class PRAK102_2310817310012_MuhammadAzwinHakim {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("");
        int angka = input.nextInt();
        
        int i = 0; 
        
        while (i < 11) { 
            if (angka % 5 == 0) { 
                System.out.print((angka / 5) - 1);
            } else {
                System.out.print(angka);
            }

            if (i < 10) {
                System.out.print(",");
            }
            
            angka++;
            i++; 
        }
        
        input.close();
	}

}