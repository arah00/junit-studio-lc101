package test;

import main.BalancedBrackets;
import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    /* These strings have balanced brackets:
            *  "[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
            *
            * While these do not:
            *   "[LaunchCode", "Launch]Code[", "[", "]["*/
    @Test
    public void emptyTest() {
        assertTrue(true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void emptyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void mixedBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch([Code])"));
    }

    @Test
    public void unclosedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode[LaunchCode]"));
    }
    @Test
    public void mixedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch[Code}])]"));
    }

    @Test
    public void reverseOrderBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

}
