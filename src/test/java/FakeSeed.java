import java.util.List;

public class FakeSeed implements ISeed {
    public List<String> randomList;
    private int index;
    public FakeSeed(List<String> randomList) {
        this.randomList = randomList;
        this.index = 0;
    }

    public String generate() {
        return randomList.get(index++);
    }

}
