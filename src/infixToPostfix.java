import java.util.Stack;
public class infixToPostfix {
    public static String infixToPostfix(String s){
        Stack<String> operand = new Stack<>();
        Stack<String> operator = new Stack<>();
        String[] exp = s.split(" ");
        for(String x : exp){
            if(x.equals("(")){
                //Do Nothing
            }
            else if (x.equals("+")
                    || x.equals("-")
                    || x.equals("*")
                    || x.equals("/")){
                operator.push(x);
            }
            else if(x.equals(")")){
                String value2 = operand.pop();
                String value1 = operand.pop();
                String op = operator.pop();
                String temp = value1 + " " + value2 + " " + op;
                operand.push(temp);
            }
            else{
                operand.push(x);
            }
        }
        return operand.pop();
    }
    public static void main(String[] args) {
        String expression = "( ( 1 + 2 ) * ( 4 / 2 ) )";
        System.out.println(infixToPostfix(expression)); //1 2 + 4 2 / *"
        System.out.println( ( 1 + 2 ) * ( 4 / 2 ) );
    }
}
