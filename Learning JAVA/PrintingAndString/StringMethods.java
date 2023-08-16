package PrintingAndString;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Shubham";
        System.out.println("name length - "+name.length());

        String newName = name.toLowerCase();
       System.out.println("name to lowercase - "+newName);

        String newNameUppercase = newName.toUpperCase();
        System.out.println("name to uppercase - "+newNameUppercase);

        String fullName = "                               Shubham                                 ";
        System.out.println("trimming extra spaces - "+fullName.trim());

        System.out.println("name substring with begin idx - "+name.substring(2));

        System.out.println("name substring with begin idx and ending idx - "+name.substring(1,6));

        System.out.println("replacing character with new character - "+name.replace('h','z'));

        System.out.println("check if name startswith desired string - "+name.startsWith("Shu"));

        System.out.println("check if name startswith desired string starting from offset val - "+name.startsWith("h", 1));

        System.out.println("check if name endswith desired string - "+name.endsWith("z"));

        System.out.println(name.charAt(6));

        System.out.println(name.indexOf("S"));

        System.out.println(name.lastIndexOf("h"));

        System.out.println(name.equals(newName));

        System.out.println(name.toLowerCase().equals(newName));
        System.out.println(name.toLowerCase() == newName);

        System.out.println(name.equalsIgnoreCase(newName));

        System.out.println("name".compareTo(newName));



        int intValue = 42;

        // Using valueOf to convert int to String
        String stringValue = String.valueOf(44);

        System.out.println("intValue: " + intValue);
        System.out.println("stringValue: " + stringValue);
    }

    
}
