package com.mygdx.game.actors;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.mygdx.game.physics.UserData;
import com.mygdx.game.utils.Constants;

/**
 * Created by kubar on 16.01.2018.
 */

public abstract class GameActor extends Actor {
    protected Body body;
    protected UserData userData;
    protected Rectangle screenRectangle;

    public GameActor(Body body){
        this.body = body;
        this.userData = (UserData) body.getUserData();
        screenRectangle = new Rectangle();
    }

    public abstract UserData getUserData();

    @Override
    public void act(float delta){
        super.act(delta);

        if(body.getUserData() != null){
            updateRectangle();
        } else {
            remove();
        }
    }

    private void updateRectangle() {
        screenRectangle.x = transformToScreen(body.getPosition().x - userData.getWidth() / 2);
        screenRectangle.y = transformToScreen(body.getPosition().y - userData.getHeight() / 2);
        screenRectangle.width = transformToScreen(userData.getWidth());
        screenRectangle.height = transformToScreen(userData.getHeight());
    }

    protected float transformToScreen(float n) {
        return Constants.WORLD_TO_SCREEN * n;
    }
}
