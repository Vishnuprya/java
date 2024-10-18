//without using string
import java.util.*;
public class Palindrome{
    public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    String a=s.next();
    char b[]=a.toCharArray();
    int c=0;
    for(int i=0,j=b.length-1;i<=j;i++,j--){
        if(b[i]!=b[j]){
            c=1;
            break;
        }
    }
    System.out.println(c==0?"palindrome":"not");
}
}