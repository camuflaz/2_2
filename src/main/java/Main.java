// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
    System.out.println("Pierwsza liczba: ");
    int n1 = read.nextInt();
    System.out.println("Druga liczba: ");
    int n2 = read.nextInt();
    System.out.println("Trzecia liczba: ");
    int n3 = read.nextInt();
    int max = 0;
    for(int i =0; i<3; i++){
      max = Math.max(n1, n2);
      max = Math.max(max, n3);
    }
    System.out.println(max);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}