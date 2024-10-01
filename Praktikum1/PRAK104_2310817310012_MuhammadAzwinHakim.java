package Praktikum1;

import java.util.Scanner;

public class PRAK104_2310817310012_MuhammadAzwinHakim {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Tangan Abu: ");
        String abuChoices = scanner.nextLine();
        System.out.print("Tangan Bagas: ");
        String bagasChoices = scanner.nextLine();

        int abuPoints = 0;
        int bagasPoints = 0;

        String[] abu = abuChoices.split(" ");
        String[] bagas = bagasChoices.split(" ");

        for (int i = 0; i < 3; i++) {
            char abuChoice = abu[i].charAt(0);
            char bagasChoice = bagas[i].charAt(0);

            if (abuChoice == bagasChoice) {
                continue;
            } else if ((abuChoice == 'B' && bagasChoice == 'G') ||
                       (abuChoice == 'G' && bagasChoice == 'K') ||
                       (abuChoice == 'K' && bagasChoice == 'B')) {
                abuPoints++;
            } else {
                bagasPoints++;
            }
        }

        if (abuPoints > bagasPoints) {
            System.out.println("Abu");
        } else if (bagasPoints > abuPoints) {
            System.out.println("Bagas");
        } else {
            System.out.println("Seri");
        }

        scanner.close();
	}

}