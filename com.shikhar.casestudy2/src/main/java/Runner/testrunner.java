package Runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "C:\\Users\\Shikhar\\eclipse-workspace\\com.shikhar.casestudy2\\src\\main\\java\\Features\\Booking.feature", //the path of the feature files
			glue={"stepDefinitions"},dryRun=false,
			plugin= {"pretty","json:target/MyReports/report.json","junit:target/MyReports/report.xml"},
			publish=true
			
			
			
			)
public class testrunner {

}
