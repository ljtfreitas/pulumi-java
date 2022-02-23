// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.EtwProviderConfigurationArgs;
import io.pulumi.azurenative.insights.inputs.EventLogConfigurationArgs;
import io.pulumi.azurenative.insights.inputs.PerformanceCounterConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceConfigurationArgs Empty = new DataSourceConfigurationArgs();

    /**
     * Windows event logs configuration.
     * 
     */
    @InputImport(name="eventLogs")
        private final @Nullable Input<List<EventLogConfigurationArgs>> eventLogs;

    public Input<List<EventLogConfigurationArgs>> getEventLogs() {
        return this.eventLogs == null ? Input.empty() : this.eventLogs;
    }

    /**
     * Performance counter configuration
     * 
     */
    @InputImport(name="perfCounters")
        private final @Nullable Input<List<PerformanceCounterConfigurationArgs>> perfCounters;

    public Input<List<PerformanceCounterConfigurationArgs>> getPerfCounters() {
        return this.perfCounters == null ? Input.empty() : this.perfCounters;
    }

    /**
     * ETW providers configuration
     * 
     */
    @InputImport(name="providers")
        private final @Nullable Input<List<EtwProviderConfigurationArgs>> providers;

    public Input<List<EtwProviderConfigurationArgs>> getProviders() {
        return this.providers == null ? Input.empty() : this.providers;
    }

    public DataSourceConfigurationArgs(
        @Nullable Input<List<EventLogConfigurationArgs>> eventLogs,
        @Nullable Input<List<PerformanceCounterConfigurationArgs>> perfCounters,
        @Nullable Input<List<EtwProviderConfigurationArgs>> providers) {
        this.eventLogs = eventLogs;
        this.perfCounters = perfCounters;
        this.providers = providers;
    }

    private DataSourceConfigurationArgs() {
        this.eventLogs = Input.empty();
        this.perfCounters = Input.empty();
        this.providers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<EventLogConfigurationArgs>> eventLogs;
        private @Nullable Input<List<PerformanceCounterConfigurationArgs>> perfCounters;
        private @Nullable Input<List<EtwProviderConfigurationArgs>> providers;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventLogs = defaults.eventLogs;
    	      this.perfCounters = defaults.perfCounters;
    	      this.providers = defaults.providers;
        }

        public Builder setEventLogs(@Nullable Input<List<EventLogConfigurationArgs>> eventLogs) {
            this.eventLogs = eventLogs;
            return this;
        }

        public Builder setEventLogs(@Nullable List<EventLogConfigurationArgs> eventLogs) {
            this.eventLogs = Input.ofNullable(eventLogs);
            return this;
        }

        public Builder setPerfCounters(@Nullable Input<List<PerformanceCounterConfigurationArgs>> perfCounters) {
            this.perfCounters = perfCounters;
            return this;
        }

        public Builder setPerfCounters(@Nullable List<PerformanceCounterConfigurationArgs> perfCounters) {
            this.perfCounters = Input.ofNullable(perfCounters);
            return this;
        }

        public Builder setProviders(@Nullable Input<List<EtwProviderConfigurationArgs>> providers) {
            this.providers = providers;
            return this;
        }

        public Builder setProviders(@Nullable List<EtwProviderConfigurationArgs> providers) {
            this.providers = Input.ofNullable(providers);
            return this;
        }
        public DataSourceConfigurationArgs build() {
            return new DataSourceConfigurationArgs(eventLogs, perfCounters, providers);
        }
    }
}
