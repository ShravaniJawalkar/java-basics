package org.example.practicedesign.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private final String dirName;
    private final List<FileSystem> children;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.children = new ArrayList<FileSystem>();
    }

    public void addFileInDirectory(FileSystem fileSystem) {
        children.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + dirName);
        for (FileSystem child : children) {
            child.ls();
        }

    }
}
