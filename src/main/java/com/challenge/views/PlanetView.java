package com.challenge.views;

public abstract class ModelView implements IView {

    private static final String[] template = {
            "\r****************************  Planet Info App  ****************************\n\n\n",
            ""
    };

    public static String getTemplate() {
        return String.join(" ", template);
    }
}
