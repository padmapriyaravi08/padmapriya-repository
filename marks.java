import java.util.Scanner;
public class marks{
  public static void main(String args[]){
    Scanner sc=new Scanner (System.in);
      int marks=sc.nextInt();
      if(marks>=90){
        System.out.println("grade A");
      }
      else if(marks>=75){
        System.out.println("grade B");
      }
       else if(marks>=60){
        System.out.println("grade C");
      }
        else if(marks>=40){
        System.out.println("grade D");
      }
      else{
          System.out.println("fail");
      }
    }
  }

      