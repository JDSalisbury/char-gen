package io.jdsalisbury.github.chargen;

import java.util.List;

public class CharacterSheet {

	List<GamaOrigin> characterOriginList = FileReader.readCharsFromFile("gammaWorldCharSheet.csv");

}
