import java.util.Scanner;
public class ebill{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int units;
    int bill;
    System.out.println("enter electricity units:");
    units=sc.nextInt();
    if(units<=100){
     bill=units*1;
    }
    else if(units<=200){
      bill=units*2;
    }
    else{
      bill=(100*1)+(100*2)+(units-200)*3;
    }
    System.out.println("Electricity bill=rs " + bill);
    
  }
}
      


    