package io.jdsalisbury.github.chargen;

public class OriginProcessor {
	private String type;
	private String primaryAbility;
	private String secondaryAbility;

	public void setOriginType(GamaOrigin primary, GamaOrigin secondary) {
		String primaryType = primary.getOrigin();
		String secondaryType = secondary.getOrigin();
		this.type = primaryType + " " + secondaryType;
	}

	public String getOriginType() {
		return type;
	}

	public String getPrimaryAbility() {
		return primaryAbility;
	}

	public String getSecondaryAbility() {
		return secondaryAbility;
	}

	public void setPrimaryAbility(GamaOrigin primary) {
		this.primaryAbility = primary.getAbility();
	}

	public void setSecondaryAbility(GamaOrigin secondary) {
		this.secondaryAbility = secondary.getAbility();
	}

	public void processAbilitieScore(GamaOrigin primary, GamaOrigin secondary) {
		setPrimaryAbility(primary);
		setSecondaryAbility(secondary);
	}

}
