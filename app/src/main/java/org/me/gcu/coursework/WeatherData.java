package org.me.gcu.coursework;

public class WeatherData {

    private String title;

    private String link;

    private String description;

    private String pubDate;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public String getTitle() {
        return title;
    }

    public String toString(){
        return "Title: "  + title + " Link: " + link + " Desription: " + description + " Publication Date: " + pubDate;
    }

}
