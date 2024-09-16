public class LasagneRecipe {
    Ingredient ui = new Ingredient(1, "stuk(s)", "rode ui");
    Ingredient peen = new Ingredient(300, "gram", "winterpeen");
    Ingredient selderij = new Ingredient(2, "stengel(s)", "bleekselderij");
    Ingredient kaas = new Ingredient(180, "gram", "Parmigiano Reggiano");
    Ingredient olijfolie = new Ingredient(2, "eetlepel(s)", "traditionele olijfolie");
    Ingredient gehakt = new Ingredient(350, "gram", "rundergehakt");
    Ingredient puree = new Ingredient(70, "gram", "tomatenpuree");
    Ingredient melk = new Ingredient(700, "milliliter", "volle melk");
    Ingredient saus = new Ingredient(690, "gram", "passata di pomodoro");
    Ingredient boter = new Ingredient(50, "gram", "ongezouten roomboter");
    Ingredient bloem = new Ingredient(60, "gram", "tarwebloem");
    Ingredient bladerdeeg = new Ingredient(250, "gram", "lasagne all'uovo");

    public void printIngredients() {
        System.out.println(ui.toString());
        System.out.println(peen.toString());
        System.out.println(selderij.toString());
        System.out.println(kaas.toString());
        System.out.println(olijfolie.toString());
        System.out.println(gehakt.toString());
        System.out.println(puree.toString());
        System.out.println(melk.toString());
        System.out.println(saus.toString());
        System.out.println(boter.toString());
        System.out.println(bloem.toString());
        System.out.println(bladerdeeg.toString());
    }
    public void steps() {
        System.out.println("Snipper de ui. Schil de winterpeen en snijd in dunne plakjes. Snijd de bleekselderij in boogjes en rasp de kaas.");
        System.out.println("Verhit de olie in een hapjespan en fruit de ui, winterpeen en bleekselderij 5 min. op laag vuur. Voeg het gehakt toe en bak op middelhoog vuur in 5 min. rul. Voeg de tomatenpuree toe en bak 2 min. mee. Voeg 200 ml melk toe en laat al roerend op laag vuur bijna helemaal inkoken. Voeg de passata toe, breng aan de kook. Zet het vuur laag. Laat met de deksel half op de pan 45 min. zachtjes koken.");
        System.out.println("Maak ondertussen de bechamelsaus. Smelt daarvoor de boter in een steelpan met dikke bodem op laag vuur. Meng de bloem erdoor en laat op laag vuur 3 min. garen. Voeg op laag vuur al roerend 500 ml melk in scheuten toe. Voeg pas de volgende scheut toe als de vorige helemaal is opgenomen. Laat op laag vuur 2-3 min. zachtjes koken. Breng op smaak met peper en eventueel zout. Zet weg tot gebruik.");
        System.out.println("Verwarm de oven voor op 180 °C. Maak laagjes in de ovenschaal van achtereenvolgens wat saus, lasagnebladen, saus, bechamelsaus en kaas. Herhaal tot alle ingrediënten op zijn en eindig met een laag bechamelsaus en kaas. Bak de lasagne ca. 40 min. in het midden van de oven. Laat afgedekt met aluminiumfolie 10 min. rusten.");
    }
}
