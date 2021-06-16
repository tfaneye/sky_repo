package com.sky;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        //"pretty",
        "html:target/cukes-test-report-html",
        "html:target/cukes-test-report-json.json",
        "html:target/cukes-test-report-xml.xml",}
        ,features = {"src/test/resources"}
        ,snippets = SnippetType.CAMELCASE
        ,tags = {"@sky_shop, @sky_search"}
)
public class RunnerCukesTest {
}
