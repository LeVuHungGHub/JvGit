import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
    Scanner Input = new Scanner(System.in);
        System.out.println("Nhap x:");
        System.out.println("Nhap y:");
        int x=(int)Input.nextInt();
        int y=(int)Input.nextInt();
        int Tong=x+y;
        int Hieu=x-y;
        int Chia=x/y;
        int ChiaLayDu=x%y;
        System.out.println("Tong(+):"+Tong);
        System.out.println("Hieu(-):"+Hieu);
        System.out.println("Chia(/):"+Chia);
        System.out.println("ChiaLayDu(%):"+ChiaLayDu);
    }
    
}