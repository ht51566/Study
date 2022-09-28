package interface01;

public class RobotEx {
	public static void main(String[] args) {
		Robot[] robots = {
				new DanceRobot(),
				new SingRobot(),
				new DrawRobot(),
				new JavaRobot()
		};
		
		for(Robot r : robots) {
			System.out.println("--------------------------");
			r.recharge();
			action(r);
		}
	}

	private static void action(Robot r) {
		if(r instanceof DanceRobot) {
			((DanceRobot)r).dance();
		}else if(r instanceof SingRobot) {
			((SingRobot)r).sing();
		}else if(r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		}else if(r instanceof JavaRobot) {
			((JavaRobot)r).programm();
		}
		
	}
}
