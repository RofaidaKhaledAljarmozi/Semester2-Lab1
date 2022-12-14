public class A2 {
//    Suppose that we create an array A of GameEntry objects, which has an integer
//    scores field, and we clone A and store the result in an array B. If we then immediately
//    set A[4].score equal to 550, what is the score value of the GameEntry
//    object referenced by B[4]?
public static void main(String[] args) {
    int []b=new int[5];
    int a[]=new int[5];
    for (int i = 0; i < a.length; i++) {
        a[4]=550;
    }
    for (int j = 0; j <b.length; j++) {
        b[4]=a[4];
    }
    System.out.println(  b[4]=a[4]);
}
}
