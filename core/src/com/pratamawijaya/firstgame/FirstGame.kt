package com.pratamawijaya.firstgame

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class FirstGame : ApplicationAdapter() {
    private lateinit var batch: SpriteBatch
    private lateinit var img: Texture

    override fun create() {
        batch = SpriteBatch()
        img = Texture("badlogic.jpg")
    }

    override fun render() {
        val widthScreen = Gdx.graphics.width
        val heightScreen = Gdx.graphics.height

        val yPos = (heightScreen / 2) - (img.height / 2)
        val xPos = (widthScreen / 2) - (img.width / 2)

        println("screen height $heightScreen and width $widthScreen")

        Gdx.gl.glClearColor(1f, 0f, 0f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        batch.begin()
        batch.draw(img, xPos.toFloat(), yPos.toFloat())
        batch.end()
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }
}
