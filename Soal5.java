/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.StringTokenizer;

/** Soal 5 Buka Tutup Jalan
 *
 * @author Sarah
 */
public class Soal5 {
    public static void main(String args[]){
        String input;
        
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextLine();
        
        StringTokenizer st = new StringTokenizer(input," ");
        
        String st1 = st.nextToken();
        st1 = st1.concat(st.nextToken());
        st1 = st1.concat(st.nextToken());
        st1 = st1.concat(st.nextToken());
        
        long plat = Long.parseLong(st1);
        
        long hasil = plat - 999999;
        
        if(hasil%5==0){
            System.out.println("jalan");
        }else{
            System.out.println("berhenti");
        }
    }
}