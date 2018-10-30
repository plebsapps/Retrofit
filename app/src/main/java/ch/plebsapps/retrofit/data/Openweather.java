
package ch.plebsapps.retrofit.data;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Openweather {

    @SerializedName("base")
    @Expose
    private String base;
    @SerializedName("clouds")
    @Expose
    private Clouds clouds;
    @SerializedName("cod")
    @Expose
    private Integer cod;
    @SerializedName("coord")
    @Expose
    private Coord coord;
    @SerializedName("dt")
    @Expose
    private Integer dt;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("main")
    @Expose
    private Main main;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("sys")
    @Expose
    private Sys sys;
    @SerializedName("weather")
    @Expose
    private List<Weather> weather = null;
    @SerializedName("wind")
    @Expose
    private Wind wind;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Openweather() {
    }

    /**
     * 
     * @param id
     * @param dt
     * @param coord
     * @param clouds
     * @param wind
     * @param cod
     * @param sys
     * @param name
     * @param base
     * @param weather
     * @param main
     */
    public Openweather(String base, Clouds clouds, Integer cod, Coord coord, Integer dt, Integer id, Main main, String name, Sys sys, List<Weather> weather, Wind wind) {
        super();
        this.base = base;
        this.clouds = clouds;
        this.cod = cod;
        this.coord = coord;
        this.dt = dt;
        this.id = id;
        this.main = main;
        this.name = name;
        this.sys = sys;
        this.weather = weather;
        this.wind = wind;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public Integer getDt() {
        return dt;
    }

    public void setDt(Integer dt) {
        this.dt = dt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

}
