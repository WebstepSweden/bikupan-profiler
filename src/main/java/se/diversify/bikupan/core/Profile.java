package se.diversify.bikupan.core;

/**
 * @author danval
 */
public class Profile {
    public final long id;
    public final long coWorkerId;
    public final String nameOfFile;
    public final byte[] file;

    public Profile(long id, long coWorkerId, String nameOfFile, byte[] file) {
        this.id = id;
        this.coWorkerId = coWorkerId;
        this.nameOfFile = nameOfFile;
        this.file = file;
    }

}
