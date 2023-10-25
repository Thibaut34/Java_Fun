class Hero {
        String nom;
        int vie;
        String arme;

        Hero(String nom, int vie, String arme){
            this.nom = nom;
            this.vie = vie;
            this.arme = arme;
            
        if(vie == 100) {
            System.out.println("normalMan est full life");
        } else if(vie == 0) {
            System.out.println("normalMan est mort");
 
        } else {
            System.out.println("il est en danger");
        }
        }
        
        
    }
    
    public class Test_2 {
    public static void main(String args[]){
        Hero normalMan = new Hero("normalMan", 10, null);
        System.out.println("Voici son niveau de vie : " + normalMan.vie);
        
        
    }
    
}
