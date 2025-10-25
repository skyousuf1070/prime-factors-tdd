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

    private List<Integer> factorOf(Integer number) {
        return emptyList();
    }
}
