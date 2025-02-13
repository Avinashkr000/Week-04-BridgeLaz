package org.example.Day02.insurancepolicymanagement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.TimeZone;

class InsurancePolicyTest {
    

    @Test
    void testEquals() {
        InsurancePolicy policy1 = new InsurancePolicy("P123", "John Doe", new Date(), "Health", 500.0);
        InsurancePolicy policy2 = new InsurancePolicy("P123", "Jane Doe", new Date(), "Health", 600.0);
        assertTrue(policy1.equals(policy2));
    }

    @Test
    void testHashCode() {
        InsurancePolicy policy = new InsurancePolicy("P123", "John Doe", new Date(), "Health", 500.0);
        int expectedHashCode = "P123".hashCode();
        assertEquals(expectedHashCode, policy.hashCode());
    }

    @Test
    void testGetPolicyNumber() {
        InsurancePolicy policy = new InsurancePolicy("P123", "John Doe", new Date(), "Health", 500.0);
        assertEquals("P123", policy.getPolicyNumber());
    }

    @Test
    void testGetCoverageType() {
        InsurancePolicy policy = new InsurancePolicy("P123", "John Doe", new Date(), "Health", 500.0);
        assertEquals("Health", policy.getCoverageType());
    }

    @Test
    void testGetExpiryDate() {
        Date expiryDate = new Date();
        InsurancePolicy policy = new InsurancePolicy("P123", "John Doe", expiryDate, "Health", 500.0);
        assertEquals(expiryDate, policy.getExpiryDate());
    }
}