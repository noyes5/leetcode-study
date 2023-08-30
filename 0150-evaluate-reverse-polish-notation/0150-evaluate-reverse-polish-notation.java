class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack<>();

        for (int i = 0; i < tokens.length ; i++) {
            if (isOperator(tokens[i])) {
                String operator = tokens[i];
                int num1 = numStack.pop();
                int num2 = numStack.pop();
                numStack.push(calculate(num1, num2, operator));
            } else {
                int num = Integer.parseInt(tokens[i]);
                numStack.push(num);
            }
        }

        return numStack.pop();

    }

    public boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
    }

    public int calculate(int num1, int num2, String operator) {
        if (operator.equals("+")) {
            return num2 + num1;
        } else if (operator.equals("-")) {
            return num2 - num1;
        } else if (operator.equals("*")) {
            return num2 * num1;
        } else {
            return num2 / num1;
        }
    }

}