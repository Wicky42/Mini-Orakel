void main(){

    // Daten für das Orakel
    String [] dates = { "heute", "morgen", "in einigen Wochen", "in 3 Jahren", "in 17 Tagen"};
    String [] adjectives = { "riesig", "schön" , "wild", "stark", "positiv", "überraschend"};
    String [] nomsAliveMale = { "Bär", "Löwe", "Mann", "Pinguin", "Zauberer", "Herr"};
    String [] goodThings = {"Segen", "Liebe", "Gesundheit", "Glück", "Freude"};




    // Benutzereingaben
    System.out.println("\uD83D\uDD2E Willkommen beim Orakel \uD83D\uDD2E");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte gib deinen Namen ein:");
    String name = scanner.nextLine();
    System.out.println("Bitte gib dein Lieblingsgetränk ein");
    String getraenk = scanner.nextLine();
    int number = -1;
    System.out.println("Jetzt gib nur noch eine Zahl zwischen 0 und 4 an.");
    do{
        number = scanner.nextInt();
        if(!isValidNumber(number)){
            System.out.println("Gib bitte eine Zahl zwischen 0 und 4 an.");
        }
    } while( !isValidNumber(number));


    /* Werte die daten aus und ergänze einen Text */

    int index = 1234 % number;

    String text = name + ", ";
    String output = "";
    switch (index){
        case 0:
            text += "%s erscheint ein %s und bringt dir %s . ";
            output = String.format(text, dates[index], nomsAliveMale[index], goodThings[index]);
            break;
        case 1:
            text += "%s begegnest du einem %s. Das wird %s .";
            output = String.format(text, dates[index], nomsAliveMale[index], adjectives[index]);
            break;
        case 2:
            text += "%s rettest du einen %s. Das wird %s und gibt dir %s .";
            output = String.format(text, dates[index], nomsAliveMale[index], adjectives[index], goodThings[index]);
            break;
    }
    System.out.println(output);
}

private boolean isValidNumber(int number){
    return (number >= 0 && number <= 4);
}
