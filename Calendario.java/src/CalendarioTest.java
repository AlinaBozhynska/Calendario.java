public class CalendarioTest {

    public static void main(String[] args) {
        Calendario calendario1 = new Calendario();
        calendario1.mese = "febbraio";
        calendario1.giorno = 30;

        System.out.println(calendario1.verifyDate());

    }
    
}
