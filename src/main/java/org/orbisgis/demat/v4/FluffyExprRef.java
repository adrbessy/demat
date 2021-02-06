package org.orbisgis.demat.v4;

import com.fasterxml.jackson.annotation.*;

public class FluffyExprRef {
    private String expr;
    private ExprRefCondition condition;
    private Align value;

    /**
     * Vega expression (which can refer to Vega-Lite parameters).
     */
    @JsonProperty("expr")
    public String getExpr() { return expr; }
    @JsonProperty("expr")
    public void setExpr(String value) { this.expr = value; }

    @JsonProperty("condition")
    public ExprRefCondition getCondition() { return condition; }
    @JsonProperty("condition")
    public void setCondition(ExprRefCondition value) { this.condition = value; }

    /**
     * A constant value in visual domain (e.g., `"red"` / `"#0099ff"` / [gradient
     * definition](https://vega.github.io/vega-lite/docs/types.html#gradient) for color, values
     * between `0` to `1` for opacity).
     */
    @JsonProperty("value")
    public Align getValue() { return value; }
    @JsonProperty("value")
    public void setValue(Align value) { this.value = value; }
}
