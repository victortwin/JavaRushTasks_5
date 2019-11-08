package com.javarush.task.task16.task1631;
import com.javarush.task.task16.task1631.common.*;


public class ImageReaderFactory {



  public static ImageReader getImageReader(ImageTypes imgType) throws IllegalArgumentException {

        ImageReader reader = null;
        if(imgType == ImageTypes.BMP) reader = new BmpReader();
        else if (imgType == ImageTypes.JPG) reader = new  JpgReader();
        else if (imgType == ImageTypes.PNG) reader =  new PngReader();
        else throw new IllegalArgumentException();

        return reader;
    }
}
