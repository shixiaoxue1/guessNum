/**
 * Created by twer on 7/9/16.
 */
public class Program {

    public static void main(String[] args){
        Seed seed = new Seed();
        NumberGenerater numberGenerater = new NumberGenerater(seed);

        String generate = numberGenerater.generate();

        System.out.print(generate);
    }
}
