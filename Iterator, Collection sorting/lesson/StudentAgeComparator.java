package ua.lviv.lgs;

import java.util.Comparator;

public class StudentAgeComparator  implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
	
		return o1.getAge()>o2.getAge()?1:-1;
	}

}
