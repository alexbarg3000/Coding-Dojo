package com.codingdojo.java.spring.driverslicense.services;

import com.codingdojo.java.spring.driverslicense.models.License;
import com.codingdojo.java.spring.driverslicense.repositories.LicenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LicenseService {
    private final LicenseRepository licenseRepository;

    public LicenseService(LicenseRepository licenseRepository) {
        this.licenseRepository = licenseRepository;
    }

    public License createLicense(License license) {

        return licenseRepository.save(license);
    }

    public static int licenseNumber;

    public static int getLicenseNumber() {
        return licenseNumber;
    }

    public static void setLicenseNumber(int licenseNumber) {
        LicenseService.licenseNumber = licenseNumber;
    }

    public String stringLicenseNumber(int num) {
        String format = String.format("%06d", num);
        return format;
    }

    public String generateLicenseNumber() {
        if(licenseRepository.findTopByOrderByNumberDesc().isEmpty()) {
            licenseNumber +=1;
        }
        else {
            List<License> top = licenseRepository.findTopByOrderByNumberDesc() ;
            licenseNumber = 1+(Integer.parseInt(top.get(0).getNumber()));
        }
        return stringLicenseNumber(licenseNumber);
    }

    public Optional<License> getLicense(Long id) {
        return licenseRepository.findById(id);
    }
}
