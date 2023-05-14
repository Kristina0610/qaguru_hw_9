package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginVerificationPage {
  // SelenideElements / locator / etc

  SelenideElement customerLoginButton = $("[ng-click='customer()']"),
          selection = $("#userSelect"),
          button = $(".btn-default");

  // Actions

  public LoginVerificationPage openPage() {
    open("/angularJs-protractor/BankingProject/#/login");

    return this;
  }

  public LoginVerificationPage choiceCustomerLogin() {
    customerLoginButton.click();

    return this;
  }

  public LoginVerificationPage setCustomerLogin(String key) {
    selection.click();
    String id = String.format("[value='%s", key) + "']";
    $(id).click();

    return this;
  }

  public LoginVerificationPage clickSubmit() {
    button.click();

    return this;
  }

  public LoginVerificationPage verifyResult(String value) {
    $(".borderM").shouldHave(text("Welcome " + value + " !!"));

    return this;
  }
}
