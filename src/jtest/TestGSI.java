package jtest;

import java.net.UnknownHostException;

public class TestGSI {
	public static void main(String[] args) throws UnknownHostException {
		String hostname = java.net.InetAddress.getLocalHost().getHostName() ;
		System.out.println(hostname);
	}
}
