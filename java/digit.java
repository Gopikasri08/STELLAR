import java.util.Scanner;
public class digit{
    public static void main(String[] args) {
        int count =0,num=65;
        while(num!=0){
            num/=10;
            ++count;
        }
        System.out.println("Number of Digits:"+count);

    }
}