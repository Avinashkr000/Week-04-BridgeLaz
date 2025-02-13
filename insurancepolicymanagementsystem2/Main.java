package org.example.Day02.insurancepolicymanagementsystem2;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagement management = new InsurancePolicyManagement();

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MONTH, 1);
        Date expiryDate1 = calendar.getTime();

        calendar.add(Calendar.MONTH, 2);
        Date expiryDate2 = calendar.getTime();

        InsurancePolicy2 policy1 = new InsurancePolicy2("POLICY001", "Avinash", expiryDate1);
        InsurancePolicy2 policy2 = new InsurancePolicy2("POLICY002", "Kunal", expiryDate2);

        management.addPolicy(policy1);
        management.addPolicy(policy2);

        System.out.println(management.getPolicyByNumber("POLICY001"));
        System.out.println(management.listPoliciesExpiringSoon());
        System.out.println(management.listPoliciesByPolicyholder("Avinash"));

        management.removeExpiredPolicies();
    }
}