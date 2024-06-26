package test1;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(10);

        int [] arr = new int[number];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter number "+(i+1)+": ");
            arr[i] =  sc.nextInt();
        }



        int [] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];


        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
