// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.outputs;

import io.pulumi.azurenative.containerinstance.outputs.LogAnalyticsResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ContainerGroupDiagnosticsResponse {
    /**
     * Container group log analytics information.
     * 
     */
    private final @Nullable LogAnalyticsResponse logAnalytics;

    @OutputCustomType.Constructor({"logAnalytics"})
    private ContainerGroupDiagnosticsResponse(@Nullable LogAnalyticsResponse logAnalytics) {
        this.logAnalytics = logAnalytics;
    }

    /**
     * Container group log analytics information.
     * 
     */
    public Optional<LogAnalyticsResponse> getLogAnalytics() {
        return Optional.ofNullable(this.logAnalytics);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupDiagnosticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LogAnalyticsResponse logAnalytics;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupDiagnosticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logAnalytics = defaults.logAnalytics;
        }

        public Builder setLogAnalytics(@Nullable LogAnalyticsResponse logAnalytics) {
            this.logAnalytics = logAnalytics;
            return this;
        }

        public ContainerGroupDiagnosticsResponse build() {
            return new ContainerGroupDiagnosticsResponse(logAnalytics);
        }
    }
}
