
package com.course.tracker.exception;

import lombok.Getter;

@Getter
public class UrlNotAccessibleException extends RuntimeException {

    private String url;

    public UrlNotAccessibleException(String url) {
        this(url, null);
    }

    public UrlNotAccessibleException(String url, Throwable cause) {
        super("URL " + url + " is not acessible", cause);
        this.url = url;
    }

}
