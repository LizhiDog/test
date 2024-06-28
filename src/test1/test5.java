package test1;
import java.util.Random;
import java.util.Scanner;

public class test5 {
    public static void main(String args[]){

        int[] arr = getArray();
        System.out.println("====================================");
        for(int j=0;j<arr.length;j++){
            System.out.print(arr[j]+" ");

        }
        System.out.println();
        System.out.println("=============================================");
        //int[] arr2 = getArray();//用户输入的
        int [] arr2 =new int[arr.length];
        Scanner sc = new Scanner(System.in);
        //输入红球号码
        for(int i=0;i<arr2.length-1;){
            System.out.println("请输入第"+(i+1)+"个红球号码");
            int redNumber = sc.nextInt();
            if(redNumber>0&&redNumber<34){
                if(!confirm(redNumber,arr2)){
                    arr2[i]=redNumber;
                    i++;
                }
                else{
                    System.out.println("数据重复，请重新输入");
                }
            }
            else{
                System.out.println("号码超出范围");
            }


        }
        //输入蓝球号码
        System.out.println("请输入蓝球号码");
        arr2[6]=sc.nextInt();






        //比较众将数字
        int count = 0;
        int blue = 0;
        for(int i=0;i<arr.length-1;i++){
            //比较红色是否中奖
            for(int j=0;j<arr.length-1;j++){
                if(arr2[i]==arr[j]){
                    count++;
                    break;
                }

            }

        }
        if(arr2[6]==arr[6]){
            blue++;
        }
        if(count==0&&blue==1 || count==1&&blue==1 || count==2&&blue==1){
            System.out.println("抽中红色球"+count+"个，抽中蓝色球"+blue+"个，恭喜获得六等奖，5元");
        }
        else if(count==3&&blue==1 || count==4&&blue==0){
            System.out.println("抽中红色球"+count+"个，抽中蓝色球"+blue+"个，恭喜获得五等奖，10元");
        }
        else if(count==4&&blue==1 || count==5&&blue==0){
            System.out.println("抽中红色球"+count+"个，抽中蓝色球"+blue+"个，恭喜获得四等奖，200元");
        }
        else if(count==5&&blue==1){
            System.out.println("抽中红色球"+count+"个，抽中蓝色球"+blue+"个，恭喜获得三等奖，3000元");
        }
        else if(count==6&&blue==0){
            System.out.println("抽中红色球"+count+"个，抽中蓝色球"+blue+"个，恭喜获得二等奖，500万元");
        }
        else if(count==6&&blue==1){
            System.out.println("抽中红色球"+count+"个，抽中蓝色球"+blue+"个，恭喜获得一等奖，1000万元");
        }
        else{
            System.out.println("您没有中奖，再接再厉");
        }



    }
    //定义一个方法判重
    public static boolean confirm(int r1,int[] arr){
        for(int i=0;i<6;i++){
            if(r1 == arr[i]){
                return true;
            }
        }
        return false;



    }
    public static int[] getArray(){
        int [] arr = new int[7];
        Random rand = new Random();
        for(int i=0;i<6;){
            int r1 = rand.nextInt(33)+1;

            if(!confirm(r1,arr)){
                arr[i] = r1;

                i++;
            }

        }
        arr[6] = rand.nextInt(16)+1;
        //arr[6]=8;
        return arr;
    }


}
