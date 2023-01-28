package metier.miniProjet;

import java.util.ArrayList;

public class Patient {
    private String nom;
    private String utilisation;
    private int age;
    private int corpulence;
    private int poids;
    private int taille;
    private int numero;
    public Revendeur re;
	public Systeme sy;
	public Aidant ai;
	public Specialiste sp;
	public final ArrayList<Fauteil> fa;

	
	public Patient() {
		fa= new ArrayList <> ();

		}
		
		
	    public void ajoute(Systeme sy1) {
	    	if(sy1!= null) {
	    		if(!sy1.getPt().contains(this)) {
	    			if(sy!= null) {
	    				sy.remove(this);
	    				this.setSy(sy1);
	    				sy.getPt().add(this);
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
