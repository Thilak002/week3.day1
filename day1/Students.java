package week3.day1;

public class Students {
    public void getStudentInfo(int id) {
		System.out.println("id is"+" "+id);

	}
    public void getStudentInfo(int id,String name) {
		System.out.println("id is"+" "+id+" "+"name is"+" "+name);

   	}
    public void getStudentInfo(String email,long phoneNumber) {
		System.out.println("email is"+" "+email+" "+"phone number is"+" "+phoneNumber);

   	} 
    public static void main(String[] args) {
		Students sd = new Students();
		sd.getStudentInfo(45);
		sd.getStudentInfo(45,"Raj Thilak");
		sd.getStudentInfo("thilakrajj002@gmail.com",9629701142L);
	}
}
