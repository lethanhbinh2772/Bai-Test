/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author ZzZ
 */
public class Test {

    public static void main(String[] args) {
        int a, b, c;
        double x;
        Scanner nhap = new Scanner(System.in);

        System.out.println("Nhap a: ");
        a = nhap.nextInt();
        System.out.println("Nhap b: ");
        b = nhap.nextInt();
        System.out.println("Nhap c");
        c = nhap.nextInt();
        double delta;
        delta = b * b - 4 * a * c;
        if (delta == 0) {
            System.out.println("Phuong trinh co nghiem kep x1 = x2: " + (-b / 2 * a));
        } else if (delta > 0) {
            System.out.println("x1 = " + (-b + sqrt(delta)) / 2);
            System.out.println("x2 = " + (-b - sqrt(delta)) / 2);
        } else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }

}
