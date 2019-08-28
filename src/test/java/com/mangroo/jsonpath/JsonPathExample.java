package com.mangroo.jsonpath;

import com.jayway.jsonpath.JsonPath;
import com.mangroo.jsonpath.utils.FileLoader;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class JsonPathExample {

    @Test
    public void extractValue() throws Throwable {
        FileLoader fileLoader = new FileLoader();
        String jsonString = fileLoader.loadFile("input.json");

        System.out.println(jsonString);

        Object result = JsonPath.parse(jsonString)
                .read("$.['name.blah']");

        assertEquals("alan", result);

    }
}
