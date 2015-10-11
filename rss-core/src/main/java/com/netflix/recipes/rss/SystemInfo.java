package com.netflix.recipes.rss;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class SystemInfo {

	public static String getHostname() {
		InetAddress ip = null;
		String hostname = "";
		try {
			ip = InetAddress.getLocalHost();
			hostname = ip.getHostName();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return hostname;
	}
}
