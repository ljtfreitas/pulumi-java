// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class DatasetDefaultEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetDefaultEncryptionConfigurationArgs Empty = new DatasetDefaultEncryptionConfigurationArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination
     * BigQuery table. The BigQuery Service Account associated with your project requires
     * access to this encryption key.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    public DatasetDefaultEncryptionConfigurationArgs(Output<String> kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private DatasetDefaultEncryptionConfigurationArgs() {
        this.kmsKeyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetDefaultEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetDefaultEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }

        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Output.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }
        public DatasetDefaultEncryptionConfigurationArgs build() {
            return new DatasetDefaultEncryptionConfigurationArgs(kmsKeyName);
        }
    }
}
