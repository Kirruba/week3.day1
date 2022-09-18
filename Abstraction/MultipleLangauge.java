package abstraction;

public abstract class MultipleLangauge implements Language,TestTool{
	public void python() {
		System.out.println("Selenium supports Python Language");
	}
	
	public abstract void ruby();
}
