
public class Player {
	public int cardsInHand, cardsInGraveyard;
	public boolean hasPowerGlyph, hasToughnessGlyph, hasMovementGlyph;

	public Player(int cardsInHand, int cardsInGraveyard){
		this.cardsInHand=cardsInHand;
		this.cardsInGraveyard=cardsInGraveyard;
	}
	
	public void decreaseCardsInHandBy(int i){
		this.cardsInHand= (this.cardsInHand - i);
	}
	
	public void increaseCardsInHandBy(int i){
		this.cardsInHand= (this.cardsInHand + i);
	}
	
	public void setCardsInHand(int i){
		this.cardsInHand=i;
	}
	
	public int getCardsInHand(){
		return this.cardsInHand;
	}
	
	public void decreaseCardsInGraveyardBy(int i){
		this.cardsInGraveyard= (this.cardsInGraveyard - i);
	}
	
	public void increaseCardsInGraveyardBy(int i){
		this.cardsInGraveyard= (this.cardsInGraveyard + i);
	}
	
	public void setCardsInGraveyard(int i){
		this.cardsInGraveyard=i;
	}
	
	public int getCardsInGraveyard(){
		return this.cardsInGraveyard;
	}
}
