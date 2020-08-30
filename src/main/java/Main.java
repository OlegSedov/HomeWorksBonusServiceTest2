public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        System.out.println(passed);

        long bonus1 = service.calculate(1000_60, true);
        System.out.println(bonus1);

        float bonus2 = service.calculate(1000_60, false);
        System.out.println(bonus2);

        long bonus3 = service.calculate(0, true);
        System.out.println(bonus3);

        long bonus4 = service.calculate(9223372036854775807L, true);
        System.out.println(bonus4);
    }
}