void main() {

    String name = "Souleymane DIALLO";
    String role = "     Software Engineer     ";
    String lastname;

    int length = name.length();
    char first = name.charAt(0);
    String upper = name.toUpperCase();
    String lower = name.toLowerCase();
    String sub = name.substring(0, 9);
    int index = name.indexOf("DIALLO");
    int lastIndex = name.lastIndexOf("o");

    lastname = name.substring(name.indexOf("D"));

    role = role.trim();

    System.out.println(index);
    System.out.println(lastname);
    System.out.println(role);
}