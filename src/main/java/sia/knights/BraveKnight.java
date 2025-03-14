package sia.knights;
  
public class BraveKnight implements Knight {

  private Quest quest;
  
//  public BraveKnight(Quest quest, Minstrel minstrel) {
//    this.quest = quest;
//    this.minstrel = minstrel;
//  }
//
//  public void embarkOnQuest() {
//	  minstrel.singBeforeQuest();
//	  quest.embark();
//	  minstrel.singAfterQuest();
//  }
  
  public BraveKnight(Quest quest) {
	    this.quest = quest;
	  }

	  public void embarkOnQuest() {
		  quest.embark();
	  }

}
