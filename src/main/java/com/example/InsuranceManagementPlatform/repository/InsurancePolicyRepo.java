package com.example.InsuranceManagementPlatform.repository;

import com.example.InsuranceManagementPlatform.model.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


public interface InsurancePolicyRepo extends JpaRepository<InsurancePolicy, Long> {
}
