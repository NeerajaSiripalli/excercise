import java.util.*;
public class Collatz {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        do {
            if ((n % 2) == 0) {
                do {
                    n = n / 2;
                    System.out.println("n");
                } while ((n % 2) == 0);
            } else {
                do {
                    n = 3 * n + 1;
                    System.out.println(n);
                } while ((n % 2) != 0);
            }
        }while(n>1);
            }
        }

