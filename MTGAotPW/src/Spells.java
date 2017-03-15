
public class Spells {
	private boolean isSorcery, isEnchantment, isHidden;
	private int cost, set;
	private String color, symbol, name, abilities, spellType, armyType;
	
	public Spells(String color, String name, String spellType,String armyType, String abilities, int cost){
		this.color = color;
		this.name=name;
		this.spellType=spellType;
		this.armyType=armyType;
		this.abilities=abilities;
		this.cost=cost;
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
	
	public void setSpellType(String s){
		this.spellType=s;
		
		if(s.equals("Sorcery")){
			this.isSorcery=true;
			this.isEnchantment=false;
			this.isHidden=false;
		}
		else{
			if(s.equals("Enchantment")){
				this.isSorcery=false;
				this.isEnchantment=true;
				this.isHidden=false;
			}
			else{
				if(s.equals("Hidden")){
					this.isSorcery=false;
					this.isEnchantment=false;
					this.isHidden=true;
				}
				else{
					this.isSorcery=false;
					this.isEnchantment=false;
					this.isHidden=false;
				}
			}
		}
	}
	
	public String getSpellType(){
		return this.spellType;
	}
	
	public void setArmyType(String s){
		this.armyType=s;
	}
	
	public String getArmyType(){
		return this.armyType;
	}
	
	public void setAbilties(String s){
		this.abilities=s;
	}
	
	public String getAbilities(){
		return this.abilities;
	}
	
	public void setCost(int i){
		this.cost=i;
	}
	
	public int getCost(){
		return this.cost;
	}
}
