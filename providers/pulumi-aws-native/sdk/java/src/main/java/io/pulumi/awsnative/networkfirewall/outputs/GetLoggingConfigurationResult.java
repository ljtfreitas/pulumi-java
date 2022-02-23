// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.LoggingConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLoggingConfigurationResult {
    private final @Nullable LoggingConfiguration loggingConfiguration;

    @OutputCustomType.Constructor({"loggingConfiguration"})
    private GetLoggingConfigurationResult(@Nullable LoggingConfiguration loggingConfiguration) {
        this.loggingConfiguration = loggingConfiguration;
    }

    public Optional<LoggingConfiguration> getLoggingConfiguration() {
        return Optional.ofNullable(this.loggingConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggingConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable LoggingConfiguration loggingConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoggingConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggingConfiguration = defaults.loggingConfiguration;
        }

        public Builder setLoggingConfiguration(@Nullable LoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }
        public GetLoggingConfigurationResult build() {
            return new GetLoggingConfigurationResult(loggingConfiguration);
        }
    }
}
