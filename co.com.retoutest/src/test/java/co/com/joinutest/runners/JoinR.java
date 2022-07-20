package co.com.joinutest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/joinutest.feature",
        glue = "co.com.joinutest.stepdefinitions.joinutest",
        snippets = SnippetType.CAMELCASE
)
public class JoinR {
}
