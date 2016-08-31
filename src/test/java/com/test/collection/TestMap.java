package com.test.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
	public static void main(String[] args) throws java.lang.Exception {
		Map<Persion, Integer> map = new HashMap<Persion, Integer>();
		Persion p = new Persion("bairagi");
		map.put(p, 32);
		p.setName("nath");
		map.put(p, 33);
		map.forEach((k, v) -> System.out.println("Key :" + k + "::Value::" + v));
		System.out.println(map.size());
	}

	static class Persion {
		private String name;

		public Persion(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int hashCode() {
			System.out.println("Hashcode :" + name + "::" + name.hashCode());
			return name.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj != null && obj instanceof Persion) {
				return ((Persion) obj).getName().equals(this.name);
			}
			return false;
		}

		@Override
		public String toString() {
			return "Persion [name=" + name + "]";
		}

	}
}
