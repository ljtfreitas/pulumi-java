// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.awsnative.athena.inputs.WorkGroupEncryptionConfiguration;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The result configuration information about the queries in this workgroup that will be updated. Includes the updated results location and an updated option for encrypting query results.
 * 
 */
public final class WorkGroupResultConfigurationUpdates extends io.pulumi.resources.InvokeArgs {

    public static final WorkGroupResultConfigurationUpdates Empty = new WorkGroupResultConfigurationUpdates();

    @InputImport(name="encryptionConfiguration")
        private final @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration;

    public Optional<WorkGroupEncryptionConfiguration> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.encryptionConfiguration);
    }

    @InputImport(name="outputLocation")
        private final @Nullable String outputLocation;

    public Optional<String> getOutputLocation() {
        return this.outputLocation == null ? Optional.empty() : Optional.ofNullable(this.outputLocation);
    }

    @InputImport(name="removeEncryptionConfiguration")
        private final @Nullable Boolean removeEncryptionConfiguration;

    public Optional<Boolean> getRemoveEncryptionConfiguration() {
        return this.removeEncryptionConfiguration == null ? Optional.empty() : Optional.ofNullable(this.removeEncryptionConfiguration);
    }

    @InputImport(name="removeOutputLocation")
        private final @Nullable Boolean removeOutputLocation;

    public Optional<Boolean> getRemoveOutputLocation() {
        return this.removeOutputLocation == null ? Optional.empty() : Optional.ofNullable(this.removeOutputLocation);
    }

    public WorkGroupResultConfigurationUpdates(
        @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration,
        @Nullable String outputLocation,
        @Nullable Boolean removeEncryptionConfiguration,
        @Nullable Boolean removeOutputLocation) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.outputLocation = outputLocation;
        this.removeEncryptionConfiguration = removeEncryptionConfiguration;
        this.removeOutputLocation = removeOutputLocation;
    }

    private WorkGroupResultConfigurationUpdates() {
        this.encryptionConfiguration = null;
        this.outputLocation = null;
        this.removeEncryptionConfiguration = null;
        this.removeOutputLocation = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupResultConfigurationUpdates defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkGroupEncryptionConfiguration encryptionConfiguration;
        private @Nullable String outputLocation;
        private @Nullable Boolean removeEncryptionConfiguration;
        private @Nullable Boolean removeOutputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupResultConfigurationUpdates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.outputLocation = defaults.outputLocation;
    	      this.removeEncryptionConfiguration = defaults.removeEncryptionConfiguration;
    	      this.removeOutputLocation = defaults.removeOutputLocation;
        }

        public Builder setEncryptionConfiguration(@Nullable WorkGroupEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder setOutputLocation(@Nullable String outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        public Builder setRemoveEncryptionConfiguration(@Nullable Boolean removeEncryptionConfiguration) {
            this.removeEncryptionConfiguration = removeEncryptionConfiguration;
            return this;
        }

        public Builder setRemoveOutputLocation(@Nullable Boolean removeOutputLocation) {
            this.removeOutputLocation = removeOutputLocation;
            return this;
        }
        public WorkGroupResultConfigurationUpdates build() {
            return new WorkGroupResultConfigurationUpdates(encryptionConfiguration, outputLocation, removeEncryptionConfiguration, removeOutputLocation);
        }
    }
}
