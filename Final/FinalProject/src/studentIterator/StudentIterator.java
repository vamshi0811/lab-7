package studentIterator;

import studentSingleton.Student;

public class StudentIterator implements Iterator {

	Student[] student;
	int position = 0;

	public StudentIterator(Student[] student) {
		this.student = student;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if (position >= student.length || student[position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		Student students = student[position];
		position = position + 1;
		return students;
	}

}
