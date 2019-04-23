package com.quantum.javacore.oops;






public class SallowCopyVsDeepCopyByUsingClone  {
	
	
	class User implements Cloneable {
		String name;
		Address address;
		User(String name,Address address){
			this.name=name;
			this.address=address;
		}
		
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
	}
	
	class Address {
		long pincode;
		
		public Address(long pincode) {
			this.pincode=pincode;
		}
		public Object clone() throws CloneNotSupportedException{
			return super.clone();
		}
	
	}
	
	
	class User1 implements Cloneable {
		String name;
		Address1 address;
		User1(String name,Address1 address){
			this.name=name;
			this.address=address;
		}
		public Object clone() throws CloneNotSupportedException{
			
			return new User1(this.name,(Address1)this.address.clone());
		}
	}
	
	class Address1 implements Cloneable {
		long pincode;
		
		public Address1(long pincode) {
			this.pincode=pincode;
		}
		
	  public Object clone() throws CloneNotSupportedException
	  {
		  return new Address1(this.pincode);
	  }
	}
	
	 void sallowCopy(){
		 User clonedUser=null;
		 User user=new User("bairagi",new Address(560037));
		 try {
		 clonedUser=(User)user.clone(); // here we can't access clone method directly, so we created userClone methon. becauxe "clone" method can access inside same class only we can access it another classs
		 }catch(Exception e){e.printStackTrace();}
		 System.out.println(user==clonedUser);
		 System.out.println(user.address==clonedUser.address);
		 
		
	}
	 
	 void deepCopy(){
		 User1 clonedUser=null;
		 User1 user=new User1("bairagi",new Address1(560037));
		 try {
		 clonedUser=(User1)user.clone(); // here we can't access clone method directly, so we created userClone methon. becauxe "clone" method can access inside same class only we can access it another classs
		 }catch(Exception e){e.printStackTrace();}
		 System.out.println(user==clonedUser);
		 System.out.println(user.address==clonedUser.address);
		 
		
	}
	 

	

	
	public static void main(String[] args) throws CloneNotSupportedException {
		SallowCopyVsDeepCopyByUsingClone dcc=new SallowCopyVsDeepCopyByUsingClone();
		dcc.sallowCopy();
		dcc.deepCopy();
		
	}

}
