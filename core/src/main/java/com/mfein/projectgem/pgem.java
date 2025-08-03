package com.mfein.projectgem;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class pgem extends ApplicationAdapter {
    private SpriteBatch batch;
    private Texture image;

    @Override
    public void create() {
        batch = new SpriteBatch();
        image = new Texture("libgdx.png");
    }

    @Override
    public void render() {
        if (Gdx.input.isKeyJustPressed(Input.Keys.F)) {
            Gdx.graphics.setFullscreenMode(Gdx.graphics.getDisplayMode());
        }

        ScreenUtils.clear(1f, 1f, 1f, 1f);
        batch.begin();
        batch.draw(image, Gdx.graphics.getWidth() / 2f -image.getWidth()/ 2f, Gdx.graphics.getHeight() / 2f - image.getHeight() / 2f);
//        batch.draw(image, 140, 210);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        image.dispose();
    }
}
