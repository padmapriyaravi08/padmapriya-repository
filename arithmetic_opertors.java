import java.util.Scanner;
public class arithmetic_opertors{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c;
    c=a+b;
    int d;
    d=a-b;
    int e;
    e=a*b;
    int f;
    f=a/b;
    System.out.println("the addition of a and b is "+c);
    System.out.println("the subraction of a and b is "+d);
    System.out.println("the multiplication of a and b is "+e);
    System.out.println("the division of a and b is "+f);
  }
}
