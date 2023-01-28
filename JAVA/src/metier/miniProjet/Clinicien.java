package metier.miniProjet;


public class Clinicien {
	private int age;
	private String nom;
	private String pathologie;
	private String evolution;
	public Fauteil fa;
	public Systeme sy;
	
public Clinicien() {
		
	}
	
	
    public void ajoute(Systeme sy1) {
    	if(sy1!= null) {
    		if(!sy1.getCl().contains(this)) {
    			if(sy!= null) {
    				sy.remove(this);
    				this.setSy(sy1);
    				sy.getCl().add(this);
    			}
    		}
    	}
    }
	
	public Systeme getSy() {
		return sy;
	}
	public void setSy(Systeme sy1) {
		this.sy = sy1;
	}
}
