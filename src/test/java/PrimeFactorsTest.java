import org.hamcrest.MatcherAssert;
import org.junit.Test;

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

    private List<Integer> factorOf(Integer number) {
        if (number > 1) {
            return List.of(number);
        }
        return emptyList();
    }
}
