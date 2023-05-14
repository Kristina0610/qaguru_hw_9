package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import pages.LoginVerificationPage;

@DisplayName("Тест на проверку авторизации под кастомным логином")
public class TestLoginVerificationCsvFileSource extends TestBase {
  LoginVerificationPage loginVerificationPage = new LoginVerificationPage();

  @CsvFileSource(resources = "/testData.csv")

  @ParameterizedTest(name = "Кастомный логин c value = {0} и значением {1}")
  @Tags({
          @Tag("WEB"),
          @Tag("BLOKER")
  })
  void successfulLogin(String key, String login) {
    loginVerificationPage.openPage()
            .choiceCustomerLogin()
            .setCustomerLogin(key)
            .clickSubmit();

    loginVerificationPage.verifyResult(login);

  }
}
