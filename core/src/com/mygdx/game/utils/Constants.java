package com.mygdx.game.utils;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by kubar on 16.01.2018.
 */

public class Constants {

    public static final int APP_WIDTH = 800;
    public static final int APP_HEIGHT = 480;
    public static final float WORLD_TO_SCREEN = 32;

    public static final Vector2 WORLD_GRAVITY = new Vector2(0, -10);

    public static final float GROUND_X = 0;
    public static final float GROUND_Y = 0;
    public static final float GROUND_WIDTH = 40f;
    public static final float GROUND_HEIGHT = 2f;
    public static final float GROUND_DENSITY = 0f;

    public static final float RUNNER_X = 2;
    public static final float RUNNER_Y = GROUND_Y + GROUND_HEIGHT;
    public static final float RUNNER_WIDTH = 1f;
    public static final float RUNNER_HEIGHT = 2f;
    public static float RUNNER_DENSITY = 0.5f;
    public static final float RUNNER_GRAVITY_SCALE = 5f; // thanks to that, runner fall faster
    public static final Vector2 RUNNER_JUMPING_LINEAR_IMPULSE = new Vector2(0, 17f);

    public static final Vector2 RUNNER_MOVING_RIGHT_LINEAR_IMPULSE = new Vector2(7, 0);
    public static final Vector2 RUNNER_MOVING_LEFT_LINEAR_IMPULSE = new Vector2(-7, 0);

    public static final float ENEMY_X = 25f;
    public static final float ENEMY_DENSITY = RUNNER_DENSITY;
    public static final int ENEMY_AMOUNT = 3;
    public static final float RUNNING_SHORT_ENEMY_Y = 1.5f;
    public static final float RUNNING_LONG_ENEMY_Y = 2f;
    public static final float FLYING_ENEMY_Y = 3f;
    public static final Vector2 ENEMY_LINEAR_VELOCITY = new Vector2(-10f, 0);
    public static final float RUNNER_HIT_ANGULAR_IMPULSE = 10f;

    //WALL
    public static final float WALL_HEIGHT = 6f;
    public static final float WALL_RIGHT_POSITION = 5f; //x
    public static final float WALL_LEFT_POSITION = 1.5f; //x
    public static final int WALL_POSITION = 7; //y dla obu
    public static final float WALL_WIDTH = 0.1f;
    public static float WALL_DENSITY = 0.5f;

    public static final float PLATFORM_X = 22f;
    public static final float PLATFORM_Y = 2f;
    public static final float PLATFORM_RAND_DIFF = 2f;
    public static final int PLATFORM_AMOUNT = 10;
    public static final float PLATFORM_DENSITY = 0f;
    public static final float PLATFORM_FRICTION = 0f;
    public static final Vector2 PLATFORM_LINEAR_VELOCITY = new Vector2(-5f, 0);

    //FALLING ROCKS
    public static final Vector2 FALLING_ROCK_LINEAR_VELOCITY = new Vector2(-1f, 0);
    public static final float FALLING_ROCK_GRAVITY_SCALE = 34f;
    public static final int FALLING_ROCK_Y = 15;
    public static final float FALLING_ROCK_DIAMETER = 0.6f;

    //BULLETS
    public static final float BULLET_WIDTH = 0.2f;
    public static final float BULLET_HEIGHT = 0.2f;
    public static final float BULLET_DENSITY = 0.5f;
    public static final Vector2 BULLET_LINEAR_VELOCITY = new Vector2(15f, 0);

    //SPIKEGROUND
    public static final float SPIKE_GROUND_Y = 1.2f;
    public static final float SPIKE_GROUND_HEIGHT = 0.2f;
    public static final float SPIKE_GROUND_DENSITY = 0f;

    //ASSETS
    public static final String FONT_NAME = "Rajdhani-Bold.ttf";

    // TEXTURES
    public static final String BACKGROUND_ASSETS_ID = "background";

    //RUNNER
    public static final String RUNNER_ASSETS_ID_MOVE_FRAME1 = "runner_frame1";
    public static final String RUNNER_ASSETS_ID_MOVE_FRAME2 = "runner_frame2";
    public static final String RUNNER_ASSETS_ID_MOVE_FRAME3 = "runner_frame3";
    public static final String RUNNER_ASSETS_ID_MOVE_FRAME4 = "runner_frame4";
    public static final String RUNNER_ASSETS_ID_JUMP = "runner_jump";
    public static final String RUNNER_ASSETS_ID_SHOOT = "runner_shoot";


    public static final String BULLET_ASSETS_ID = "bullet";
    public static final String FALLING_ROCK_ASSETS_ID = "falling_rock";

    public static final String PLATFORM_DEFAULT_TEXTURE = "platform_short";
    public static final String PLATFORM_WIDE_TEXTURE = "platform_long";

    public static final String RUNNING_SMALL_TEXTURE = "enemy_small";
    public static final String RUNNING_BIG_TEXTURE = "enemy_big";
    public static final String RUNNING_WIDE_TEXTURE = "enemy_wide";
    public static final String RUNNING_LONG_TEXTURE = "enemy_long";
    public static final String FLYING_WIDE_TEXTURE = "enemy_flying_wide";
    public static final String FLYING_SMALL_TEXTURE = "enemy_flying_small";


    public static final String BACKGROUND_IMAGE_PATH = "background.png";

    //RUNNER

    public static final String RUNNER_IMAGE_MOVE_FRAME1 = "frame1.png";
    public static final String RUNNER_IMAGE_MOVE_FRAME2 = "frame2.png";
    public static final String RUNNER_IMAGE_MOVE_FRAME3 = "frame3.png";
    public static final String RUNNER_IMAGE_MOVE_FRAME4 = "frame4.png";
    public static final String RUNNER_JUMP_IMAGE_PATH = "runner_jump.png";
    public static final String RUNNER_SHOOT_IMAGE_PATH = "runner_shoot.png";




    public static final String PLATFORM_DEFAULT_IMAGE_PATH = "platform_short.png";
    public static final String PLATFORM_WIDE_IMAGE_PATH = "platform_long.png";
    public static final String FALLING_ROCK_IMAGE_PATH = "rock.png";

    public static final String RUNNING_SMALL_IMAGE_PATH = "enemy_small.png";
    public static final String RUNNING_BIG_IMAGE_PATH = "enemy_big.png";
    public static final String RUNNING_WIDE_IMAGE_PATH = "enemy_wide.png";
    public static final String RUNNING_LONG_IMAGE_PATH = "enemy_long.png";
    public static final String FLYING_WIDE_IMAGE_PATH = "enemy_flying_wide.png";
    public static final String FLYING_SMALL_IMAGE_PATH = "enemy_flying_small.png";

    public static final String BULLET_IMAGE_PATH = "bullet.png";



}
