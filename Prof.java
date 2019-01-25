package study;

import java.util.Random;

public class Prof {
	private String name;
	private String group;
	private final int age;
	private final int PROF_MAX_AGE=87;
	private final int PROF_MIN_AGE=18;
	
	Prof(String name, Group group) {
		Random age = new Random();
		int range = PROF_MAX_AGE-PROF_MIN_AGE;
		
		this.name=name;
		this.age=PROF_MIN_AGE+age.nextInt(range);
		
		System.out.println("+++++++++++++++++++++++++");
		System.out.println("There is a professor: "+this.getName());
		System.out.println("He is "+this.getAge()+" years old");
		
		int a = this.getAge();
		
		if(a>80) {
			System.out.println("It seems he is going to leave us");
		} else if(a>70) {
			System.out.println("Just a serial killer");
		} else if(a>60) {
			System.out.println("Good professor");
		} else if(a<25) {
			System.out.println("Just too young");
		} else {
			System.out.println("And he is normal. Congratulations!!!");
		}
		System.out.println("");
	}
	void sayHello() {
		System.out.println("Good morning. I`m professor "+this.getName()+"\r\n");
	}
	
	void checkStudentsOf(Group group) {
		System.out.println("Lets check my journal...");
		System.out.println("");
		
		int k = group.getSize();
		int i;
		
		for(i=0; i<k;i++) {
			if(group.students[i].isAbsent()) {
				System.out.println("Oh, I can't see: "+group.students[i].getNAME());
			}
		}
		System.out.println("");
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public int getAge() {
		return age;
	}

}
