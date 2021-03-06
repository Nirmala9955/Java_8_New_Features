//Test04_FunctionStudentGrade.java

import java.util.ArrayList;
import java.util.function.Function;

class Student {
	String name;
	int mark;
	Student(String name, int mark) {
		this.name=name;
		this.mark=mark;
	}
}

class Test04_FunctionStudentGrade {
	
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>();
		populate(al);
		Function<Student, String> f = s -> {
			int mark=s.mark;
			if (mark>=80) {
				return "A [Distinction]";
			} else if(mark>=60) {
				return "B [First class]";
			} else if(mark>=50) {
				return "C [Second class]";
			} else if(mark>=35) {
				return "D [Third class]";
			} else {
				return "F [Failed]";
			}
		};
		for (Student s:al) {
			System.out.println("Name : "+s.name);
			System.out.println("Mark : "+s.mark);
			System.out.println("Grade : "+f.apply(s));
			System.out.println("-------------------------");
		}
	}

	public static void populate(ArrayList<Student> al) {
		al.add(new Student("Sunny", 74));	
		al.add(new Student("Bunny", 54));	
		al.add(new Student("Munny", 84));	
		al.add(new Student("Chunny", 94));	
		al.add(new Student("Kunny", 34));	
	}

}
