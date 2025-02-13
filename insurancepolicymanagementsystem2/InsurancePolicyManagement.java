package org.example.Day02.insurancepolicymanagementsystem2;


import java.util.*;

class InsurancePolicyManagement {
    private HashMap<String, InsurancePolicy2> policyMap = new HashMap<>();
    private LinkedHashMap<String, InsurancePolicy2> linkedPolicyMap = new LinkedHashMap<>();
    private TreeMap<Date, InsurancePolicy2> expirySortedPolicyMap = new TreeMap<>();

    public void addPolicy(InsurancePolicy2 policy) {
        policyMap.put(policy.getPolicyNumber(), policy);
        linkedPolicyMap.put(policy.getPolicyNumber(), policy);
        expirySortedPolicyMap.put(policy.getExpiryDate(), policy);
    }

    public InsurancePolicy2 getPolicyByNumber(String policyNumber) {
        return policyMap.get(policyNumber);
    }

    public List<InsurancePolicy2> listPoliciesExpiringSoon() {
        List<InsurancePolicy2> expiringPolicies = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thresholdDate = calendar.getTime();

        for (Map.Entry<Date, InsurancePolicy2> entry : expirySortedPolicyMap.entrySet()) {
            if (entry.getKey().before(thresholdDate)) {
                expiringPolicies.add(entry.getValue());
            }
        }
        return expiringPolicies;
    }

    public List<InsurancePolicy2> listPoliciesByPolicyholder(String policyholderName) {
        List<InsurancePolicy2> policiesByHolder = new ArrayList<>();
        for (InsurancePolicy2 policy : policyMap.values()) {
            if (policy.getPolicyholderName().equals(policyholderName)) {
                policiesByHolder.add(policy);
            }
        }
        return policiesByHolder;
    }

    public void removeExpiredPolicies() {
        Date currentDate = new Date();
        Iterator<Map.Entry<Date, InsurancePolicy2>> iterator = expirySortedPolicyMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Date, InsurancePolicy2> entry = iterator.next();
            if (entry.getKey().before(currentDate)) {
                iterator.remove();
                policyMap.remove(entry.getValue().getPolicyNumber());
                linkedPolicyMap.remove(entry.getValue().getPolicyNumber());
            }
        }
    }
}
