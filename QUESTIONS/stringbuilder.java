public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello"); // 0 based indexing
        str.append("prashant");
        System.out.println(str);
        str.insert(1,"p");
        System.out.println(str);
        str.delete(0, 3);
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.reverse());

        String part = str.toString();  // stringbuilder to string

        System.out.println(part);
    }
}
