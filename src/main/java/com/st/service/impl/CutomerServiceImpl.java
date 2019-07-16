package com.st.service.impl;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.st.entity.Customer;
import com.st.repo.CustomerRepo;
import com.st.service.ICustomerService;

@Service
public class CutomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepo repo;
	
	@Override
	@Transactional
	public Integer saveCustomer(Customer customer) {
		
		return repo.save(customer).getCustId();
	}

	@Override
	@Transactional(readOnly = true)
	public Customer getCustomer(Integer id) {
		
		Optional<Customer> opt=repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	@Override
	@Transactional(readOnly = true)
	public List<Customer> getAll() {

		return repo.findAll();
	}

	@Override
	@Transactional
	public void deleteCust(Integer id) {
		repo.deleteById(id);
	}

	
}
