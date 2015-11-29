/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quantum.javacore.designpattern;

import java.io.Serializable;

/**
 *
 * @author BAIRAGI
 */
public class DemoSingleTon implements Serializable {
	private volatile static DemoSingleTon instance = null;

	public static DemoSingleTon getInstance() {
		if (instance == null) {
			instance = new DemoSingleTon();
		}
		return instance;
	}

	protected Object readResolve() {
		return instance;
	}

	private int i = 10;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
