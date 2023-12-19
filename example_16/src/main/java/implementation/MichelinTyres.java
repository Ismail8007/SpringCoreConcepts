package implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import interfaces.Tyres;

@Component
@Primary
public class MichelinTyres implements Tyres {
	
	public String rotate() {
		return "tyres rotating with MichelinTyres "
;	}

}
