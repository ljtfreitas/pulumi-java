// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.LimitRangeItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class LimitRangeSpec {
    /**
     * Limits is the list of LimitRangeItem objects that are enforced.
     * 
     */
    private final List<LimitRangeItem> limits;

    @CustomType.Constructor
    private LimitRangeSpec(@CustomType.Parameter("limits") List<LimitRangeItem> limits) {
        this.limits = limits;
    }

    /**
     * Limits is the list of LimitRangeItem objects that are enforced.
     * 
    */
    public List<LimitRangeItem> getLimits() {
        return this.limits;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LimitRangeSpec defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<LimitRangeItem> limits;

        public Builder() {
    	      // Empty
        }

        public Builder(LimitRangeSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limits = defaults.limits;
        }

        public Builder limits(List<LimitRangeItem> limits) {
            this.limits = Objects.requireNonNull(limits);
            return this;
        }
        public LimitRangeSpec build() {
            return new LimitRangeSpec(limits);
        }
    }
}
