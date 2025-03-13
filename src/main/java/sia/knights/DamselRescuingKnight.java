package sia.knights;

public class DamselRescuingKnight implements Knight {

	private RescueDamselQuest quest;
	
	private Minstrel minstrel;

	public DamselRescuingKnight() {
		this.quest = new RescueDamselQuest();
	}

	public void embarkOnQuest() {
		quest.embark();
	}

}
