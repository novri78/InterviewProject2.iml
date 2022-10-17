package TestPackages;

import ReverseWord.ReverseWord;
import org.junit.Test;

public class TestReverseWord extends ReverseWord {

    @Test
    public void testReverse() {
        this.reverseChar("Akmal Sharim Mumtaz");
        this.reverseChar("Ilham zufar Akram");
        this.reverseChar("Mikail Azlan Rafey");
    }
}
