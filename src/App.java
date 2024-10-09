public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("Tuition cost        Year");
    double new_tuition = 0;
    int i = 0;
        for (i = 0; i<10; i++){
        int tuition = 10000;
        new_tuition = ((.05*i)*tuition)+ tuition;
        int year = i + 1;
        System.out.println("$"+(int)new_tuition+"                 "+ year);
        }
    int four_year_cost = (int)new_tuition* 4;
    System.out.println("The four year cost after " + i+ " years is $" +four_year_cost);
    }
}
