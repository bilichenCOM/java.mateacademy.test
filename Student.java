package study;

import java.util.Random;

public class Student {
	private final String NAME;
	private String group;
	private final int ACHIEVEMENTS;
	private final int RESPECT;
	private final int STAMINA;
	private final String SEX;
	private boolean chief = false;
	private boolean absent=false;
	
	Student(String name) {
		this.NAME=name;
		Random random = new Random();
		
		this.ACHIEVEMENTS=random.nextInt(10);
		this.RESPECT=random.nextInt(10);
		this.STAMINA=random.nextInt(10);
		
		if(random.nextBoolean()) {
			this.SEX="male";
		} else {
			this.SEX="female";
		}
		System.out.println("|        "+this.getNAME()+"        |");
	}
	
	public String getNAME() {
		return NAME;
	}
	
	public String getGroup() {
		return group;
	}
	
	public void setGroup(String group) {
		this.group=group;
	}

	public int getACHIEVEMENTS() {
		return ACHIEVEMENTS;
	}


	public int getRESPECT() {
		return RESPECT;
	}


	public int getSTAMINA() {
		return STAMINA;
	}


	public String getSEX() {
		return SEX;
	}
	
	public boolean isChief() {
		return this.chief;
	}
	
	public void makeChief() {
		this.chief=true;
	}
	
	public boolean isAbsent() {
		return this.absent;
	}
	public void setAbsent(boolean absent) {
		this.absent=absent;
	}
	
	
}
