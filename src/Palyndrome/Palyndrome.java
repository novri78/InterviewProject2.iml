package Palyndrome;

public class Palyndrome {

    public boolean isPalyndrome(String value) {
        for(int i = 0; i < value.length() / 2; ++i) {
            int pembanding = value.length() - i - 1;
            if (value.charAt(i) != value.charAt(pembanding)) {
                return false;
            }
        }

        return true;
    }
}
