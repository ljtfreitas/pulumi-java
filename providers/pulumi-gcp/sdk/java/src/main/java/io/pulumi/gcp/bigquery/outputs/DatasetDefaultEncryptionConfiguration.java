// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DatasetDefaultEncryptionConfiguration {
    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination
     * BigQuery table. The BigQuery Service Account associated with your project requires
     * access to this encryption key.
     * 
     */
    private final String kmsKeyName;

    @CustomType.Constructor
    private DatasetDefaultEncryptionConfiguration(@CustomType.Parameter("kmsKeyName") String kmsKeyName) {
        this.kmsKeyName = kmsKeyName;
    }

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination
     * BigQuery table. The BigQuery Service Account associated with your project requires
     * access to this encryption key.
     * 
    */
    public String getKmsKeyName() {
        return this.kmsKeyName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDefaultEncryptionConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDefaultEncryptionConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public DatasetDefaultEncryptionConfiguration build() {
            return new DatasetDefaultEncryptionConfiguration(kmsKeyName);
        }
    }
}
