package com.muskan.spring.basics.springpractice;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReadTestTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void fileRead() {
        //FileReadTest.fileRead();
        String FOLDER_PATH = "D:\\Muskan\\PET";

        FileReadTest.listFilesAndFilesSubDirectories(FOLDER_PATH);
    }
}