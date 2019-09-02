package com.aspose.imaging.examples.ManipulatingPNGImages;

import com.aspose.imaging.examples.Utils;

public class ApplyFilterMethod
{
    public static void main(String... args)
    {
		//ExStart:ApplyFilterMethod
        // The path to the documents directory.
        String dataDir = Utils.getSharedDataDir() + "ManipulatingPNGImages/";

        com.aspose.imaging.fileformats.png.PngImage png = (com.aspose.imaging.fileformats.png.PngImage) com.aspose.imaging.Image
                .load(dataDir + "aspose_logo.png");

		try
		{
			// Create an instance of PngOptions
			com.aspose.imaging.imageoptions.PngOptions options = new com.aspose.imaging.imageoptions.PngOptions();

			// Set the PNG filter method
			options.setFilterType(com.aspose.imaging.fileformats.png.PngFilterType.Paeth);

			// Save changes to the disc
			png.save(dataDir + "ApplyFilterMethod_out.jpg", options);
		}
		finally
		{
			png.close();
		}
		//ExEnd:ApplyFilterMethod
    }

}
