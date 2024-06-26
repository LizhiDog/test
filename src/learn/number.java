package learn;

import java.util.Random;

public class number {
    public static void main(String[] args) {
        //随机5位数验证码
        //前四位字母，后一位数字
        //随机
        //定义一个数组存储
        char [] arr = new char[52];
        for (int i = 0; i < 52; i++) {
            if(i<26){
                arr[i] = (char) ('a' + i);
            }
            else{
                arr[i] = (char) ('A' + i - 26);
            }
            

        }

        //随机
        Random r = new Random();

        String result = "";
        for(int i = 0;i<4;i++){
            int index = r.nextInt(52);
            result = result + arr[index];
        }
        Random r2 = new Random();
        int number = r2.nextInt(10);
        System.out.println(result+number);

    }
}
