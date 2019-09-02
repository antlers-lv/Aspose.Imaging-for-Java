package com.aspose.imaging.examples.images;

import com.aspose.imaging.*;
import com.aspose.imaging.brushes.*;
import com.aspose.imaging.examples.Utils;

public class AddWatermarkToImage
{
    public static void main(String[] args)
    {
        //ExStart:AddWatermarkToImage

        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir() + "images/";
        //Create an instance of Image and load an existing image.
        Image image= Image.load(dataDir + "sample.bmp");

        try
        {
            //Create and initialize an instance of Graphics class.
            Graphics graphics=new Graphics(image);

            //Creates an instance of Font
            Font font = new Font("Times New Roman", 16, FontStyle.Bold);

            //Create an instance of SolidBrush and set its various properties.
            SolidBrush brush = new SolidBrush();
            brush.setColor(Color.getBlack());
            brush.setOpacity(100);

            //Draw a String using the SolidBrush object and Font, at specific Point.
            graphics.drawString("Aspose.Imaging for Java", font, brush, new PointF(image.getWidth()-100, image.getHeight()-100));

            // save the image with changes
            image.save(dataDir + "AddWatermarkToImage_out.bmp");

            // Display Status.
            System.out.println("Watermark added successfully!");
        }
        finally
        {
            image.close();
        }

        //ExEnd:AddWatermarkToImage
    }
}




