package udemy_exercises.songs;

import java.util.*;

class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    public static void main(String[] args) {
        Album album = new Album("DIVISIONS", "STARSET");
        album.addSong("A BRIEF HISTORY OF THE FUTURE", 1.38);
        album.addSong("MANIFEST", 4.27);
        album.addSong("ECHO", 3.37);
        album.addSong("WHERE THE SKIES END", 6.34);
        album.addSong("PERFECT MACHINE", 5.24);
        album.addSong("TELEKINETIC", 5.13);
        album.addSong("STRATOSPHERE", 4.17);
        album.addSong("FAULTLINE", 3.36);
        album.addSong("SOLSTICE", 5.42);
        album.addSong("TRIALS", 4.19);
        album.addSong("WAKING UP", 3.50);
        album.addSong("OTHER WORLDS THAN THESE", 4.18);
        album.addSong("DIVING BELL", 5.38);
        albums.add(album);

        album = new Album("MNQN", "MNQN");
        album.addSong("Config.Sys", 1.29);
        album.addSong("iGhost", 3.59);
        album.addSong("Amphetamine", 6.15);
        album.addSong("Animal Oddity", 6.10);
        album.addSong("Out Of Sight Out Of Mind", 6.15);
        album.addSong("Man on the Moon", 3.51);
        album.addSong("What Have You Become?", 4.22);
        album.addSong("On My Mind", 4.37);
        album.addSong("Don't Get It", 4.47);
        album.addSong("Zombie", 5.43);
        album.addSong("Noir", 4.34);
        album.addSong("Invincible", 4.47);
        album.addSong("Terminal", 5.24);
        album.addSong("What Dreams My Come", 1.13);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("TRIALS", playList);
        albums.get(0).addToPlaylist("ECHO", playList);
        albums.get(0).addToPlaylist("Monster", playList); // shouldn't work
        albums.get(0).addToPlaylist(2, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(6, playList);
        albums.get(1).addToPlaylist(24, playList); // There is no track 24

        play(playList);
    }

    private static void stop() {
        System.out.println("Playlist complete.");
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    stop();
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("We have reached the end of the playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing " + listIterator.previous());
                        } else {
                            System.out.println("The playlist is now empty");
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" + "1 - to play next song\n" + "2 - to play previous song\n"
                + "3 - to replay current song\n" + "4 - to list songs in playlist\n"
                + "5 - to print available actions\n" + "6 - to remove current song\n");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("==========================");
        while ((iterator.hasNext())) {
            System.out.println(iterator.next());
        }
        System.out.println("==========================");
    }
}