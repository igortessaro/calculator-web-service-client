package br.com.calculator.webservice;

import br.com.calculator.webservice.wsclient.Calculator;
import br.com.calculator.webservice.wsclient.CalculatorSoap;

public class Main {

	public static void main(String[] args) {
		Calculator ws = new Calculator();		
		CalculatorSoap soap = ws.getCalculatorSoap();

		int firstInput = 10;
		int secondInput = 5;
		
		System.out.println(soap.divide(firstInput, secondInput));
	}

}
