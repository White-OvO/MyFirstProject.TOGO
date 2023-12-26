import java.util.Scanner;

public class using4Loop {
  public static void main(String[] args) {
    int i, j, k;
    k = 0;
    for (i = 0; i < 6; i++) {
      for (j = 0; j < 6; j++) {
        System.out.print(k + "\t");
        k++;
      }
      System.out.println("");
    }

    int programCounter;
    do {
      int sum = 0;
      int list[] = new int[3];
      Scanner in = new Scanner(System.in);
      System.out.println("Enter 3 numbers to be added: ");
      for (int i2 = 0; i2 < 3; i2++) {
        list[i2] = in.nextInt();
        sum += list[i2];
      }
      System.out.println("Sum = " + sum);

      System.out.println("Enter 1 to continue or any value to exit........");
      programCounter = in.nextInt();

    } while (programCounter == 1);
  }
}
