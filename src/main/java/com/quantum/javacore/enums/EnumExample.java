/**
 * 
 */
package com.quantum.javacore.enums;

/**
 * @author bairagi 12-Feb-2018 12:33:36 AM EnumExample.java
 *
 */

public class EnumExample {
	
	//Basic Enum
	public enum UserStatus {
	    PENDING,
	    ACTIVE,
	    INACTIVE,
	    DELETED;
	}
	//Enum + Instance field
	public enum WhoisRIR {
	    ARIN("whois.arin.net"),
	    RIPE("whois.ripe.net"),
	    APNIC("whois.apnic.net"),
	    AFRINIC("whois.afrinic.net"),
	    LACNIC("whois.lacnic.net"),
	    JPNIC("whois.nic.ad.jp"),
	    KRNIC("whois.nic.or.kr"),
	    CNNIC("ipwhois.cnnic.cn"),
	    UNKNOWN("");
		
		
		private String url;
		WhoisRIR(String url) {
	        this.url = url;
	    }
		public String getUrl(){
			return this.url;
		}
	}
		//Enum + Method + Some logic

		public enum Operation {
		    PLUS,
		    MINUS,
		    TIMES,
		    DIVIDE;

		    double calculate(double x, double y) {
		        switch (this) {
		            case PLUS:
		                return x + y;
		            case MINUS:
		                return x - y;
		            case TIMES:
		                return x * y;
		            case DIVIDE:
		                return x / y;
		            default:
		                throw new AssertionError("Unknown operations " + this);
		        }
		    }

		}
		
		
	
	
 
public static void main(String[] args) {
	System.out.println(UserStatus.ACTIVE);
	System.out.println(WhoisRIR.RIPE.getUrl());
	System.out.println(Operation.PLUS.calculate(1, 2));
	for (UserStatus status : UserStatus.values()) {
        System.out.println(status);
    }
	
	WhoisRIR output[]=new WhoisRIR[]{WhoisRIR.AFRINIC,WhoisRIR.APNIC};
	for(WhoisRIR w:output){
		if(w==WhoisRIR.APNIC)
			System.out.println(true);
		else
			System.out.println(false);
	}
	//Convert a String to Enum object.
	System.out.println(Operation.valueOf("PLUS").calculate(4, 7));
}

}
