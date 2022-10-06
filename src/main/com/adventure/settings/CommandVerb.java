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
        CommandVerb commandVerb;
        switch (verbString.toLowerCase()) {
            case "take":
                commandVerb = TAKE;
                break;
            case "move":
                commandVerb = MOVE;
                break;
            case "use":
                commandVerb = USE;
                break;
            case "dig":
                commandVerb = DIG;
                break;
            case "examine":
                commandVerb = EXAMINE;
                break;
            case "look":
                commandVerb = LOOK;
                break;
            case "help":
                commandVerb = HELP;
                break;
            case "fight":
                commandVerb = FIGHT;
                break;
            case "inventory":
                commandVerb = INVENTORY;
                break;
            default:
                commandVerb = INVALID;
                break;
        }
        return commandVerb;
    }

}
