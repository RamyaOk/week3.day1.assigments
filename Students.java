package week3.day1.Assigments;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id is : " + id);
		}
	public void getStudentInfo(int id,String name) {
		System.out.println("Student id is : " + id);
		System.out.println("Student Name is : " + name );
		}
	public void getStudentInfo(String eMail,long pNumber) {
		System.out.println("Student Email is : " + eMail);
		System.out.println("Student Phone Number is : " + pNumber );
		}
	
	public static void main(String[] args) {
		Students stuObj =new Students();
		stuObj.getStudentInfo(20034678);
		stuObj.getStudentInfo(20034678, "Ramya");
		stuObj.getStudentInfo("okramyaksr@gmail.com",9994148985l);
		
		

	}

}
