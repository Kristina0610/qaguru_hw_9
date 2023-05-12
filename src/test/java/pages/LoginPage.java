package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
  // SelenideElements / locator / etc

  SelenideElement customerLoginButton = $("[ng-click='customer()']"),
          selection = $("#userSelect"),
          button = $(".btn-default");

  // Actions

  public LoginPage openPage() {
    open("/angularJs-protractor/BankingProject/#/login");

    return this;
  }

  public LoginPage choiceCustomerLogin() {
    customerLoginButton.click();

    return this;
  }

  public LoginPage setCustomerLogin(String key) {
    selection.click();
    String id = String.format("[value='%s", key) + "']";
    $(id).click();

    return this;
  }

  public LoginPage clickSubmit() {
    button.click();

    return this;
  }

  public LoginPage verifyResult(String value) {
    $(".borderM").shouldHave(text("Welcome " + value + " !!"));

    return this;
  }
}
