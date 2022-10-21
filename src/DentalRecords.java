import java.util.Locale;
import java.util.Scanner;

public class DentalRecords {
    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

//This is the variable declaration (RENAME):
        int i;
        int p;
        int k;

//This is the welcome message:
        System.out.println("Welcome to the Floridian Tooth Records");
        System.out.println("--------------------------------------");

//This collects the initial inputs:
        System.out.print("Please enter number of people in the family :");
        int numFamilyMembers = keyboard.nextInt();
        while (numFamilyMembers < 1 || numFamilyMembers > 6) {
            System.out.print("\n" + "Invalid number of people, try again         :");
            numFamilyMembers = keyboard.nextInt();
        }

        //This is the array declaration and takes the family name inputs:
        String[] familyNames = new String[numFamilyMembers];
        char[][][] teeth = new char[numFamilyMembers][2][8];
        for (i = 0; i < numFamilyMembers; i++) {
            System.out.print("\n" + "Please enter the name for family member " + (i + 1) + "   :");
            familyNames[i] = keyboard.next();

            //This takes the upper inputs:
            System.out.print("\n" + "Please enter the uppers for " + familyNames[i] + "       :");
            String tooths = keyboard.next();
            tooths = tooths.toUpperCase();

            for (p = 0; p < tooths.length(); p++) {
                while (tooths.charAt(p) != 'I' && tooths.charAt(p) != 'B' && tooths.charAt(p) != 'M') {
                    System.out.print("\n" + "Invalid teeth types, try again              :");
                    tooths = keyboard.next();
                    tooths = tooths.toUpperCase();
                }
            }
            while (tooths.length() > 8) {
                System.out.print("\n" + "Too many teeth, try again                   :");
                tooths = keyboard.next();
            }
            for (k = 0; k < tooths.length(); k++) {
                teeth[i][0][k] = tooths.charAt(k);
            }

            //This takes the lower inputs:
            System.out.print("\n" + "Please enter the lowers for " + familyNames[i] + "       :");
            tooths = keyboard.next();
            tooths = tooths.toUpperCase();

            for (p = 0; p < tooths.length(); p++) {
                while (tooths.charAt(p) != 'I' && tooths.charAt(p) != 'B' && tooths.charAt(p) != 'M') {
                    System.out.print("\n" + "Invalid teeth types, try again              :");
                    tooths = keyboard.next();
                    tooths = tooths.toUpperCase();
                }
            }
            while (tooths.length() > 8) {
                System.out.print("\n" + "Too many teeth, try again                   :");
                tooths = keyboard.next();
            }
            for (k = 0; k < tooths.length(); k++) {
                teeth[i][1][k] = tooths.charAt(k);
            }
        }

//This is my menu creation and menu loop:
        char menuOption;
        System.out.print("\n" + "(P)rint, (E)xtract, (R)oot, e(X)it          :");
        menuOption = ((keyboard.next()).toUpperCase()).charAt(0);
        while (menuOption != 'X') {
            if (menuOption == 'P') {
                printDentalRecordsMethod(teeth,familyNames, numFamilyMembers);
                System.out.print("\n" + "(P)rint, (E)xtract, (R)oot, e(X)it          :");
                menuOption = ((keyboard.next()).toUpperCase()).charAt(0);
            } else if (menuOption == 'E') {
                extractMethod(teeth,familyNames);
                System.out.print("\n" + "(P)rint, (E)xtract, (R)oot, e(X)it          :");
                menuOption = ((keyboard.next()).toUpperCase()).charAt(0);
            } else if (menuOption == 'R') {
                rootMethod(teeth);
                System.out.print("\n" + "(P)rint, (E)xtract, (R)oot, e(X)it          :");
                menuOption = ((keyboard.next()).toUpperCase()).charAt(0);
            } else {
                System.out.print("\n" + "Invalid menu option, try again              :");
                menuOption = ((keyboard.next()).toUpperCase()).charAt(0);
            }
            menuOption = ((keyboard.next()).toUpperCase()).charAt(0);
        }
        System.out.print("\n" + "Exiting the Floridian Tooth Records :-)");
        //This is the end of the main method
    }

//This method prints menu option P:
    public static return (teeth)
        if (menuOption.charAt(0) == 'P') {
            for (i = 0; i < numFamilyMembers; i++)
                System.out.println("");
        }

//This prints menu option R:
        if (menuOption.charAt(0) == 'R') {

        }

//This prints menu option X:
        if (menuOption.charAt(0) == 'X') {
            System.out.println("Exiting the Floridian Tooth Records :-)");
        }

//This prints menu option E:
        if (menuOption.charAt(0) == 'E') {
            System.out.println("Which family member                         :");
            String selectedFamMember = keyboard.next();
        }

}

/*
1. Inputs
    1.1 Collect number of family members (only accept inputs that fall under: 0<#<=6)
        1.1.1 Collect names of each family member
            1.1.1.1 Uppers (only accept inputs that fall under: 0<#<=8)
            1.1.1.2 Lowers (only accept inputs that fall under: 0<#<=8)
2. Options
    2.1 Create loop to re-display menu options after a menu option is selected and displayed. In this loop, each menu option is tied to a method that gets called when the given menu option is chosen
    2.2 Print method
        2.2.1 Print a list of family members and the number of each type of tooth for both lowers and uppers
    2.3 Extract method
        2.3.1 Change selected tooth to 'M' (must have a tooth to remove)
    2.4 Root method
        2.4.1 Ix^2 + Bx - M (where I, B, and M are the family's numbers of those types of teeth)
    2.5 Exit method
        2.5.1 Display Exit Message
 */