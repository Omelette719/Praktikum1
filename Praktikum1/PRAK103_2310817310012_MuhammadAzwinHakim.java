package Praktikum1;

import java.util.Scanner;

public class PRAK103_2310817310012_MuhammadAzwinHakim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("");
        int N = input.nextInt();
        System.out.print("");
        int bilanganAwal = input.nextInt();

        int i = 0; 
        int check = bilanganAwal; 

        do {
            
            if (check % 2 != 0) {
                System.out.print(check);
                i++;

                
                if (i < N) {
                    System.out.print(",");
                }
            }
            check++;
        } while (i < N);

        input.close();
	}

}