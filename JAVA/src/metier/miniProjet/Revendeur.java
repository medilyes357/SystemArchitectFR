package metier.miniProjet;

import java.util.ArrayList;

public class Revendeur {
	public int age;
	public String nom;
	public void Conseille() {}
	public void Rechercher() {}
	public void Verifie() {}
	public void RendezVous() {}
public Systeme sy;
public final ArrayList<Patient> pt;
	
	public Revendeur() {
		pt= new ArrayList <> ();
		}
		
		
	    public void ajoute(Systeme sy1) {
	    	if(sy1!= null) {
	    		if(!sy1.getRe().contains(this)) {
	    			if(sy!= null) {
	    				sy.remove(this);
	    				this.setSy(sy1);
	    				sy.getRe().add(this);
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
