package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


class FileManagerTest {
    private FileManager fileManager = new FileManager();

    @BeforeEach
    void shouldAdd() {
        fileManager.addNewApplication("pdf", "Open pdf");
        fileManager.addNewApplication("txt", "NotePad++");
        fileManager.addNewApplication("doc", "Word");
        fileManager.addNewApplication("doc", "Word");
        fileManager.addNewApplication("xlsx", "Excel");
    }

    @Test
    void shoulAllApp() {
        assertArrayEquals(Arrays.asList("Excel", "NotePad++", "Open pdf", "Word").toArray(), fileManager.getAllApp().toArray());
    }

    @Test
    void shouldRemoveApp() {
        fileManager.removeApp("doc");
        assertArrayEquals(Arrays.asList("Excel", "NotePad++", "Open pdf").toArray(), fileManager.getAllApp().toArray());
    }

    @Test
    void shouldRemoveAppExt() {
        fileManager.removeApp("doc");
        assertArrayEquals(new HashSet(Arrays.asList("pdf", "txt", "xlsx")).toArray(), fileManager.getAllExt().toArray());
    }

    @Test
    void allExt() {
        assertArrayEquals(new HashSet(Arrays.asList("pdf", "txt", "doc", "xlsx")).toArray(), fileManager.getAllExt().toArray());
    }

    @Test
    void allApplication() {
        assertEquals("Word", fileManager.getAppName("doc"));
    }
}