// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudsearch_v1.inputs.DateArgs;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of a single value with generic type.
 * 
 */
public final class ValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ValueArgs Empty = new ValueArgs();

    @Import(name="booleanValue")
      private final @Nullable Output<Boolean> booleanValue;

    public Output<Boolean> getBooleanValue() {
        return this.booleanValue == null ? Output.empty() : this.booleanValue;
    }

    @Import(name="dateValue")
      private final @Nullable Output<DateArgs> dateValue;

    public Output<DateArgs> getDateValue() {
        return this.dateValue == null ? Output.empty() : this.dateValue;
    }

    @Import(name="doubleValue")
      private final @Nullable Output<Double> doubleValue;

    public Output<Double> getDoubleValue() {
        return this.doubleValue == null ? Output.empty() : this.doubleValue;
    }

    @Import(name="integerValue")
      private final @Nullable Output<String> integerValue;

    public Output<String> getIntegerValue() {
        return this.integerValue == null ? Output.empty() : this.integerValue;
    }

    @Import(name="stringValue")
      private final @Nullable Output<String> stringValue;

    public Output<String> getStringValue() {
        return this.stringValue == null ? Output.empty() : this.stringValue;
    }

    @Import(name="timestampValue")
      private final @Nullable Output<String> timestampValue;

    public Output<String> getTimestampValue() {
        return this.timestampValue == null ? Output.empty() : this.timestampValue;
    }

    public ValueArgs(
        @Nullable Output<Boolean> booleanValue,
        @Nullable Output<DateArgs> dateValue,
        @Nullable Output<Double> doubleValue,
        @Nullable Output<String> integerValue,
        @Nullable Output<String> stringValue,
        @Nullable Output<String> timestampValue) {
        this.booleanValue = booleanValue;
        this.dateValue = dateValue;
        this.doubleValue = doubleValue;
        this.integerValue = integerValue;
        this.stringValue = stringValue;
        this.timestampValue = timestampValue;
    }

    private ValueArgs() {
        this.booleanValue = Output.empty();
        this.dateValue = Output.empty();
        this.doubleValue = Output.empty();
        this.integerValue = Output.empty();
        this.stringValue = Output.empty();
        this.timestampValue = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> booleanValue;
        private @Nullable Output<DateArgs> dateValue;
        private @Nullable Output<Double> doubleValue;
        private @Nullable Output<String> integerValue;
        private @Nullable Output<String> stringValue;
        private @Nullable Output<String> timestampValue;

        public Builder() {
    	      // Empty
        }

        public Builder(ValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.booleanValue = defaults.booleanValue;
    	      this.dateValue = defaults.dateValue;
    	      this.doubleValue = defaults.doubleValue;
    	      this.integerValue = defaults.integerValue;
    	      this.stringValue = defaults.stringValue;
    	      this.timestampValue = defaults.timestampValue;
        }

        public Builder booleanValue(@Nullable Output<Boolean> booleanValue) {
            this.booleanValue = booleanValue;
            return this;
        }

        public Builder booleanValue(@Nullable Boolean booleanValue) {
            this.booleanValue = Output.ofNullable(booleanValue);
            return this;
        }

        public Builder dateValue(@Nullable Output<DateArgs> dateValue) {
            this.dateValue = dateValue;
            return this;
        }

        public Builder dateValue(@Nullable DateArgs dateValue) {
            this.dateValue = Output.ofNullable(dateValue);
            return this;
        }

        public Builder doubleValue(@Nullable Output<Double> doubleValue) {
            this.doubleValue = doubleValue;
            return this;
        }

        public Builder doubleValue(@Nullable Double doubleValue) {
            this.doubleValue = Output.ofNullable(doubleValue);
            return this;
        }

        public Builder integerValue(@Nullable Output<String> integerValue) {
            this.integerValue = integerValue;
            return this;
        }

        public Builder integerValue(@Nullable String integerValue) {
            this.integerValue = Output.ofNullable(integerValue);
            return this;
        }

        public Builder stringValue(@Nullable Output<String> stringValue) {
            this.stringValue = stringValue;
            return this;
        }

        public Builder stringValue(@Nullable String stringValue) {
            this.stringValue = Output.ofNullable(stringValue);
            return this;
        }

        public Builder timestampValue(@Nullable Output<String> timestampValue) {
            this.timestampValue = timestampValue;
            return this;
        }

        public Builder timestampValue(@Nullable String timestampValue) {
            this.timestampValue = Output.ofNullable(timestampValue);
            return this;
        }
        public ValueArgs build() {
            return new ValueArgs(booleanValue, dateValue, doubleValue, integerValue, stringValue, timestampValue);
        }
    }
}
