package Atts_Montanha;


import java.util.Scanner;

public class att7 {
    public static void main(String[] args){
    	Scanner scanner = new Scanner(System.in);
    	
           double lado;
           double area;
           double lado2;
           double dobro = 2;
           
           System.out.println("digite a area:");
           
   
           lado = scanner.nextDouble();

           area = lado  * lado * dobro; 
           System.out.println(" o dobro da area e:"+ area);

         }
}