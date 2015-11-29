package com.quantum.javacore.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


class EmpClass {
	int empId;
	String empName;
	EmpClass(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}
	@Override
	public int hashCode() {		
		return empId*this.empName.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {		
		return this.hashCode()==obj.hashCode();
	}
}

public class HashMapKeyConcept {
	public static void main(String[] args) {
		EmpClass emp1=new EmpClass(4,"bairagi");
		EmpClass emp2=new EmpClass(4,"bairagi");
		Map<EmpClass,Integer> m=new HashMap<EmpClass, Integer>();
		m.put(emp1,600);
		System.out.println(m.get(emp2));
	}
	
	

	
	
	

}
