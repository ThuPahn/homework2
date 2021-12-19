package com.company;

import java.util.Scanner;

public class ex2
{
    public static void ex21 (String[] args) {
        Scanner nhap=new Scanner(System.in);
        System.out.print("Diem thuc hanh ");
        Th = nhap.nextFloat();
        System.out.print("Diem lý thuyet ");
        Lt = nhap.nextFloat();
        System.out.print("Diem TB Hoc Ki : ");
        Tb = nhap.nextFloat();

        float Tb = (float) (Th + Lt)/2;

        boolean kiemTra = (Tb >= 6);
        System.out.println("Dat");
        boolean kiemTra = (Tb < 6);
        System.out.println("Truot");

        System.out.println(" Diem TB Hoc Ki : " + Tb + kiemTra );



    }


}
