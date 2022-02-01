package Z1;
import java.time.*;

public class Z1 {
    public static void main(String[] args) {
        // Integer
        Integer integerS[] = {1,2,3,4,5};
        Integer integerUS[] = {1,2,3,2,1};
        System.out.println(ArrayUtil.jestPalindromem(integerS));
        System.out.println(ArrayUtil.jestPalindromem(integerUS));
        System.out.println();

        // LocalTime
        LocalTime localTimeS[] = {LocalTime.of(10,25), LocalTime.of(12,50), LocalTime.of(15,10)};
        LocalTime localTimeUS[] = {LocalTime.of(10,25), LocalTime.of(12,50), LocalTime.of(10,25)};
        System.out.println(ArrayUtil.jestPalindromem(localTimeS));
        System.out.println(ArrayUtil.jestPalindromem(localTimeUS));
    }
}
