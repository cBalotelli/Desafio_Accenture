package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty",
		"html:C:\\Users\\User\\Git\\Desafio_Accenture\\Case_Accenture\\evidencia\\relatorio\\Relatorio.html",
		"json:C:\\Users\\User\\Git\\Desafio_Accenture\\Case_Accenture\\evidencia\\relatorio\\report.json" }, 
		monochrome = true, snippets = SnippetType.CAMELCASE, dryRun = false, features = "src/test/resources/features/AutomobileInsurance.feature", glue = "Steps")
public class RunnerVeichleData {
}
