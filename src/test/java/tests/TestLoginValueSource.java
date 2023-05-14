package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import pages.LoginTypePage;


@DisplayName("Тест на проверку наличия 2х кнопок для выбора типа логина")

public class TestLoginValueSource extends TestBase {
  LoginTypePage loginTypePage = new LoginTypePage();

  @ValueSource(strings = {"Customer Login", "Bank Manager Login"})

  @ParameterizedTest(name = "Тест на проверку наличия кнопки для выбора типа {0}")
  @Tags({
          @Tag("WEB"),
          @Tag("BLOKER")
  })
  void successfulLoginValue(String loginType) {
    loginTypePage.openPage();

    loginTypePage.verifyLoginType(loginType);
  }
}
