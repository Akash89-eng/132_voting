package com.voting;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VoterTest {

    @Test
    public void testEligibleVoter() {
        Voter voter = new Voter("Amit Kumar", 25, "Indian", "VID12345", true);
        assertEquals("Eligible to vote.", voter.evaluateEligibility());
    }

    @Test
    public void testUnderageVoter() {
        Voter voter = new Voter("Rahul", 16, "Indian", "VID54321", true);
        assertEquals("Ineligible: Underage (Must be at least 18 years old).", voter.evaluateEligibility());
    }

    @Test
    public void testNonCitizenVoter() {
        Voter voter = new Voter("John Doe", 30, "American", "VID9999", true);
        assertEquals("Ineligible: Not an Indian citizen.", voter.evaluateEligibility());
    }

    @Test
    public void testInvalidIdVoter() {
        Voter voter = new Voter("Priya", 22, "Indian", "INVALID", false);
        assertEquals("Ineligible: Invalid or missing Voter ID.", voter.evaluateEligibility());
    }
}
