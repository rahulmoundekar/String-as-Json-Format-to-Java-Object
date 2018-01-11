package com.jackson;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jackson.model.Customer;

public class Application {
	public static void main(String[] args) {

		String jsonString = "";

		//
		// Convert Java Object to JSON String
		//
		ObjectMapper mapper = new ObjectMapper();
		try {

			Customer customer = new Customer(1, "Jack", "Kennedy");
			jsonString = mapper.writeValueAsString(customer);
			System.out.println("jsonString = " + jsonString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

		// Convert String as Json Format to Java Object
		try {
			Customer convertedCustomer = mapper.readValue(jsonString, Customer.class);
			System.out.println("convertedCustomer info: " + convertedCustomer.toString());
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
