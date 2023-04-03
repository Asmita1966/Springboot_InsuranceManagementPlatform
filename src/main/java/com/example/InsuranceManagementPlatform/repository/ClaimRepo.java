package com.example.InsuranceManagementPlatform.repository;

import com.example.InsuranceManagementPlatform.model.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimRepo extends JpaRepository<Claim,Long> {
}
