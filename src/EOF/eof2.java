package EOF;
import java.io.*;

public class eof2 {
    public static void main(String[] args) throws IOException {

        BufferedReader num = new BufferedReader(new InputStreamReader(System.in));
        String text = num.readLine();
        double sum = 0;

        while ((text = num.readLine()) != null) {
            double a = Double.parseDouble(text);
            sum += a ;
        }
        System.out.println("sum : "+ sum);
    }
}
