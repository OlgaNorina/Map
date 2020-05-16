package ru.netology.manager;

import java.util.*;

public class FileManager {
    private Map<String, String> extention = new HashMap<>();

    public void addNewApplication(String ext, String nameApp) {
        extention.put(ext.toLowerCase(), nameApp);
    }

    public String getAppName(String ext) {
        return extention.get(ext.toLowerCase());
    }

    public void removeApp(String ext) {
        extention.remove(ext.toLowerCase());
    }


    public Set<String> getAllExt() {
        return extention.keySet();
    }

    public List<String> getAllApp() {
        List<String> valuesName = new ArrayList<>(extention.values());
        valuesName.sort(Comparator.comparing(String::toLowerCase));
        return valuesName;
    }
}

