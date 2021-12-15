package entities.extension;

public class Cliente {
	private int ci;
	private String names, lastnames;
	
	public Cliente() {}
	
	public Cliente(int ci, String names, String lastnames)
	{
		this.ci = ci;
		this.names = names;
		this.lastnames = lastnames;
	}
	
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	
	public String getNames() {
		return names;
	}
	
	public void setNames(String names) {
		this.names = names;
	}
	
	public String getLastnames() {
		return lastnames;
	}
	
	public void setLastnames(String lastnames) {
		this.lastnames = lastnames;
	}
}
