// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.athena.outputs;

import io.pulumi.aws.athena.outputs.WorkgroupConfigurationResultConfigurationEncryptionConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkgroupConfigurationResultConfiguration {
    /**
     * Configuration block with encryption settings. Documented below.
     * 
     */
    private final @Nullable WorkgroupConfigurationResultConfigurationEncryptionConfiguration encryptionConfiguration;
    /**
     * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
     * 
     */
    private final @Nullable String outputLocation;

    @CustomType.Constructor
    private WorkgroupConfigurationResultConfiguration(
        @CustomType.Parameter("encryptionConfiguration") @Nullable WorkgroupConfigurationResultConfigurationEncryptionConfiguration encryptionConfiguration,
        @CustomType.Parameter("outputLocation") @Nullable String outputLocation) {
        this.encryptionConfiguration = encryptionConfiguration;
        this.outputLocation = outputLocation;
    }

    /**
     * Configuration block with encryption settings. Documented below.
     * 
    */
    public Optional<WorkgroupConfigurationResultConfigurationEncryptionConfiguration> getEncryptionConfiguration() {
        return Optional.ofNullable(this.encryptionConfiguration);
    }
    /**
     * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
     * 
    */
    public Optional<String> getOutputLocation() {
        return Optional.ofNullable(this.outputLocation);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkgroupConfigurationResultConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkgroupConfigurationResultConfigurationEncryptionConfiguration encryptionConfiguration;
        private @Nullable String outputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkgroupConfigurationResultConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionConfiguration = defaults.encryptionConfiguration;
    	      this.outputLocation = defaults.outputLocation;
        }

        public Builder encryptionConfiguration(@Nullable WorkgroupConfigurationResultConfigurationEncryptionConfiguration encryptionConfiguration) {
            this.encryptionConfiguration = encryptionConfiguration;
            return this;
        }

        public Builder outputLocation(@Nullable String outputLocation) {
            this.outputLocation = outputLocation;
            return this;
        }
        public WorkgroupConfigurationResultConfiguration build() {
            return new WorkgroupConfigurationResultConfiguration(encryptionConfiguration, outputLocation);
        }
    }
}
