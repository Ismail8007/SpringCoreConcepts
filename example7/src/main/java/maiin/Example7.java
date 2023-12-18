package maiin;

import java.util.Random;
import java.util.function.Supplier;

import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import beans.Vehicle;
import config.ProjectConfig;

public class Example7 {

	public static void main(String[] args) {

		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		
	   Vehicle volks = new Vehicle();
	   volks.setName("volkswagen");
	   
	   //supplier is functional interface whose method is get. distinct results will be return when supplier is invoked.
	   
	   Supplier<Vehicle> volksSupplier = () -> volks;
	   
	   
	   Supplier<Vehicle> audiSupplier = () ->{
		   
		   Vehicle audi = new Vehicle();
		   audi.setName("Audi");
		   return audi;
	   };
	   
	   
	   Random random = new Random();
	   int randomNumber = random.nextInt(10);
	   
	   System.out.println("randomNumber : "+ randomNumber);
	   
	   
	   if((randomNumber%2)==0) {
		   context.registerBean("volks", Vehicle.class, volksSupplier);
		   System.out.println(volksSupplier.get().getName());
	   }
	   else {
		   context.registerBean("audi", Vehicle.class, audiSupplier);
		   System.out.println(audiSupplier.get().getName());
	   }
	   
	   Vehicle volksVehicle = null;
	   Vehicle audiVehicle = null;
	   
	   try {
		   volksVehicle = context.getBean("volks",Vehicle.class);
	   }catch(NoSuchBeanDefinitionException  noSuchBeanDeifinition) {
		   System.out.println("Error while creating volkswagen vehicle");
	   }
	   try {
		   audiVehicle = context.getBean("audi",Vehicle.class);
	   }
	   	catch(NoSuchBeanDefinitionException nosucuBeanDefinitionException) {
	   		System.out.println("error while creating audi vehicle");
	   	}
	   
		if(null!= volksVehicle) {
			System.out.println("programming vehicle name from spring context is: "+ volksVehicle.getName());
		}else {
			System.out.println("programming vehicle name form spring context is: "+ audiVehicle.getName());
		}
		
	}

}
