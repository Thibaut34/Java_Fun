class Sport {
    String nom;
    boolean equipe;
    int nbr_joueur;

    Sport(String nom, boolean equipe, int nbr_joueur) {
        this.nom = nom;
        this.equipe = equipe;
        this.nbr_joueur = nbr_joueur;
    }

    String GetNom() {
        return this.nom;
    }

    void VerifEquipe() {
        if (this.equipe == true) {
            System.out.println("Ce sport se pratique en équipe");

        } else {
            System.out.println("Ce sport est individuel");
        }
    }

    void VerifNbreJoueur() {
        if (this.equipe == true && this.nbr_joueur != 0) {
            System.out.println("L'équipe est composée de " + this.nbr_joueur + " joueurs");
        } else {
            System.out.println("L'équipe est pas composée");
        }
    }
}

public class Test_3 {
    public static void main(String args[]) {
        Sport foot = new Sport("Football", true, 11);
        foot.VerifEquipe();
        System.out.println("Il s'agit de " + foot.GetNom());
        foot.VerifNbreJoueur();
        Sport tennis = new Sport("Tennis", false, 1);
        tennis.VerifEquipe();
        System.out.println("On joue au " + tennis.GetNom());
    }
    
}
