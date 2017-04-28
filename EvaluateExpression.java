/**
 * Created by island on 17-4-2.
 */
import java.util.Scanner;
import java.util.Stack;

public class EvaluateExpression {
    static Stack<Character> oprt = new Stack<>();  // 操作符栈
    static Stack<Integer> vals = new Stack<>();  // 操作数栈
    static String expression;  // 输入的中缀表达式

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        expression = in.next();
        in.close();
        String postfix = toPostfix(expression);
        int result = evaluate(postfix);
        System.out.println(result);
    }

    static String toPostfix(String expr) {
        // 中缀转后缀
        String postfix = "";

        for (int i=0;i<expr.length();i++) {
            // 遍历中缀表达式
            char c = expr.charAt(i);
            if (Character.isDigit(c)) {
                // 读入操作数
                String num = c + "";
                // 操作数可能有多位
                while (i + 1 < expr.length() && Character.isDigit(expr.charAt(i + 1))) {
                    num += expr.charAt(++i);
                }
                postfix += num + " ";  // 用空格分开操作数，因为在后缀表达式中，有可能有多个操作数相邻，这里用空格将它们分开
            } else {
                if (oprt.isEmpty() || c == '(') {
                    // 空栈或左括号，直接入栈
                    oprt.push(c);
                } else if (c == ')') {
                    // 遇到右括号，弹出操作数和操作符，直到弹出左括号
                    char opt = oprt.pop();
                    while (opt != '(') {
                        postfix += opt;
                        opt = oprt.pop();
                    }

                } else {
                    if (priority(c) > priority(oprt.peek())) {
                        // 当前操作符的优先级大于栈顶操作符的优先级，直接入栈
                        oprt.push(c);
                    } else {
                        // 否则将操作符栈中的操作符弹出，直到遇到比当前操作符优先级小的操作符，并把当前操作符入栈
                        while ((! oprt.isEmpty()) && (priority(c) <= priority(oprt.peek()))) {
                            postfix += oprt.pop();
                        }
                        oprt.push(c);
                    }
                }
            }
        }
        while (!oprt.isEmpty()) {
            postfix += oprt.pop();
        }
        return postfix;
    }

    static int evaluate(String postfix) {
        // 对后缀表达式求值
        for (int i = 0; i < postfix.length(); i++) {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch)) {
                String num = ch + "";
                while (i + 1 < postfix.length() && Character.isDigit(postfix.charAt(i + 1))) {
                    num += postfix.charAt(i + 1);
                    i++;
                }
                vals.push(Integer.parseInt(num));
            } else if (ch == ' ') {
                // 忽略空格
            } else {
                // 注意操作数的顺序
                int b = vals.pop();
                int a = vals.pop();
                int result = compute(a, b, ch);
                vals.push(result);
            }
        }
        return vals.pop();
    }

    static int priority(char opt) {
        // 确定操作符的优先级
        int priority = 0;
        if (opt == '+' || opt == '-') {
            priority = 1;
        } else if (opt == '*' || opt == '/') {
            priority = 2;
        }
        return priority;
    }

    static int compute(int a, int b, char opt) {
        // 根据操作符对a b做四则运算
        int result = 0;
        switch (opt) {
            case '+': {
                result = a + b;
                break;
            }
            case '-': {
                result = a - b;
                break;
            }
            case '*': {
                result = a * b;
                break;
            }
            case '/': {
                result = a / b;
                break;
            }
        }
        return result;
    }
}
