package abstraction;

public class Automation extends MultipleLangauge {

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Selenium supports Java Language");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Testing Tool:Selenium WebDriver");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Selenium supports Ruby Language");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation obj=new Automation();
		obj.Java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		
	}
}
