package step9_03.student;

public class StudentDelete {

	private StudentDAO stdDAO ;
	
	public StudentDelete(StudentDAO std) {
		
		this.stdDAO = std;
	}
	
	public void deleteStudent(StudentVO std) {
		
		stdDAO.getStudentDB().remove(stdDAO.select(std.getId()).getId());
	}
}
