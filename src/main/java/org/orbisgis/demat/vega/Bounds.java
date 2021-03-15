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

/**
 * The bounds calculation method to use for determining the extent of a sub-plot. One of
 * `full` (the default) or `flush`.
 *
 * - If set to `full`, the entire calculated bounds (including axes, title, and legend) will
 * be used. - If set to `flush`, only the specified width and height values for the sub-view
 * will be used. The `flush` setting can be useful when attempting to place sub-plots
 * without axes or legends into a uniform grid structure.
 *
 * __Default value:__ `"full"`
 */
public enum Bounds {
    FLUSH, FULL;

    @JsonValue
    public String toValue() {
        switch (this) {
            case FLUSH: return "flush";
            case FULL: return "full";
        }
        return null;
    }

    @JsonCreator
    public static Bounds forValue(String value) throws IOException {
        if (value.equals("flush")) return FLUSH;
        if (value.equals("full")) return FULL;
        throw new IOException("Cannot deserialize Bounds");
    }
}
