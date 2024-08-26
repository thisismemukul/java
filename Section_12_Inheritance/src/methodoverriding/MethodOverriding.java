package methodoverriding;

public class MethodOverriding {
        public static void main(String[] args) {
            Super s = new Super();
            s.display();

            Sub sub = new Sub();
            sub.display();

            Super sup = new Sub();
            sup.display();
        }
}
