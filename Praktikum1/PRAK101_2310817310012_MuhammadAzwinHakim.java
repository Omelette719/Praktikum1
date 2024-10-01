package Praktikum1;

import java.util.Scanner;

public class PRAK101_2310817310012_MuhammadAzwinHakim {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String nama = input.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = input.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = input.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = input.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = input.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        int tinggiBadan = input.nextInt();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = input.nextDouble();

        String bulan = "";
        switch (bulanLahir) {
            case 1:  bulan = "Januari"; break;
            case 2:  bulan = "Februari"; break;
            case 3:  bulan = "Maret"; break;
            case 4:  bulan = "April"; break;
            case 5:  bulan = "Mei"; break;
            case 6:  bulan = "Juni"; break;
            case 7:  bulan = "Juli"; break;
            case 8:  bulan = "Agustus"; break;
            case 9:  bulan = "September"; break;
            case 10: bulan = "Oktober"; break;
            case 11: bulan = "November"; break;
            case 12: bulan = "Desember"; break;
            default: bulan = "Bulan tidak valid"; break;
	}
        
        System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempatLahir + " pada Tanggal " + 
                tanggalLahir + " " + bulan + " " + tahunLahir);
		System.out.println("Tinggi Badan " + tinggiBadan + " cm dan Berat Badan " + beratBadan + " kilogram");
		
		input.close();
		}

}