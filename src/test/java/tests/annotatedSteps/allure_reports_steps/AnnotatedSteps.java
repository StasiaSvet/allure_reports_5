package tests.annotatedSteps.allure_reports_steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import tests.TestData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AnnotatedSteps extends TestData {

    @Step ("Open the main page")
    public void openMainPage() {
        open("https://github.com/");
    }
    @Step ("Search for {repositoryName}")
    public void searchForRepository(String repositoryName) {
        $(byName("q")).setValue(repositoryName).pressEnter();
    }
    @Step ("Open {repositoryName} repository")
    public void openRepository(String repositoryName) {
        $(byLinkText(repositoryName)).click();
    }
    @Step ("Open the Issues tab")
    public void openIssuesTab() {
        $(withText("Issues")).click();
    }
    @Step ("Search for Issue {issueNumber}")
    public void searchForIssueNumber(int issueNumber) {
        $(withText("Issue #" + issueNumber)).should(Condition.exist);
    }
}
