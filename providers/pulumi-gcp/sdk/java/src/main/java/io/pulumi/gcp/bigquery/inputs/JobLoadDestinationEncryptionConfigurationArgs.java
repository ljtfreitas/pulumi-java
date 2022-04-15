// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobLoadDestinationEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobLoadDestinationEncryptionConfigurationArgs Empty = new JobLoadDestinationEncryptionConfigurationArgs();

    /**
     * Describes the Cloud KMS encryption key that will be used to protect destination BigQuery table.
     * The BigQuery Service Account associated with your project requires access to this encryption key.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final Output<String> kmsKeyName;

    public Output<String> kmsKeyName() {
        return this.kmsKeyName;
    }

    /**
     * - 
     * Describes the Cloud KMS encryption key version used to protect destination BigQuery table.
     * 
     */
    @Import(name="kmsKeyVersion")
      private final @Nullable Output<String> kmsKeyVersion;

    public Output<String> kmsKeyVersion() {
        return this.kmsKeyVersion == null ? Codegen.empty() : this.kmsKeyVersion;
    }

    public JobLoadDestinationEncryptionConfigurationArgs(
        Output<String> kmsKeyName,
        @Nullable Output<String> kmsKeyVersion) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
        this.kmsKeyVersion = kmsKeyVersion;
    }

    private JobLoadDestinationEncryptionConfigurationArgs() {
        this.kmsKeyName = Codegen.empty();
        this.kmsKeyVersion = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobLoadDestinationEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeyName;
        private @Nullable Output<String> kmsKeyVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(JobLoadDestinationEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
    	      this.kmsKeyVersion = defaults.kmsKeyVersion;
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Output.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }
        public Builder kmsKeyVersion(@Nullable Output<String> kmsKeyVersion) {
            this.kmsKeyVersion = kmsKeyVersion;
            return this;
        }
        public Builder kmsKeyVersion(@Nullable String kmsKeyVersion) {
            this.kmsKeyVersion = Codegen.ofNullable(kmsKeyVersion);
            return this;
        }        public JobLoadDestinationEncryptionConfigurationArgs build() {
            return new JobLoadDestinationEncryptionConfigurationArgs(kmsKeyName, kmsKeyVersion);
        }
    }
}
