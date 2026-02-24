void main(){

    // Daten für das Orakel
    String [] dates = { "heute", "morgen", "in einigen Wochen", "in 3 Jahren", "in 17 Tagen"};
    String [] adjectives = { "riesig", "schön" , "wild", "stark", "positiv", "überraschend"};
    String [] nomsAliveMale = { "Bär", "Löwe", "Mann", "Pinguin", "Zauberer", "Herr"};
    String [] goodThings = {"Segen", "Liebe", "Gesundheit", "Glück", "Freude"};

    //TODO random int % nutzereingabe instead of 2
    int index = (int) (Math.random() % 2);

    String output = "%s erscheint ein %s und bringt dir %s";
    String result = String.format(output, dates[index], nomsAliveMale[index], goodThings[index]);
    System.out.println(result);

    // Benutzereingaben
    System.out.println("\uD83D\uDD2E Willkommen beim Orakel \uD83D\uDD2E");

}
