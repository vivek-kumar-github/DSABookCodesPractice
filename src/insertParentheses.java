import edu.princeton.cs.algs4.Stack;

public class insertParentheses {
    public static String inParentheses(String s){
        Stack<String> operators = new Stack<>();
        Stack<String> operand = new Stack<>();
        String[] op = s.split(" ");
        for(String x : op){
            if(x.equals("(")){
                //do nothing;
            } else if ("+-/*".contains(x)) {
                operators.push(x);
            } else if (x.equals(")")) {
                String val2 = operand.pop();
                String val1 = operand.pop();
                String ope = operators.pop();
                String exp = "( " + val1 + " " + ope + " " + val2 + " )";
                operand.push(exp);
            }else{
                operand.push(x);
            }
        }
        return operand.pop();
    }

    public static void main(String[] args) {
        String s =  "1 + 2 ) * 3 - 4 ) * 5 - 6 ) ) )";
        System.out.println(inParentheses(s));
    }
}
