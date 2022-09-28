package abstract02;

public class ShapeEx {
	public static void main(String[] args) {
		
		Shape cc = new Circle();
		
		cc.title();cc.draw();cc.delete();
		System.out.println("---------------------");
		Shape ta = new Triangle();
		ta.title();ta.draw();ta.delete();
		System.out.println("---------------------");
		//Shape sh = new Shape();
		
		Shape[] shapes = {cc, ta};
		for(Shape sh: shapes) {
			sh.title();sh.draw();sh.delete();
			if(sh instanceof Circle) {
				((Circle)sh).kill("corona");
			}
			
			System.out.println("-----------------------");
		}
	}
}
