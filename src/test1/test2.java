package test1;

import java.util.Random;
import java.util.Scanner;

public class test2 {
    public static void main(String args[]){
        //数组存储每个数
        //加五
        //对10求余
        //反转  数组反转，两个指针一左一右

        //数组个数随机
        //用户输入
        //提示

        /*Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int r1 = r.nextInt(10);


        int [] arr = new int[r1];
        for(int i=0;i<r1;i++){
            System.out.println("请输入密码 : ");
            arr[i] = sc.nextInt();
        }*/
        //定义数组，不知道有几个元素
        //把整数
        // 每一位存到数组中

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入未加密的密码：");
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


        //加五操作
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+5;
        }
        //对10取余
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i] % 10;
        }
        //反转


        int temp = 0;
        for(int i=0,j=arr.length-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }
        String s = "";
        for(int i=0;i<arr.length;i++){
            s = s + arr[i];

        }

        System.out.println("加密之后的密码为："+s);



    }
}
