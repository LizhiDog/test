package test1;

import java.util.Scanner;

public class test3 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入加密后的密码：");
        int numberCount = sc.nextInt();
        int count = 0;
        int copy = numberCount;
        while(numberCount!=0){
            numberCount = numberCount / 10;
            count++;
        }

        int [] arr = new int[count];
        int index = count -1;
        while(copy!=0){
            int ge = copy % 10;
            copy = copy / 10;
            arr[index] = ge;
            index--;
        }
        int temp = 0;
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }
        //5-14
        //1 2 3 4 11 12 13 14
        //5 6 7 8 9 0
        for(int i=0;i<arr.length;i++){
            if( arr[i]>=0 && arr[i]<=4){
                arr[i] = arr[i] + 10;
            }

        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] - 5;
        }
        String s = "";
        for(int i=0;i<arr.length;i++){
            s = s + arr[i];

        }

        System.out.println("未加密的密码为："+s);



    }

}
