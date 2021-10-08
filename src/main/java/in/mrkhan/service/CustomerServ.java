package in.mrkhan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.mrkhan.dto.OrderRequest;
import in.mrkhan.entity.Customer;
import in.mrkhan.entity.Product;
import in.mrkhan.repository.CustomerRepository;
import in.mrkhan.repository.ProductRepository;

@Service
public class CustomerServ {
	@Autowired 
	private CustomerRepository customerRepository;
	 
	 @Autowired 
	 private ProductRepository productRepository;
	 
	public Customer saveOrUpdateCustomer(OrderRequest request)
	{
		String status="";
		boolean present = customerRepository.findById(request.getCustomer().getId()).isPresent();
		
		if(present)
		{
			status="data updated";
			
			return customerRepository.save(request.getCustomer());
			
		}
		else
		{
			status="data inserted";
			return customerRepository.save(request.getCustomer());
			
		}
		

	}

}
