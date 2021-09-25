package week3.day1;
public class Students {
	
	public void getStudentInfo( int id) {
		
		System.out.println("Student ID is :" + id);

	}
	public void getStudentInfo( int id, String name) {
	System.out.println("Student ID is :" + id);
	System.out.println("Student Name is" + name);
		
		

	}
	public void getStudentInfo( long phoneNumber, String email) {
		// TODO Auto-generated method stub
		System.out.println("Student Phonenumber is :" + phoneNumber);
		System.out.println("Student Email is" + email);
	}
	public static void main (String[] args) {
			Students obj = new Students();
			obj.getStudentInfo(06);
			obj.getStudentInfo(06, "Deepika M");
			obj.getStudentInfo(1234567890, "deepika@gmail.com");
			
			
		}
		
			
		}
	

