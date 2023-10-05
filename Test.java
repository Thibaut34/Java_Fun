class Vehicule {
    String marque;
    int id;
    
    Vehicule(String marque, int id) {
        this.marque = marque;
        this.id = id;
    }
}

class Voiture extends Vehicule {
    int nbre_roues;
    Voiture(int nbre_roues, String marque, int id){
        super(marque, id);
        this.nbre_roues = nbre_roues;
    }
    
     void NewId(int newId) {
        this.id = newId;
    }
    
    void VerifVoiture(int testId, int verif_nbre_roues) {
        
        if(verif_nbre_roues == this.nbre_roues) {
            System.out.println("Il s'agit d'une voiture");
        } else if(verif_nbre_roues == 2){
            System.out.println("C'est une moto");
        } else {
            System.out.println("Véhicule non reconnu");
        }
        System.out.println("Nous vérifions le numéro de série " + testId + " dans la base de données");
        if(testId == this.id && verif_nbre_roues == this.nbre_roues ) {
            System.out.println("C'est bien ma voiture !!!");
        } else if(verif_nbre_roues != 4) {
            System.out.println("Ce n'est pas une voiture !!!");
        } else {
            System.out.println("Ce n'est pas ma voiture !!!");
        }
    }
}

public class Test {
    public static void main(String args[]) {
        //Vehicule vehicule1 = new Vehicule("Ford", 2);
        //System.out.println("Mon véhicule est de la marque : " + vehicule1.marque);
        
        //Voiture voiture1 = new Voiture(4, "Citroën", 5327);
        //System.out.println("Ma voiture vient de " + voiture1.marque + " son numéro de série est " + voiture1.id + " et elle a " + voiture1.nbre_roues + " roues évidemment !");
        
        //voiture1.NewId(2048);
        //System.out.println("Suite à une erreur, le numéro de série est mis à jour : " + voiture1.id);
        //voiture1.VerifVoiture(4812);
        
        Voiture voiture2 = new Voiture(4, "Peugeot", 3250);
        voiture2.VerifVoiture(3256, 2);
    
    }
}