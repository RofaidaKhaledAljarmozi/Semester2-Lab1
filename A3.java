import java.util.Scanner;

public class A3 {
////    Write a short Java method, isMultiple, that takes two long values, n and m, and
////    returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
public static boolean take(long n,long m)
{
    System.out.println("pleas enter 2 long values:");
    Scanner in =new Scanner(System.in);
    n= in.nextLong();
    m= in.nextLong();
    if (n!=m)return true;
    else return false;
}

    public static void main(String[] args) {
        long a = 0,b = 0;
        take(a,b);
    }
}
