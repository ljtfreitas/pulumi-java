// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs;
import io.pulumi.gcp.dataloss.inputs.PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueGetArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs Empty = new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs();

    /**
     * A boolean value.
     * 
     */
    @InputImport(name="booleanValue")
        private final @Nullable Input<Boolean> booleanValue;

    public Input<Boolean> getBooleanValue() {
        return this.booleanValue == null ? Input.empty() : this.booleanValue;
    }

    /**
     * Represents a whole or partial calendar date.
     * Structure is documented below.
     * 
     */
    @InputImport(name="dateValue")
        private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs> dateValue;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs> getDateValue() {
        return this.dateValue == null ? Input.empty() : this.dateValue;
    }

    /**
     * Represents a day of the week.
     * Possible values are `MONDAY`, `TUESDAY`, `WEDNESDAY`, `THURSDAY`, `FRIDAY`, `SATURDAY`, and `SUNDAY`.
     * 
     */
    @InputImport(name="dayOfWeekValue")
        private final @Nullable Input<String> dayOfWeekValue;

    public Input<String> getDayOfWeekValue() {
        return this.dayOfWeekValue == null ? Input.empty() : this.dayOfWeekValue;
    }

    /**
     * A float value.
     * 
     */
    @InputImport(name="floatValue")
        private final @Nullable Input<Double> floatValue;

    public Input<Double> getFloatValue() {
        return this.floatValue == null ? Input.empty() : this.floatValue;
    }

    /**
     * An integer value.
     * 
     */
    @InputImport(name="integerValue")
        private final @Nullable Input<Integer> integerValue;

    public Input<Integer> getIntegerValue() {
        return this.integerValue == null ? Input.empty() : this.integerValue;
    }

    /**
     * A string value.
     * 
     */
    @InputImport(name="stringValue")
        private final @Nullable Input<String> stringValue;

    public Input<String> getStringValue() {
        return this.stringValue == null ? Input.empty() : this.stringValue;
    }

    /**
     * Represents a time of day.
     * Structure is documented below.
     * 
     */
    @InputImport(name="timeValue")
        private final @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueGetArgs> timeValue;

    public Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueGetArgs> getTimeValue() {
        return this.timeValue == null ? Input.empty() : this.timeValue;
    }

    /**
     * A timestamp in RFC3339 UTC "Zulu" format, with nanosecond resolution and up to nine fractional digits.
     * Examples: "2014-10-02T15:01:23Z" and "2014-10-02T15:01:23.045123456Z".
     * 
     */
    @InputImport(name="timestampValue")
        private final @Nullable Input<String> timestampValue;

    public Input<String> getTimestampValue() {
        return this.timestampValue == null ? Input.empty() : this.timestampValue;
    }

    public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs(
        @Nullable Input<Boolean> booleanValue,
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs> dateValue,
        @Nullable Input<String> dayOfWeekValue,
        @Nullable Input<Double> floatValue,
        @Nullable Input<Integer> integerValue,
        @Nullable Input<String> stringValue,
        @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueGetArgs> timeValue,
        @Nullable Input<String> timestampValue) {
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.dayOfWeekValue = dayOfWeekValue;
        this.floatValue = floatValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
        this.timeValue = timeValue;
        this.timestampValue = timestampValue;
    }

    private PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs() {
        this.booleanValue = Input.empty();
        this.dateValue = Input.empty();
        this.dayOfWeekValue = Input.empty();
        this.floatValue = Input.empty();
        this.integerValue = Input.empty();
        this.stringValue = Input.empty();
        this.timeValue = Input.empty();
        this.timestampValue = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> booleanValue;
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs> dateValue;
        private @Nullable Input<String> dayOfWeekValue;
        private @Nullable Input<Double> floatValue;
        private @Nullable Input<Integer> integerValue;
        private @Nullable Input<String> stringValue;
        private @Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueGetArgs> timeValue;
        private @Nullable Input<String> timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.dayOfWeekValue = defaults.dayOfWeekValue;
    	      this.floatValue = defaults.floatValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timeValue = defaults.timeValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder setBooleanValue(@Nullable Input<Boolean> booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder setBooleanValue(@Nullable Boolean booleanValue) {
            this.booleanValue = Input.ofNullable(booleanValue);
            return this;
        }

        public Builder setDateValue(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs> dateValue) {
            this.dateValue = dateValue;
            return this;
        }

        public Builder setDateValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueDateValueGetArgs dateValue) {
            this.dateValue = Input.ofNullable(dateValue);
            return this;
        }

        public Builder setDayOfWeekValue(@Nullable Input<String> dayOfWeekValue) {
            this.dayOfWeekValue = dayOfWeekValue;
            return this;
        }

        public Builder setDayOfWeekValue(@Nullable String dayOfWeekValue) {
            this.dayOfWeekValue = Input.ofNullable(dayOfWeekValue);
            return this;
        }

        public Builder setFloatValue(@Nullable Input<Double> floatValue) {
            this.floatValue = floatValue;
            return this;
        }

        public Builder setFloatValue(@Nullable Double floatValue) {
            this.floatValue = Input.ofNullable(floatValue);
            return this;
        }

        public Builder setIntegerValue(@Nullable Input<Integer> integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public Builder setIntegerValue(@Nullable Integer integerValue) {
            this.integerValue = Input.ofNullable(integerValue);
            return this;
        }

        public Builder setStringValue(@Nullable Input<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder setStringValue(@Nullable String stringValue) {
            this.stringValue = Input.ofNullable(stringValue);
            return this;
        }

        public Builder setTimeValue(@Nullable Input<PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueGetArgs> timeValue) {
            this.timeValue = timeValue;
            return this;
        }

        public Builder setTimeValue(@Nullable PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueTimeValueGetArgs timeValue) {
            this.timeValue = Input.ofNullable(timeValue);
            return this;
        }

        public Builder setTimestampValue(@Nullable Input<String> timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }

        public Builder setTimestampValue(@Nullable String timestampValue) {
            this.timestampValue = Input.ofNullable(timestampValue);
            return this;
        }
        public PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs build() {
            return new PreventionDeidentifyTemplateDeidentifyConfigInfoTypeTransformationsTransformationPrimitiveTransformationReplaceConfigNewValueGetArgs(booleanValue, dateValue, dayOfWeekValue, floatValue, integerValue, stringValue, timeValue, timestampValue);
        }
    }
}
