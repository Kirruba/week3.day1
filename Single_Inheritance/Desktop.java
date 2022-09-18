package org.system;

public class Desktop extends Computer {

	public void desktopSize() {
		System.out.println("DesktopSize: 13.5 inches");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Desktop D = new Desktop();
		D.computerModel();
		D.desktopSize();
	}

}
