package commonMistake;

public class NullPointerException {
    public static void main(String[] args){

        Person person= new Person("abhishek");
       // Person person=null;
        String FIRSTNAME=person.getFirstName();

        if(person!=null)
        {
            System.out.println(FIRSTNAME);
        }
        else {
            System.out.println("first name is null");
        }
    }
}
