package io.jdsalisbury.github.chargen;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class OriginProcessorTest {

	private GamaOrigin vampire = new GamaOrigin("Vampire", "STR", "Conspiracy", "Dark", 0, 0, 0, 0);
	private GamaOrigin yeti = new GamaOrigin("Yeti", "STR", "Nature", "Bio", 1, 0, 0, 0);
	private GamaOrigin plant = new GamaOrigin("Plant", "CON", "Nature", "Bio", 0, 2, 0, 0);

	OriginProcessor processOrigins = new OriginProcessor();

	@Test
	public void shouldSetName() {
		processOrigins.setOriginType(vampire, yeti);
		String type = processOrigins.getOriginType();

		assertThat(type, is("Vampire Yeti"));
	}

	// 18 ability score of your Primary Origin.
	// 16 ability score of your Secondary Origin.
	// both same ability, then you get a 20 ability score
	@Test
	public void shoudSetPrimAndSecAbilitieScoreReturnPrimaryScore() {
		processOrigins.processAbilitieScore(vampire, yeti);
		int primaryScore = processOrigins.getPrimaryAbilityScore();
		assertThat(primaryScore, is(20));

	}

	@Test
	public void shoudSetRandomSecondaryScoreIfPrimeAndSecondaryAreTheSame() {
		processOrigins.processAbilitieScore(vampire, yeti);
		int secondaryScore = processOrigins.getSecondaryAbilityScore();
		assertThat(secondaryScore, is(not(19)));

	}

	@Test
	public void shouldReturnSecondaryScore() {
		processOrigins.processAbilitieScore(vampire, plant);
		int secondaryScore = processOrigins.getSecondaryAbilityScore();
		assertThat(secondaryScore, is(16));

	}

	// For all other ability
	// scores, roll 3d6 for each and record them on your character sheet.

	@Test
	public void shouldGiveAScoreForOtherAbilities() {

	}

}
