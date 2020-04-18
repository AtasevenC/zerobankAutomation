$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resource/features/PayBills.feature");
formatter.feature({
  "name": "Pay Bills Page",
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
  "name": "The user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enter the valid credential",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepDef.the_user_enter_the_valid_credential()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user navigate to \"Pay Bills\" module",
  "keyword": "And "
});
formatter.match({
  "location": "AccountActivtyStepDef.the_user_navigate_to_module(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Available currencies",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.step({
  "name": "the user enter the Purchase\tforeign\tcurrency cash tab",
  "keyword": "Given "
});
formatter.match({
  "location": "payBillsStepDef.the_user_enter_the_Purchase_foreign_currency_cash_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "following currencies should be available",
  "rows": [
    {
      "cells": [
        "Select One"
      ]
    },
    {
      "cells": [
        "Australia (dollar)"
      ]
    },
    {
      "cells": [
        "Canada (dollar)"
      ]
    },
    {
      "cells": [
        "Switzerland (franc)"
      ]
    },
    {
      "cells": [
        "China (yuan)"
      ]
    },
    {
      "cells": [
        "Denmark (krone)"
      ]
    },
    {
      "cells": [
        "Eurozone (euro)"
      ]
    },
    {
      "cells": [
        "Great Britain (pound)"
      ]
    },
    {
      "cells": [
        "Hong Kong (dollar)"
      ]
    },
    {
      "cells": [
        "Japan (yen)"
      ]
    },
    {
      "cells": [
        "Mexico (peso)"
      ]
    },
    {
      "cells": [
        "Norway (krone)"
      ]
    },
    {
      "cells": [
        "New Zealand (dollar)"
      ]
    },
    {
      "cells": [
        "Sweden (krona)"
      ]
    },
    {
      "cells": [
        "Singapore (dollar)"
      ]
    },
    {
      "cells": [
        "Thailand (baht)"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "payBillsStepDef.following_currencies_should_be_available(String\u003e)"
});
formatter.result({
  "error_message": "java.lang.AssertionError: verify that  expected:\u003c[Select One, Australia (dollar), Canada (dollar), Switzerland (franc), China (yuan), Denmark (krone), Eurozone (euro), Great Britain (pound), Hong Kong (dollar), Japan (yen), Mexico (peso), Norway (krone), New Zealand (dollar), Sweden (krona), Singapore (dollar), Thailand (baht)]\u003e but was:\u003c[                                Select One\n                                    Australia (dollar)\n                                    Canada (dollar)\n                                    Switzerland (franc)\n                                    China (yuan)\n                                    Denmark (krone)\n                                    Eurozone (euro)\n                                    Great Britain (pound)\n                                    Hong Kong (dollar)\n                                    Japan (yen)\n                                    Mexico (peso)\n                                    Norway (krone)\n                                    New Zealand (dollar)\n                                    Sweden (krona)\n                                    Singapore (dollar)\n                                    Thailand (baht)\n                            ]\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:118)\r\n\tat com.zerobank.stepDefinition.payBillsStepDef.following_currencies_should_be_available(payBillsStepDef.java:123)\r\n\tat ✽.following currencies should be available(file:src/test/resource/features/PayBills.feature:62)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
});