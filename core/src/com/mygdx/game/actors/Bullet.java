package com.mygdx.game.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.utils.Pool.Poolable;
import com.mygdx.game.physics.BulletUserData;
import com.mygdx.game.physics.UserData;

/**
 * Created by kubar on 19.01.2018.
 */

public class Bullet extends GameActor {

    public Bullet(Body body){
        super(body);
    }

    @Override
    public BulletUserData getUserData() {
        return (BulletUserData) userData;
    }

    @Override
    public void act(float delta){
        super.act(delta);
        body.setLinearVelocity(getUserData().getLinearVelocity());
    }


}
