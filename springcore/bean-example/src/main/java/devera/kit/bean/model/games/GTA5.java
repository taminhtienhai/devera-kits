package devera.kit.bean.model.games;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import devera.kit.bean.interfaces.Game;

@Primary
@Component
public class GTA5 implements Game {

    @Override
    public String name() {
        return "gta5";
    }
    
}
