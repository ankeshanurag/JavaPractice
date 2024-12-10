package com.springproject.rest_demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.rest_demo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	

	CloudVendor cloudVendor;
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId) {
		//System.out.println(vendorId);
		return cloudVendor;
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "vendor created successfully";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudVendor = cloudVendor;
		return "vendor updated successfully";
	}
	
	@DeleteMapping("{vendorId}")
	public String deleteCloudVendorDetails(String vendorId) {
		this.cloudVendor = null;
		return "vendor deleted successfully";
	}
}
