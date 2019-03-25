package com.bcv.lessons;

import org.htmlcleaner.HtmlCleaner;
import org.htmlcleaner.TagNode;
import org.htmlcleaner.XPatherException;

import java.io.IOException;
import java.net.URL;

public class MyHtmlCleaner {
    public static void main(String[] args) throws IOException, XPatherException {


        HtmlCleaner cleaner = new HtmlCleaner();
        final String siteUrl = "http://weldering.com/";

        TagNode node = cleaner.clean(new URL(siteUrl));

        Object[] objects = node.evaluateXPath("//a");
        for (Object o : objects) {
            System.out.println(((TagNode) o).getText());
        }
    }
}
