package com.example.androidgridgallery;

public class Photo {
    private final int photoName;
    private final int imageResource;
    private boolean isFavorite = false;
    private final int photoId;

    public Photo(int name, int imageResource, int photoId) {
        this.photoName = name;
        this.imageResource = imageResource;
        this.photoId = photoId;
    }

    public int getName() {
        return photoName;
    }

    public int getImageResource() {
        return imageResource;
    }

    public int getPhotoId() {
        return photoId;
    }

}
