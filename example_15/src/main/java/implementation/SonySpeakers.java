package implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import interfaces.Speakers;

@Component
@Primary
public class SonySpeakers implements Speakers {
	
	public String makeSound() {
		return "playing with sony speakers";
	}

}
