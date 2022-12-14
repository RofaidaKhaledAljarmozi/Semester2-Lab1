import java.util.Scanner;
//A program that print the input elements of an array by using Method##########
public class Ex6 {
public static void inputArray(String array [],int size){
    System.out.println("pleas enter three names:");
    Scanner in =new Scanner(System.in);
    for (int i = 0; i < array.length; i++) {
        array[i]=in.next();

    }
}

    public static void main(String[] args) {
        String name[]=new String[3];
    inputArray(name,3);

        for (int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
    }
}
