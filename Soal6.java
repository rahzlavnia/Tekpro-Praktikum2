/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.math.BigInteger;

/** Soal 6 Big Number
 *
 * @author Sarah
 */
public class Soal6 {
    public static void main(String args[]){
        BigInteger angka1, angka2;
        
        Scanner keyboard = new Scanner(System.in);
        
        angka1 = keyboard.nextBigInteger();
        angka2 = keyboard.nextBigInteger();
        
        System.out.println(angka1.add(angka2));
        System.out.println(angka1.multiply(angka2));
        
    }
}
