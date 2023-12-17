import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Vehicle;
import config.ProjectConfig;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		var v2=context.getBean("vehicle2", Vehicle.class);
		
		System.out.println("calling bean based on method name : "+ v2.getName());
		

	}

}
