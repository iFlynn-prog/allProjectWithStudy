package Lessons.Day5.monitor;

import java.io.IOException;
import java.nio.file.*;
import java.util.HashSet;
import java.util.Set;

public class Monitor {
    private final Path path;
    private final Set<IMonitor> set;

    public Monitor(String dir) {

        Path path = Paths.get(dir);
        if (Files.notExists(path)) throw new IllegalArgumentException();
        this.path = path;
        set = new HashSet<>();
    }

    public Path getPath() {
        return path;
    }

    public void start() {
        try (WatchService watch = FileSystems.getDefault().newWatchService()) {
            path.register(watch, StandardWatchEventKinds.ENTRY_CREATE);
            for (int i = 1; i <= 3; ++i) {
                WatchKey key = watch.take();

                for (WatchEvent ev : key.pollEvents())
                    System.out.println(ev.context().toString());
                key.reset();
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public boolean add(IMonitor obj) {
        return set.add(obj);
    }

    public boolean delete(IMonitor obj) {
        return set.remove(obj);
    }
}
