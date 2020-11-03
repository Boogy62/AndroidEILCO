package com.example.td6;

public class ListeRepo {
private String html_url;
private String name;

    public ListeRepo(String html_url, String name) {
        this.html_url = html_url;
        this.name = name;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
