package week3.day1;

public class Students {

	public void getStudentInfo(int id) {
		int S1 = id;
		System.out.println("Id:" + S1);
	}

	public void getStudentInfo(int id, String name) {
		String S2 = name;
		System.out.println("Name:" + S2);
	}

	public void getStudentInfo(String email, String phoneNumber) {
		String S3 = email;
		String S4 = phoneNumber;
		System.out.println("Email:" + S3);
		System.out.println("PhoneNumber:" + S4);
	}

}
