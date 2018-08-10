package io.jdsalisbury.github.chargen;

public class OriginProcessor {
	private String type;

	public void setOriginType(GamaOrigin primary, GamaOrigin secondary) {
		String primaryType = primary.getOrigin();
		String secondaryType = secondary.getOrigin();
		this.type = primaryType + " " + secondaryType;
	}

	public String getOriginType() {
		return type;
	}

}
