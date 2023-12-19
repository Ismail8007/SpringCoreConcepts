package implementation;

import org.springframework.stereotype.Component;

import interfaces.Speakers;

@Component
public class BossSpeakers implements Speakers{
	
	
	public String makeSound() {
		return "playing with Boss Speakers";
	}

}
