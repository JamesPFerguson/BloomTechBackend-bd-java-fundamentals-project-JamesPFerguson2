package main.com.adventure.settings;

/**
 * Sprint 2 Module 3
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 2 Module 3
    FIGHT,
    //Used in Sprint 3 Module 1
    INVENTORY;


    /**
     * Takes verbString to determine and return the associated CommandVerb.
     * @param verbString - the verb from the user input
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {
        switch(verbString.toLowerCase()) {
            case "take":
                return TAKE;
            case "move":
                return MOVE;
            case "use":
                return USE;
            case "dig":
                return DIG;
            case "examine":
                return EXAMINE;
            case "look":
                return LOOK;
            case "help":
                return HELP;
            case "fight":
                return FIGHT;
            case "inventory":
                return INVENTORY;
            default:
                return INVALID;
        }
    }

}
