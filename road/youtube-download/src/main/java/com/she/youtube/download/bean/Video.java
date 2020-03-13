package com.she.youtube.download.bean;

/**
 * 2/27/19.
 */
/*
 * @author she
 **/
public class Video {
    public String ext = "";
    public String type = "";
    public String url = "";

    Video(String ext, String type, String url) {
        this.ext = ext;
        this.type = type;
        this.url = url;
    }
}
