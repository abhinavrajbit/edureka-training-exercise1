package com.service.publisher;

import javax.xml.ws.Endpoint;

import com.service.impl.CalculatorSoapServiceImpl;



public class Publisher {

	public static void main(String[] args) {
		String url="http://localhost:8001/calculator";
		Endpoint.publish(url, new CalculatorSoapServiceImpl());
		System.out.println("The service is up and running on" +url);
		System.out.println("Open Chrome and add ?wsdl at the end of the url ");
	}

}
