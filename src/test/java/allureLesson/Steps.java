package allureLesson;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Steps {
    @Step("Открыть страницу {page}")
    public void openPage(String page) {
        open("https://github.com/" + page);
    }

    @Step("Ввести номер задачи {issueId} и выполнить поиск")
    public void setValueIssueId(String issueId) {
        $("#js-issues-search").click();
        $("#js-issues-search").setValue(issueId).pressEnter();
    }

    @Step("задача {issueId} присутствует в списке выдачи")
    public void issueShoudBeVisible(String issueId) {
        $("#issue_"+issueId+"_link").shouldBe(Condition.visible);

    }

    @Step("Заголовок задачи {issueId} соответствует значению {issueName}")
    public void checkName(String issueId, String issueName) {
        $("#issue_"+issueId+"_link").shouldHave(Condition.
                text(issueName));
    }
}
