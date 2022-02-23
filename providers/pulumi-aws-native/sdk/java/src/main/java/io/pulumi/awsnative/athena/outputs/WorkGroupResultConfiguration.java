// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.outputs;

import io.pulumi.awsnative.athena.outputs.WorkGroupEncryptionConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WorkGroupResultConfiguration {
    private final @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration;
    private final @Nullable String outputLocation;

    @OutputCustomType.Constructor({"encryptionConfiguration","outputLocation"})
    private WorkGroupResultConfiguration(
        @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration,
        @Nullable String outputLocation) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.outputLocation = outputLocation;
    }

    public Optional<WorkGroupEncryptionConfiguration> getEncryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }
    public Optional<String> getOutputLocation() {
        return Optional.ofNullable(this.outputLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupResultConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration;
        private @Nullable String outputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupResultConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.outputLocation = defaults.outputLocation;
        }

        public Builder setEncryptionConfiguration(@Nullable WorkGroupEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setOutputLocation(@Nullable String outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }
        public WorkGroupResultConfiguration build() {
            return new WorkGroupResultConfiguration(encryptionConfiguration, outputLocation);
        }
    }
}
