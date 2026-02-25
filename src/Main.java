void main(){

    // Daten für das Orakel
    String [] dates = { "heute", "morgen", "in einigen Wochen", "in 3 Jahren", "in 17 Tagen"};
    String [] adjectives = { "riesig", "schön" , "wild", "stark", "positiv", "überraschend"};
    String [] nomsAliveMale = { "Bär", "Löwe", "Mann", "Pinguin", "Zauberer", "Herr"};
    String [] goodThings = {"Segen", "Liebe", "Gesundheit", "Glück", "Freude"};

    int index = 7 % 3;

    String text;
    String output = "";
    switch (index){
        case 0:
            text = "%s erscheint ein %s und bringt dir %s . ";
            output = String.format(text, dates[index], nomsAliveMale[index], goodThings[index]);
            break;
        case 1:
            text = "%s begegnest du einem %s. Das wird %s .";
            output = String.format(text, dates[index], nomsAliveMale[index], adjectives[index]);
            break;
        case 2:
            text = "%s rettest du einen %s. Das wird %s und gibt dir %s .";
            output = String.format(text, dates[index], nomsAliveMale[index], adjectives[index], goodThings[index]);
            break;
    }
    System.out.println(output);



    // Benutzereingaben
    System.out.println("\uD83D\uDD2E Willkommen beim Orakel \uD83D\uDD2E");

}
