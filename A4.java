import java.util.Scanner;

public class A4 {
//    Write a short Java method, isEven, that takes an int i and returns true if and only
//if i is even. Your method cannot use the multiplication, modulus, or division
//            operators, however
public static void main(String[] args) {
    System.out.println("pleas enter n:");
    Scanner in =new Scanner(System.in);
    int n = 0,num = 0;
    n=in.nextInt();
    if (n-2!=0)

        System.out.println("is odd");
    else System.out.println("is even");
}

}
