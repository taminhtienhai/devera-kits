package devera.kits.aop.expresion;

import org.springframework.expression.spel.standard.SpelExpressionParser;

public class ParseDemo {

    public void simpleParser() {
        var parser = new SpelExpressionParser();

        var exp = parser.parseExpression("'Hello'.concat('!')");

        var result = (String) exp.getValue();

        System.out.println(result);
    }
    
}
