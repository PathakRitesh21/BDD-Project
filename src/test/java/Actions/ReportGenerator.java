package Actions;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReportGenerator {
    public static void generateReport() {
        File reportOutputDirectory = new File("target/cucumber-reports");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target/cucumber-reports/Cucumber.json");

        Configuration config = new Configuration(reportOutputDirectory, "BDD-Test-Project");
        config.addClassifications("Platform", System.getProperty("os.name"));
        config.addClassifications("Browser", "Chrome");
        config.addClassifications("Build Number", "1.0.0");
        config.addClassifications("Environment", "QA");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, config);
        reportBuilder.generateReports();
    }
}

