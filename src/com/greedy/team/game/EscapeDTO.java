package com.greedy.team.game;

public abstract class EscapeDTO {
	
	protected static int hp = 100;
	public int mission = (int)(Math.random()*10)+1;
	protected static int count = 0;
	protected String hof = "술집";
	String str = " ";
	protected String []iarr = new String [100];
	protected String []Str = new String [100];
	protected static int coin = (int)(Math.random()*10000)+1000;
	
	

	public abstract void recharge();
	
	public abstract void drink();
	
	public abstract void upDownGame();
	
	public abstract void mart();
	

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp ;
	}

	public int getCoin() {
		
		return coin;
	}

	public void setCoin(int coin) {
		this.coin = coin;
	}
	
	

}
