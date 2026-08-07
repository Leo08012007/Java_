public class day13 {
    public static void main(String args[]){
        String name1 = "Bhargavi";
        for(int i=0;i<name1.length();i++){
            System.out.println(name1.charAt(i));
        }
        System.out.println(name1.length());
        String name2="Bhargavi";
        if(name1.compareTo(name2)==0){
            System.out.println("same");
        }else{
            System.out.println("no");
        }
        if(new String("tony")== new String("tony")){
            System.out.println("s");
        }else{
            System.out.println("no");
        }
        if(name1.equals(name2)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println(name1.substring(0,7));
        String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);

    }
    
}
