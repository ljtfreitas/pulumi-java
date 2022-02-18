// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.MetricCounterSetResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Metric configuration.
 * 
 */
public final class MetricConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final MetricConfigurationResponse Empty = new MetricConfigurationResponse();

    /**
     * Host name for the IoT hub associated to the device.
     * 
     */
    @InputImport(name="counterSets", required=true)
    private final List<MetricCounterSetResponse> counterSets;

    public List<MetricCounterSetResponse> getCounterSets() {
        return this.counterSets;
    }

    /**
     * The MDM account to which the counters should be pushed.
     * 
     */
    @InputImport(name="mdmAccount")
    private final @Nullable String mdmAccount;

    public Optional<String> getMdmAccount() {
        return this.mdmAccount == null ? Optional.empty() : Optional.ofNullable(this.mdmAccount);
    }

    /**
     * The MDM namespace to which the counters should be pushed. This is required if MDMAccount is specified
     * 
     */
    @InputImport(name="metricNameSpace")
    private final @Nullable String metricNameSpace;

    public Optional<String> getMetricNameSpace() {
        return this.metricNameSpace == null ? Optional.empty() : Optional.ofNullable(this.metricNameSpace);
    }

    /**
     * The Resource ID on which the metrics should be pushed.
     * 
     */
    @InputImport(name="resourceId", required=true)
    private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    public MetricConfigurationResponse(
        List<MetricCounterSetResponse> counterSets,
        @Nullable String mdmAccount,
        @Nullable String metricNameSpace,
        String resourceId) {
        this.counterSets = Objects.requireNonNull(counterSets, "expected parameter 'counterSets' to be non-null");
        this.mdmAccount = mdmAccount;
        this.metricNameSpace = metricNameSpace;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private MetricConfigurationResponse() {
        this.counterSets = List.of();
        this.mdmAccount = null;
        this.metricNameSpace = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MetricConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<MetricCounterSetResponse> counterSets;
        private @Nullable String mdmAccount;
        private @Nullable String metricNameSpace;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(MetricConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.counterSets = defaults.counterSets;
    	      this.mdmAccount = defaults.mdmAccount;
    	      this.metricNameSpace = defaults.metricNameSpace;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setCounterSets(List<MetricCounterSetResponse> counterSets) {
            this.counterSets = Objects.requireNonNull(counterSets);
            return this;
        }

        public Builder setMdmAccount(@Nullable String mdmAccount) {
            this.mdmAccount = mdmAccount;
            return this;
        }

        public Builder setMetricNameSpace(@Nullable String metricNameSpace) {
            this.metricNameSpace = metricNameSpace;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public MetricConfigurationResponse build() {
            return new MetricConfigurationResponse(counterSets, mdmAccount, metricNameSpace, resourceId);
        }
    }
}
