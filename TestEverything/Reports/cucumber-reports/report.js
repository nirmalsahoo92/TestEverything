$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Login.feature");
formatter.feature({
  "name": "Login Test",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login_Valid Data",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I login to portal",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.StepDefination.i_login_to_portal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open menu \"Admin\u003d\u003eUser Management\u003d\u003eUsers\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.StepDefination.i_open_menu(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on \"Add Button\" button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.StepDefination.i_click_on_button(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create user with following data",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.StepDefination.i_create_user_with_following_data(io.cucumber.datatable.DataTable)"
});
