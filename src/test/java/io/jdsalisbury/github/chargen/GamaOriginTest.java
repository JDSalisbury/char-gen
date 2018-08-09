
package io.jdsalisbury.github.chargen;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class GamaOriginTest {

	@Test
	public void shouldReturnOriginName() {
		GamaOrigin vampire = new GamaOrigin("Vampire", "STR", "Conspiracy", "Dark", 0, 0, 0, 0);

		String name = vampire.getOriginName();
		assertThat(name, is("Vampire"));
	}
}
