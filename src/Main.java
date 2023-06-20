import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter 3 Numbers");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int min=n1<n2&&n1<n3?n1:n2<n1&&n2<n3?n2:n3;
        int max=n1>n2&&n1>n3?n1:n2>n1&&n2>n3?n2:n3;
        System.out.println("the minimum is  "+min+"  the maximum is "+ max);
    }
}