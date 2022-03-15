// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.outputs.InfrastructureConfigurationS3Logs;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InfrastructureConfigurationLogging {
    private final @Nullable InfrastructureConfigurationS3Logs s3Logs;

    @CustomType.Constructor
    private InfrastructureConfigurationLogging(@CustomType.Parameter("s3Logs") @Nullable InfrastructureConfigurationS3Logs s3Logs) {
        this.s3Logs = s3Logs;
    }

    public Optional<InfrastructureConfigurationS3Logs> getS3Logs() {
        return Optional.ofNullable(this.s3Logs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InfrastructureConfigurationLogging defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable InfrastructureConfigurationS3Logs s3Logs;

        public Builder() {
    	      // Empty
        }

        public Builder(InfrastructureConfigurationLogging defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Logs = defaults.s3Logs;
        }

        public Builder s3Logs(@Nullable InfrastructureConfigurationS3Logs s3Logs) {
            this.s3Logs = s3Logs;
            return this;
        }
        public InfrastructureConfigurationLogging build() {
            return new InfrastructureConfigurationLogging(s3Logs);
        }
    }
}
