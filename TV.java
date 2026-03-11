class TV {

    boolean isTvOn = false;
    int channel = 0;
    int volume = 0;

    public void turnOn() {
        isTvOn = true;
    }

    public void turnOff() {
        isTvOn = false;
    }

    public void setChannel(int newChannel) {
        channel = newChannel;
    }

    public void setVolume(int newVolumeLevel) {
        volume = newVolumeLevel;
    }

    public void channelUp() {
        channel = channel + 1;
    }

    public void channelDown() {
        if (channel == 1) {
            System.out.println("Channel sudah berada paling awal");
        } else {
            channel = channel - 1;
        }
    }

    public void volumeUp() {
        volume = volume + 1;
    }

    public void volumeDown() {
        if (volume == 0) {
            System.out.println("Volume sudah 0");
        } else {
            volume = volume - 1;
        }
    }
}
