package pattern.structural.composite;


import java.util.Collections;

public class CompositeTest {

    public static void main(String[] args) {
        Component photoDirectory = new Directory("MyPhoto");
        photoDirectory.add(new File("foto2023.jpeg"));
        photoDirectory.add(new File("foto2024.jpeg"));

        Component documentDirectory = new Directory("MyDocuments");
        documentDirectory.add(photoDirectory);
        documentDirectory.add(new File("presentation1.pdf"));

        Component musicDirectory = new Directory("MyMusic");
        musicDirectory.add(new File("newSong.mp3"));

        Component rootDirectory = new Directory("Home");
        rootDirectory.add(documentDirectory);
        rootDirectory.add(musicDirectory);


        FileSystem fileSystem = new FileSystem(Collections.singletonList(rootDirectory));
        fileSystem.showFileSystem();
    }
}
