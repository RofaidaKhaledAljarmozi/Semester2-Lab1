import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        System.out.println("input an array 5 elements");
        Scanner in = new Scanner(System.in);
        int array[] = new int[5];
        int a;
        for (a = 0; a < array.length; a++) {
            array[a] = in.nextInt();
            System.out.println(array[a]);
        }

    }
}
