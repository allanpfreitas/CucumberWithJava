package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    private String testPalindrome;
    private Boolean isPalindrome;

    @Given("I entered string {string}")
    public void iEnteredString(String toTest) {
        testPalindrome = toTest;
    }

    @When("I test it for palindrome")
    public void iTestItForPalindrome() {
        isPalindrome = testPalindrome.equalsIgnoreCase(new StringBuilder(testPalindrome).reverse().toString());
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String result) {
        boolean expectedResult = Boolean.parseBoolean(result);
        if (expectedResult) {
            Assert.assertTrue(isPalindrome);
        } else {
            Assert.assertFalse(isPalindrome);
        }

    }

    @Given("I entered word {string}")
    public void i_entered_word(String word) {
        testPalindrome = word;
    }
    @Then("The output should be {string}")
    public void the_output_should_be(String expectedresult) {
        theResultShouldBe(expectedresult);

    }
}
