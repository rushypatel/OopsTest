package com.rushit.oopslearn.interfc;
public class MailMessenger implements Messenger {

	public void sendMessage(String receiver, String text) {

		// Connect to mailserver

		// Send message

		// Disconnect
		// Just print to stdout
		System.out.println("A message is sent to " + receiver + ":");
		System.out.println(text);
	}

}