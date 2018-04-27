package com.mypackage.soap;

import java.math.BigInteger;

import com.dataaccess.webservicesserver.NumberConversion;

public class NumberConversionApp {

	public static void main(String[] args) {
		BigInteger inputBig = new BigInteger("4321");
		NumberConversion numberConversion = new NumberConversion();
		System.out.println("Number in words : " + numberConversion.getNumberConversionSoap().numberToWords(inputBig));
	}

}
