package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import interfaces.Speakers;
import interfaces.Tyres;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class VehicleService {
	
	@Autowired
	private Speakers speaker;
	
	@Autowired
	private Tyres tyres;
	
	public void playMusic() {
		String music =speaker.makeSound();
		System.out.println(music);
	}
	
	public void moveVehicle() {
		String status =tyres.rotate();
		System.out.println(status);
	}

}
