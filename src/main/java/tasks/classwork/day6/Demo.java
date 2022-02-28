package main.java.tasks.classwork.day6;

public class Demo {

    public static void main(String[] args) {

        String x = "sdf@mail.ru";

//        String[] y = x.split("a");

//        for(String z: y){
//            System.out.println(z);
//        }

      //  x = x.replaceAll("abc", "999");

//        x = x.substring(4);

        System.out.println(x);
        x = x.trim();

        System.out.println(x);

        boolean z = x.matches("[a-z]+@[a-z]+.[a-z]{2}");

        System.out.println(z);

        x = x.concat("z");
        System.out.println(x);

        StringBuilder sb = new StringBuilder();

        for (int d = 0; d < 1000000; d++){
            sb.append("asdf");
        }
        System.out.println(x);

        System.out.println(sb);

//        System.out.println( x.contains("543"));
//
//        System.out.println(x.equals("ABC"));
//        System.out.println(x.equalsIgnoreCase("ABC"));
    }
}
