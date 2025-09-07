package org.example.practicedesign;

public class VehicleConfiguration {
    private final String engine;
    private final String color;
    private final int seats;
    private final boolean gps;
    private final boolean sunroof;
    private final String name;
    private final String type;
    private final String transmission;


    private VehicleConfiguration(Builder builder){
        this.engine = builder.engine;
        this.color = builder.color;
        this.seats = builder.seats;
        this.gps = builder.gps;
        this.sunroof = builder.sunroof;
        this.name = builder.name;
        this.type = builder.type;
        this.transmission = builder.transmission;
    }


    public String getEngine() {
        return engine;
    }
    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }
    public boolean isGps() {
        return gps;
    }
    public boolean isSunroof() {
        return sunroof;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public String getTransmission() {
        return transmission;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String toString() {
        return "VehicleConfiguration{" +
                "engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", seats=" + seats +
                ", gps=" + gps +
                ", sunroof=" + sunroof +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", transmission='" + transmission + '\'' +
                '}';
    }

    public static class Builder{
        private String engine;
        private String color;
        private int seats;
        private boolean gps;
        private boolean sunroof;
        private String name;
        private String type;
        private String transmission;


        public Builder withEngine(String engine){
            this.engine = engine;
            return this;
        }

        public  Builder withColor(String color){
            this.color = color;
            return this;
        }
        public Builder withSeats(int seats){
            this.seats = seats;
            return this;
        }
        public  Builder withGps(boolean gps){
            this.gps = gps;
            return this;
        }
        public Builder withSunroof(boolean sunroof){
            this.sunroof = sunroof;
            return this;
        }
        public Builder withName(String name){
            this.name = name;
            return this;
        }
        public Builder withType(String type){
            this.type = type;
            return this;
        }
        public Builder withTransmission(String transmission){
            this.transmission = transmission;
            return this;
        }

        public Builder gps(boolean gps){
            this.gps = gps;
            return this;
        }

        public VehicleConfiguration build(){
            return new VehicleConfiguration(this);
        }
    }
}
