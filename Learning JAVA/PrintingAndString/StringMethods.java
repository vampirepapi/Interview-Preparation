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

        System.out.println("find char at desired index - "+name.charAt(6));

        System.out.println("find index of desired string - "+name.indexOf("S"));

        System.out.println("find index of desired string traversing from the end of string - "+name.lastIndexOf("h"));

        System.out.println("check if two compared string is equal or not (here .equals() check object) - "+name.equals(newName));

        System.out.println("check if two compared string is equal or not (here .equals() check object) - "+name.toLowerCase().equals(newName));
        System.out.println("check if two compared string is equal or not (here == check refrences are same or not) - "+name.toLowerCase() == newName);

        System.out.println("check if two compared string is equal or not and dont look for the case sensitive either - "+name.equalsIgnoreCase(newName));

        System.out.println(name.compareTo(newName));



        int intValue = 42;

        // Using valueOf to convert int to String
        String stringValue = String.valueOf(44);

        System.out.println("intValue: " + intValue);
        System.out.println("stringValue: " + stringValue);
    }

    
}
