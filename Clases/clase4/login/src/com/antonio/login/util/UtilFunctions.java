package com.antonio.login.util;

import java.security.MessageDigest;

import javax.swing.JFrame;

/**
 * 
 * @author Antonio
 * 
 */
public class UtilFunctions {

	public static void redirect(JFrame currentView, JFrame view) {
		view.setVisible(true);
		currentView.setVisible(false);
	}

	public static String hash(String message) {
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
		} catch (Exception e) {
			md = null;
			e.printStackTrace();
		}
		md.update(message.getBytes());
		byte byteData[] = md.digest();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < byteData.length; i++) {
			sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
		}
		return sb.toString();
	}

}
