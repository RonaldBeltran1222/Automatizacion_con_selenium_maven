import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@CucumberOptions(features = "src/test/resources/feactures",
        plugin = {"pretty", "html:target/cucumber.html"}, snippets = CucumberOptions.SnippetType.CAMELCASE)
@RunWith(Cucumber.class)
public class TestRunner {
}
