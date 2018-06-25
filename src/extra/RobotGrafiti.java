package extra;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
public static void main(String[] args) {
	

	Robot bot = new Robot("mini");
	bot.penDown();
bot.setSpeed(200);
	bot.move(100);
	bot.turn(135);
bot.move(50);
bot.turn(45);
bot.move(30);
bot.turn(45);
bot.move(50);
}	
}
