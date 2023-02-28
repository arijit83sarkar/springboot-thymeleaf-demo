package com.raven.springbootthymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.raven.springbootthymeleafdemo.model.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	private List<Customer> customers;

	@PostConstruct
	private void loadCustomers() {
		this.customers = new ArrayList<>();

		Customer customer = new Customer(1, "Schwartz J. Wright", "(000) 666-6666", "schwartz@example.com",
				"5659 Heavner AvenueAtlanta, GAUnited States");
		this.customers.add(customer);

		customer = new Customer(2, "Patricia L. Dubose", "(098) 765-5411", "patricia@example.com",
				"1462 Brown AvenueEnoree, SC, 41231United States");
		this.customers.add(customer);

		customer = new Customer(3, "Patricia L. Dubose", "(098) 765-5411", "patricia@example.com",
				"1462 Brown AvenueEnoree, SC, 41231United States");
		this.customers.add(customer);

		customer = new Customer(4, "Raquel M. Morgan", "(123) 333-3333", "raquel@example.com",
				"1333 Plainfield AvenueNY, 1234United States");
		this.customers.add(customer);

		customer = new Customer(5, "Jill J. Morris", "(123) 555-5555", "jill@example.com",
				"2508 Timber Oak DriveRiverside, CA, 75421United States");
		this.customers.add(customer);
	}

	@GetMapping("/list")
	public ModelAndView listCustomers() {
		ModelAndView modelAndView = new ModelAndView("customers/customerlist");
		modelAndView.addObject("customers", this.customers);

		return modelAndView;
	}

	@GetMapping("/getCustomerDetails")
	public ModelAndView getCustomerDetails() {
		ModelAndView modelAndView = new ModelAndView("customers/customer_details");

		Customer customer = new Customer(4, "Raquel M. Morgan", "(123) 333-3333", "raquel@example.com",
				"1333 Plainfield AvenueNY, 1234United States");
		modelAndView.addObject("customer", customer);

		return modelAndView;
	}
}
