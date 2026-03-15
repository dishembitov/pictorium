package ru.dishembitov.pictorium.image;

public record ThumbnailResult(
        byte[] data,
        int width,
        int height
) {}