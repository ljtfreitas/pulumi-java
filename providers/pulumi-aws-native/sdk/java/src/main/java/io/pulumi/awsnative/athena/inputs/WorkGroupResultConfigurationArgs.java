// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.inputs;

import io.pulumi.awsnative.athena.inputs.WorkGroupEncryptionConfigurationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The location in Amazon S3 where query results are stored and the encryption option, if any, used for query results. These are known as "client-side settings". If workgroup settings override client-side settings, then the query uses the workgroup settings.
 * 
 */
public final class WorkGroupResultConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkGroupResultConfigurationArgs Empty = new WorkGroupResultConfigurationArgs();

    @Import(name="encryptionConfiguration")
      private final @Nullable Output<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration;

    public Output<WorkGroupEncryptionConfigurationArgs> getEncryptionConfiguration() {
        return this.encryptionConfiguration == null ? Output.empty() : this.encryptionConfiguration;
    }

    @Import(name="outputLocation")
      private final @Nullable Output<String> outputLocation;

    public Output<String> getOutputLocation() {
        return this.outputLocation == null ? Output.empty() : this.outputLocation;
    }

    public WorkGroupResultConfigurationArgs(
        @Nullable Output<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration,
        @Nullable Output<String> outputLocation) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.outputLocation = outputLocation;
    }

    private WorkGroupResultConfigurationArgs() {
        this.encryptionConfiguration = Output.empty();
        this.outputLocation = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupResultConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration;
        private @Nullable Output<String> outputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupResultConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.outputLocation = defaults.outputLocation;
        }

        public Builder encryptionConfiguration(@Nullable Output<WorkGroupEncryptionConfigurationArgs> encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder encryptionConfiguration(@Nullable WorkGroupEncryptionConfigurationArgs encryptionConfiguration) {
            this.encryptionConfiguration = Output.ofNullable(encryptionConfiguration);
            return this;
        }

        public Builder outputLocation(@Nullable Output<String> outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }

        public Builder outputLocation(@Nullable String outputLocation) {
            this.outputLocation = Output.ofNullable(outputLocation);
            return this;
        }
        public WorkGroupResultConfigurationArgs build() {
            return new WorkGroupResultConfigurationArgs(encryptionConfiguration, outputLocation);
        }
    }
}
