import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void test1() {
        int[][] lcp = {
                {4, 0, 2, 0},
                {0, 3, 0, 1},
                {2, 0, 2, 0},
                {0, 1, 0, 1}
        };
        String expected = "abab";
        String actual = new Solution().findTheString(lcp);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test2() {
        int[][] lcp = {
                {4, 3, 2, 1},
                {3, 3, 2, 1},
                {2, 2, 2, 1},
                {1, 1, 1, 1}
        };
        String expected = "abab";
        String actual = new Solution().findTheString(lcp);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3() {
        int[][] lcp = {
                {4, 3, 2, 1},
                {3, 3, 2, 1},
                {2, 2, 2, 1},
                {1, 1, 1, 3}
        };
        String expected = "";
        String actual = new Solution().findTheString(lcp);

        Assert.assertEquals(expected, actual);
    }
}
