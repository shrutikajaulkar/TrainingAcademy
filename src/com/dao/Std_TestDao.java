package com.dao;
import java.util.List;

import com.modal.Stud_Test;
import com.modal.Student;

public interface Std_TestDao {
	boolean addTestMarks(Stud_Test o);
	boolean updateTestMarks(Stud_Test o);
	boolean deleteTestResult(int id);
	List<Stud_Test> getAllStud_Test();
}
