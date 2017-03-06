import org.junit.jupiter.api.*;

import java.util.List;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Created by chengyi.cy on 2017/3/6.
 * stream特性测试
 * junit 5, junit with lambda support
 * http://junit.org/junit5/docs/current/user-guide/
 */
public class StreamFeatureTest {

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    @Test
    void succeedingTest() {
    }

    @Test
    void failingTest() {
        fail("a failing test");
    }

    @Test
    public void testMapReduce() {
        List<Integer> testList = asList(1, 2, 3, 4);
        Integer squareSum = testList.stream().map(x -> x * x).reduce(0, (a, b) -> a + b);
        assertThat(squareSum, equalTo(30));
    }
}
