import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    public static void main(String[] args) {
        encodingTestResult();
        sortingTestResult();
    }
    public static void encodingTestResult () {
        Result result = JUnitCore.runClasses(EncodingTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
    public static void sortingTestResult () {
        Result result = JUnitCore.runClasses(SortingTest.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());
    }
}
