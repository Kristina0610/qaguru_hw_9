package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTypePage {
  //  SelenideElements / locator / etc
  SelenideElement button = $(".borderM");

  // Actions
  public LoginTypePage openPage() {
    open("/angularJs-protractor/BankingProject/#/login");

    return this;
  }

  public LoginTypePage verifyLoginType(String value) {
    button.shouldHave(text(value));

    return this;
  }
}
