package PrimeNumber;

public class Prime {

    public boolean isPrimeNumber(int numb) {
        if (numb <= 1)
            return false;
        for (int i = 2; i < numb; i++)
            if ((numb % i) == 0) return false;

        return true;
    }

}
                