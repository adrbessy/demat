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

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.core.type.*;
import org.orbisgis.demat.vega.condition.ConditionalValueNumber;

import java.util.List;

/**
 * One or more value definition(s) with [a selection or a test
 * predicate](https://vega.github.io/vega-lite/docs/condition.html).
 *
 * __Note:__ A field definition's `condition` property can only contain [conditional value
 * definitions](https://vega.github.io/vega-lite/docs/condition.html#value) since Vega-Lite
 * only allows at most one encoded field per encoding channel.
 */
@JsonDeserialize(using = OrderFieldDefCondition.Deserializer.class)
@JsonSerialize(using = OrderFieldDefCondition.Serializer.class)
public class OrderFieldDefCondition {
    public ConditionalPredicateValueDefNumberClass conditionalPredicateValueDefNumberClassValue;
    public List<ConditionalValueNumber> conditionalValueDefNumberArrayValue;

    static class Deserializer extends JsonDeserializer<OrderFieldDefCondition> {
        @Override
        public OrderFieldDefCondition deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            OrderFieldDefCondition value = new OrderFieldDefCondition();
            switch (jsonParser.currentToken()) {
                case VALUE_NULL:
                    break;
                case START_ARRAY:
                    value.conditionalValueDefNumberArrayValue = jsonParser.readValueAs(new TypeReference<List<ConditionalValueNumber>>() {});
                    break;
                case START_OBJECT:
                    value.conditionalPredicateValueDefNumberClassValue = jsonParser.readValueAs(ConditionalPredicateValueDefNumberClass.class);
                    break;
                default: throw new IOException("Cannot deserialize OrderFieldDefCondition");
            }
            return value;
        }
    }

    static class Serializer extends JsonSerializer<OrderFieldDefCondition> {
        @Override
        public void serialize(OrderFieldDefCondition obj, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            if (obj.conditionalPredicateValueDefNumberClassValue != null) {
                jsonGenerator.writeObject(obj.conditionalPredicateValueDefNumberClassValue);
                return;
            }
            if (obj.conditionalValueDefNumberArrayValue != null) {
                jsonGenerator.writeObject(obj.conditionalValueDefNumberArrayValue);
                return;
            }
            jsonGenerator.writeNull();
        }
    }
}
