package com.mangroo.jsonpath;

import com.jayway.jsonpath.JsonPath;
import com.mangroo.jsonpath.utils.FileLoader;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.junit.Assert.assertEquals;

public class JsonPathExample {

    private Logger logger = LoggerFactory.getLogger(JsonPathExample.class);

    @Test
    public void extractValue() throws Throwable {
        FileLoader fileLoader = new FileLoader();
        String jsonString = fileLoader.loadFile("input.json");

        logger.debug(jsonString);

        Object result = JsonPath.parse(jsonString)
                .read("$.['name.blah']");

        assertEquals("alan", result);

    }
}
