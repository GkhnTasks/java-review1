package Lambda.AppleQuestion;

public class AppleGreenColurPredicate implements ApplePredicate{

    @Override
    public boolean test(Apple apple) {

        return apple.getColor().equals(Color.GREEN);
    }
}
