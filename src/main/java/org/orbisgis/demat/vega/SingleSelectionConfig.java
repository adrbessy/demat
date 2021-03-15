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
import java.util.List;
import java.util.Map;

/**
 * The default definition for a
 * [`single`](https://vega.github.io/vega-lite/docs/selection.html#type) selection. All
 * properties and transformations   for a single selection definition (except `type`) may be
 * specified here.
 *
 * For instance, setting `single` to `{"on": "dblclick"}` populates single selections on
 * double-click by default.
 */
public class SingleSelectionConfig {
    private SingleBind bind;
    private ClearUnion clear;
    private Empty empty;
    private List<SingleDefUnitChannel> encodings;
    private List<String> fields;
    private Map<String, SelectionInit> init;
    private Boolean nearest;
    private OnUnion on;
    private SelectionResolution resolve;

    /**
     * When set, a selection is populated by input elements (also known as dynamic query
     * widgets) or by interacting with the corresponding legend. Direct manipulation interaction
     * is disabled by default; to re-enable it, set the selection's
     * [`on`](https://vega.github.io/vega-lite/docs/selection.html#common-selection-properties)
     * property.
     *
     * Legend bindings are restricted to selections that only specify a single field or
     * encoding.
     *
     * Query widget binding takes the form of Vega's [input element binding
     * definition](https://vega.github.io/vega/docs/signals/#bind) or can be a mapping between
     * projected field/encodings and binding definitions.
     *
     * __See also:__ [`bind`](https://vega.github.io/vega-lite/docs/bind.html) documentation.
     */
    @JsonProperty("bind")
    public SingleBind getBind() { return bind; }
    @JsonProperty("bind")
    public void setBind(SingleBind value) { this.bind = value; }

    /**
     * Clears the selection, emptying it of all values. Can be a [Event
     * Stream](https://vega.github.io/vega/docs/event-streams/) or `false` to disable.
     *
     * __Default value:__ `dblclick`.
     *
     * __See also:__ [`clear`](https://vega.github.io/vega-lite/docs/clear.html) documentation.
     */
    @JsonProperty("clear")
    public ClearUnion getClear() { return clear; }
    @JsonProperty("clear")
    public void setClear(ClearUnion value) { this.clear = value; }

    /**
     * By default, `all` data values are considered to lie within an empty selection. When set
     * to `none`, empty selections contain no data values.
     */
    @JsonProperty("empty")
    public Empty getEmpty() { return empty; }
    @JsonProperty("empty")
    public void setEmpty(Empty value) { this.empty = value; }

    /**
     * An array of encoding channels. The corresponding data field values must match for a data
     * tuple to fall within the selection.
     *
     * __See also:__ [`encodings`](https://vega.github.io/vega-lite/docs/project.html)
     * documentation.
     */
    @JsonProperty("encodings")
    public List<SingleDefUnitChannel> getEncodings() { return encodings; }
    @JsonProperty("encodings")
    public void setEncodings(List<SingleDefUnitChannel> value) { this.encodings = value; }

    /**
     * An array of field names whose values must match for a data tuple to fall within the
     * selection.
     *
     * __See also:__ [`fields`](https://vega.github.io/vega-lite/docs/project.html)
     * documentation.
     */
    @JsonProperty("fields")
    public List<String> getFields() { return fields; }
    @JsonProperty("fields")
    public void setFields(List<String> value) { this.fields = value; }

    /**
     * Initialize the selection with a mapping between [projected channels or field
     * names](https://vega.github.io/vega-lite/docs/project.html) and initial values.
     *
     * __See also:__ [`init`](https://vega.github.io/vega-lite/docs/init.html) documentation.
     */
    @JsonProperty("init")
    public Map<String, SelectionInit> getInit() { return init; }
    @JsonProperty("init")
    public void setInit(Map<String, SelectionInit> value) { this.init = value; }

    /**
     * When true, an invisible voronoi diagram is computed to accelerate discrete selection. The
     * data value _nearest_ the mouse cursor is added to the selection.
     *
     * __See also:__ [`nearest`](https://vega.github.io/vega-lite/docs/nearest.html)
     * documentation.
     */
    @JsonProperty("nearest")
    public Boolean getNearest() { return nearest; }
    @JsonProperty("nearest")
    public void setNearest(Boolean value) { this.nearest = value; }

    /**
     * A [Vega event stream](https://vega.github.io/vega/docs/event-streams/) (object or
     * selector) that triggers the selection. For interval selections, the event stream must
     * specify a [start and
     * end](https://vega.github.io/vega/docs/event-streams/#between-filters).
     */
    @JsonProperty("on")
    public OnUnion getOn() { return on; }
    @JsonProperty("on")
    public void setOn(OnUnion value) { this.on = value; }

    /**
     * With layered and multi-view displays, a strategy that determines how selections' data
     * queries are resolved when applied in a filter transform, conditional encoding rule, or
     * scale domain.
     *
     * __See also:__ [`resolve`](https://vega.github.io/vega-lite/docs/selection-resolve.html)
     * documentation.
     */
    @JsonProperty("resolve")
    public SelectionResolution getResolve() { return resolve; }
    @JsonProperty("resolve")
    public void setResolve(SelectionResolution value) { this.resolve = value; }
}
