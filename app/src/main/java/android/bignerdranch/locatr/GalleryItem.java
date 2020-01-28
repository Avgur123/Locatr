package android.bignerdranch.locatr;

import android.net.Uri;

public class GalleryItem {
    private String mCaption;
    private String mId;
    private String mUrl;
    private String mOwner;
    private double mLat;
    private double mLon;

    public String getOwner() {
        return mOwner;
    }
    public void setOwner(String owner) {
        mOwner = owner;
    }

    public Uri getPhotoPageUri() {
        return Uri.parse("https://www.flickr.com/photos/")
                .buildUpon()
                .appendPath(mOwner)
                .appendPath(mId)
                .build();
    }
    public void setmCaption(String mCaption) {
        this.mCaption = mCaption;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public void setmUrl(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getmCaption() {

        return mCaption;
    }

    public String getmId() {
        return mId;
    }

    public String getmUrl() {
        return mUrl;
    }

    @Override
    public String toString() {

        //return mCaption;
        return mId;
    }
}
