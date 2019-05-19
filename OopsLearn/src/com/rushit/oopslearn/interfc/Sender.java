package com.rushit.oopslearn.interfc;
public class Sender {

	public static void main(String args[]) {

		// Retrieve an Implementation of the interface
		Messenger m = getMessenger();

		// Send a message
		m.sendMessage("Bob", "Hello Bob, this is Alice!");
	}

	private static Messenger getMessenger() {
		// TODO Auto-generated method stub
		MailMessenger objMainMessenger = new MailMessenger();
		return objMainMessenger;
	}
}