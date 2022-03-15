// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.inputs.GoogleTypeDateResponse;
import io.pulumi.googlenative.dlp_v2.inputs.GoogleTypeTimeOfDayResponse;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Set of primitive values supported by the system. Note that for the purposes of inspection or transformation, the number of bytes considered to comprise a 'Value' is based on its representation as a UTF-8 encoded string. For example, if 'integer_value' is set to 123456789, the number of bytes would be counted as 9, even though an int64 only holds up to 8 bytes of data.
 * 
 */
public final class GooglePrivacyDlpV2ValueResponse extends io.pulumi.resources.InvokeArgs {

    public static final GooglePrivacyDlpV2ValueResponse Empty = new GooglePrivacyDlpV2ValueResponse();

    /**
     * boolean
     * 
     */
    @Import(name="booleanValue", required=true)
      private final Boolean booleanValue;

    public Boolean getBooleanValue() {
        return this.booleanValue;
    }

    /**
     * date
     * 
     */
    @Import(name="dateValue", required=true)
      private final GoogleTypeDateResponse dateValue;

    public GoogleTypeDateResponse getDateValue() {
        return this.dateValue;
    }

    /**
     * day of week
     * 
     */
    @Import(name="dayOfWeekValue", required=true)
      private final String dayOfWeekValue;

    public String getDayOfWeekValue() {
        return this.dayOfWeekValue;
    }

    /**
     * float
     * 
     */
    @Import(name="floatValue", required=true)
      private final Double floatValue;

    public Double getFloatValue() {
        return this.floatValue;
    }

    /**
     * integer
     * 
     */
    @Import(name="integerValue", required=true)
      private final String integerValue;

    public String getIntegerValue() {
        return this.integerValue;
    }

    /**
     * string
     * 
     */
    @Import(name="stringValue", required=true)
      private final String stringValue;

    public String getStringValue() {
        return this.stringValue;
    }

    /**
     * time of day
     * 
     */
    @Import(name="timeValue", required=true)
      private final GoogleTypeTimeOfDayResponse timeValue;

    public GoogleTypeTimeOfDayResponse getTimeValue() {
        return this.timeValue;
    }

    /**
     * timestamp
     * 
     */
    @Import(name="timestampValue", required=true)
      private final String timestampValue;

    public String getTimestampValue() {
        return this.timestampValue;
    }

    public GooglePrivacyDlpV2ValueResponse(
        Boolean booleanValue,
        GoogleTypeDateResponse dateValue,
        String dayOfWeekValue,
        Double floatValue,
        String integerValue,
        String stringValue,
        GoogleTypeTimeOfDayResponse timeValue,
        String timestampValue) {
        this.booleanValue = Objects.requireNonNull(booleanValue, "expected parameter 'booleanValue' to be non-null");
        this.dateValue = Objects.requireNonNull(dateValue, "expected parameter 'dateValue' to be non-null");
        this.dayOfWeekValue = Objects.requireNonNull(dayOfWeekValue, "expected parameter 'dayOfWeekValue' to be non-null");
        this.floatValue = Objects.requireNonNull(floatValue, "expected parameter 'floatValue' to be non-null");
        this.integerValue = Objects.requireNonNull(integerValue, "expected parameter 'integerValue' to be non-null");
        this.stringValue = Objects.requireNonNull(stringValue, "expected parameter 'stringValue' to be non-null");
        this.timeValue = Objects.requireNonNull(timeValue, "expected parameter 'timeValue' to be non-null");
        this.timestampValue = Objects.requireNonNull(timestampValue, "expected parameter 'timestampValue' to be non-null");
    }

    private GooglePrivacyDlpV2ValueResponse() {
        this.booleanValue = null;
        this.dateValue = null;
        this.dayOfWeekValue = null;
        this.floatValue = null;
        this.integerValue = null;
        this.stringValue = null;
        this.timeValue = null;
        this.timestampValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2ValueResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean booleanValue;
        private GoogleTypeDateResponse dateValue;
        private String dayOfWeekValue;
        private Double floatValue;
        private String integerValue;
        private String stringValue;
        private GoogleTypeTimeOfDayResponse timeValue;
        private String timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2ValueResponse defaults) {
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

        public Builder booleanValue(Boolean booleanValue) {
            this.booleanValue = Objects.requireNonNull(booleanValue);
            return this;
        }

        public Builder dateValue(GoogleTypeDateResponse dateValue) {
            this.dateValue = Objects.requireNonNull(dateValue);
            return this;
        }

        public Builder dayOfWeekValue(String dayOfWeekValue) {
            this.dayOfWeekValue = Objects.requireNonNull(dayOfWeekValue);
            return this;
        }

        public Builder floatValue(Double floatValue) {
            this.floatValue = Objects.requireNonNull(floatValue);
            return this;
        }

        public Builder integerValue(String integerValue) {
            this.integerValue = Objects.requireNonNull(integerValue);
            return this;
        }

        public Builder stringValue(String stringValue) {
            this.stringValue = Objects.requireNonNull(stringValue);
            return this;
        }

        public Builder timeValue(GoogleTypeTimeOfDayResponse timeValue) {
            this.timeValue = Objects.requireNonNull(timeValue);
            return this;
        }

        public Builder timestampValue(String timestampValue) {
            this.timestampValue = Objects.requireNonNull(timestampValue);
            return this;
        }
        public GooglePrivacyDlpV2ValueResponse build() {
            return new GooglePrivacyDlpV2ValueResponse(booleanValue, dateValue, dayOfWeekValue, floatValue, integerValue, stringValue, timeValue, timestampValue);
        }
    }
}
