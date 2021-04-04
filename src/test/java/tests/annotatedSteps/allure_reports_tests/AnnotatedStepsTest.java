package tests.annotatedSteps.allure_reports_tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestData;
import tests.annotatedSteps.allure_reports_steps.AnnotatedSteps;

public class AnnotatedStepsTest {

    private AnnotatedSteps annotatedSteps = new AnnotatedSteps();

    @Test
    @DisplayName("Annotated tests")
    public void testSearch() {
        annotatedSteps.openMainPage();
        annotatedSteps.searchForRepository(TestData.repositoryName);
        annotatedSteps.openRepository(TestData.repositoryName);
        annotatedSteps.openIssuesTab();
        annotatedSteps.searchForIssueNumber(TestData.issueNumber);
    }
}
