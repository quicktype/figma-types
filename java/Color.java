package io.quicktype;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

/**
 * An RGBA color
 */
public class Color {
    private Double a;
    private Double b;
    private Double g;
    private Double r;

    /**
     * Alpha channel value, between 0 and 1
     */
    @JsonProperty("a")
    public Double getA() { return a; }
    @JsonProperty("a")
    public void setA(Double value) { this.a = value; }

    /**
     * Blue channel value, between 0 and 1
     */
    @JsonProperty("b")
    public Double getB() { return b; }
    @JsonProperty("b")
    public void setB(Double value) { this.b = value; }

    /**
     * Green channel value, between 0 and 1
     */
    @JsonProperty("g")
    public Double getG() { return g; }
    @JsonProperty("g")
    public void setG(Double value) { this.g = value; }

    /**
     * Red channel value, between 0 and 1
     */
    @JsonProperty("r")
    public Double getR() { return r; }
    @JsonProperty("r")
    public void setR(Double value) { this.r = value; }
}
