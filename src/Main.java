//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StackArray st = new StackArray(20);
        st.isFull();
        st.isEmpty();
        st.hasElements();
        st.push("Adonay");
        st.push("Manzanares");
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }
}