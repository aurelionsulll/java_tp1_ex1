public class Produit {

    private int prix_hors_taxe;
    private String categorie;
    private int nProduit;
    private double prix_ttc;

    public Produit() {
    }

    public Produit(int prix_hors_taxe, String categorie) {
        this.prix_hors_taxe = prix_hors_taxe;
        this.categorie = categorie;
    }

    public int getPrix_hors_taxe() {
        return this.prix_hors_taxe;
    }

    public void setPrix_hors_taxe(int prix_hors_taxe) {
        this.prix_hors_taxe = prix_hors_taxe;
    }

    public String getCategorier() {
        return this.categorie;
    }

    public void setCategorier(String categorie) {
        this.categorie = categorie;
    }

    public int getNProduit() {
        return this.nProduit;
    }

    public void setNProduit(int nProduit) {
        this.nProduit = nProduit;
    }

    public double ttc() {
        if (categorie.equals("alimentaire")) {
            prix_ttc = prix_hors_taxe * 1.055;
        } else {
            prix_ttc = prix_hors_taxe * 1.20;
        }
        return prix_ttc;
    }

    public void affiche() {
        ttc();
        System.out.println("prix TTC d'un seul produit : " + prix_ttc + " prix TTC du lot :  : " + (prix_ttc * nProduit));
    }

}
