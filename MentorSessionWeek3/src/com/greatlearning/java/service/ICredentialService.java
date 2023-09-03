package com.greatlearning.java.service;
import com.greatlearning.java.Employee;

public interface ICredentialService {
	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCredentials(Employee employee);
	
	
	

}
