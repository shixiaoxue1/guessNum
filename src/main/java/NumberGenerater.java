import java.util.Arrays;

public class NumberGenerater {

    private final ISeed seed;

    public NumberGenerater(ISeed seed) {
        this.seed = seed;
    }

    public String generate() {
        String generated = seed.generate();
        if(isCorrect(generated)){
            return generated;
        }else{
            return generate();
        }
    }

    private boolean isCorrect(String num) {
        char[] array = num.toCharArray();
        Arrays.sort(array);
        for(int i = 0; i< array.length -1; i++){
            if(array[i] == array[i+1]){
                return false;
            }
        }
        return true;

    }
}
