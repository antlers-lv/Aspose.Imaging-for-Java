package com.aspose.imaging.examples.ModifyingImages;

import com.aspose.imaging.Image;
import com.aspose.imaging.examples.Utils;
import com.aspose.imaging.imageoptions.PngOptions;

public class SimpleResizeImageProportionally
{
    public static void main(String... args)
    {
		//ExStart:SimpleResizeImageProportionally

		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir() + "ModifyingImages/";
		try (Image image = Image.load(dataDir + "aspose-logo.jpg"))
		{

			if (!image.isCached())
			{
				image.cacheData();
			}

			// specifying width and height
			int newWidth = image.getWidth() / 2;
			image.resizeWidthProportionally(newWidth);

			int newHeight = image.getHeight() / 2;
			image.resizeHeightProportionally(newHeight);

			// saving result
			image.save(dataDir + "SimpleResizeImageProportionally_out.png", new PngOptions());
		}
		//ExEnd:SimpleResizeImageProportionally
    }

}
