package com.example.android.miwok;

public class Word {
    private String mMiwokWord;
    private String mDefaultWord;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mAudioId;

    public Word(String defaultWord, String miwokWord, int audioId){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mAudioId = audioId;
    }

    public Word(String defaultWord, String miwokWord, int imageId, int audioId){
        mMiwokWord = miwokWord;
        mDefaultWord = defaultWord;
        mImageId = imageId;
        mAudioId = audioId;
    }

    public String getmMiwokWord(){
        return mMiwokWord;
    }

    public String getmDefaultWord() {
        return mDefaultWord;
    }

    public int getmImageId(){
        return mImageId;
    }

    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioId() {
        return mAudioId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokWord='" + mMiwokWord + '\'' +
                ", mDefaultWord='" + mDefaultWord + '\'' +
                ", mImageId=" + mImageId +
                ", mAudioId=" + mAudioId +
                '}';
    }
}
