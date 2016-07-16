public class NumberCompare {
    public String compare(String sysInput, String userInput) {
        int countA = getCountA(sysInput, userInput);

        int countB = getCountB(sysInput, userInput);

        return countA + "A"+ countB +"B";
    }

    private int getCountB(String sysInput, String userInput) {
        int countB = 0;
        for (int i = 0; i < sysInput.length(); i++) {
            if(sysInput.indexOf(userInput.charAt(i)) != -1){
                countB++;
            }
        }

        countB = countB - getCountA(sysInput, userInput);
        return countB;
    }

    private int getCountA(String sysInput, String userInput) {
        int countA = 0;
        for (int i = 0; i < sysInput.length(); i++) {
            if(sysInput.charAt(i) == userInput.charAt(i)){
                countA++;
            }
        }
        return countA;
    }
}
