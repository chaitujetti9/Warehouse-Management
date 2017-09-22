package com.jetti.crates;

public class Crate implements Comparable{

	int xCord;
	int yCord;

	public Crate(int xCord, int yCord) {
		super();
		this.xCord = xCord;
		this.yCord = yCord;
	}

	public int getxCord() {
		return xCord;
	}

	public int getyCord() {
		return yCord;
	}

	@Override
	public String toString() {
		return "\nCrate  : [x-Cord: " + xCord + ", y-Cord: " + yCord + "]";
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
