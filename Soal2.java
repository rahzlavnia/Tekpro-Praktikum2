/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/** Soal 2 Input & Output
 *
 * @author Sarah
 */
public class Soal2 {
    public static void main(String args[]){
    String [] st = new String [3];
    int [] num = new int [3];
    
    Scanner keyboard = new Scanner(System.in);
   
    for (int i=0; i<3; i++){
        st[i] = keyboard.next();
        num[i] = keyboard.nextInt();
        if (num[i]<0 || num[i]>999){
            System.out.println("Masukkan angka dengan range 0-999");
            System.exit(i);
        }
    }
    
    System.out.println("================================");
    for (int i=0; i<3; i++){
        System.out.printf("%-15s%03d\n",st[i],num[i]);
    }
    System.out.println("================================");
     
    }  
}
