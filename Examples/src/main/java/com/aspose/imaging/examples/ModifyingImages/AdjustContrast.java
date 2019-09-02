package com.aspose.imaging.examples.ModifyingImages;

import com.aspose.imaging.Image;
import com.aspose.imaging.RasterImage;
import com.aspose.imaging.examples.Utils;
import com.aspose.imaging.fileformats.tiff.enums.TiffExpectedFormat;
import com.aspose.imaging.fileformats.tiff.enums.TiffPhotometrics;
import com.aspose.imaging.imageoptions.TiffOptions;

public class AdjustContrast
{
    public static void main(String... args)
    {
		//ExStart:AdjustContrast
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir() + "ModifyingImages/";
        Image image = Image.load(dataDir + "aspose-logo.jpg");
		try
		{
			// Cast object of Image to RasterImage
			RasterImage rasterImage = (RasterImage) image;

			// Check if RasterImage is cached
			if (!rasterImage.isCached())
			{
				// Cache RasterImage for better performance
				rasterImage.cacheData();
			}

			// Adjust the contrast
			rasterImage.adjustContrast(10);

			// Create an instance of TiffOptions for the resultant image
			TiffOptions tiffOptions = new TiffOptions(TiffExpectedFormat.Default);
			// Set various properties for the object of TiffOptions
			tiffOptions.setBitsPerSample(new int[]{8, 8, 8});
			tiffOptions.setPhotometric(TiffPhotometrics.Rgb);

			// Save the resultant image to TIFF format
			rasterImage.save(dataDir + "AdjustContrast_out.tiff", tiffOptions);
		}
		finally
		{
			image.close();
		}
		//ExEnd:AdjustContrast
    }

}
