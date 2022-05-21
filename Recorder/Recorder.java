package Recorder;

import java.util.*;

public class Recorder {
	Map<String, String> c = new HashMap<String, String>();

	public void put(String key, String value) {
		c.put(key, value);
		System.out.println(key + "=" + value);
	}

	public void get(String key) {
		if (c.get(key) == null) {
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		}
		System.out.println(c.get(key));
	}

	public void delete(String key) {
		if (c.get(key) == null) {
			IllegalArgumentException e = new IllegalArgumentException();
			throw e;
		}
		c.remove(key);
		System.out.println("deleted:" + key);
	}

	public void delete() {
		c.clear();
		System.out.println("deleted all");
	}

}
