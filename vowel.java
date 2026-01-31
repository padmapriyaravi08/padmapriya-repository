import java.util.Scanner;
public class vowel{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println("enter a character:");
    ch=sc.next().charAt(2);
    switch(ch){
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
      case 'A':
      case 'E':
      case 'I':
      case 'O':
      case 'U':
        System.out.println("it is vowel");
      break;
      default:
        System.out.println("it is not vowel");
    }
  }
}
        
        
        
        