package week3.day1;

public class Androidphone extends Smartphone {
    
	public void takevideo() {
		System.out.println("take video");
	}
	public static void main(String[] args) {

       Androidphone phone = new Androidphone();
       Smartphone p = new Smartphone();
       phone.takevideo();
       phone.accesswhatsapp();
       p.makecall();
       p.sendmsg();
       p.savecontact();
       
	}

}
