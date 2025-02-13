package org.example.Day02.insurancepolicymanagementsystem2;

import java.util.*;

class InsurancePolicy2 {
    String policyNumber;
    String policyholderName;
    Date expiryDate;

    @Override
    public String toString() {
        return "InsurancePolicy2{" +
                "policyNumber='" + policyNumber + '\'' +
                ", policyholderName='" + policyholderName + '\'' +
                ", expiryDate=" + expiryDate +
                '}';
    }

    public InsurancePolicy2(String policyNumber, String policyholderName, Date expiryDate) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
    }

    public InsurancePolicy2() {

    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }
}



