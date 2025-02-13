package org.example.Day02.insurancepolicymanagementsystem2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

class MainTest {

    @Test
    void testAddPolicy() {
        InsurancePolicyManagement management = new InsurancePolicyManagement();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        Date expiryDate = calendar.getTime();

        InsurancePolicy2 policy = new InsurancePolicy2("POL001", "John Doe", expiryDate);
        management.addPolicy(policy);

        assertEquals(policy, management.getPolicyByNumber("POL001"));
    }

    @Test
    void testGetPolicyByNumber() {
        InsurancePolicyManagement management = new InsurancePolicyManagement();
        InsurancePolicy2 policy = new InsurancePolicy2("POL002", "Jane Doe", new Date());
        management.addPolicy(policy);

        assertEquals(policy, management.getPolicyByNumber("POL002"));
        assertNull(management.getPolicyByNumber("NON_EXISTENT"));
    }

    @Test
    void testRemoveExpiredPolicies() {
        InsurancePolicyManagement management = new InsurancePolicyManagement();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, -1);
        Date expiredDate = calendar.getTime();

        InsurancePolicy2 expiredPolicy = new InsurancePolicy2("POL003", "Expired Holder", expiredDate);
        management.addPolicy(expiredPolicy);

        management.removeExpiredPolicies();

        assertNull(management.getPolicyByNumber("POL003"));
    }

    @Test
    void testListPoliciesExpiringSoon() {
        InsurancePolicyManagement management = new InsurancePolicyManagement();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 5);
        Date expiringSoonDate = calendar.getTime();

        InsurancePolicy2 policy = new InsurancePolicy2("POL004", "Expiring Holder", expiringSoonDate);
        management.addPolicy(policy);

        assertTrue(management.listPoliciesExpiringSoon().contains(policy));
    }

    @Test
    void testListPoliciesByPolicyholder() {
        InsurancePolicyManagement management = new InsurancePolicyManagement();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        Date expiryDate = calendar.getTime();

        InsurancePolicy2 policy = new InsurancePolicy2("POL005", "John Smith", expiryDate);
        management.addPolicy(policy);

        assertTrue(management.listPoliciesByPolicyholder("John Smith").contains(policy));
        assertTrue(management.listPoliciesByPolicyholder("Jane Doe").isEmpty());
    }
}