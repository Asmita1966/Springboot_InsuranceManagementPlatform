package com.example.InsuranceManagementPlatform.controller;

import com.example.InsuranceManagementPlatform.model.Claim;
import com.example.InsuranceManagementPlatform.model.Client;
import com.example.InsuranceManagementPlatform.model.InsurancePolicy;
import com.example.InsuranceManagementPlatform.repository.ClaimRepo;
import com.example.InsuranceManagementPlatform.repository.ClientRepo;
import com.example.InsuranceManagementPlatform.repository.InsurancePolicyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api")
public class ApiControllers {


    @Autowired
    private ClientRepo clientRepo;

    @Autowired
    private ClaimRepo claimRepo;

    @Autowired
    private InsurancePolicyRepo insurancePolicyRepo;


    @GetMapping(value = "/clients")
    public List<Client> getClient(){
        return clientRepo.findAll();
    }

    @GetMapping(value = "/clients/{id}")
    public Optional<Client> getUserById(@PathVariable int id, @RequestBody Client client){
        Client getUser=clientRepo.findById(id).orElseThrow(NoSuchElementException::new);
        return clientRepo.findById(id);

    }

    @PostMapping(value = "/clients")
    public String saveClient(@RequestBody Client client){
        clientRepo.save(client);
        return "New client created successfully...!";
    }

    @PutMapping(value = "/clients/{id}")
    public String updateClient(@PathVariable int id, @RequestBody Client client){
        Client updatedClient=clientRepo.findById(id).orElseThrow(NoSuchElementException::new);
        updatedClient.setDob(client.getDob());
        updatedClient.setName(client.getName());
        updatedClient.setContactNo(client.getContactNo());
        updatedClient.setAddress(client.getAddress());
        updatedClient.setId(client.getId());
        clientRepo.save(updatedClient);
        return "Updated successfully...!";

    }

    @DeleteMapping(value = "/clients/{id}")
    public String deleteClient(@PathVariable int id, @RequestBody Client client){
        Client deleteClient=clientRepo.findById(id).orElseThrow(NoSuchElementException::new);
        clientRepo.delete(deleteClient);
        return "Deleted client with id: "+id;
    }

//    ------------------------------------------------------------------------------------------------------

    @GetMapping(value = "/policies")
    public List<InsurancePolicy> getInsurancePolicy(){
        return insurancePolicyRepo.findAll();
    }

    @GetMapping(value = "/policies/{policyNo}")
    public Optional<InsurancePolicy> getPolicyById(@PathVariable long policyNo, @RequestBody InsurancePolicy insurancePolicy){
        InsurancePolicy getPolicyNo=insurancePolicyRepo.findById(policyNo).orElseThrow(NoSuchElementException::new);
        return insurancePolicyRepo.findById(policyNo);
    }

    @PostMapping(value = "/policies")
    public String savePolicy(@RequestBody InsurancePolicy insurancePolicy){
        insurancePolicyRepo.save(insurancePolicy);
        return "Policy saved successfully...!";
    }

    @PutMapping(value = "/policies/{policyNo}")
    public String updatePolicy(@PathVariable long policyNo, @RequestBody InsurancePolicy insurancePolicy){
        InsurancePolicy updatedPolicy=insurancePolicyRepo.findById(policyNo).orElseThrow(NoSuchElementException::new);
        updatedPolicy.setPolicyNo(insurancePolicy.getPolicyNo());
        updatedPolicy.setCoverageAmt(insurancePolicy.getCoverageAmt());
        updatedPolicy.setPremium(insurancePolicy.getPremium());
        updatedPolicy.setEndDate(insurancePolicy.getEndDate());
        updatedPolicy.setType(insurancePolicy.getType());
        updatedPolicy.setStartDate(insurancePolicy.getStartDate());
        insurancePolicyRepo.save(updatedPolicy);
        return "Policy updated successfully...!";
    }

    @DeleteMapping(value = "/policies/{policyNo}")
    public String deletePolicy(@PathVariable long policyNo, @RequestBody InsurancePolicy insurancePolicy){
        InsurancePolicy deletePolicy=insurancePolicyRepo.findById(policyNo).orElseThrow(NoSuchElementException::new);
        insurancePolicyRepo.delete(deletePolicy);
        return "Policy deleted successfully by Policy No.: "+policyNo;
    }

//    ------------------------------------------------------------------------------------------------------------------

    @GetMapping(value = "/claims")
    public List<Claim> getClaims(){
        return claimRepo.findAll();
    }

    @GetMapping(value = "/claims/{claimNumber}")
    public Optional<Claim> getClaimById(@PathVariable long claimNumber, @RequestBody Claim claim){
        Claim getClaim=claimRepo.findById(claimNumber).orElseThrow(NoSuchElementException::new);
        return claimRepo.findById(claimNumber);
    }

    @PostMapping(value = "/claims")
    public String saveClaim(@RequestBody Claim claim){
        claimRepo.save(claim);
        return "New Claim created successfully...!";
    }

    @PutMapping(value = "/claims/{claimNumber}")
    public String updateClaim(@PathVariable long claimNumber, @RequestBody Claim claim){
        Claim updatedClaim=claimRepo.findById(claimNumber).orElseThrow(NoSuchElementException::new);
        updatedClaim.setClaimNumber(claim.getClaimNumber());
        updatedClaim.setClaimDate(claim.getClaimDate());
        updatedClaim.setClaimStatus(claim.getClaimStatus());
        updatedClaim.setDescription(claim.getDescription());
        claimRepo.save(updatedClaim);
        return "Updated successfully...!";
    }

    @DeleteMapping(value = "/claims/{claimNumber}")
    public String deleteClaim(@PathVariable long claimNumber, @RequestBody Claim claim){
        Claim deletedClaim=claimRepo.findById(claimNumber).orElseThrow(NoSuchElementException::new);
        claimRepo.delete(deletedClaim);
        return "Deleted claim Successfully...!";
    }
}
