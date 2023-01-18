package com.codecool.dungeoncrawl.ui.keyeventhandler;

import com.codecool.dungeoncrawl.data.GameMap;
import com.codecool.dungeoncrawl.logic.GameLogic;
import com.codecool.dungeoncrawl.ui.UI;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Right implements KeyHandler {
    public static final KeyCode code1 = KeyCode.RIGHT;
    public static final KeyCode code2 = KeyCode.D;

    @Override
    public void perform(KeyEvent event, GameLogic logic, UI ui) {
        if(code1.equals(event.getCode()) || code2.equals(event.getCode()))
        logic.getMap().getPlayer().move(1, 0, ui);
    }
}
