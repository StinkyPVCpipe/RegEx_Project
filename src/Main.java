public class Main {
    public static void main(String[] args) {
        //CREDIT CARD INFO <3
        //the 16 numbers on the front
        //gonna need at least 21,,, 7 tests for the three patterns bet bet bet
        //pattern 1
        String credit1 = "1234567890123456";
        String credit2 = "123456pokemon";
        String credit3 = "654321digimon";
        String credit4 = "123456789012345";
        String credit5 = "12345678901234567";
        String credit6 = "0000000000000000";
        String credit7 = " 1234567890123456";
        String credit8 = "1234567890123456 ";
        //pattern 2
        String credit9 = "1234-5678-9012-3456";
        String credit10 = "abcd-efgh-ijkl-mnop";
        String credit11 = "123-45678-901234-56";
        String credit12 = "1234-5678-9012-3456-7890";
        String credit13 = "1234-5678-90123";
        String credit14 = "1234 - 5678 - 9012 - 3456";
        String credit15 = "1-2-3-4-5-6-7-8-9-0-1-2-3-4-5-6";
        //pattern3
        String credit16 = "1234 5678 9012 3456";
        String credit17 = "abcd efgh ijkl mnop";
        String credit18 = "12345678 12345678";
        String credit19 = "1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6";
        String credit20 = "12345 6789 012 3456";
        String credit21 = "1234 5678 9012 34567";
        String credit22 = "123 456 789 012 345";

        System.out.println("credit card pattern 1");
        System.out.println(credit1 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit1));
        System.out.println(credit2 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit2));
        System.out.println(credit3 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit3));
        System.out.println(credit4 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit4));
        System.out.println(credit5 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit5));
        System.out.println(credit6 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit6));
        System.out.println(credit7 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit7));
        System.out.println(credit8 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit8));
        System.out.println("\ncredit card pattern 2");
        System.out.println(credit9 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit9));
        System.out.println(credit10 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit10));
        System.out.println(credit11 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit11));
        System.out.println(credit12 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit12));
        System.out.println(credit13 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit13));
        System.out.println(credit14 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit14));
        System.out.println(credit15 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit15));
        System.out.println("\ncredit card pattern 3");
        System.out.println(credit16 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit16));
        System.out.println(credit17 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit17));
        System.out.println(credit18 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit18));
        System.out.println(credit19 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit19));
        System.out.println(credit20 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit20));
        System.out.println(credit21 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit21));
        System.out.println(credit22 + " could be a valid credit card number input: " + ValidateInput.validateCreditCard(credit22));


        //those three numbers on the back <3
        String card1 = "123";
        String card2 = "abc";
        String card3 = "1234";
        String card4 = "12";
        String card5 = "12a";
        String card6 = "Aub";
        String card7 = "9 8 7";

        System.out.println("\ncredit card three numbers on the back(pattern 4)");
        System.out.println(card1 + " could be a valid three digits on the back of a credit card input: " + ValidateInput.validateThoseThreeNumbersOnTheBack(card1));
        System.out.println(card2 + " could be a valid three digits on the back of a credit card input: " + ValidateInput.validateThoseThreeNumbersOnTheBack(card2));
        System.out.println(card3 + " could be a valid three digits on the back of a credit card input: " + ValidateInput.validateThoseThreeNumbersOnTheBack(card3));
        System.out.println(card4 + " could be a valid three digits on the back of a credit card input: " + ValidateInput.validateThoseThreeNumbersOnTheBack(card4));
        System.out.println(card5 + " could be a valid three digits on the back of a credit card input: " + ValidateInput.validateThoseThreeNumbersOnTheBack(card5));
        System.out.println(card6 + " could be a valid three digits on the back of a credit card input: " + ValidateInput.validateThoseThreeNumbersOnTheBack(card6));
        System.out.println(card7 + " could be a valid three digits on the back of a credit card input: " + ValidateInput.validateThoseThreeNumbersOnTheBack(card7));

        //this is more for funsies teehee
        System.out.println("\nTesting the 16 nums and the 3 nums together (not a pattern, just for fun)");
        System.out.println(credit1 + " " + card1 + " could be a valid credit card input: " + ValidateInput.validateCard(credit1, card1));
        System.out.println(credit2 + " " + card6 + " could be a valid credit card input: " + ValidateInput.validateCard(credit2, card6));
        System.out.println(credit3 + " " + card7 + " could be a valid credit card input: " + ValidateInput.validateCard(credit3, card7));
        System.out.println(credit11 + " " + card2 + " could be a valid credit card input: " + ValidateInput.validateCard(credit11, card2));

        //Scientificus nomenclatura (pattern 5)
        String nomen1 = "Imposterus amogus";
        String nomen2 = "Amogus Imposterus";
        String nomen3 = "amongus Imposterus";
        String nomen4 = "Sonicus The hedgehogus";
        String nomen5 = "MEOW meow";
        String nomen6 = "123456 pokemon";
        String nomen7 = "AuB awesomeus";
        String nomen8 = "stinky pvcpipe";

        System.out.println("\nScientific Nomenclature(pattern 5)");
        System.out.println(nomen1 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen1));
        System.out.println(nomen2 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen2));
        System.out.println(nomen3 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen3));
        System.out.println(nomen4 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen4));
        System.out.println(nomen5 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen5));
        System.out.println(nomen6 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen6));
        System.out.println(nomen7 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen7));
        System.out.println(nomen8 + " is proper scientific nomenclature: " + ValidateInput.validateNomenclature(nomen8));

        //single 20-sided die roll
        //pattern 1 (01-19)
        String roll1 = "12";
        String roll2 = "twelve";
        String roll3 ="123";
        String roll4 = "03";
        String roll5 = "10";
        String roll6 = "01";
        String roll7 = "1 9";

        //pattern 2 (1-9)
        String roll8 = "9";
        String roll9 = "0";
        String roll10 = "five";
        String roll11 = "1";
        String roll12 = " ";
        String roll13 = "a";
        String roll14 = "50";

        //pattern 3 (20)
        String roll15 = "20";
        String roll16 = "21";
        String roll17 = "Natural Twenty";
        String roll18 = "two zero";
        String roll19 = "30";
        String roll20 = "24";
        String roll21 = "22";

        System.out.println("\nValid 20-sided die roll without any modifiers(pattern 6, 01-19)");
        System.out.println(roll1 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll1));
        System.out.println(roll2 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll2));
        System.out.println(roll3 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll3));
        System.out.println(roll4 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll4));
        System.out.println(roll5 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll5));
        System.out.println(roll6 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll6));
        System.out.println(roll7 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll7));

        System.out.println("\nValid 20-sided die roll without any modifiers(pattern 7, 1-9)");
        System.out.println(roll8 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll8));
        System.out.println(roll9 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll9));
        System.out.println(roll10 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll10));
        System.out.println(roll11 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll11));
        System.out.println(roll12 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll12));
        System.out.println(roll13 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll13));
        System.out.println(roll14 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll14));

        System.out.println("\nValid 20-sided die roll without any modifiers(pattern 8, 20)");
        System.out.println(roll15 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll15));
        System.out.println(roll16 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll16));
        System.out.println(roll17 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll17));
        System.out.println(roll18 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll18));
        System.out.println(roll19 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll19));
        System.out.println(roll20 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll20));
        System.out.println(roll21 + " is a valid 20-sided die roll: " + ValidateInput.validate20SideRoll(roll21));


        //20-sided die roll with modifier
        //pattern 9 (modifier of ten)
        String modRoll1 = "11";
        String modRoll2 = "120";
        String modRoll3 = "20";
        String modRoll4 = "28";
        String modRoll5 = "5";
        String modRoll6 = "9";
        String modRoll7 = "10";

        //pattern 10 (modifier of 10 maximum amount)
        String modRoll8 = "30";
        String modRoll9 = "31";
        String modRoll10 = "300";
        String modRoll11 = "thirty";
        String modRoll12 = "030";
        String modRoll13 = " 30";
        String modRoll14 = "30 ";

        //pattern 11 (nums 1-9 with any modifier <10)
        String modRoll15 = "5";//test w/ mod of 4 and mod of 6
        String modRoll16 = "1";//test w/ mod of 0 and mod of 2
        String modRoll17 = "two";
        String modRoll18 = "9";//test w/ mod of 3 and mod of 9
        String modRoll19 = "2";//test w/ mod of 1 and mod of 2
        String modRoll20 = "0";

        //pattern 12 (nums 10-19 w/ any modifier)
        String modRoll21 = "11";
        String modRoll22 = "111";
        String modRoll23 = "10";
        String modRoll24 = "19";
        String modRoll25 = "fifteen";
        String modRoll26 = " 12";
        String modRoll27 = "13 ";

        //pattern 13 (nums >= 20)
        String modRoll28 = "20";
        String modRoll29 = "23";//test w/ mod of 3 and mod of 8
        String modRoll30 = "29";
        String modRoll32 = "200";
        String modRoll33 = "020";

        System.out.println("\nValid 20-sided die roll with modifiers(pattern 9, modifiers of ten)");
        System.out.println(modRoll1 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll1, 10));
        System.out.println(modRoll2 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll2, 10));
        System.out.println(modRoll3 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll3, 10));
        System.out.println(modRoll4 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll4, 10));
        System.out.println(modRoll5 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll5, 10));
        System.out.println(modRoll6 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll6, 10));
        System.out.println(modRoll7 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll7, 10));

        System.out.println("\nValid 20-sided die roll with modifiers(pattern 10, modifiers of ten but the maximum amount)");
        System.out.println(modRoll8 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll8, 10));
        System.out.println(modRoll9 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll9, 10));
        System.out.println(modRoll10 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll10, 10));
        System.out.println(modRoll11 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll11, 10));
        System.out.println(modRoll12 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll12, 10));
        System.out.println(modRoll13 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll13, 10));
        System.out.println(modRoll14 + " with a modifier of 10 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll14, 10));

        System.out.println("\nValid 20-sided die roll with modifiers(pattern 11, nums 1-9 w/ any modifier)");
        System.out.println(modRoll15 + " with a modifier of 4 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll15, 4));
        System.out.println(modRoll15 + " with a modifier of 6 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll15, 6));
        System.out.println(modRoll16 + " with a modifier of 0 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll16, 0));
        System.out.println(modRoll16 + " with a modifier of 2 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll16, 2));
        System.out.println(modRoll17 + " with a modifier of 3 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll17, 3));
        System.out.println(modRoll18 + " with a modifier of 3 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll18, 3));
        System.out.println(modRoll18 + " with a modifier of 9 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll18, 9));
        System.out.println(modRoll19 + " with a modifier of 1 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll19, 1));
        System.out.println(modRoll19 + " with a modifier of 2 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll19, 2));
        System.out.println(modRoll20 + " with a modifier of 1 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll20, 1));

        System.out.println("\nValid 20-sided die roll with modifiers(pattern 12, nums 10-19 w/ any modifier)");
        System.out.println(modRoll21 + " with a modifier of 1 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll21, 1));
        System.out.println(modRoll22 + " with a modifier of 2 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll22, 2));
        System.out.println(modRoll23 + " with a modifier of 3 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll23, 3));
        System.out.println(modRoll24 + " with a modifier of 4 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll24, 4));
        System.out.println(modRoll25 + " with a modifier of 5 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll25, 5));
        System.out.println(modRoll26 + " with a modifier of 6 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll26, 6));
        System.out.println(modRoll27 + " with a modifier of 7 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll27, 7));

        System.out.println("\nValid 20-sided die roll with modifiers(pattern 11, nums >=20 w/ any modifier)");
        System.out.println(modRoll28 + " with a modifier of 4 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll28, 4));
        System.out.println(modRoll29 + " with a modifier of 2 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll29, 2));
        System.out.println(modRoll29 + " with a modifier of 8 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll29, 8));
        System.out.println(modRoll30 + " with a modifier of 9 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll30, 9));
        System.out.println(modRoll30 + " with a modifier of 4 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll30, 4));
        System.out.println(modRoll32+ " with a modifier of 3 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll32, 3));
        System.out.println(modRoll33 + " with a modifier of 7 is a valid 20-sided die roll: " + ValidateInput.validate20SideModRoll(modRoll33, 7));
    }
}