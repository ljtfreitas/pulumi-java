// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2ValueDayOfWeekValue;
import io.pulumi.googlenative.dlp_v2.inputs.GoogleTypeDateArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GoogleTypeTimeOfDayArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Set of primitive values supported by the system. Note that for the purposes of inspection or transformation, the number of bytes considered to comprise a 'Value' is based on its representation as a UTF-8 encoded string. For example, if 'integer_value' is set to 123456789, the number of bytes would be counted as 9, even though an int64 only holds up to 8 bytes of data.
 * 
 */
public final class GooglePrivacyDlpV2ValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2ValueArgs Empty = new GooglePrivacyDlpV2ValueArgs();

    /**
     * boolean
     * 
     */
    @InputImport(name="booleanValue")
      private final @Nullable Input<Boolean> booleanValue;

    public Input<Boolean> getBooleanValue() {
        return this.booleanValue == null ? Input.empty() : this.booleanValue;
    }

    /**
     * date
     * 
     */
    @InputImport(name="dateValue")
      private final @Nullable Input<GoogleTypeDateArgs> dateValue;

    public Input<GoogleTypeDateArgs> getDateValue() {
        return this.dateValue == null ? Input.empty() : this.dateValue;
    }

    /**
     * day of week
     * 
     */
    @InputImport(name="dayOfWeekValue")
      private final @Nullable Input<GooglePrivacyDlpV2ValueDayOfWeekValue> dayOfWeekValue;

    public Input<GooglePrivacyDlpV2ValueDayOfWeekValue> getDayOfWeekValue() {
        return this.dayOfWeekValue == null ? Input.empty() : this.dayOfWeekValue;
    }

    /**
     * float
     * 
     */
    @InputImport(name="floatValue")
      private final @Nullable Input<Double> floatValue;

    public Input<Double> getFloatValue() {
        return this.floatValue == null ? Input.empty() : this.floatValue;
    }

    /**
     * integer
     * 
     */
    @InputImport(name="integerValue")
      private final @Nullable Input<String> integerValue;

    public Input<String> getIntegerValue() {
        return this.integerValue == null ? Input.empty() : this.integerValue;
    }

    /**
     * string
     * 
     */
    @InputImport(name="stringValue")
      private final @Nullable Input<String> stringValue;

    public Input<String> getStringValue() {
        return this.stringValue == null ? Input.empty() : this.stringValue;
    }

    /**
     * time of day
     * 
     */
    @InputImport(name="timeValue")
      private final @Nullable Input<GoogleTypeTimeOfDayArgs> timeValue;

    public Input<GoogleTypeTimeOfDayArgs> getTimeValue() {
        return this.timeValue == null ? Input.empty() : this.timeValue;
    }

    /**
     * timestamp
     * 
     */
    @InputImport(name="timestampValue")
      private final @Nullable Input<String> timestampValue;

    public Input<String> getTimestampValue() {
        return this.timestampValue == null ? Input.empty() : this.timestampValue;
    }

    public GooglePrivacyDlpV2ValueArgs(
        @Nullable Input<Boolean> booleanValue,
        @Nullable Input<GoogleTypeDateArgs> dateValue,
        @Nullable Input<GooglePrivacyDlpV2ValueDayOfWeekValue> dayOfWeekValue,
        @Nullable Input<Double> floatValue,
        @Nullable Input<String> integerValue,
        @Nullable Input<String> stringValue,
        @Nullable Input<GoogleTypeTimeOfDayArgs> timeValue,
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

    private GooglePrivacyDlpV2ValueArgs() {
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

    public static Builder builder(GooglePrivacyDlpV2ValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> booleanValue;
        private @Nullable Input<GoogleTypeDateArgs> dateValue;
        private @Nullable Input<GooglePrivacyDlpV2ValueDayOfWeekValue> dayOfWeekValue;
        private @Nullable Input<Double> floatValue;
        private @Nullable Input<String> integerValue;
        private @Nullable Input<String> stringValue;
        private @Nullable Input<GoogleTypeTimeOfDayArgs> timeValue;
        private @Nullable Input<String> timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ValueArgs defaults) {
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

        public Builder setDateValue(@Nullable Input<GoogleTypeDateArgs> dateValue) {
            this.dateValue = dateValue;
            return this;
        }

        public Builder setDateValue(@Nullable GoogleTypeDateArgs dateValue) {
            this.dateValue = Input.ofNullable(dateValue);
            return this;
        }

        public Builder setDayOfWeekValue(@Nullable Input<GooglePrivacyDlpV2ValueDayOfWeekValue> dayOfWeekValue) {
            this.dayOfWeekValue = dayOfWeekValue;
            return this;
        }

        public Builder setDayOfWeekValue(@Nullable GooglePrivacyDlpV2ValueDayOfWeekValue dayOfWeekValue) {
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

        public Builder setIntegerValue(@Nullable Input<String> integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public Builder setIntegerValue(@Nullable String integerValue) {
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

        public Builder setTimeValue(@Nullable Input<GoogleTypeTimeOfDayArgs> timeValue) {
            this.timeValue = timeValue;
            return this;
        }

        public Builder setTimeValue(@Nullable GoogleTypeTimeOfDayArgs timeValue) {
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
        public GooglePrivacyDlpV2ValueArgs build() {
            return new GooglePrivacyDlpV2ValueArgs(booleanValue, dateValue, dayOfWeekValue, floatValue, integerValue, stringValue, timeValue, timestampValue);
        }
    }
}
