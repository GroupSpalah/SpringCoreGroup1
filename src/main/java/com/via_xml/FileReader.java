package com.via_xml;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FileReader {
    String fileName;

    public void read() {
        System.out.println("Read from file " + fileName);
    }
}
