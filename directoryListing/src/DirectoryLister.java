import java.io.File;
import java.io.FileFilter;

public class DirectoryLister {
    public static void listFiles(String directoryPath, String fileExtension) {
        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.isFile() && (fileExtension == null || file.getName().endsWith(fileExtension));
                }
            });

            if (files != null) {
                for (File file : files) {
                    System.out.println(file.getAbsolutePath());
                }
            }

            File[] subdirectories = directory.listFiles(new FileFilter() {
                @Override
                public boolean accept(File file) {
                    return file.isDirectory();
                }
            });

            if (subdirectories != null) {
                for (File subdirectory : subdirectories) {
                    System.out.println("Directory: " + subdirectory.getAbsolutePath());
                    listFiles(subdirectory.getAbsolutePath(), fileExtension);
                }
            }
        } else {
            System.err.println("Directory does not exist.");
        }
    }

    public static void main(String[] args) {
        String directoryPath = args.length > 0 ? args[0] : ".";
        String fileExtension = args.length > 1 ? args[1] : null;

        listFiles(directoryPath, fileExtension);
    }
}
