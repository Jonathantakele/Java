public class Constant {

    public static void main(String[] args) {
        final String Company_Name = "Jonah P.L.C";
        minAndMax(args);
        integerDataTypes(args);

        System.out.println(Company_Name);
        System.out.println(Company_Name);
        System.out.println(Company_Name);
        System.out.println(Company_Name);
        System.out.println(Company_Name);}

    public static void integerDataTypes(String[] args) {

        byte b1 =5;
        short s1 = 10;
        int i1 =100;
        long l1= 999L;

        System.out.println(b1);
        System.out.println(s1);
        System.out.println(i1);
        System.out.println(l1);
    }

    public static void minAndMax(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
    }

}
