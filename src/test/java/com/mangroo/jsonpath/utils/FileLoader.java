package com.mangroo.jsonpath.utils;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileLoader {

    public String loadFile(String filename) throws Throwable {

        Path path = Paths.get(getClass().getClassLoader()
                .getResource(filename).toURI());

        Stream<String> lines = Files.lines(path);
        String data = lines.collect(Collectors.joining("\n"));
        lines.close();
        return data;
    }
}
