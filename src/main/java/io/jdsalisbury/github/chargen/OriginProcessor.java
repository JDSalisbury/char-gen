package io.jdsalisbury.github.chargen;

import java.util.Random;

public class OriginProcessor {
	private String type;
	private String primaryAbility;
	private String secondaryAbility;
	private Random rand = new Random();

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

	public int getPrimaryAbilityScore() {
		int abilityScore = 18;
		if (abilitiesAreTheSame()) {
			abilityScore = 20;
		}
		return abilityScore;
	}

	public int getSecondaryAbilityScore() {
		int abilityScore = 16;
		if (abilitiesAreTheSame()) {
			abilityScore = rollDice(3, 6, 0);
		}
		return abilityScore;
	}

	public int getAbilityScore() {
		return rollDice(3, 6, 0);
	}

	public boolean abilitiesAreTheSame() {
		return getPrimaryAbility().equals(getSecondaryAbility());

	}

	public int rollDice(int numberOfDice, int sidesOnDice, int modifier) {
		int result = 0;
		for (int i = 0; i <= numberOfDice - 1; i++) {
			result += rand.nextInt(sidesOnDice) + 1;
		}
		int total = result + modifier;
		return total;
	}

}
