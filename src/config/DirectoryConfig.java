package config;

import java.io.File;

public class DirectoryConfig {
    private static final String currentDir = System.getProperty("user.dir");
    private static final File currentDirFile = new File(currentDir);
    public static final String ASSET_DIRECTORY = currentDirFile.getPath() + File.separator + "assets" + File.separator;
    public static final String STATIC_DIRECTORY = ASSET_DIRECTORY + "static" + File.separator;
}
