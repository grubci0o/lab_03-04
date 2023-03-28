import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;


@SelectPackages({"org.Problem1Test", "org.Problem2Test", "org.Problem4Test"
, "org.Problem11Test", "org.Problem16Test"})
@Suite
public class TestSuite {
}
