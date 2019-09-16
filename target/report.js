$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/AddCustomer.feature");
formatter.feature({
  "name": "To add customer details",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enters all the fields with valid data",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_enters_all_the_fields_with_valid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.clicks_on_submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer id should be generated and displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.customer_id_should_be_generated_and_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature/AddTariff.feature");
formatter.feature({
  "name": "To add tariff details",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "click on add tariff button",
  "keyword": "And "
});
formatter.match({
  "location": "AddTariffSteps.click_on_add_tariff_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user enter all the field with valid data",
  "keyword": "When "
});
formatter.match({
  "location": "AddTariffSteps.user_enter_all_the_field_with_valid_data()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on submit button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.clicks_on_submit_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@value\u003d\u0027Submit\u0027]\"}\n  (Session info: chrome\u003d76.0.3809.132)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-PPCNGVQ\u0027, ip: \u0027192.168.1.100\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 76.0.3809.132, chrome: {chromedriverVersion: 75.0.3770.140 (2d9f97485c7b..., userDataDir: C:\\Users\\subbian\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:49240}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: e8c331d241ce46e55b2bba2ccfbb553b\n*** Element info: {Using\u003dxpath, value\u003d//input[@value\u003d\u0027Submit\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.click(Unknown Source)\r\n\tat com.resources.FunctionalLibrary.button(FunctionalLibrary.java:22)\r\n\tat com.stepdefinition.AddCustomerSteps.clicks_on_submit_button(AddCustomerSteps.java:101)\r\n\tat ✽.clicks on submit button(src/test/resources/Feature/AddTariff.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "customer id should be generated and displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.customer_id_should_be_generated_and_displayed()"
});
formatter.result({
  "status": "skipped"
});
});