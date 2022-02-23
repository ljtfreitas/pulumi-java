// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.EtwProviderConfigurationResponse;
import io.pulumi.azurenative.insights.outputs.EventLogConfigurationResponse;
import io.pulumi.azurenative.insights.outputs.PerformanceCounterConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataSourceConfigurationResponse {
    /**
     * Windows event logs configuration.
     * 
     */
    private final @Nullable List<EventLogConfigurationResponse> eventLogs;
    /**
     * Performance counter configuration
     * 
     */
    private final @Nullable List<PerformanceCounterConfigurationResponse> perfCounters;
    /**
     * ETW providers configuration
     * 
     */
    private final @Nullable List<EtwProviderConfigurationResponse> providers;

    @OutputCustomType.Constructor({"eventLogs","perfCounters","providers"})
    private DataSourceConfigurationResponse(
        @Nullable List<EventLogConfigurationResponse> eventLogs,
        @Nullable List<PerformanceCounterConfigurationResponse> perfCounters,
        @Nullable List<EtwProviderConfigurationResponse> providers) {
        this.eventLogs = eventLogs;
        this.perfCounters = perfCounters;
        this.providers = providers;
    }

    /**
     * Windows event logs configuration.
     * 
     */
    public List<EventLogConfigurationResponse> getEventLogs() {
        return this.eventLogs == null ? List.of() : this.eventLogs;
    }
    /**
     * Performance counter configuration
     * 
     */
    public List<PerformanceCounterConfigurationResponse> getPerfCounters() {
        return this.perfCounters == null ? List.of() : this.perfCounters;
    }
    /**
     * ETW providers configuration
     * 
     */
    public List<EtwProviderConfigurationResponse> getProviders() {
        return this.providers == null ? List.of() : this.providers;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EventLogConfigurationResponse> eventLogs;
        private @Nullable List<PerformanceCounterConfigurationResponse> perfCounters;
        private @Nullable List<EtwProviderConfigurationResponse> providers;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLogs = defaults.eventLogs;
    	      this.perfCounters = defaults.perfCounters;
    	      this.providers = defaults.providers;
        }

        public Builder setEventLogs(@Nullable List<EventLogConfigurationResponse> eventLogs) {
            this.eventLogs = eventLogs;
            return this;
        }

        public Builder setPerfCounters(@Nullable List<PerformanceCounterConfigurationResponse> perfCounters) {
            this.perfCounters = perfCounters;
            return this;
        }

        public Builder setProviders(@Nullable List<EtwProviderConfigurationResponse> providers) {
            this.providers = providers;
            return this;
        }
        public DataSourceConfigurationResponse build() {
            return new DataSourceConfigurationResponse(eventLogs, perfCounters, providers);
        }
    }
}
