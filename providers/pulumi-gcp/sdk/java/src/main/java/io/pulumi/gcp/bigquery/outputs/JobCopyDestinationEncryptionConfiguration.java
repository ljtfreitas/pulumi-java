// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobCopyDestinationEncryptionConfiguration {
    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table.
     * The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    private final String kmsKeyName;
    /**
     * - 
     * Describes the Cloud KMS encryption key version used to protect destination BigQuery table.
     * 
     */
    private final @Nullable String kmsKeyVersion;

    @CustomType.Constructor
    private JobCopyDestinationEncryptionConfiguration(
        @CustomType.Parameter("kmsKeyName") String kmsKeyName,
        @CustomType.Parameter("kmsKeyVersion") @Nullable String kmsKeyVersion) {
        this.kmsKeyName = kmsKeyName;
        this.kmsKeyVersion = kmsKeyVersion;
    }

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table.
     * The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }
    /**
     * - 
     * Describes the Cloud KMS encryption key version used to protect destination BigQuery table.
     * 
    */
    public Optional<String> getKmsKeyVersion() {
        return Optional.ofNullable(this.kmsKeyVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCopyDestinationEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;
        private @Nullable String kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCopyDestinationEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder kmsKeyVersion(@Nullable String kmsKeyVersion) {
            this.kmsKeyVersion = kmsKeyVersion;
            return this;
        }
        public JobCopyDestinationEncryptionConfiguration build() {
            return new JobCopyDestinationEncryptionConfiguration(kmsKeyName, kmsKeyVersion);
        }
    }
}
