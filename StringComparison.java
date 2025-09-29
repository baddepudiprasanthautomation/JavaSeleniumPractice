public class StringComparison {
    public static void main(String[] args) {
        String state = "AndhraPradesh";
        String state2 = "Tamilnadu";

        boolean status = state.contains(state2);

        if(status)
            System.out.println("two states are same");
        else
            System.out.println("states are not same");
    }
}
