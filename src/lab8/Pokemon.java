package lab8;

public class Pokemon implements Fightable {

	private final String name ;
	private final PokemonType type;
	private int cp;
	public String getName() {
		return name;
	}

	public PokemonType getType() {
		return type;
	}
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public Pokemon(String name, PokemonType type, int cp) {
		super();
		this.name = name;
		this.type = type;
		this.cp = cp;
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	

}
