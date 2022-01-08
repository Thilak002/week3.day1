package org.system;

public class Desktop extends Computer {
    public void desktopSize() {
		System.out.println("is 12 inches");

	}
	public static void main(String[] args) {
		Desktop dp = new Desktop();
		dp.computerModel();
		dp.desktopSize();

	}

}
