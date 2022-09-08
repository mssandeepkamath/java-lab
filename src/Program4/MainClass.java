package Program4;

/*
Create a class Thirdsem. Put this class into a package called CSE. Define a method
Welcomemsg which prints a line “Welcome to CSE dept- 3rd sem young budding Engineers”.
Create a class Csedept. Put this class into a package called RVCE.
Inherit the class Thirdsem in CSE package to Csedept class in RVCE package and call
Welcomemsg method to display welcome message and also verify Public method
Overriding, Private method overriding and default method overriding from different
packages in java with the same program
 */

import Program4.RVCE.CseDept;

public class MainClass {
    public static void main(String[] args) {
        CseDept cse=new CseDept();
        cse.welcomemsgpublic();
    }
}
