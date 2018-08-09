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

	public String getOrigin() {
		return origin;
	}

	public String getAbility() {
		return ability;
	}

	public String getSkill() {
		return skill;
	}

	public String getBonus() {
		return bonus;
	}

	public int getAc() {
		return ac;
	}

	public int getFort() {
		return fort;
	}

	public int getRef() {
		return ref;
	}

	public int getWill() {
		return will;
	}

	@Override
	public String toString() {
		return origin + " " + ability + " " + skill + " " + bonus + " " + ac + " " + fort + " " + ref + " " + will;
	}

}
