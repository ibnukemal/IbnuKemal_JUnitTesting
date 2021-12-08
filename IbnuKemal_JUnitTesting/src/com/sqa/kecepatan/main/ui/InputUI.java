package com.sqa.kecepatan.main.ui;

import java.util.Scanner;

import com.sqa.kecepatan.main.KecepatanRataRata;

public class InputUI {

	KecepatanRataRata kecepatan;
	double jarak;
	double waktu;
	
	public InputUI() {
		if(kecepatan == null) {
			kecepatan = new KecepatanRataRata();
		}
	}
	
	public void showKecepatan() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Masukkan Jarak Tempuh Anda(Km) : ");
		jarak = sc.nextDouble();
		System.out.print("Masukkan Waktu Tempuh Anda(Jam) : ");
		waktu = sc.nextDouble();
		double kecepatan = jarak / waktu;
		System.out.println("Kecepatan Rata-Rata Anda Adalah : " +kecepatan+ " Km/h");
	}
	
}
