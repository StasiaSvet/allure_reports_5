package tests.annotatedSteps.allure_reports_steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import tests.TestData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AnnotatedSteps extends TestData {

    @Step ("Open the main page")
    public void OpenMainPage() {
        open("https://github.com/");
    }
    @Step ("Search for {repositoryName}")
    public void SearchForRepository(String repositoryName) {
        $(byName("q")).setValue(repositoryName).pressEnter();
    }
    @Step ("Open {repositoryName} repository")
    public void OpenRepository(String repositoryName) {
        $(byLinkText(repositoryName)).click();
    }
    @Step ("Open the Issues tab")
    public void OpenIssuesTab() {
        $(withText("Issues")).click();
    }
    @Step ("Search for Issue {issueNumber}")
    public void SearchForIssueNumber(int issueNumber) {
        $(withText("Issue #" + issueNumber)).should(Condition.exist);
    }
}
