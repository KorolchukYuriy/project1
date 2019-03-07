$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Authorization.feature");
formatter.feature({
  "name": "Welcome to the-internet",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "home_page",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "that user is on main page",
  "keyword": "Given "
});
formatter.match({
  "location": "basicAuth.that_user_is_on_main_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Basik Auth button",
  "keyword": "When "
});
formatter.match({
  "location": "basicAuth.user_clicks_on_Basik_Auth_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should should enter \"admin\" and \"admin\" and click ok",
  "keyword": "Then "
});
formatter.match({
  "location": "basicAuth.user_should_should_enter_and_and_click_ok(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be loged in",
  "keyword": "Then "
});
formatter.match({
  "location": "basicAuth.user_should_be_loged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "dropdown_options",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on dropdown page",
  "keyword": "Given "
});
formatter.match({
  "location": "dropdown_text.user_is_on_dropdown_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks dropdown box",
  "keyword": "When "
});
formatter.match({
  "location": "dropdown_text.user_clicks_dropdown_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should select both options one by one and print text to console",
  "keyword": "Then "
});
formatter.match({
  "location": "dropdown_text.user_should_select_first_option()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "upload_file",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on upload page",
  "keyword": "Given "
});
formatter.match({
  "location": "upload.user_is_on_upload_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on browse button",
  "keyword": "When "
});
formatter.match({
  "location": "upload.user_clicks_on_browse_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to upload the file",
  "keyword": "Then "
});
formatter.match({
  "location": "upload.user_should_be_able_to_upload_the_file()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "download_file",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on download page",
  "keyword": "Given "
});
formatter.match({
  "location": "download1.the_user_is_on_download_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on selected file and file will be downloaded",
  "keyword": "When "
});
formatter.match({
  "location": "download1.user_clicks_on_selected_file()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "jquery",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on jquery page",
  "keyword": "Given "
});
formatter.match({
  "location": "jquery.user_is_on_jquery_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on all files one by one and downloads them",
  "keyword": "Then "
});
formatter.match({
  "location": "jquery.user_clicks_on_all_files_one_by_one()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});