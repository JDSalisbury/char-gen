
package io.jdsalisbury.github.chargen;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GamaOriginTest {

	private GamaOrigin vampire = new GamaOrigin("Vampire", "STR", "Conspiracy", "Dark", 0, 0, 0, 0);

	@Test
	public void shouldReturnOriginName() {
		String name = vampire.getOrigin();
		assertThat(name, is("Vampire"));
	}

	@Test
	public void shouldReturnAbility() {
		String ability = vampire.getAbility();
		assertThat(ability, is("STR"));
	}
}
