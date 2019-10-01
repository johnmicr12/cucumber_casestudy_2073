package testbatchrunner_casestudy;





import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="Features",glue="stepdef_casestudy",plugin= {"pretty","json:target/Cucumber_Casestudies-json-report.json"})
public class Testrunner {

}
