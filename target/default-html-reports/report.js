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
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});