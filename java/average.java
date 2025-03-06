import java.util.Scanner;
public class average {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        float Tamil,English,Maths,Science,Social;
        float a,b;
        System.out.println("Enter Tamil mark:");
        Tamil=sc.nextFloat();
        System.out.println("Enter English mark:");
        English=sc.nextFloat();
        System.out.println("Enter Maths mark:");
        Maths=sc.nextFloat();
        System.out.println("Enter Science mark:");
        Science=sc.nextFloat();
        System.out.println("Enter Social mark:");
        Social=sc.nextFloat();

        a=Tamil+English+Maths+Science+Social;
        System.out.println("Total mark="+a);
        b=a/5;
        System.out.println("Average mark ="+b);
        }

    
}
