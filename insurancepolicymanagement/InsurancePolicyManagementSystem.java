package org.example.Day02.insurancepolicymanagement;
import java.util.*;

public class InsurancePolicyManagementSystem {
    private Set<InsurancePolicy> hashSet = new HashSet<>();
    private Set<InsurancePolicy> linkedHashSet = new LinkedHashSet<>();
    private Set<InsurancePolicy> treeSet = new TreeSet<>(Comparator.comparing(InsurancePolicy::getExpiryDate));

    public void addPolicyToHashSet(InsurancePolicy policy) {
        hashSet.add(policy);
    }

    public void addPolicyToLinkedHashSet(InsurancePolicy policy) {
        linkedHashSet.add(policy);
    }

    public void addPolicyToTreeSet(InsurancePolicy policy) {
        treeSet.add(policy);
    }

    public void removePolicyFromHashSet(InsurancePolicy policy) {
        hashSet.remove(policy);
    }

    public void removePolicyFromLinkedHashSet(InsurancePolicy policy) {
        linkedHashSet.remove(policy);
    }

    public void removePolicyFromTreeSet(InsurancePolicy policy) {
        treeSet.remove(policy);
    }

    public Set<InsurancePolicy> getAllUniquePolicies() {
        Set<InsurancePolicy> allPolicies = new HashSet<>(hashSet);
        allPolicies.addAll(linkedHashSet);
        allPolicies.addAll(treeSet);
        return allPolicies;
    }

    public Set<InsurancePolicy> getPoliciesExpiringSoon() {
        Set<InsurancePolicy> expiringPolicies = new HashSet<>();
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date thirtyDaysLater = calendar.getTime();

        for (InsurancePolicy policy : getAllUniquePolicies()) {
            if (policy.getExpiryDate().after(currentDate) && policy.getExpiryDate().before(thirtyDaysLater)) {
                expiringPolicies.add(policy);
            }
        }
        return expiringPolicies;
    }

    public Set<InsurancePolicy> getPoliciesByCoverageType(String coverageType) {
        Set<InsurancePolicy> coveragePolicies = new HashSet<>();
        for (InsurancePolicy policy : getAllUniquePolicies()) {
            if (policy.getCoverageType().equalsIgnoreCase(coverageType)) {
                coveragePolicies.add(policy);
            }
        }
        return coveragePolicies;
    }

    public Set<InsurancePolicy> getDuplicatePolicies() {
        Set<InsurancePolicy> duplicates = new HashSet<>();
        Set<String> policyNumbers = new HashSet<>();
        for (InsurancePolicy policy : getAllUniquePolicies()) {
            if (!policyNumbers.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }
        return duplicates;
    }

    public void comparePerformance() {
        long startTime, endTime;

        InsurancePolicy policy1 = new InsurancePolicy("P001", "Aviansh", new Date(), "Health", 200);
        InsurancePolicy policy2 = new InsurancePolicy("P002", "Kunal", new Date(), "Auto", 150);
        InsurancePolicy policy3 = new InsurancePolicy("P003", "Dheeraj", new Date(), "Home", 300);

        startTime = System.nanoTime();
        addPolicyToHashSet(policy1);
        addPolicyToHashSet(policy2);
        addPolicyToHashSet(policy3);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to HashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        addPolicyToLinkedHashSet(policy1);
        addPolicyToLinkedHashSet(policy2);
        addPolicyToLinkedHashSet(policy3);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to LinkedHashSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        addPolicyToTreeSet(policy1);
        addPolicyToTreeSet(policy2);
        addPolicyToTreeSet(policy3);
        endTime = System.nanoTime();
        System.out.println("Time taken to add to TreeSet: " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        hashSet.contains(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in HashSet : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        linkedHashSet.contains(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in LinkedHashSet : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        treeSet.contains(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to search in TreeSet : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        removePolicyFromHashSet(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from HashSet : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        removePolicyFromLinkedHashSet(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from LinkedHashSet : " + (endTime - startTime) + " ns");

        startTime = System.nanoTime();
        removePolicyFromTreeSet(policy1);
        endTime = System.nanoTime();
        System.out.println("Time taken to remove from TreeSet : " + (endTime - startTime) + " ns");
    }
}
