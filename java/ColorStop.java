package io.quicktype;

import java.util.Map;
import com.fasterxml.jackson.annotation.*;

/**
 * Positions of key points along the gradient axis with the colors
 * anchored there. Colors along the gradient are interpolated smoothly
 * between neighboring gradient stops.
 *
 * A position color pair representing a gradient stop
 */
public class ColorStop {
    private Color color;
    private double position;

    /**
     * Color attached to corresponding position
     */
    @JsonProperty("color")
    public Color getColor() { return color; }
    @JsonProperty("color")
    public void setColor(Color value) { this.color = value; }

    /**
     * Value between 0 and 1 representing position along gradient axis
     */
    @JsonProperty("position")
    public double getPosition() { return position; }
    @JsonProperty("position")
    public void setPosition(double value) { this.position = value; }
}
