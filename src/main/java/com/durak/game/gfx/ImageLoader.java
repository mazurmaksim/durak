package com.durak.game.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImageLoader {

    public static BufferedImage loadImage(String path) {
        try {
            URL resource = ImageLoader.class.getResource(path);

            if (resource == null) {
                throw new IllegalArgumentException("Image resource not found: " + path);
            }

            return ImageIO.read(resource);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load image: " + path, e);
        }
    }

}
