// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.enums.RulesetThresholdType;
import io.pulumi.awsnative.databrew.enums.RulesetThresholdUnit;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RulesetThreshold {
    private final @Nullable RulesetThresholdType type;
    private final @Nullable RulesetThresholdUnit unit;
    private final Double value;

    @OutputCustomType.Constructor({"type","unit","value"})
    private RulesetThreshold(
        @Nullable RulesetThresholdType type,
        @Nullable RulesetThresholdUnit unit,
        Double value) {
        this.type = type;
        this.unit = unit;
        this.value = Objects.requireNonNull(value);
    }

    public Optional<RulesetThresholdType> getType() {
        return Optional.ofNullable(this.type);
    }
    public Optional<RulesetThresholdUnit> getUnit() {
        return Optional.ofNullable(this.unit);
    }
    public Double getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetThreshold defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RulesetThresholdType type;
        private @Nullable RulesetThresholdUnit unit;
        private Double value;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetThreshold defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.unit = defaults.unit;
    	      this.value = defaults.value;
        }

        public Builder setType(@Nullable RulesetThresholdType type) {
            this.type = type;
            return this;
        }

        public Builder setUnit(@Nullable RulesetThresholdUnit unit) {
            this.unit = unit;
            return this;
        }

        public Builder setValue(Double value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public RulesetThreshold build() {
            return new RulesetThreshold(type, unit, value);
        }
    }
}
