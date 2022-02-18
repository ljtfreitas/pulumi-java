// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.LogAnalyticsResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container group diagnostic information.
 * 
 */
public final class ContainerGroupDiagnosticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerGroupDiagnosticsResponse Empty = new ContainerGroupDiagnosticsResponse();

    /**
     * Container group log analytics information.
     * 
     */
    @InputImport(name="logAnalytics")
    private final @Nullable LogAnalyticsResponse logAnalytics;

    public Optional<LogAnalyticsResponse> getLogAnalytics() {
        return this.logAnalytics == null ? Optional.empty() : Optional.ofNullable(this.logAnalytics);
    }

    public ContainerGroupDiagnosticsResponse(@Nullable LogAnalyticsResponse logAnalytics) {
        this.logAnalytics = logAnalytics;
    }

    private ContainerGroupDiagnosticsResponse() {
        this.logAnalytics = null;
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
