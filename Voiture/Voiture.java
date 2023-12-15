import java.util.Arrays;

public class Voiture {

    private String modele;
    private String marque;
    private double vitesse;
    private boolean estDemaree = false;
    private Moteur leMoteur;
    private Roue[] les4Roues;
    private Roue roueDeSecours;


    public Voiture(String modele, String marque, double vitesse) {
        this.leMoteur = new Moteur("Renault", 8);
        this.les4Roues = new Roue[4];
        for (int i = 0; i < les4Roues.length; i++) {
            les4Roues[i] = new Roue(14, 28);
        }
        this.roueDeSecours = new Roue(14, 28);
        this.modele = modele;
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public int deQuellePuissance() {
        return leMoteur.getPuissance();
    }

    public void demarre() {
        setEstDemaree(true);
    }

    public void accelere(double vitesse) {
        setVitesse(this.vitesse + vitesse);
    }

    public void changerLeMoteur(Moteur m) {
        this.leMoteur = m;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getVitesse() {
        return vitesse;
    }

    public void setVitesse(double vitesse) {
        this.vitesse = vitesse;
    }

    public boolean getEstDemaree() {
        return estDemaree;
    }

    public void setEstDemaree(boolean estDemaree) {
        this.estDemaree = estDemaree;
    }

    public Moteur getLeMoteur() {
        return leMoteur;
    }

    public void setLeMoteur(Moteur leMoteur) {
        this.leMoteur = leMoteur;
    }

    public Roue[] getLes4Roues() {
        return les4Roues;
    }

    public void setLes4Roues(Roue[] les4Roues) {
        this.les4Roues = les4Roues;
    }

    public Roue getRoueDeSecours() {
        return roueDeSecours;
    }

    public void setRoueDeSecours(Roue roueDeSecours) {
        this.roueDeSecours = roueDeSecours;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "modele='" + modele + '\'' +
                ", marque='" + marque + '\'' +
                ", vitesse=" + vitesse +
                ", estDemaree=" + estDemaree +
                ", leMoteur=" + leMoteur +
                ", les4Roues=" + Arrays.toString(les4Roues) +
                ", roueDeSecours=" + roueDeSecours +
                '}';
    }
}
