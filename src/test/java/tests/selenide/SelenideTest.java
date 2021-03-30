package tests.selenide;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import tests.TestData;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SelenideTest extends TestData {

    @Test
    @DisplayName("Selenide tests")
    public void SearchForIssueTab() {
        open("https://github.com/");
        $(byName("q")).setValue(repositoryName).pressEnter();
        $(byLinkText("StessyT/allure_reports_5")).click();
        $(withText("Issues")).click();
        $(withText("Issue #" + issueNumber)).should(Condition.exist);
    }
}
