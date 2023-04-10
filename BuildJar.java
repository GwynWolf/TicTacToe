import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.jar.*;


/**
 * @author GwynWolf
 */
public class BuildJar {
    public static void main(final String[] args) throws IOException {
        final Path classesDir = Paths.get("out/classes");
        if(!Files.exists(classesDir)){
            Files.createDirectories(classesDir);
        }
        runCmd("javac -sourcepath src/ -d out/classes src/academy/devonline/tictactoe/Launcher.java");
        runCmd("jar cfe out/tic-tac-toe.jar academy.devonline.tictactoe.Launcher -C out/classes .");
        deleteCompiledClassFilesAndPackageDirectories();
    }

    private static void runCmd(final String cmd) {
        try{
            final Process process = Runtime.getRuntime().exec(cmd);
            process.getErrorStream().transferTo(System.err);
            process.getInputStream().transferTo(System.out);
            process.waitFor();
        }
        catch (final IOException | InterruptedException exception){
            exception.printStackTrace();
        }
    }
    private static void deleteCompiledClassFilesAndPackageDirectories() throws IOException {
        Files.walkFileTree(Paths.get("out/classes"), new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult visitFile(final Path file,
                                             final BasicFileAttributes attrs) throws IOException{
                Files.delete(file);
                return  super.visitFile(file, attrs);
            }
            @Override
            public FileVisitResult postVisitDirectory(final Path dir,
                                                      final IOException exc) throws IOException{
                Files.delete(dir);
                return  super.postVisitDirectory(dir, exc);
            }
        });
    }
}
