package com.example.application.data.service;

import com.example.application.data.entity.ConfigurationParameters;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ConfigurationParametersRepository
        extends
            JpaRepository<ConfigurationParameters, Long>,
            JpaSpecificationExecutor<ConfigurationParameters> {

}
