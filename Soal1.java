/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;
import java.util.StringTokenizer;

/** Soal 1 Input & Output
 *
 * @author Sarah
 */
public class Soal1 {
    public static void main(String args[]){
        
        Scanner keyboard = new Scanner(System.in);
        String s = keyboard.nextLine();
        
        StringTokenizer st = new StringTokenizer(s,"!,?._' @");
        
        int token = st.countTokens();
        System.out.println(token);
        
        while(st.hasMoreTokens())
        {
           System.out.println(st.nextToken());
        }      
    }
}

