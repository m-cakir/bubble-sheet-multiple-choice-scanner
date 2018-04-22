package com.mcakir.scanner;

import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

import static com.mcakir.scanner.Util.getSource;
import static com.mcakir.scanner.Util.sout;

public class Main {

    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    public static void main(String[] args) throws Exception {

        sout("...started");

        Mat source = Imgcodecs.imread(getSource("sheet-1.jpg"));

        Scanner scanner = new Scanner(source, 20);
        scanner.setLogging(true);
        scanner.scan();

        sout("...finished");
    }
}
