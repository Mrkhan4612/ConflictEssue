package in.mrkhan.controller;

import in.mrkhan.dto.OrderRequest;



import in.mrkhan.entity.Customer;
import in.mrkhan.service.CustomerServ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class OrderController {
	
	@Autowired
	private CustomerServ serv;
	
	@PostMapping("/orderPlace")
	public ResponseEntity<Customer> CustomerInfo(@RequestBody OrderRequest request)
	{
	           	Customer customer = serv.saveOrUpdateCustomer(request);

	           	return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		
		}

}
