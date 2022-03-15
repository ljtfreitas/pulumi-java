// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.MetricCounterResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MetricCounterSetResponse {
    /**
     * The counters that should be collected in this set.
     * 
     */
    private final List<MetricCounterResponse> counters;

    @CustomType.Constructor
    private MetricCounterSetResponse(@CustomType.Parameter("counters") List<MetricCounterResponse> counters) {
        this.counters = counters;
    }

    /**
     * The counters that should be collected in this set.
     * 
    */
    public List<MetricCounterResponse> getCounters() {
        return this.counters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricCounterSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetricCounterResponse> counters;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricCounterSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counters = defaults.counters;
        }

        public Builder counters(List<MetricCounterResponse> counters) {
            this.counters = Objects.requireNonNull(counters);
            return this;
        }
        public MetricCounterSetResponse build() {
            return new MetricCounterSetResponse(counters);
        }
    }
}
