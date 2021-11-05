import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);
    System.out.println("Enter a new name");
    String name= scan.nextLine();
    String firstL= name.substring(0,1);
    System.out.println(firstL);

  }
}