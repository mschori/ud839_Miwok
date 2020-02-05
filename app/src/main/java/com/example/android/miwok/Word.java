package com.example.android.miwok;

public class Word {

    private String firstWord;
    private String secondWord;
    private int imageId;

    public Word(String firstWord, String secondWord, int pictureName) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
        this.imageId = pictureName;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
