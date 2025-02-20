package com.mygdx.game.physics;

import com.badlogic.gdx.math.Vector2;
import com.mygdx.game.enums.UserDataType;
import com.mygdx.game.utils.Constants;

/**
 * Created by kubar on 17.01.2018.
 */

public class PlatformUserData extends UserData {

    private Vector2 linearVelocity;
    private String texture;

    public PlatformUserData(float width, float height, String texture){
        super(width, height);
        userDataType = UserDataType.PLATFORM;
        linearVelocity = Constants.PLATFORM_LINEAR_VELOCITY;
        this.texture = texture;

    }

    public void setLinearVelocity(Vector2 linearVelocity) {
        this.linearVelocity = linearVelocity;
    }

    public String getTexture() {
        return texture;
    }


    public Vector2 getLinearVelocity() {
        return linearVelocity;
    }
}
