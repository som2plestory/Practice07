package com.javaex.ex02;

public class Sparrow extends Bird {
	
	public Sparrow() {
		super();
	}
	
	public Sparrow(String name) {
		super(name);
	}


	public void sing() {
		System.out.println("참새("+super.getName()+")가"+"소리내어 웁니다.");
    }

    public void fly() {
    	System.out.println("오리("+super.getName()+")가"+" 날아 다닙니다.");
    }
    
    public void showName() {
    	System.out.println("참새의 이름은 "+super.getName()+" 입니다." );
    }

}
