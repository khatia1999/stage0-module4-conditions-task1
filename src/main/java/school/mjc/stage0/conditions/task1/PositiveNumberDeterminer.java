package school.mjc.stage0.conditions.task1;

public class PositiveNumberDeterminer {
    public void isPositive(int numberToBeDetermined) {

        if(numberToBeDetermined > 0) {
            System.out.println(numberToBeDetermined + "is a possitive number");
        } else if (numberToBeDetermined < 0 ){
            System.out.println(numberToBeDetermined + "is a negative number");
        } else if (numberToBeDetermined == 0) {
            System.out.println(numberToBeDetermined + "zero");

        }
    }
}
