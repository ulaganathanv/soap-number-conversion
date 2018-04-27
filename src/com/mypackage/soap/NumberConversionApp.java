package com.mypackage.soap;

import java.math.BigInteger;

import com.dataaccess.webservicesserver.NumberConversion;

public class NumberConversionApp {

	// Stub is generated using the below command
	// wsimport -keep -s src http://www.dataaccess.com/webservicesserver/numberconversion.wso?WSDL
	// Package com.dataaccess.webservicesaserver is created to place the source files.
	public static void main(String[] args) {
		BigInteger inputBig = new BigInteger("4321");
		NumberConversion numberConversion = new NumberConversion();
		System.out.println("Number in words : " + numberConversion.getNumberConversionSoap().numberToWords(inputBig));
	}

}
