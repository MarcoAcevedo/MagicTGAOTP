
public class Army {
	
	private boolean isPlaneswalker, isHero, isSquad, isUnique;
	private String color, name, abilities, type;
	private int life, move, range, power, toughness, height, size, cost, PPFcost, set, figureQuantity;
	
	public Army(String color, String name, String type, int figureQuantity, int life, int power, int move, int range, int toughness, String abilities, int size, int height, int cost, int PPFcost) {
		this.color=color;
		this.name = name;
		this.type = type;
		this.figureQuantity=figureQuantity;
		this.life = life;
		this.power = power;
		this.move = move;
		this.range = range;
		this.toughness=toughness;
		this.abilities=abilities;
		this.size=size;
		this.height=height;
		this.cost=cost;
		this.PPFcost=PPFcost;
		
	}
	
	public void setColor(String s){
		this.color=s;
	}
	
	public String getColor(){
		return this.color;
	}
	
	public void setName(String s){
		this.name=s;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setType(String s){
		this.type=s;
		
		if(s.equals("Planeswalker")){
			this.isPlaneswalker=true;
			this.isHero=false;
			this.isSquad=false;
		}
		else{
			if(s.equals("Hero")){
				this.isPlaneswalker=false;
				this.isHero=true;
				this.isSquad=false;
			}
			else{
				if(s.equals("Squad")){
					this.isPlaneswalker=false;
					this.isHero=false;
					this.isSquad=false;
				}
				else{
					this.isPlaneswalker=false;
					this.isHero=false;
					this.isSquad=false;
				}
			}
		}
	}
	
	public String getType(){
		return this.type;
	}
	
	public void setFigureQuantity(int i){
		this.figureQuantity=i;
	}
	
	public int getFigureQuantity(){
		return this.figureQuantity;
	}
	
	public void decreaseLifeBy(int i){
		this.life = (this.life - i);
	}
	
	public void increaseLifeBy(int i){
		this.life=(this.life + i);
	}
	
	public void setLife(int i){
		this.life=i;
	}
	
	public int getLife(){
		return this.life;
	}
	
	public void decreasePowerBy(int i){
		this.power = (this.power - i);
	}
	
	public void increasePowerBy(int i){
		this.power = (this.power + i);
	}
	
	public void setPower(int i){
		this.power=i;
	}
	
	public int getPower(){
		return this.power;
	}
	
	public void decreaseMoveby(int i){
		this.move=(this.move - i);
	}
	
	public void increaseMoveBy(int i){
		this.move=(this.move + i);
	}
	
	public void setMove(int i){
		this.move=i;
	}
	
	public int getMove(){
		return this.move;
	}

	public void decreaseRangeBy(int i){
		this.range=(this.range-i);
	}
	
	public void increaseRangeBy(int i){
		this.range=(this.range+i);
	}
	
	public void setRange(int i){
		this.range=i;
	}
	
	public int getRange(int i){
		return this.range;
	}

	public void decreaseToughnessBy(int i){
		this.toughness=(this.toughness-i);
	}
	
	public void increaseToughnessBy(int i){
		this.toughness=(this.toughness+i);
	}
	
	public void setToughness(int i){
		this.toughness=i;
	}
	
	public int getToughness(int i){
		return this.toughness;
	}

	public void setAbilties(String s){
		this.abilities=s;
	}
	
	public String getAbilities(){
		return this.abilities;
	}

	public void setSize(int i){
		this.size=i;
	}
	
	public int getSize(){
		return this.size;
	}

	public void setHeight(int i){
		this.height=i;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public void setCost(int i){
		this.cost=i;
	}
	
	public int getCost(){
		return this.cost;
	}

	public void setPPFCost(int i){
		this.PPFcost=i;
	}
	
	public int getPPFCost(){
		return this.PPFcost;
	}
}
