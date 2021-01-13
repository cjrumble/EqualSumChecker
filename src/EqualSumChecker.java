public class EqualSumChecker {

    public static boolean hasEqualSum(int one, int two, int three) {
        boolean isSumEqual = false;
        if ((one + two) == three) {
            isSumEqual = true;
        }
        return isSumEqual;
    }
}
