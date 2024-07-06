public class String {
    public static void main(java.lang.String[] arg){
        java.lang.String str= "Java";
        System.out.println("str :"+str);



        System.out.println("str length:"+   str.length());
        java.lang.String str1 = str.toLowerCase();
        System.out.println("str1 this is a new object toLowerCase:"+   str1);
        System.out.println("str this is a new object toLowerCase:"+   str.toLowerCase());
//        str = str.toLowerCase(); // commenting this to use same str
        System.out.println("str toLowerCase:"+   str);
        System.out.println("str toUpperCase:"+   str.toUpperCase());

        java.lang.String sTrim= "  Trim  ";

        System.out.println("str trim:"+   sTrim.trim());

        System.out.println("str substring(2):"+   str.substring(2));
        System.out.println("str substring(1,3):"+   str.substring(1,3));

        System.out.println("str replace(1,3):"+   str.replace('J','L'));

        System.out.println("str startsWith():"+   str.startsWith("Java"));
        System.out.println("str endsWith(1,3):"+   str.endsWith("s"));

        System.out.println("str charAt(3):"+   str.charAt(3));

        System.out.println("str indexOf(a):"+   str.indexOf("a"));

        System.out.println("str lastIndexOf(a):"+   str.lastIndexOf("a"));
        System.out.println("str lastIndexOf(a,2):"+   str.lastIndexOf("a",2));

        System.out.println("str lastIndexOf(a,2):"+   str.lastIndexOf("a",2));

        System.out.println("str :"+   str);
        System.out.println("str1 :"+   str1);
        System.out.println("str equals():"+   str.equals(str1));
        System.out.println("str equalsIgnoreCase():"+   str.equalsIgnoreCase(str1));

        System.out.println("str compareTo():"+   str.compareTo(str1));
    }
}
