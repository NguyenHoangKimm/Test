package test;

import java.util.Scanner;

import Class.PhanSo;

public class testClass {
		public static void main(String[] args) {
		Scanner sc323 = new Scanner(System.in);
	 	PhanSo ps1323 = new PhanSo();
	 	PhanSo ps2323 = new PhanSo();
	 	PhanSo psTong323 = new PhanSo();
	 
	 System.out.println("Nhap phan so thu nhat ");
	 ps1323.nhapPS(sc323);
	 System.out.println("Nhap phan so thu hai ");
	 ps2323.nhapPS(sc323);
	 
	 psTong323=ps1323.congPS(ps2323);
	 
	 System.out.println("\nPhan so thu nhat la: ");
	 ps1323.hienthiPS();
	 System.out.println("\nPhan so thu hai la: ");
	 ps2323.hienthiPS();
	 System.out.println("\nPhan so Tong la: ");
	 psTong323.hienthiPS();
	 
	 sc323.close();
}
}
