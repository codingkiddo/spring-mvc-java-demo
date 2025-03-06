package sia.knights;
  
public class BraveKnightAop implements Knight {

  private Quest quest;
  
  public BraveKnightAop(Quest quest) {
    this.quest = quest;
  }

  public void embarkOnQuest() {
	  quest.embark();
  }

}
