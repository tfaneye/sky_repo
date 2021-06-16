$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/search.feature");
formatter.feature({
  "line": 2,
  "name": "This feature will make the search show the results that are determined by editorial, as well as generic searches.",
  "description": "",
  "id": "this-feature-will-make-the-search-show-the-results-that-are-determined-by-editorial,-as-well-as-generic-searches.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sky_search"
    }
  ]
});
formatter.before({
  "duration": 4748607200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User sees the editorial section in specific searches",
  "description": "",
  "id": "this-feature-will-make-the-search-show-the-results-that-are-determined-by-editorial,-as-well-as-generic-searches.;user-sees-the-editorial-section-in-specific-searches",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@wip4"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I search \"sky\" in the search bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should see an editorial section with below title",
  "rows": [
    {
      "cells": [
        "Title"
      ],
      "line": 9
    },
    {
      "cells": [
        "Sky Shop"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 11203019000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sky",
      "offset": 10
    }
  ],
  "location": "TestSteps.iSearchSomethingInTheSearchBar(String)"
});
formatter.result({
  "duration": 392170200,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iShouldSeeAnEditorialSection(DataTable)"
});
formatter.result({
  "duration": 999974800,
  "status": "passed"
});
formatter.after({
  "duration": 1285562900,
  "status": "passed"
});
formatter.uri("features/shop_page.feature");
formatter.feature({
  "line": 2,
  "name": "This feature will make sure that the shop page is navigable and usable.",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@sky_shop"
    }
  ]
});
formatter.before({
  "duration": 1836263400,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User navigates to shop page",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.;user-navigates-to-shop-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@wip1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I navigate to Deals page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user should be on the deal page",
  "rows": [
    {
      "cells": [
        "DealPage"
      ],
      "line": 9
    },
    {
      "cells": [
        "https://www.sky.com/deals"
      ],
      "line": 10
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 10525822100,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iNavigateToDealsPage()"
});
formatter.result({
  "duration": 3188813300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.theUserShouldBeOnTheDealPage(DataTable)"
});
formatter.result({
  "duration": 6198900,
  "status": "passed"
});
formatter.after({
  "duration": 929122700,
  "status": "passed"
});
formatter.before({
  "duration": 1924134100,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User sees tiles on the shop page",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.;user-sees-tiles-on-the-shop-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@wip2"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I try to sign in with invalid credentials \"name@sky.com\", \"password\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "I should see a text saying the error message",
  "rows": [
    {
      "cells": [
        "Message"
      ],
      "line": 17
    },
    {
      "cells": [
        "Sorry, we did not recognise either your username or password"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 10912161700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name@sky.com",
      "offset": 43
    },
    {
      "val": "password",
      "offset": 59
    }
  ],
  "location": "TestSteps.iTryToSignInWithInvalidCredentialsSomethingSomething(String,String)"
});
formatter.result({
  "duration": 4306550400,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iShouldSeeATextSayingTheErrorMessage(DataTable)"
});
formatter.result({
  "duration": 56839100,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Sorry, we did not recognise either your username or password]\u003e but was:\u003c[Privacy \u0026 Cookies Notice]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.sky.step_def.TestSteps.iShouldSeeATextSayingTheErrorMessage(TestSteps.java:64)\r\n\tat ✽.Then I should see a text saying the error message(features/shop_page.feature:16)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1018692700,
  "status": "passed"
});
formatter.before({
  "duration": 1948316300,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "User sees a list of deals on the deals page",
  "description": "",
  "id": "this-feature-will-make-sure-that-the-shop-page-is-navigable-and-usable.;user-sees-a-list-of-deals-on-the-deals-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 21,
      "name": "@wip3"
    }
  ]
});
formatter.step({
  "line": 23,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 24,
  "name": "I navigate to Deals page",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "I see a list of deals with a price to it",
  "rows": [
    {
      "cells": [
        "DealOnePrice",
        "DealTwoPrice",
        "DealThreePrice"
      ],
      "line": 26
    },
    {
      "cells": [
        "£25",
        "£41",
        "£36"
      ],
      "line": 27
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "TestSteps.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 10327543200,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iNavigateToDealsPage()"
});
formatter.result({
  "duration": 3147872000,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.iSeeAListOfDealsWithAPriceToIt(DataTable)"
});
formatter.result({
  "duration": 261224600,
  "status": "passed"
});
formatter.after({
  "duration": 1021820500,
  "status": "passed"
});
});