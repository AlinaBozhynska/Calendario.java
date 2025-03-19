public class Calendario {

    public int giorno;
    public String mese;

    public boolean verifyDate() {
        switch(mese) {
            case "gennaio", "marzo", "maggio", "luglio", "agosto", "ottobre", "dicembre":
            if(giorno >= 1 && giorno <= 31) { 
                return true;
            } 
            System.out.println("Giorno immesso non valido!");           
            break;

            case "febbraio": 
            if(giorno >= 1 && giorno <= 28) {
                return true;
            }
            System.out.println("Giorno immesso non valido!");
            break;

            case "aprile", "giugno", "settembre", "novembre":
            if(giorno >= 1 && giorno <= 30) {
                return true;
            }
            System.out.println("Giorno immesso non valido!");
            break;
            default: 
            System.out.println("Mese immesso non valido!");
        } 
        return false;
    } 
    
    public void printModule() {
        if(verifyDate()) {}


    }
}