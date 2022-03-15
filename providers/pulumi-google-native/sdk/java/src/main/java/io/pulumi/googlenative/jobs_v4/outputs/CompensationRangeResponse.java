// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.jobs_v4.outputs.MoneyResponse;
import java.util.Objects;

@CustomType
public final class CompensationRangeResponse {
    /**
     * The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
     */
    private final MoneyResponse maxCompensation;
    /**
     * The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
     */
    private final MoneyResponse minCompensation;

    @CustomType.Constructor
    private CompensationRangeResponse(
        @CustomType.Parameter("maxCompensation") MoneyResponse maxCompensation,
        @CustomType.Parameter("minCompensation") MoneyResponse minCompensation) {
        this.maxCompensation = maxCompensation;
        this.minCompensation = minCompensation;
    }

    /**
     * The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation.
     * 
    */
    public MoneyResponse getMaxCompensation() {
        return this.maxCompensation;
    }
    /**
     * The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation.
     * 
    */
    public MoneyResponse getMinCompensation() {
        return this.minCompensation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CompensationRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MoneyResponse maxCompensation;
        private MoneyResponse minCompensation;

        public Builder() {
    	      // Empty
        }

        public Builder(CompensationRangeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxCompensation = defaults.maxCompensation;
    	      this.minCompensation = defaults.minCompensation;
        }

        public Builder maxCompensation(MoneyResponse maxCompensation) {
            this.maxCompensation = Objects.requireNonNull(maxCompensation);
            return this;
        }

        public Builder minCompensation(MoneyResponse minCompensation) {
            this.minCompensation = Objects.requireNonNull(minCompensation);
            return this;
        }
        public CompensationRangeResponse build() {
            return new CompensationRangeResponse(maxCompensation, minCompensation);
        }
    }
}
