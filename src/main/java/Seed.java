import java.util.Random;
import java.util.StringJoiner;

/**
 * Created by twer on 7/9/16.
 */
public class Seed implements ISeed{
   
    public String generate() {
        Random random = new Random();
        return "" + random.nextInt(10) +random.nextInt(10) +random.nextInt(10) +random.nextInt(10);
    }
}
