
public abstract class HouseTemplate {

	public final void buildHouse(){
		buildFundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}
	
	public void buildWindows(){
		System.out.println("Building glass windows.");
	}
	
	public abstract void buildWalls();
	
	public abstract void buildPillars();
	
	public void buildFundation(){
		System.out.println("Building fundation with cement,iron rods and sand.");
	}
	
	
}
