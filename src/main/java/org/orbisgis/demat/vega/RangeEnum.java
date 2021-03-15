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

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum RangeEnum {
    CATEGORY, DIVERGING, HEATMAP, HEIGHT, ORDINAL, RAMP, SYMBOL, WIDTH;

    @JsonValue
    public String toValue() {
        switch (this) {
            case CATEGORY: return "category";
            case DIVERGING: return "diverging";
            case HEATMAP: return "heatmap";
            case HEIGHT: return "height";
            case ORDINAL: return "ordinal";
            case RAMP: return "ramp";
            case SYMBOL: return "symbol";
            case WIDTH: return "width";
        }
        return null;
    }

    @JsonCreator
    public static RangeEnum forValue(String value) throws IOException {
        if (value.equals("category")) return CATEGORY;
        if (value.equals("diverging")) return DIVERGING;
        if (value.equals("heatmap")) return HEATMAP;
        if (value.equals("height")) return HEIGHT;
        if (value.equals("ordinal")) return ORDINAL;
        if (value.equals("ramp")) return RAMP;
        if (value.equals("symbol")) return SYMBOL;
        if (value.equals("width")) return WIDTH;
        throw new IOException("Cannot deserialize RangeEnum");
    }
}
