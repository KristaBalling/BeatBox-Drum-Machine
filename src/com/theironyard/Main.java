package com.theironyard;

public class Main {

    public static void main(String[] args) {
//        MusicTest1 mt = new MusicTest1();
//        mt.play();
//
//        MiniMiniMusicApp mini = new MiniMiniMusicApp();
//        mini.play();

        MiniMusicCmdLine mini = new MiniMusicCmdLine();
        if (args.length < 2) {
            System.out.println("Dont forget the instrument and note args");
        } else {
            int instrument = Integer.parseInt(args[0]);
            int note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }
}
