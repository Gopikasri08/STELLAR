import java.util.Scanner;
public class count{
    public static void main(String[] args) {
        int count = 0, num=7777;
        while (num!=0){
        num /= 10;
        ++count;
        }
        System.out.println("Number og digits:"+count);
    }
}
