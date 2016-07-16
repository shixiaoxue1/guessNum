import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NumberCompareTest {
    @Test
    public void should_return_0A0B (){
        NumberCompare numberCompare = new NumberCompare();
        String result = numberCompare.compare("1234", "5678");
        Assert.assertEquals("0A0B", result);
    }
    @Test
    public void should_return_1A0B (){
        NumberCompare numberCompare = new NumberCompare();
        String result = numberCompare.compare("1234", "1678");
        Assert.assertEquals("1A0B", result);
    }

    @Test
    public void should_return_2A0B (){
        NumberCompare numberCompare = new NumberCompare();
        String result = numberCompare.compare("1234", "1674");
        Assert.assertEquals("2A0B", result);
    }
    @Test
    public void should_return_0A1B (){
        NumberCompare numberCompare = new NumberCompare();
        String result = numberCompare.compare("1234", "6748");
        Assert.assertEquals("0A1B", result);
    }

    @Test
    public void should_get_4_bit_random_number() {

        List<String> given = new ArrayList<String>();
        given.add("1234");

        ISeed randomSeed = new FakeSeed(given);
        NumberGenerater numberGenerater = new NumberGenerater(randomSeed);
        String result = numberGenerater.generate();
        Assert.assertEquals("1234", result);
    }

    @Test
    public void should_get_4_bit_random_number_and_ignore_not_satisfied_nuber() {

        List<String> randomSequence = new ArrayList<String>();
        randomSequence.add("1224");
        randomSequence.add("1244");
        randomSequence.add("1374");

        ISeed randomSeed = new FakeSeed(randomSequence);
        NumberGenerater numberGenerater = new NumberGenerater(randomSeed);
        String result = numberGenerater.generate();
        Assert.assertEquals("1374", result);
    }
}
