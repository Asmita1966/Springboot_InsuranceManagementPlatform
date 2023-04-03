package com.example.InsuranceManagementPlatform.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "clients_details")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "client_id")
    private int id;

    @Column
    private String name;

    @Column
    private String dob;

    @Column
    private String address;

    @Column
    private long contactNo;



    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinColumn(name = "insurance_policies_policy_no",referencedColumnName = "policy_No")
    private InsurancePolicy insurancePolicies;

    public InsurancePolicy getInsurancePolicies() {
        return insurancePolicies;
    }

    public void setInsurancePolicies(InsurancePolicy insurancePolicies) {
        this.insurancePolicies = insurancePolicies;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getContactNo() {
        return contactNo;
    }

    public void setContactNo(long contactNo) {
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", address='" + address + '\'' +
                ", contactNo=" + contactNo +
                ", insurancePolicies=" + insurancePolicies +
                '}';
    }
}
