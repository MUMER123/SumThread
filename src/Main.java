import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many number to input: ");
        int range = sc.nextInt();
        int[] arr = new int[range];

        for(int i=0;i<range;i++){
           arr[i] = input();
        }
        MyThread t = new MyThread("sum",arr);
        t.start();


    }
    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Positive Integer: ");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("Only Positive numbers allowed...");
            return input();
        }
        else{
            return num;
        }
    }
}