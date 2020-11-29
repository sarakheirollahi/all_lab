public class main {
    public static void main(String[] args)
    {
    MusicCollection pop = new MusicCollection();
    MusicCollection jazz= new MusicCollection();
    MusicCollection rock= new MusicCollection();
    MusicCollection country= new MusicCollection();
        jazz.addFile("a");
        jazz.addFile("b");
        jazz.addFile("c");
        jazz.addFile("d");
        jazz.listAllFiles();
        jazz.removeFile(2);
        jazz.listAllFiles();
    }
}

