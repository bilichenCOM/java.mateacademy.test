package study;


public class Main {

	public static void main(String[] args) {
		Group group = new Group("Fantastic Group", 20);
		
		group.addStudents();
		group.addProfessor();
		group.professor.setName("MacGregor");
		group.professor.sayHello();
		group.addChiefOfGroup();
		group.getChiefName();
		group.getChiefFeatures();
		
		group.gotoLesson();
	}

}
