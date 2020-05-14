package androidstudio.class29.java.pojo;

public class Music {
    private String name;
    private String bandArtist;

    public Music(String name, String bandArtist) {
        this.name = name;
        this.bandArtist = bandArtist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBandArtist() {
        return bandArtist;
    }

    public void setBandArtist(String bandArtist) {
        this.bandArtist = bandArtist;
    }
}
