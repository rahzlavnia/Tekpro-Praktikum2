/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/** Soal 3 Berhitung
 *
 * @author Sarah
 */
public class Soal3 {
    public static void main(String args[]){
    int n1, n2;
    char op;
    
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Masukkan bilangan bulat dipisahkan dengan sebuah spasi "
            + "dengan range 1-1000, contoh: (1 + 1)");
    
    n1 = keyboard.nextInt();
    op = keyboard.next().charAt(0);
    n2 = keyboard.nextInt();
    
    if(n1>0 && n1<=1000){
        switch (op) {
            case '+':
                System.out.println(n1+n2);
                break;
            case '-':
                System.out.println(n1-n2);
                break;
            case '*':
                System.out.println(n1*n2);
                break;
            case '/':
                System.out.println(n1/n2);
                break;
            case '%':
                System.out.println(n1%n2);
                break;
            default:
                System.out.println("operator tidak valid, masukkan salah satu "
                        + "dari '+','-','*','/','%'");
                break;
        }
    }else
        System.out.println ("Masukkan angka melebihi range");
        
    }
}
