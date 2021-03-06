package me.kavin.piped.utils.obj.search;

public class SearchStream extends SearchItem {

    private String uploadDate, uploader, uploaderUrl;
    private long views, duration;
    private boolean uploaderVerified;

    public SearchStream(String name, String thumbnail, String url, String uploadDate, String uploader,
            String uploaderUrl, long views, long duration, boolean uploaderVerified) {
        super(name, thumbnail, url);
        this.uploadDate = uploadDate;
        this.uploader = uploader;
        this.uploaderUrl = uploaderUrl;
        this.views = views;
        this.duration = duration;
        this.uploaderVerified = uploaderVerified;
    }

    public String getUploadDate() {
        return uploadDate;
    }

    public String getUploader() {
        return uploader;
    }

    public String getUploaderUrl() {
        return uploaderUrl;
    }

    public long getViews() {
        return views;
    }

    public long getDuration() {
        return duration;
    }

    public boolean isUploaderVerified() {
        return uploaderVerified;
    }
}
