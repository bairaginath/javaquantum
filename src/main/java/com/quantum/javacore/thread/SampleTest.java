package com.quantum.javacore.thread;

import java.util.ArrayList;
import java.util.List;


class AddList extends Thread {
	List<Integer> list=null;
	AddList(List<Integer> list){
		this.list=list;
	}
	public void run(){
		
		synchronized (list) {
			for(int i=0;i<3;i++){
				list.add(i);
			}
			list.notify();
			
		}
		
	}
	
}

class RemoveList extends Thread {
	AddList ad;
	RemoveList(AddList ad){
		this.ad=ad;
		this.ad.start();
		this.start();
	}
	public void run(){
		synchronized (ad.list) {
			try{
				
			ad.list.wait();
			}catch(InterruptedException ie){}
			/*for(int i=0;i<3;i++){
				System.out.println(ad.list.get(i));
			}*/
			System.out.println("Size  "+ad.list.size());
			new RemoveList(new AddList(ad.list));
			
			
			
		}
		
	}
	
}

public class SampleTest {
	public static void main(String[] args) {
		System.out.println("In side Main Method");
		List<Integer> list=new ArrayList<Integer>();
		AddList addList=new AddList(list);
		RemoveList removeList=new RemoveList(addList);
		
	}
	
	

}
