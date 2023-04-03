package com.example.InsuranceManagementPlatform.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "insurance_details")
public class InsurancePolicy {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "policy_No")
    private long policyNo;

    @Column
    private String type;

    @Column
    private long coverageAmt;

    @Column
    private long premium;

    @Column
    private String startDate;

    @Column
    private String endDate;



    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "claims_claim_number",referencedColumnName ="claim_Number" )
    private Claim claims;


    public Claim getClaims() {
        return claims;
    }

    public void setClaims(Claim claims) {
        this.claims = claims;
    }




    public long getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(long policyNo) {
        this.policyNo = policyNo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getCoverageAmt() {
        return coverageAmt;
    }

    public void setCoverageAmt(long coverageAmt) {
        this.coverageAmt = coverageAmt;
    }

    public long getPremium() {
        return premium;
    }

    public void setPremium(long premium) {
        this.premium = premium;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyNo=" + policyNo +
                ", type='" + type + '\'' +
                ", coverageAmt=" + coverageAmt +
                ", premium=" + premium +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", claims=" + claims +
                '}';
    }
}
