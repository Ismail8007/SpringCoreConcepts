package implementation;

import org.springframework.stereotype.Component;

import interfaces.Tyres;

@Component
public class BridgeStoneTyres implements Tyres{
	
	
public String rotate() {
	return "rating with BridgeStoneTyres ";
}
	
}
