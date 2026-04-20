package week3_zhangtianlu.practice1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Student> student = new ArrayList<Student>();
		student.add(new Student("Alice",15,60));
		student.add(new Student("Takuya",12,90));
		student.add(new Student("Ryo",25,34));
		student.add(new Student("Suzanu",18,20));
		List<Student> result = student.stream()
			.filter(s->s.getScore()<60)
			.sorted(Comparator.comparingInt(Student::getScore).reversed())
			.collect(Collectors.toList());
		System.out.println(result);
	}
}
