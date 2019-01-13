package pl.sda.structure.stack;

public class MDRevertWordWithStack {

    public static void main(String args[]) {
        MDMyStack<String> stack = new MDMyStack<>();

        String test1 = "TEST";
        String[] split = test1.split("");

        stack.push("D");
        stack.push("C");
        stack.push("A");
        stack.push("B");

        String element = stack.pop();

        while (element !=null){
            System.out.println(element);
            element = stack.pop();
        }
        stack.printStack();



    }


}
