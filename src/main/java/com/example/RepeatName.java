package com.example;
import java.util.Scanner;
public class RepeatName{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your name:");
        String name=scan.nextLine();
        System.out.print("How many times you want to repeat:");
        int num=scan.nextInt();
        int numw=num;
        int numd=num;
        for(int i=0;i<num;i++){
            System.out.println(name);
        }
        /*int j=0;
        while(j<numw){
            System.out.println(name);
        }
        int k=0;
        do{
            System.out.println(name);
            
        }while(k<numd){
            System.out.println(name);
        }*/
        
    }
}