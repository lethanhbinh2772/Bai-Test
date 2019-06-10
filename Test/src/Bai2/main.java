/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import java.util.Scanner;

/**
 *
 * @author ZzZ
 */
public class main {

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("Nhap n: ");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            double tong, tong1, tongn;
            tong = 1 / 2;
            tong1 = tong+ 1/4;
            //Em quen mat cach lam cap so cong
        } while (n >= 1 && n <= 50);
    }

}
