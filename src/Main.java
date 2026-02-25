private static final Random RANDOM = new Random();

void main(){

    // Daten für das Orakel
    String [] dates = { "heute", "morgen", "in einigen Wochen", "in 3 Jahren", "in 17 Tagen", "jetzt"};
    String [] adjectives = { "riesig", "schön" , "wild", "stark", "positiv", "überraschend"};
    String [] nomsAliveMale = { "Bär", "Löwe", "Mann", "Pinguin", "Zauberer", "Herr"};
    String [] goodThings = {"Segen", "Liebe", "Gesundheit", "Glück", "Freude", "Frieden"};

    // Benutzereingaben
    System.out.println("\uD83D\uDD2E Willkommen beim Orakel \uD83D\uDD2E");

    Scanner scanner = new Scanner(System.in);
    System.out.println("Bitte gib deinen Namen ein:");
    String name = scanner.nextLine();
    System.out.println("Bitte gib dein Lieblingsgetränk ein");
    String getraenk = scanner.nextLine();
    int number;
    System.out.println("Jetzt gib nur noch eine Zahl größer als 3 an.");
    do{
        number = scanner.nextInt();
        if(!isValidNumber(number)){
            System.out.println("Gib bitte eine Zahl größer als 3 an.");
        }
    } while( !isValidNumber(number));


    /* Werte die daten aus und erstelle einen Text */

    int index = number % 3;
    System.out.println(index);

    String text = name + ", ";
    String output = "";
    switch (index){
        case 0:
            text += "%s erscheint ein %s und bringt dir %s . ";
            output = String.format(text, dates[getRandom()], nomsAliveMale[getRandom()], goodThings[getRandom()]);
            break;
        case 1:
            text += "%s begegnest du einem %s. Das wird %s.";
            output = String.format(text, dates[getRandom()], nomsAliveMale[getRandom()], adjectives[getRandom()]);
            break;
        case 2:
            text += "%s rettest du einen %s. Das wird %s und gibt dir %s.";
            output = String.format(text, dates[getRandom()], nomsAliveMale[getRandom()], adjectives[getRandom()], goodThings[getRandom()]);
            break;
    }
    output += " Gönn dir eine " + getraenk;
    System.out.println(output);
}

private static boolean isValidNumber(int number){
    return (number > 3);
}

private static int getRandom(){
    return RANDOM.nextInt(6);
}
