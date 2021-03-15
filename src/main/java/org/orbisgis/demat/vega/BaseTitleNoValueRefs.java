/*
 * DEMAT is java wrapper on top of the vega-lite library
 *
 * Demat is breton word to said "Hello".
 *
 * DEMAT is part of the OrbisGIS platform.
 *
 * OrbisGIS platform is a set of open source tools to access, process, display
 * and share geographical informations.
 *
 * It is leaded by CNRS within the French Lab-STICC laboratory <http://www.lab-sticc.fr/>,
 * DECIDE team of Vannes.
 *
 * OrbisGIS is dedicated to research in GIScience.
 *
 * The GIS group of the DECIDE team is located at :
 *
 * Laboratoire Lab-STICC – CNRS UMR 6285
 * Equipe DECIDE
 * UNIVERSITÉ DE BRETAGNE-SUD
 * Institut Universitaire de Technologie de Vannes
 * 8, Rue Montaigne - BP 561 56017 Vannes Cedex
 *
 * DEMAT is distributed under LGPL 3 license.
 *
 * Copyright (C) 2021 CNRS (Lab-STICC UMR CNRS 6285)
 *
 *
 * DEMAT is free software: you can redistribute it and/or modify it under the
 * terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * DEMAT is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * DEMAT. If not, see <http://www.gnu.org/licenses/>.
 *
 * For more information, please consult: <http://www.orbisgis.org/>
 * or contact directly:
 * info_at_ orbisgis.org
 */
package org.orbisgis.demat.vega;

import com.fasterxml.jackson.annotation.*;

/**
 * Title configuration, which determines default properties for all
 * [titles](https://vega.github.io/vega-lite/docs/title.html). For a full list of title
 * configuration options, please see the [corresponding section of the title
 * documentation](https://vega.github.io/vega-lite/docs/title.html#config).
 */
public class BaseTitleNoValueRefs {
    private Align align;
    private TitleAnchorUnion anchor;
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
    private Background subtitleColor;
    private Background subtitleFont;
    private FontSize subtitleFontSize;
    private Background subtitleFontStyle;
    private FontWeightUnion subtitleFontWeight;
    private CornerRadius subtitleLineHeight;
    private CornerRadius subtitlePadding;
    private FontSize zindex;

    /**
     * Horizontal text alignment for title text. One of `"left"`, `"center"`, or `"right"`.
     */
    @JsonProperty("align")
    public Align getAlign() { return align; }
    @JsonProperty("align")
    public void setAlign(Align value) { this.align = value; }

    @JsonProperty("anchor")
    public TitleAnchorUnion getAnchor() { return anchor; }
    @JsonProperty("anchor")
    public void setAnchor(TitleAnchorUnion value) { this.anchor = value; }

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

    @JsonProperty("zindex")
    public FontSize getZindex() { return zindex; }
    @JsonProperty("zindex")
    public void setZindex(FontSize value) { this.zindex = value; }
}
