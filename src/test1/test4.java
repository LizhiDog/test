package test1;
import java.util.Random;
public class test4 {
    //五个奖金放在数组中，随机索引
    //不重复
    //每抽一次减一个
    public static void main(String args[]){
        int [] arr = {2,588,888,1000,10000};
        Random r = new Random();
        for(int i=0; i<arr.length; i++){
            int randomIndex = r.nextInt(5);
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        /*int [] arr = {2,588,888,1000,10000};
        Random r = new Random();

        for(int i = 0; i<arr.length; ){
            int j = r.nextInt(5);
            if(arr[j] == 0){

                continue;

            }


            System.out.println(arr[j]+"元的奖金被抽出");
            arr[j] = 0;
            i++;


        }*/





        /*int [] arr2 = new int[arr.length];
        for(int i=0;i<arr.length;){
            int index = r.nextInt(arr.length);
            boolean flag = contain(arr[index],arr2 );
            if(!flag){
                arr2[i] = arr[index];
                i++;
                System.out.println(arr[index]);
            }



        }*/

    }

    /*public static boolean contain(int a,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                return true;
            }
        }
        return false;
    }*/

}














