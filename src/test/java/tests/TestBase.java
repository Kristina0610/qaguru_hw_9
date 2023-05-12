package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

  @BeforeAll
  static void beforeAll() {
    Configuration.baseUrl = "https://www.globalsqa.com";
    Configuration.browserSize = "1520x1080";
    Configuration.browser = "firefox";
    //Эта настройка упрощает загрузку сайтов,
    //которые зависят от плохо грузящихся ресурсов
    Configuration.pageLoadStrategy = "eager";
  }
}
