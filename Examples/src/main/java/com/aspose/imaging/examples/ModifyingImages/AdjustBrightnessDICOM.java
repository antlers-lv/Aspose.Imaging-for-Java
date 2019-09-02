package com.aspose.imaging.examples.ModifyingImages;

import com.aspose.imaging.Image;
import com.aspose.imaging.RasterImage;
import com.aspose.imaging.examples.Utils;
import com.aspose.imaging.fileformats.tiff.enums.TiffExpectedFormat;
import com.aspose.imaging.fileformats.tiff.enums.TiffPhotometrics;
import com.aspose.imaging.imageoptions.TiffOptions;

public class AdjustBrightnessDICOM
{
    public static void main(String... args)
    {
		//ExStart:AdjustBrightness
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir() + "ModifyingImages/";
        Image image = Image.load(dataDir + "aspose-logo.jpg");
        // Cast object of Image to RasterImage
        RasterImage rasterImage = (RasterImage) image;

		try
		{
			// Check if RasterImage is cached
			if (!rasterImage.isCached())
			{
				// Cache RasterImage for better performance
				rasterImage.cacheData();
			}

			// Adjust the brightness
			rasterImage.adjustBrightness(70);

			// Create an instance of TiffOptions for the resultant image
			TiffOptions tiffOptions = new TiffOptions(TiffExpectedFormat.Default);
			// Set various properties for the object of TiffOptions
			tiffOptions.setBitsPerSample(new int[]{8, 8, 8});
			tiffOptions.setPhotometric(TiffPhotometrics.Rgb);

			// Save the resultant image to TIFF format
			rasterImage.save(dataDir + "AdjustBrightness_out.tiff", tiffOptions);
		}
		finally
		{
			rasterImage.close();
		}
		//ExEnd:AdjustBrightness
    }

}
