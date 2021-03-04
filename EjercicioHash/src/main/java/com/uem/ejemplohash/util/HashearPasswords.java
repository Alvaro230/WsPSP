package com.uem.ejemplohash.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.xml.bind.DatatypeConverter;

public class HashearPasswords {
	
	public static String cifrarPassword(String password) throws NoSuchAlgorithmException {
		byte[] pass = password.getBytes();
		
		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(pass);
		
		byte[] passhash = md.digest();
		
		//O a Hexadecimal
		String mensajeHashHex = DatatypeConverter.printHexBinary(passhash);
		
		return mensajeHashHex;
	}
}
