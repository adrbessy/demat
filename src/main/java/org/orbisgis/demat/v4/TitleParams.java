package org.orbisgis.demat.v4;

import com.fasterxml.jackson.annotation.*;

public class TitleParams {
    private Align align;
    private TitleAnchorEnum anchor;
    private CornerRadius angle;
    private Aria aria;
    private String baseline;
    private Background color;
    private CornerRadius dx;
    private CornerRadius dy;
    private Background font;
    private FontSize fontSize;
    private Background fontStyle;
    private FontWeightUnion fontWeight;
    private Background frame;
    private FontSize limit;
    private CornerRadius lineHeight;
    private CornerRadius offset;
    private TitleParamsOrient orient;
    private LegendText style;
    private LegendText subtitle;
    private Background subtitleColor;
    private Background subtitleFont;
    private FontSize subtitleFontSize;
    private Background subtitleFontStyle;
    private FontWeightUnion subtitleFontWeight;
    private CornerRadius subtitleLineHeight;
    private CornerRadius subtitlePadding;
    private ConditionalValueDefTextExprRefText text;
    private Double zindex;

    /**
     * Horizontal text alignment for title text. One of `"left"`, `"center"`, or `"right"`.
     */
    @JsonProperty("align")
    public Align getAlign() { return align; }
    @JsonProperty("align")
    public void setAlign(Align value) { this.align = value; }

    /**
     * The anchor position for placing the title. One of `"start"`, `"middle"`, or `"end"`. For
     * example, with an orientation of top these anchor positions map to a left-, center-, or
     * right-aligned title.
     *
     * __Default value:__ `"middle"` for
     * [single](https://vega.github.io/vega-lite/docs/spec.html) and
     * [layered](https://vega.github.io/vega-lite/docs/layer.html) views. `"start"` for other
     * composite views.
     *
     * __Note:__ [For now](https://github.com/vega/vega-lite/issues/2875), `anchor` is only
     * customizable only for [single](https://vega.github.io/vega-lite/docs/spec.html) and
     * [layered](https://vega.github.io/vega-lite/docs/layer.html) views. For other composite
     * views, `anchor` is always `"start"`.
     */
    @JsonProperty("anchor")
    public TitleAnchorEnum getAnchor() { return anchor; }
    @JsonProperty("anchor")
    public void setAnchor(TitleAnchorEnum value) { this.anchor = value; }

    @JsonProperty("angle")
    public CornerRadius getAngle() { return angle; }
    @JsonProperty("angle")
    public void setAngle(CornerRadius value) { this.angle = value; }

    @JsonProperty("aria")
    public Aria getAria() { return aria; }
    @JsonProperty("aria")
    public void setAria(Aria value) { this.aria = value; }

    /**
     * Vertical text baseline for title and subtitle text. One of `"alphabetic"` (default),
     * `"top"`, `"middle"`, `"bottom"`, `"line-top"`, or `"line-bottom"`. The `"line-top"` and
     * `"line-bottom"` values operate similarly to `"top"` and `"bottom"`, but are calculated
     * relative to the *lineHeight* rather than *fontSize* alone.
     */
    @JsonProperty("baseline")
    public String getBaseline() { return baseline; }
    @JsonProperty("baseline")
    public void setBaseline(String value) { this.baseline = value; }

    @JsonProperty("color")
    public Background getColor() { return color; }
    @JsonProperty("color")
    public void setColor(Background value) { this.color = value; }

    @JsonProperty("dx")
    public CornerRadius getDx() { return dx; }
    @JsonProperty("dx")
    public void setDx(CornerRadius value) { this.dx = value; }

    @JsonProperty("dy")
    public CornerRadius getDy() { return dy; }
    @JsonProperty("dy")
    public void setDy(CornerRadius value) { this.dy = value; }

    @JsonProperty("font")
    public Background getFont() { return font; }
    @JsonProperty("font")
    public void setFont(Background value) { this.font = value; }

    @JsonProperty("fontSize")
    public FontSize getFontSize() { return fontSize; }
    @JsonProperty("fontSize")
    public void setFontSize(FontSize value) { this.fontSize = value; }

    @JsonProperty("fontStyle")
    public Background getFontStyle() { return fontStyle; }
    @JsonProperty("fontStyle")
    public void setFontStyle(Background value) { this.fontStyle = value; }

    @JsonProperty("fontWeight")
    public FontWeightUnion getFontWeight() { return fontWeight; }
    @JsonProperty("fontWeight")
    public void setFontWeight(FontWeightUnion value) { this.fontWeight = value; }

    @JsonProperty("frame")
    public Background getFrame() { return frame; }
    @JsonProperty("frame")
    public void setFrame(Background value) { this.frame = value; }

    @JsonProperty("limit")
    public FontSize getLimit() { return limit; }
    @JsonProperty("limit")
    public void setLimit(FontSize value) { this.limit = value; }

    @JsonProperty("lineHeight")
    public CornerRadius getLineHeight() { return lineHeight; }
    @JsonProperty("lineHeight")
    public void setLineHeight(CornerRadius value) { this.lineHeight = value; }

    @JsonProperty("offset")
    public CornerRadius getOffset() { return offset; }
    @JsonProperty("offset")
    public void setOffset(CornerRadius value) { this.offset = value; }

    @JsonProperty("orient")
    public TitleParamsOrient getOrient() { return orient; }
    @JsonProperty("orient")
    public void setOrient(TitleParamsOrient value) { this.orient = value; }

    /**
     * A [mark style property](https://vega.github.io/vega-lite/docs/config.html#style) to apply
     * to the title text mark.
     *
     * __Default value:__ `"group-title"`.
     */
    @JsonProperty("style")
    public LegendText getStyle() { return style; }
    @JsonProperty("style")
    public void setStyle(LegendText value) { this.style = value; }

    /**
     * The subtitle Text.
     */
    @JsonProperty("subtitle")
    public LegendText getSubtitle() { return subtitle; }
    @JsonProperty("subtitle")
    public void setSubtitle(LegendText value) { this.subtitle = value; }

    @JsonProperty("subtitleColor")
    public Background getSubtitleColor() { return subtitleColor; }
    @JsonProperty("subtitleColor")
    public void setSubtitleColor(Background value) { this.subtitleColor = value; }

    @JsonProperty("subtitleFont")
    public Background getSubtitleFont() { return subtitleFont; }
    @JsonProperty("subtitleFont")
    public void setSubtitleFont(Background value) { this.subtitleFont = value; }

    @JsonProperty("subtitleFontSize")
    public FontSize getSubtitleFontSize() { return subtitleFontSize; }
    @JsonProperty("subtitleFontSize")
    public void setSubtitleFontSize(FontSize value) { this.subtitleFontSize = value; }

    @JsonProperty("subtitleFontStyle")
    public Background getSubtitleFontStyle() { return subtitleFontStyle; }
    @JsonProperty("subtitleFontStyle")
    public void setSubtitleFontStyle(Background value) { this.subtitleFontStyle = value; }

    @JsonProperty("subtitleFontWeight")
    public FontWeightUnion getSubtitleFontWeight() { return subtitleFontWeight; }
    @JsonProperty("subtitleFontWeight")
    public void setSubtitleFontWeight(FontWeightUnion value) { this.subtitleFontWeight = value; }

    @JsonProperty("subtitleLineHeight")
    public CornerRadius getSubtitleLineHeight() { return subtitleLineHeight; }
    @JsonProperty("subtitleLineHeight")
    public void setSubtitleLineHeight(CornerRadius value) { this.subtitleLineHeight = value; }

    @JsonProperty("subtitlePadding")
    public CornerRadius getSubtitlePadding() { return subtitlePadding; }
    @JsonProperty("subtitlePadding")
    public void setSubtitlePadding(CornerRadius value) { this.subtitlePadding = value; }

    /**
     * The title text.
     */
    @JsonProperty("text")
    public ConditionalValueDefTextExprRefText getText() { return text; }
    @JsonProperty("text")
    public void setText(ConditionalValueDefTextExprRefText value) { this.text = value; }

    /**
     * The integer z-index indicating the layering of the title group relative to other axis,
     * mark and legend groups.
     *
     * __Default value:__ `0`.
     */
    @JsonProperty("zindex")
    public Double getZindex() { return zindex; }
    @JsonProperty("zindex")
    public void setZindex(Double value) { this.zindex = value; }
}
