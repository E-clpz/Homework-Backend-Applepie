public class ApplePieRecipe {
    Ingredient boter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient witteBastardSuiker = new Ingredient( 200, "gram", "witte bastard suiker");
    Ingredient zelfrijzendBakmeel = new Ingredient(400, "gram", "zelfrijzend bakmeel");
    Ingredient ei = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillesuiker = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient zout = new Ingredient(1, "snuf", "zout");
    Ingredient zoetzureAppels = new Ingredient(1.5, "kilo", "zoetzure appels");
    Ingredient kristalSuiker = new Ingredient(75, "gram", "kristal suiker");
    Ingredient kaneel = new Ingredient(3, "theelepels", "kaneel");
    Ingredient paneermeel = new Ingredient(15, "gram", "paneermeel");

    public void printIngredients() {
//        System.out.println(boter.getName() + " " + boter.getAmount() + " " + boter.getUnit());
//        System.out.println(witteBastardSuiker.getName() + " " + witteBastardSuiker.getAmount() + " " + witteBastardSuiker.getUnit());
//        System.out.println(zelfrijzendBakmeel.getName() + " " + zelfrijzendBakmeel.getAmount() + " " + zelfrijzendBakmeel.getUnit());
//        System.out.println(ei.getName() + " " + ei.getAmount() + " " + ei.getUnit());
//        System.out.println(vanillesuiker.getName() + " " + vanillesuiker.getAmount() + " " + vanillesuiker.getUnit());
//        System.out.println(zout.getName() + " " + zout.getAmount() + " " + zout.getUnit());
//        System.out.println(zoetzureAppels.getName() + " " + zoetzureAppels.getAmount() + " " + zoetzureAppels.getUnit());
//        System.out.println(kristalSuiker.getName() + " " + kristalSuiker.getAmount() + " " + kristalSuiker.getUnit());
//        System.out.println(kaneel.getName() + " " + kaneel.getAmount() + " " + kaneel.getUnit());
//        System.out.println(paneermeel.getName() + " " + paneermeel.getAmount() + " " + paneermeel.getUnit());
        System.out.println(boter.toString());
        System.out.println(witteBastardSuiker.toString());
        System.out.println(zelfrijzendBakmeel.toString());
        System.out.println(ei.toString());
        System.out.println(vanillesuiker.toString());
        System.out.println(zout.toString());
        System.out.println(zoetzureAppels.toString());
        System.out.println(kristalSuiker.toString());
        System.out.println(kaneel.toString());
        System.out.println(paneermeel.toString());
    }

        public void steps() {
            System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
            System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
            System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
            System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
            System.out.println("Vet de springvorm in en bestrooi deze met bloem");
            System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
            System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
            System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
            System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
            System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}


