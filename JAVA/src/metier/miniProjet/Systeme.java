package metier.miniProjet;
import java.util.ArrayList;



public class Systeme {
	public final ArrayList<Patient> pt;
	public final ArrayList<Clinicien> cl;
	public final ArrayList<Revendeur> re;
	public PartieControle pc;
	
	public Systeme() { // constructeur
		pt= new ArrayList <> ();
		cl= new ArrayList <> ();
		re= new ArrayList <> ();
	}

	public void remove(Patient pt1) {
		pt.remove(pt1);
	}
    public void addPatient( Patient pt1) {
    	if (!pt.contains(pt1)) {
    		if(pt1.getSy() != null) {
    			pt1.getSy().remove(pt1);
    			pt1.setSy(this);
    			pt.add(pt1);
    		}
    	}
     
    }
    
    public void remove(Clinicien cl1) {
		cl.remove(cl1);
	}
    public void addClinicien( Clinicien cl1) {
    	if (!cl.contains(cl1)) {
    		if(cl1.getSy() != null) {
    			cl1.getSy().remove(cl1);
    			cl1.setSy(this);
    			cl.add(cl1);
    		}
    	}
     
    }
    public void remove(Revendeur re1) {
		re.remove(re1);
	}
    public void addRevendeur( Revendeur re1) {
    	if (!re.contains(re1)) {
    		if(re1.getSy() != null) {
    			re1.getSy().remove(re1);
    			re1.setSy(this);
    			re.add(re1);
    		}
    	}
     
    }
	
	public ArrayList<Patient> getPt() {
		return pt;
	}
	public ArrayList<Clinicien> getCl() {
		return cl;
	}
	public ArrayList<Revendeur> getRe() {
		return re;
	}
}
