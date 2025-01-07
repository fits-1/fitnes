package fitnes;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
  features = {"featurse"}, // This should be the correct path to your feature files
  plugin = {"pretty", "html:target/cucumber-report.html"},
  monochrome = true,
  snippets = CucumberOptions.SnippetType.CAMELCASE,
  glue = {"fitnes"}
)
public class Acceptance_test {

  // Constructor for the Acceptance_test class
  public Acceptance_test() {
    super();
  }
}
