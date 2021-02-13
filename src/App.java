import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Produit p = new Produit();

        System.out.println("entrez la categorie");
        String categorie = sc.nextLine();
        p.setCategorier(categorie);

        System.out.println("entrez le prix hors taxe");
        int prix_hors_taxe = sc.nextInt();
        p.setPrix_hors_taxe(prix_hors_taxe);

        System.out.println("quel est le nombre de produits dans le lot ? ");
        int nProduit = sc.nextInt();
        p.setNProduit(nProduit);
        p.affiche();

    }
}
