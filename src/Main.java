public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 65.5f;
        float height = 1.70f;
        float bmi = service.calculate(weight, height);
        System.out.println("Ваш индекс массы тела равен " + bmi);
    }
}