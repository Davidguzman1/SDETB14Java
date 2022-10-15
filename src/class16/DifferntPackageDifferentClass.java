package class16;

import class17.ConstructoPublicAccess;

public class DifferntPackageDifferentClass {
    public static void main(String[] args) {
        ConstructoPublicAccess publicAccess=new ConstructoPublicAccess("David", 14);

        publicAccess.m1();

    }
}
