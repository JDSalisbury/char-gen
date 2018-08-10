package io.jdsalisbury.github.chargen;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OriginProcessorTest {

	private GamaOrigin vampire = new GamaOrigin("Vampire", "STR", "Conspiracy", "Dark", 0, 0, 0, 0);
	private GamaOrigin yeti = new GamaOrigin("Yeti", "STR", "Nature", "Bio", 1, 0, 0, 0);

	@Test
	public void shouldSetName() {
		String primary = vampire.getOrigin();
		String secondary = yeti.getOrigin();

		OriginProcessor processOrigins = new OriginProcessor();
		processOrigins.setOriginType(vampire, yeti);
		String type = processOrigins.getOriginType();

		assertThat(type, is("Vampire Yeti"));
	}

	// 18 ability score of your Primary Origin.
	// 16 ability score of your Secondary Origin.
	// both same ability, then you get a 20 ability score
}
