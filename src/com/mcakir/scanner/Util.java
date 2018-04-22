package com.mcakir.scanner;

import org.opencv.core.Mat;
import org.opencv.core.MatOfPoint;
import org.opencv.core.Point;

import java.util.Collections;
import java.util.List;

import static org.opencv.imgcodecs.Imgcodecs.imwrite;

public class Util {

    public static String SOURCE_FOLDER = System.getProperty("user.dir") + "/sources/";
    public static String TARGET_FOLDER = System.getProperty("user.dir") + "/target/";

    public static String getSource(String name){
        return SOURCE_FOLDER + name;
    }

    public static String getOutput(String name){
        return TARGET_FOLDER + name;
    }

    public static void write2File(Mat source, String name){
        imwrite(getOutput(name), source);
    }

    public static void sout(String str){
        System.out.println(str);
    }

    public static void sortTopLeft2BottomRight(List<MatOfPoint> points){
        // top-left to right-bottom sort
        Collections.sort(points, (e1, e2) -> {

            Point o1 = new Point(e1.get(0, 0));
            Point o2 = new Point(e2.get(0, 0));

            return o1.y > o2.y ? 1 : -1;
        });
    }

    public static void sortLeft2Right(List<MatOfPoint> points){
        // left to right sort
        Collections.sort(points, (e1, e2) -> {

            Point o1 = new Point(e1.get(0, 0));
            Point o2 = new Point(e2.get(0, 0));

            return o1.x > o2.x ? 1 : -1;
        });
    }
}
