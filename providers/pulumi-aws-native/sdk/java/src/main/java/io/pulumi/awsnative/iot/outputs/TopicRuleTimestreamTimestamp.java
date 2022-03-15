// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TopicRuleTimestreamTimestamp {
    private final String unit;
    private final String value;

    @CustomType.Constructor
    private TopicRuleTimestreamTimestamp(
        @CustomType.Parameter("unit") String unit,
        @CustomType.Parameter("value") String value) {
        this.unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return this.unit;
    }
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleTimestreamTimestamp defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String unit;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleTimestreamTimestamp defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder unit(String unit) {
            this.unit = Objects.requireNonNull(unit);
            return this;
        }

        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public TopicRuleTimestreamTimestamp build() {
            return new TopicRuleTimestreamTimestamp(unit, value);
        }
    }
}
