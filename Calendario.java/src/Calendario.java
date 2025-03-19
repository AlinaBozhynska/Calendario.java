public class Calendario {

    public int giorno;
    public String mese;

    public boolean verifyDate() {
        switch (mese) {
            case "gennaio", "marzo", "maggio", "luglio", "agosto", "ottobre", "dicembre":
                if (giorno >= 1 && giorno <= 31) {
                    return true;
                }
                System.out.println("Giorno immesso non valido!");
                break;

            case "febbraio":
                if (giorno >= 1 && giorno <= 28) {
                    return true;
                }
                System.out.println("Giorno immesso non valido!");
                break;

            case "aprile", "giugno", "settembre", "novembre":
                if (giorno >= 1 && giorno <= 30) {
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
        if (verifyDate()) {
            switch (mese) {
                case "gennaio":
                    System.out.println("Corso non ancora avviato");
                    break;
                case "febbraio":
                    if (giorno >= 1 && giorno <= 12) {
                        System.out.println("Corso non ancora avviato");
                    } else if (giorno >= 13) {
                        System.out.println("Web");
                    }
                    break;
                case "marzo":
                    if (giorno <= 4) {
                        System.out.println("Web");
                    } else if (giorno == 5) {
                        System.out.println("DASA");
                    } else if ((giorno >= 6 && giorno <= 10) || (giorno >= 12)) {
                        System.out.println("JAVA");
                    } else if (giorno == 11) {
                        System.out.println("GitHub");
                    }
                    break;
                case "aprile":
                    if (giorno == 25 || giorno == 21) {
                        System.out.println("Festivo!!");
                    } else if (giorno <= 8) {
                        System.out.println("JAVA");
                    } else if (giorno >= 9 && giorno <= 17) {
                        System.out.println("Database");
                    } else if (giorno >= 18 && giorno <= 23) {
                        System.out.println("JDBC");
                    } else if (giorno >= 24) {
                        System.out.println("Spring");
                    }
                    break;
                case "maggio":
                    if (giorno == 1) {
                        System.out.println("Festivo!!");
                    } else if (giorno <= 8) {
                        System.out.println("Spring");
                    } else if (giorno >= 9 && giorno <= 21) {
                        System.out.println("Project work");
                    } else if (giorno >= 22 && giorno <= 30) {
                        System.out.println("Corso terminato!!!");
                    } else if (giorno == 31) {
                        System.out.println("Corso non presente");
                    }
                    break;
                default:
                    System.out.println("Corso non presente");
                    break;
            }
        }

    }
}