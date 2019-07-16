package com.st.service;

import java.util.List;

import com.st.entity.Customer;

public interface ICustomerService {

	 public abstract Integer saveCustomer(Customer customer);
	 public abstract Customer getCustomer(Integer id);
	 List<Customer> getAll();
	 void deleteCust(Integer id );
}
