package io.jdsalisbury.github.chargen;

public class GamaOrigin {
	private String origin;
	private String ability;
	private String skill;
	private String bonus;
	private int ac;
	private int fort;
	private int ref;
	private int will;

	public GamaOrigin(String origin, String ability, String skill, String bonus, int ac, int fort, int ref, int will) {
		this.origin = origin;
		this.ability = ability;
		this.skill = skill;
		this.bonus = bonus;
		this.ac = ac;
		this.fort = fort;
		this.ref = ref;
		this.will = will;
	}

	public String getName() {
		return origin;
	}

	public String getAbility() {
		return ability;
	}

}
