package eu.sig.training.ch03;

import java.awt.Color;
import java.util.*;

public class FlagFactory {

    /**
     * hieronder is het switch statement vervangen door eerst alle vlaggen in een hasmap te zetten
     * en deze vervolgens dmv getFlagColors op te zoeken dmv een get functie op de meegegeven nationaliteit.
     * Hierdoor blijft de code compact en heb je nu een korte functie die niet zowel de vlaggen aanmaakt en de kleuren
     * teruggeeft maar puur alleen een vlag opzoekt in de map en dan de colors teruggeeft. Op deze manier
     * kun je de al gemaakte functie .getColors() uit de Flag klasse aanroepen, dat werd in het switch statement
     * niet gedaan.
     * */
    public Map<Nationality, Flag> createFlags() {
        Map<Nationality, Flag> flags = new HashMap<>();
        flags.put(Nationality.DUTCH, new Flag (Color.RED, Color.WHITE, Color.BLUE));
        flags.put(Nationality.BELGIAN, new Flag(Color.BLACK, Color.RED, Color.YELLOW));
        flags.put(Nationality.GERMAN, new Flag(Color.BLACK, Color.YELLOW, Color.RED));
        flags.put(Nationality.FRENCH, new Flag(Color.BLUE, Color.WHITE, Color.RED));
        flags.put(Nationality.ITALIAN, new Flag(Color.GREEN, Color.WHITE, Color.RED));
        flags.put(Nationality.ROMANIA, new Flag(Color.BLUE, Color.YELLOW, Color.RED));
        flags.put(Nationality.IRELAND, new Flag(Color.GREEN, Color.WHITE, Color.ORANGE));
        flags.put(Nationality.HUNGARIAN, new Flag(Color.RED, Color.WHITE, Color.GREEN));
        flags.put(Nationality.BULGARIAN, new Flag(Color.WHITE, Color.GREEN, Color.RED));
        flags.put(Nationality.RUSSIA, new Flag(Color.WHITE, Color.BLUE, Color.RED));
        flags.put(Nationality.UNCLASSIFIED, new Flag(Color.GRAY));
        return flags;
    }

    public List<Color> getFlagColors(Nationality nationality) {
        Map<Nationality, Flag> flags = createFlags();
        return flags.get(nationality).getColors();

    }

}