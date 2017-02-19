import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: Brojandos.
 * @creation_date: 19.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int firstNumber = Integer.parseInt(reader.readLine());
            int secondNumber = Integer.parseInt(reader.readLine());
            if (firstNumber > secondNumber) {
                System.out.println(">");
            } else if (firstNumber < secondNumber){
                System.out.println("<");
            } else {
                System.out.println("=");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
