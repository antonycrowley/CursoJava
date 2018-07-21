package com.antonio.login.util;

import com.antonio.login.model.Person;

public class SessionData {
	
	private static Person currentPerson;
	public static Person getCurrentPerson() {
		return currentPerson;
	}
	
	public static void setCurrentPerson(Person currentPerson) {
		SessionData.currentPerson = currentPerson;
	}

}
