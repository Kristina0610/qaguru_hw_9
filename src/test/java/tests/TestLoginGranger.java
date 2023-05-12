package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pages.LoginPage;

@DisplayName("Тест на проверку авторизации под кастомным логином")
public class TestLoginGranger extends TestBase {
  LoginPage loginPage = new LoginPage();

  @CsvSource(value = {
          "1 | Hermoine Granger",
          "2 | Harry Potter",
          "3 | Ron Weasly",
          "4 | Albus Dumbledore",
          "5 | Neville Longbottom",
  }, delimiter = '|')

  @ParameterizedTest(name = "Кастомный логин c value = {0} и значением {1}")
  @Tags({
          @Tag("WEB"),
          @Tag("BLOKER")
  })
  void successfulLogin(String key, String login) {
    loginPage.openPage()
            .choiceCustomerLogin()
            .setCustomerLogin(key)
            .clickSubmit();

    loginPage.verifyResult(login);

  }
}
