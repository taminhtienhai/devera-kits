package devera.kit.bean.model.games;

import org.springframework.stereotype.Component;

import devera.kit.bean.interfaces.Game;

@Component
public class CounterStrike implements Game {

    @Override
    public String name() {
        return "cs";
    }
    
}
