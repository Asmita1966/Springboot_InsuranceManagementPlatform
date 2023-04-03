package com.example.InsuranceManagementPlatform.repository;

import com.example.InsuranceManagementPlatform.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClientRepo extends JpaRepository<Client,Integer> {
}
