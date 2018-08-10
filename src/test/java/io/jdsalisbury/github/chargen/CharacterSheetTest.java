package io.jdsalisbury.github.chargen;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class CharacterSheetTest {

	List<GamaOrigin> characterOriginList = FileReader.readCharsFromFile("gammaWorldCharSheet.csv");

	@Test
	public void shouldGiveOneRandomOrigin() {

		GamaOrigin origin1 = characterOriginList.getRandomOrigin();

		assertThat(characterOriginList, containsInAnyOrder(origin1));

	}

}
