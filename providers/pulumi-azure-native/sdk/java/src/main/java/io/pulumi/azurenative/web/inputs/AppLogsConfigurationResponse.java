// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.LogAnalyticsConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AppLogsConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AppLogsConfigurationResponse Empty = new AppLogsConfigurationResponse();

    @InputImport(name="destination")
    private final @Nullable String destination;

    public Optional<String> getDestination() {
        return this.destination == null ? Optional.empty() : Optional.ofNullable(this.destination);
    }

    @InputImport(name="logAnalyticsConfiguration")
    private final @Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration;

    public Optional<LogAnalyticsConfigurationResponse> getLogAnalyticsConfiguration() {
        return this.logAnalyticsConfiguration == null ? Optional.empty() : Optional.ofNullable(this.logAnalyticsConfiguration);
    }

    public AppLogsConfigurationResponse(
        @Nullable String destination,
        @Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration) {
        this.destination = destination;
        this.logAnalyticsConfiguration = logAnalyticsConfiguration;
    }

    private AppLogsConfigurationResponse() {
        this.destination = null;
        this.logAnalyticsConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppLogsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String destination;
        private @Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(AppLogsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.logAnalyticsConfiguration = defaults.logAnalyticsConfiguration;
        }

        public Builder setDestination(@Nullable String destination) {
            this.destination = destination;
            return this;
        }

        public Builder setLogAnalyticsConfiguration(@Nullable LogAnalyticsConfigurationResponse logAnalyticsConfiguration) {
            this.logAnalyticsConfiguration = logAnalyticsConfiguration;
            return this;
        }

        public AppLogsConfigurationResponse build() {
            return new AppLogsConfigurationResponse(destination, logAnalyticsConfiguration);
        }
    }
}
