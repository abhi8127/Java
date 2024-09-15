package practice2;

public class Use_Continue {
    public static void main(String[] args){
//        for(int i=0;i<=10;i++){
//            if(i%2==0)
//                continue;
//            System.out.print(i+" ");


//        String str="Knowledge";
//       // String s=str;
//        str=str.concat(" Base");
//        System.out.println(str);
       // System.out.println(s);



        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        System.out.println(sb);
       // String message = sb.toString();
       // System.out.println(message);

        Integer i = new Integer(10);
        Integer j = new Integer(20);
        Integer k = new Integer(i.intValue() + j.intValue());
        System.out.println("Output: "+ k);
        }
    }

