import java.util.ArrayList;
import java.util.Iterator;


    /**
     * A class to hold details of audio files.
     *
     * @author David J. Barnes and Michael Kِlling
     * @version 2011.07.31
     */
    public class MusicCollection
    {
        // An ArrayList for storing the file names of music files.
        private ArrayList<String> files;
        // A player for the music files.
        private MusicPlayer player;
        private ArrayList<String > favorit;
        /**
         * Create a MusicCollection
         */
        public MusicCollection()
        {
            files = new ArrayList<>();
            player = new MusicPlayer();
            favorit = new ArrayList<>();
        }

        /**
         * Add a file to the collection.
         * @param filename The file to be added.
         */
        public void addFile(String filename)
        {
            if (files.isEmpty())
            files.add(filename);

            else {
                if(files.contains(filename))
                    System.out.println("is exite already");
                else
                    files.add(filename);

            }

        }

        /**
         * Return the number of files in the collection.
         * @return The number of files in the collection.
         */
        public int getNumberOfFiles()
        {
            int number = files.size();
            return  number;
        }

        /**
         * List a file from the collection.
         * @param index The index of the file to be listed.
         */
        public void listFile(int index)
        {
            String s = files.get(index);
            System.out.println(s);

        }

        /**
         * Show a list of all the files in the collection.
         */
        public void listAllFiles()
        {
           for (String ex:files){
               System.out.println(ex);
           }
        }

        /**
         * Remove a file from the collection.
         * @param index The index of the file to be removed.
         */
        public void removeFile(int index)
        {
            boolean v = validIndex(index);

            if (v ==true) {
                Iterator<String> it = files.iterator();
                int i;
                for (i = 0; it.hasNext(); i++) {
                    String s = it.next();
                    if (i == index) {
                        it.remove();
                    }
                }
            }}
        /**
         * Start playing a file in the collection.
         * Use stopPlaying() to stop it playing.
         * @param index The index of the file to be played.
         */
        public void startPlaying(int index)
        {
            String start = files.get(index);
            player.startPlaying(start);

        }

        /**
         * Stop the player.
         */
        public void stopPlaying()
        {
            player.stop();
        }


        /**
         * Determine whether the given index is valid for the collection.
         * Print an error message if it is not.
         * @param index The index to be checked.
         * @return true if the index is valid, false otherwise.
         */
        private boolean validIndex(int index)
        {boolean out ;
        int i = files.size();
        if(index>i){
                System.out.println("imvalid index");
                out = false;
            }
            else
                out = true;


            // The return value.
            // Set according to whether the index is valid or not.
        return out;}

     public  void search(String name)
              {
              for (String found:files) {
              if(found==name)
                  System.out.println("exite");
              }
              }}
