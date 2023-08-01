package com.vti.utils;

import java.util.Scanner;

public class ScannerUltis {
	private static Scanner sc = new Scanner(System.in);
	
	public static int inPutInt() {
		while(true) {
			try {
				int intInput = Integer.parseInt(sc.next());
				if (intInput>0) {
					return intInput;
				}else {
					System.out.println("Nhap lai:   ");

				}
			} catch (Exception e) {
				System.out.println("Nhap lai:   ");
				// TODO: handle exception
			}
		}
	}
}
