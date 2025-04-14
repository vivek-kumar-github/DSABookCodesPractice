import java.util.Stack;

public class evaluatePostfix {
    public static int eval(String s){
        Stack<Integer> operand = new Stack<>();
        String[] exp = s.split(" ");
        for(String x : exp){
            if(x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")){
                int op2 = operand.pop();
                int op1 = operand.pop();
                int res = 0;
                if(x.equals("+")){
                    res = op1 + op2;
                }
                else if(x.equals("-")){
                    res = op1 - op2;
                }
                else if(x.equals("*")){
                    res = op1 * op2;
                }
                else if(x.equals("/")){
                    res = op1 * op2;
                }
                operand.push(res);
            }
            else{
                operand.push(Integer.parseInt(x));
            }
        }
        return operand.pop();
    }

    public static void main(String[] args) {
        String expression = "4 2 + 1 3 - *";
        System.out.println(eval(expression));
    }
}
