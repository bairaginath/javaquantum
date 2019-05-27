/**
 * 
 */
package com.quantum.javacore.generics;

/**
 * @author bairagi 14-Apr-2019 2:23:47 PM FruitTeste.java
 *
 */
interface Fruit {
	String teste();
}
class Apple implements Fruit {

	@Override
	public String teste() {
		return "sweet";
	}
	 
}

class Masambi implements Fruit {
	 @Override
	 public String teste(){
		 return "sour";
	 }
}
public class FruitTeste <T extends Fruit>{
	
  T instance;
  public FruitTeste()  {
	  //instance=new T();
  }
  
  public String teste(){
	  return instance.teste();
  }
  
  public static void main(String[] args) {
	FruitTeste<Apple> ft=new FruitTeste<>();
	try {
	ft.teste();
	FruitTeste<Masambi> ft1=new FruitTeste<>();
	ft1.teste();
	}catch(NullPointerException npe){}
	
	}
	  

	

}
