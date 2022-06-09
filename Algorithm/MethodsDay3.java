public class MethodsDay3 {
    public static void getIndex(String str , int indx) {
        int a = str.length();
        if (indx < a) {
            char b = str.charAt(indx);
            System.out.println(b);
        } else {
            System.out.println("OOps, try again");
        }
    }



    public static void separatedBySpace(String s) {
        //.....
        for (int i =0; i <s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }

//        char[] cr = s.toCharArray();
//        for(int i = 0; i<s.length(); i++) {
//
//        }
    }


    public static void twoStrings(String s1, String s2) {
        String s3 = s1.concat(s2);
        System.out.println((s3));

    }

    public static void compareStrongs(String s1, String s2){
        String s3 = s1.toUpperCase();
        String s4 = s2.toUpperCase();
        int k =s3.compareTo(s4);
        if (k==0) {
            System.out.println("yesss");
        } else {
            System.out.println("nooo");
        }
    }

    public static void specifiedSequence(String s1, String s2) {
        if(s1.contains(s2)) {
            System.out.println("voalyaaa");
        }
    }



    public static void main(String[] args) {
        //getIndex("writeee", 4);
        //separatedBySpace("Word");
        //twoStrings("Arm", "Eur");
        //compareStrongs("arm", "aRm");
        specifiedSequence("Armenia", "rm");


    }

}

