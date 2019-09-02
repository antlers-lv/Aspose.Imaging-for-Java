package com.aspose.imaging.examples.ModifyingImages;

import com.aspose.imaging.Image;
import com.aspose.imaging.examples.Utils;

public class SimpleResizing
{
    public static void main(String... args)
    {
		//ExStart:SimpleResizing
		// Create an instance of JpegImage and load an image as of JpegImage
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir() + "ModifyingImages/";
		try (Image image = Image.load(dataDir + "aspose-logo.jpg"))
		{
			image.resize(300, 300);
			image.save(dataDir + "SimpleResizing_out.jpg");
		}
		//ExEnd:SimpleResizing
    }

}
