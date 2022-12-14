import java.util.Scanner;

public class Advance1 {
//    Write a pseudocode description of a method that reverses an array of n integers,
//    so that the numbers are listed in the opposite order than they were before, and
//    compare this method to an equivalent Java method for doing the same thing.
public static void main(String[] args) {
    int number[]=new int[3];
    reverse(number,3);

    for (int i =3-1; i >=0; i--){
        System.out.println(number[i]);
    }

}
public static void reverse(int a[],int size)
{
    System.out.println("pleas enter three num:");
    Scanner in =new Scanner(System.in);
    for (int i = 0; i < a.length; i++) {
        a[i]=in.nextInt();

    }
}}
//    int a[]=new int[5];
//    System.out.println("enter 5 elements");
//    Scanner r= new Scanner(System.in);
//    for (int i = 0; i < a.length; i++) {
//        a[i]=r.nextInt();
//
//    }
//    System.out.println("array elements");
//    for (int i = 0; i <a.length; i++) {
//        System.out.println(a[i]+"");
//
//    }
//    System.out.println("reverse");
//    for (int i = 5-1; i >=0 ; i--)
//        System.out.println(a[i]+"");

