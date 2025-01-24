public class ValidateInput
{
    public static boolean validateCreditCard(String credit)
    {
        return (credit.matches("[0-9]{16}") || credit.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}") ||
                credit.matches("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}"));
    }
    public static boolean validateThoseThreeNumbersOnTheBack(String card)
    {
        return card.matches("[0-9]{3}");
    }

    public static boolean validateCard(String credit, String card)
    {
        return (credit.matches("[0-9]{16}") || credit.matches("[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}") ||
                credit.matches("[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}\\s[0-9]{4}")) && card.matches("[0-9]{3}");
    }

    public static boolean validateNomenclature(String nomenclature)
    {
        return nomenclature.matches("[A-Z][a-z]*+\\s[a-z]*");
    }

    public static boolean validate20SideRoll(String roll)
    {
        return roll.matches("[0-1][1-9]") || roll.matches("[1-9]") || roll.matches("20");
    }

    public static boolean validate20SideModRoll(String roll, int mod)
    {
        int modifier = mod+1;
        boolean output = false;
        if (mod >= 10)
        {
            output = roll.matches("[1-2][0-9]")  || roll.matches("(2|3)0");
        }
        else if (mod == 0)
        {
            output =  roll.matches("[0-1][0-9]") || roll.matches("[1-9]") || roll.matches("20");//not actually a new pattern lol
        }
        else
        {
            output =  (!(roll.matches("[0-" + mod + "]")) && (roll.matches("[0-9]{1}"))) || roll.matches("1[0-9]{1}") || roll.matches("2[0-"+mod+"]");//UHHH guys... what the balls
        }
        return output;
    }
}
