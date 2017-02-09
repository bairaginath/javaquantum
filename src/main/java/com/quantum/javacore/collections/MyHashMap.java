package com.quantum.javacore.collections;

public class MyHashMap<K,V> {
	
	class Node<K,V>{;
		int hash;
	    K key;
	    V value;
	    Node<K,V> next;
	    public Node(int hash,K k,V v,Node<K,V> next){
	    	this.hash=hash;
	    	this.key=k;
	    	this.value=v;
	    	this.next=next;
	    }
	}
	
	static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }
	
	public final int getIndex(Object key){
		return  hash(key) & (this.length - 1);
	}	
	Node<K,V> bucket[];
	int length=16;
	int size=0;
	final double efficencyRatio=0.75;
	
	public void checkResize(){
		int efficiencySize=(int)(length*efficencyRatio);
		if(size<efficiencySize)
			return ;
		Node newBucket[]=new Node[this.length=2*this.length];
		newBucket[0]=bucket[0];
		for(int i=1;i<bucket.length;i++){
			Node<K,V> e=bucket[i];
			if(e==null)
				continue;
			int index=getIndex(e.key);
			newBucket[index]=e;
		}
		this.bucket=newBucket;
	}
	
	public MyHashMap(){
		this.bucket=new Node[this.length];
	}
	
	public MyHashMap(int length){
		this.length=length;
		this.bucket=new Node[this.length];
	}
	
	public int size(){
		return this.size;
	}
	
	public V  put(K k,V v){
		checkResize();
		int index=getIndex(k);
		System.out.println("index="+index);
		int hashValue=hash(k);
		Node<K,V> header=bucket[index];
		if(header==null){
			bucket[index]=new Node<K,V>(hashValue,k,v,null);
			size++;
			return v;
		}else{
			Node<K,V> previous=null;
			Node<K,V>temp=header;
			if(temp.hash==0 && temp.key==null)
			{   
				V old=temp.value;
				temp.value=v;
				return old;
			}
			while(temp!=null){
				if(temp.hash==hashValue && temp.key.equals(k)){
					V value=temp.value;
					temp.value=v;
					return value;
				}
				previous=temp;
				temp=temp.next;
				size++;
			}
			previous.next=new Node<K,V>(hashValue,k,v,null);			
		}
		
		return v;
	}
	
	
	public V get(K k){
		int hashValue=hash(k);
		int index=getIndex(k);
		Node<K,V> header=bucket[index];
		if(header==null)
			return null;
		Node<K,V> temp=header;
		if(temp.hash==0 && temp.key==null)
			return temp.value;
		while(temp!=null){
			if(temp.hash==hashValue &&  temp.key.equals(k))
				return temp.value;
			temp=temp.next;
		}
		return null;
	}
	
	public static void main(String[] args) {
/*		MyHashMap<Integer,String> hm=new MyHashMap<>();
		hm.put(1,"bairagi");
		hm.put(2,"kuna");
		System.out.println(hm.put(1,"rajib"));
	    System.out.println(hm.size());
	    System.out.println(hm.get(1));*/
	    
	    MyHashMap<Integer,String> hm1=new MyHashMap<>(4);
	    hm1.put(null,"nullValue1");
	    hm1.put(1,"value1");
	    hm1.put(2,"value2");
	    hm1.put(3,"value3");
	    hm1.put(4,"value4");
	    hm1.put(5,"value5");
	    System.out.println(hm1.size());
	    System.out.println(hm1.get(5));
	    hm1.put(null,"nullValue2");
	    System.out.println(hm1.get(null));
	}

}
