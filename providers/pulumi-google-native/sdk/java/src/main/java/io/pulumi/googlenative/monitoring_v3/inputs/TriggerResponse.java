// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * Specifies how many time series must fail a predicate to trigger a condition. If not specified, then a {count: 1} trigger is used.
 * 
 */
public final class TriggerResponse extends io.pulumi.resources.InvokeArgs {

    public static final TriggerResponse Empty = new TriggerResponse();

    /**
     * The absolute number of time series that must fail the predicate for the condition to be triggered.
     * 
     */
    @Import(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * The percentage of time series that must fail the predicate for the condition to be triggered.
     * 
     */
    @Import(name="percent", required=true)
      private final Double percent;

    public Double getPercent() {
        return this.percent;
    }

    public TriggerResponse(
        Integer count,
        Double percent) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.percent = Objects.requireNonNull(percent, "expected parameter 'percent' to be non-null");
    }

    private TriggerResponse() {
        this.count = null;
        this.percent = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private Double percent;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.percent = defaults.percent;
        }

        public Builder count(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder percent(Double percent) {
            this.percent = Objects.requireNonNull(percent);
            return this;
        }
        public TriggerResponse build() {
            return new TriggerResponse(count, percent);
        }
    }
}
