package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/report-html"},
        tags = ("@CriarSimulacaoSucesso"),
        monochrome = true,
        snippets = SnippetType.CAMELCASE
)

public class Runner {
}
