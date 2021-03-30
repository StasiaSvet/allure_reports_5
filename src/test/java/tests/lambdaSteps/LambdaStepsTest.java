package tests.lambdaSteps;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class LambdaStepsTest extends TestData {

    @Test
    @DisplayName("Lambda tests")
    public void SearchForIssueTab() {
        step("Open the main page", () ->
            open("https://github.com/"));
        step("Search for " + repositoryName + " repository name", () -> {
            $(byName("q")).setValue(repositoryName).pressEnter();
        });
        step("Go to " + repositoryName + " repository", () ->
            $(byLinkText(repositoryName)).click());
        step("Go to Issues tab", () ->
            $(withText("Issues")).click());
        step("Search for Issue #" + issueNumber, () -> {
            $(withText("Issue #" + issueNumber)).should(Condition.exist);
        });
    }
}
