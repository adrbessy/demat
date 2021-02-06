package org.orbisgis.demat.v4;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class FluffyLinearGradient {
    private String gradient;
    private String id;
    private List<GradientStop> stops;
    private Double x1;
    private Double x2;
    private Double y1;
    private Double y2;
    private Double r1;
    private Double r2;
    private String expr;

    /**
     * The type of gradient. Use `"linear"` for a linear gradient.
     *
     * The type of gradient. Use `"radial"` for a radial gradient.
     */
    @JsonProperty("gradient")
    public String getGradient() { return gradient; }
    @JsonProperty("gradient")
    public void setGradient(String value) { this.gradient = value; }

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    /**
     * An array of gradient stops defining the gradient color sequence.
     */
    @JsonProperty("stops")
    public List<GradientStop> getStops() { return stops; }
    @JsonProperty("stops")
    public void setStops(List<GradientStop> value) { this.stops = value; }

    /**
     * The starting x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
     *
     * __Default value:__ `0`
     *
     * The x-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle
     * for the gradient.
     *
     * __Default value:__ `0.5`
     */
    @JsonProperty("x1")
    public Double getX1() { return x1; }
    @JsonProperty("x1")
    public void setX1(Double value) { this.x1 = value; }

    /**
     * The ending x-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
     *
     * __Default value:__ `1`
     *
     * The x-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle
     * for the gradient.
     *
     * __Default value:__ `0.5`
     */
    @JsonProperty("x2")
    public Double getX2() { return x2; }
    @JsonProperty("x2")
    public void setX2(Double value) { this.x2 = value; }

    /**
     * The starting y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
     *
     * __Default value:__ `0`
     *
     * The y-coordinate, in normalized [0, 1] coordinates, for the center of the inner circle
     * for the gradient.
     *
     * __Default value:__ `0.5`
     */
    @JsonProperty("y1")
    public Double getY1() { return y1; }
    @JsonProperty("y1")
    public void setY1(Double value) { this.y1 = value; }

    /**
     * The ending y-coordinate, in normalized [0, 1] coordinates, of the linear gradient.
     *
     * __Default value:__ `0`
     *
     * The y-coordinate, in normalized [0, 1] coordinates, for the center of the outer circle
     * for the gradient.
     *
     * __Default value:__ `0.5`
     */
    @JsonProperty("y2")
    public Double getY2() { return y2; }
    @JsonProperty("y2")
    public void setY2(Double value) { this.y2 = value; }

    /**
     * The radius length, in normalized [0, 1] coordinates, of the inner circle for the
     * gradient.
     *
     * __Default value:__ `0`
     */
    @JsonProperty("r1")
    public Double getR1() { return r1; }
    @JsonProperty("r1")
    public void setR1(Double value) { this.r1 = value; }

    /**
     * The radius length, in normalized [0, 1] coordinates, of the outer circle for the
     * gradient.
     *
     * __Default value:__ `0.5`
     */
    @JsonProperty("r2")
    public Double getR2() { return r2; }
    @JsonProperty("r2")
    public void setR2(Double value) { this.r2 = value; }

    /**
     * Vega expression (which can refer to Vega-Lite parameters).
     */
    @JsonProperty("expr")
    public String getExpr() { return expr; }
    @JsonProperty("expr")
    public void setExpr(String value) { this.expr = value; }
}
