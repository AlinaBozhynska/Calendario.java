public class Calendario {

    public int giorno;
    public String mese;

    // feb: 15-16, 22-23; mar: 1-2, 8-9, 15-16, 22-23, 29-30; apr: 5-6, 12-13,
    // 19-20, 26-27; mag: 3-4, 10-11, 17,18.

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
        if (verifyDate() == false) {
            return;
        }
        switch (mese) {
            case "gennaio":
                System.out.println("Corso non ancora avviato");
                break;
            case "febbraio":
                if (giorno == 15 || giorno == 16 || giorno == 22 || giorno == 23) {
                    System.out.println("Il weekend non si lavora!!");
                } else if (giorno >= 1 && giorno <= 12) {
                    System.out.println("Corso non ancora avviato");
                } else if (giorno >= 13) {
                    System.out.println("Web");
                }
                break;
            case "marzo":
                if ((giorno == 1 || giorno == 2 || giorno == 8 || giorno == 9 || giorno == 15 || giorno == 16
                        || giorno == 22 || giorno == 23 || giorno == 29 || giorno == 30)) {
                    System.out.println("Il weekend non si lavora!!");
                } else if (giorno <= 4) {
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
                if (giorno == 5 || giorno == 6 || giorno == 12 || giorno == 13 || giorno == 19 || giorno == 20
                        || giorno == 26 || giorno == 27) {
                    System.out.println("Il weekend non si lavora!!");
                } else if (giorno == 25) {
                    System.out.println("Anniversario dell'indipendenza!!");
                } else if (giorno == 21) {
                    System.out.println("Pasqua!!");
                } else if (giorno <= 8) {
                    System.out.println("Java");
                } else if (giorno >= 9 && giorno <= 17) {
                    System.out.println("Database");
                } else if (giorno >= 18 && giorno <= 23) {
                    System.out.println("JDBC");
                } else if (giorno >= 24) {
                    System.out.println("Spring");
                }
                break;
            case "maggio":
                if (giorno == 3 || giorno == 4 || giorno == 10 || giorno == 11 || giorno == 17 || giorno == 18) {
                    System.out.println("Il weekend non si lavora!!");
                } else if (giorno == 1) {
                    System.out.println("Festa dei lavoratori!!");
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