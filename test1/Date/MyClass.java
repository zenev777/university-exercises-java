public class MyClass {

    public static void main(String[] args) {
        Date date1 = new Date(1, "July", 2002);

        Date date2 = new Date(25, "February", 2003);




        System.out.println(date1.isValidDate());
        System.out.println(date2.isValidDate());
        Date.CompareDates(date1,date2);


    }
}