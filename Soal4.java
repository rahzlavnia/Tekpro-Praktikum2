/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/** Soal 4 Gaji Agent
 *
 * @author Sarah
 */
public class Soal4 {
    public static void main(String args[]){
        int itemJual, gajiPokok=500000, gajiTotal = 0, hargaItem =50000;
        
        Scanner keyboard = new Scanner(System.in);
        
        itemJual = keyboard.nextInt();
        
        if (itemJual >= 40){
            gajiTotal = gajiPokok + ((hargaItem * itemJual)*25/100);
        }else if (itemJual >=80){
            gajiTotal = gajiPokok + ((hargaItem * itemJual)*35/100);
        }else if (itemJual >=15 && itemJual <40){
            gajiTotal = gajiPokok + ((hargaItem *10/100)*itemJual);
        }else if (itemJual <15){
            gajiTotal = gajiPokok - (((15-itemJual)*hargaItem)*15/100);
        }
        
        System.out.printf("%d\n",gajiTotal);
    }
}
