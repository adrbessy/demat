package org.orbisgis.demat.v4;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

public class Predicate {
    private ConditionalValueDefNumberExprRefPredicateComposition not;
    private List<PredicateCompositionElement> and;
    private List<PredicateCompositionElement> or;
    private Equal equal;
    private String field;
    private TimeUnitUnion timeUnit;
    private LogicalNotPredicateRange range;
    private List<SelectionInitInterval> oneOf;
    private Lt lt;
    private Lt gt;
    private Lt lte;
    private Lt gte;
    private Boolean valid;
    private ConditionalValueDefNumberExprRefSelectionComposition selection;

    @JsonProperty("not")
    public ConditionalValueDefNumberExprRefPredicateComposition getNot() { return not; }
    @JsonProperty("not")
    public void setNot(ConditionalValueDefNumberExprRefPredicateComposition value) { this.not = value; }

    @JsonProperty("and")
    public List<PredicateCompositionElement> getAnd() { return and; }
    @JsonProperty("and")
    public void setAnd(List<PredicateCompositionElement> value) { this.and = value; }

    @JsonProperty("or")
    public List<PredicateCompositionElement> getOr() { return or; }
    @JsonProperty("or")
    public void setOr(List<PredicateCompositionElement> value) { this.or = value; }

    /**
     * The value that the field should be equal to.
     */
    @JsonProperty("equal")
    public Equal getEqual() { return equal; }
    @JsonProperty("equal")
    public void setEqual(Equal value) { this.equal = value; }

    /**
     * Field to be tested.
     */
    @JsonProperty("field")
    public String getField() { return field; }
    @JsonProperty("field")
    public void setField(String value) { this.field = value; }

    /**
     * Time unit for the field to be tested.
     */
    @JsonProperty("timeUnit")
    public TimeUnitUnion getTimeUnit() { return timeUnit; }
    @JsonProperty("timeUnit")
    public void setTimeUnit(TimeUnitUnion value) { this.timeUnit = value; }

    /**
     * An array of inclusive minimum and maximum values for a field value of a data item to be
     * included in the filtered data.
     */
    @JsonProperty("range")
    public LogicalNotPredicateRange getRange() { return range; }
    @JsonProperty("range")
    public void setRange(LogicalNotPredicateRange value) { this.range = value; }

    /**
     * A set of values that the `field`'s value should be a member of, for a data item included
     * in the filtered data.
     */
    @JsonProperty("oneOf")
    public List<SelectionInitInterval> getOneOf() { return oneOf; }
    @JsonProperty("oneOf")
    public void setOneOf(List<SelectionInitInterval> value) { this.oneOf = value; }

    /**
     * The value that the field should be less than.
     */
    @JsonProperty("lt")
    public Lt getLt() { return lt; }
    @JsonProperty("lt")
    public void setLt(Lt value) { this.lt = value; }

    /**
     * The value that the field should be greater than.
     */
    @JsonProperty("gt")
    public Lt getGt() { return gt; }
    @JsonProperty("gt")
    public void setGt(Lt value) { this.gt = value; }

    /**
     * The value that the field should be less than or equals to.
     */
    @JsonProperty("lte")
    public Lt getLTE() { return lte; }
    @JsonProperty("lte")
    public void setLTE(Lt value) { this.lte = value; }

    /**
     * The value that the field should be greater than or equals to.
     */
    @JsonProperty("gte")
    public Lt getGte() { return gte; }
    @JsonProperty("gte")
    public void setGte(Lt value) { this.gte = value; }

    /**
     * If set to true the field's value has to be valid, meaning both not `null` and not
     * [`NaN`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/NaN).
     */
    @JsonProperty("valid")
    public Boolean getValid() { return valid; }
    @JsonProperty("valid")
    public void setValid(Boolean value) { this.valid = value; }

    /**
     * Filter using a selection name or a logical composition of selection names.
     */
    @JsonProperty("selection")
    public ConditionalValueDefNumberExprRefSelectionComposition getSelection() { return selection; }
    @JsonProperty("selection")
    public void setSelection(ConditionalValueDefNumberExprRefSelectionComposition value) { this.selection = value; }
}
