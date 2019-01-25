package study;

import java.util.Random;

public class Group {
	private String name;
	private final int size;
	private final String DEFAULT_PROF_NAME = "Professor";
	private final String DEFAULT_STUDENT_NAME = "Student";
	private Student chief;
	public Student[] students;
	Prof professor;
	
	Group(String name, int size) {
		this.name=name;
		this.size=size;
	}
	void addStudents() {
		int i;
		
		students = new Student[size];
		
		System.out.println("_________________________");
		System.out.println("|                       |");
		
		for(i=0;i<size;++i) {
			students[i]=new Student(DEFAULT_STUDENT_NAME+i);
			students[i].setGroup(name);
		}
		
		System.out.println("|                        |");
		System.out.println("__________________________");
	}
	
	void addProfessor() {
		professor=new Prof(DEFAULT_PROF_NAME, this);
		professor.setGroup(name);
	}
	
	void gotoLesson() {
		makeAbsentStudents();
		this.getProfessor().checkStudentsOf(this);
	}
	
	void addChiefOfGroup() {
		int index = calculateChiefIndex();
		students[index].makeChief();
		this.chief=students[index];
	}
	
	private int calculateChiefIndex() {
		int i;
		int[] marks = new int[size];
		int max_mark=0;
		int max_index=0;
		
		for(i=0;i<size;i++) {
			int achievements = students[i].getACHIEVEMENTS();
			int respect = students[i].getRESPECT();
			int stamina = students[i].getSTAMINA();
			
			marks[i]=achievements+respect+stamina;
		}
		for(i=0;i<size;i++) {
			if(marks[i]>max_mark) {
				max_mark=marks[i];
				max_index=i;
			}
		}
		return max_index;
	}
	
	private void makeAbsentStudents() {
		Random random = new Random();
		int i;
		int r;
		int absent_count;
		
		absent_count=random.nextInt(this.size);

		for(i=0;i<absent_count;i++) {
			r=random.nextInt(this.size);
			this.students[r].setAbsent(true);;
		}
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student[] getStudents() {
		return students;
	}
	public Prof getProfessor() {
		return professor;
	}
	public int getSize() {
		return size;
	}
	public String getChiefName() {
		System.out.println("Chief of this group is \r\n"+this.chief.getNAME()+"\r\n");
		return chief.getNAME();
	}
	public Student getChief() {
		return chief;
	}
	public String getChiefFeatures() {
		int achievements = this.chief.getACHIEVEMENTS();
		int respect = this.chief.getRESPECT();
		int stamina = this.chief.getSTAMINA();
		String sex = this.chief.getSEX();
		System.out.println("Chief features:\r\n Achievements: "+achievements+"\r\n Respect: "
		+respect+"\r\n Stamina: "+stamina+"\r\n Sex: "+sex+"\r\n");
		return ("Chief features:\r\n Achievements: "+achievements+"\r\n Respect: "
		+respect+"\r\n Stamina: "+stamina+"\r\n Sex: "+sex+"\r\n");
	}
	
}
