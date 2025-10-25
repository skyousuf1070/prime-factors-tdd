import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.hamcrest.CoreMatchers.is;

public class PrimeFactorsTest {
    @Test
    public void shouldReturnEmptyListWhenNumberIsOne() {
        MatcherAssert.assertThat(factorOf(1), is(emptyList()));
    }

    @Test
    public void shouldReturnListContainingTwoWhenNumberIsTwo() {
        MatcherAssert.assertThat(factorOf(2), is(List.of(2)));
    }

    @Test
    public void shouldReturnListContainingThreeWhenNumberIsThree() {
        MatcherAssert.assertThat(factorOf(3), is(List.of(3)));
    }

    @Test
    public void shouldReturnListContainingTwoTwoWhenNumberIsFour() {
        MatcherAssert.assertThat(factorOf(4), is(List.of(2, 2)));
    }

    @Test
    public void shouldReturnListContainingFiveWhenNumberIsFive() {
        MatcherAssert.assertThat(factorOf(5), is(List.of(5)));
    }

    @Test
    public void shouldReturnListContainingTwoThreeWhenNumberIsSix() {
        MatcherAssert.assertThat(factorOf(6), is(List.of(2, 3)));
    }

    @Test
    public void shouldReturnListContainingSevenWhenNumberIsSeven() {
        MatcherAssert.assertThat(factorOf(7), is(List.of(7)));
    }

    @Test
    public void shouldReturnListContainingTwoTwoTwoWhenNumberIsEight() {
        MatcherAssert.assertThat(factorOf(8), is(List.of(2, 2, 2)));
    }

    @Test
    public void shouldReturnListContainingThreeThreeWhenNumberIsNine() {
        MatcherAssert.assertThat(factorOf(9), is(List.of(3, 3)));
    }

    @Test
    public void shouldReturnListContainingTwoTwoThreeThreeFiveSevenElevenElevenThirteenWhenNumberIsTwoTimesTwoTimesThreeTimesThreeTimesFiveTimesSevenTimesElevenTimesThirteen() {
        MatcherAssert.assertThat(factorOf(2 * 2 * 3 * 3 * 5 * 7 * 11 * 11 * 13), is(List.of(2, 2, 3, 3, 5, 7, 11, 11, 13)));
    }

    private List<Integer> factorOf(Integer number) {
        ArrayList<Integer> factors = new ArrayList<>();
        int divisor = 2;
        while (number > 1) {
            while (number % divisor == 0) {
                factors.add(divisor);
                number /= divisor;
            }
            divisor++;
        }
        return factors;
    }
}
