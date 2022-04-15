// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs Empty = new TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs();

    /**
     * AWS Key ID.
     * 
     */
    @Import(name="accessKeyId", required=true)
      private final Output<String> accessKeyId;

    public Output<String> accessKeyId() {
        return this.accessKeyId;
    }

    /**
     * AWS Secret Access Key.
     * 
     */
    @Import(name="secretAccessKey", required=true)
      private final Output<String> secretAccessKey;

    public Output<String> secretAccessKey() {
        return this.secretAccessKey;
    }

    public TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs(
        Output<String> accessKeyId,
        Output<String> secretAccessKey) {
        this.accessKeyId = Objects.requireNonNull(accessKeyId, "expected parameter 'accessKeyId' to be non-null");
        this.secretAccessKey = Objects.requireNonNull(secretAccessKey, "expected parameter 'secretAccessKey' to be non-null");
    }

    private TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs() {
        this.accessKeyId = Codegen.empty();
        this.secretAccessKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accessKeyId;
        private Output<String> secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder accessKeyId(Output<String> accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = Output.of(Objects.requireNonNull(accessKeyId));
            return this;
        }
        public Builder secretAccessKey(Output<String> secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }
        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Output.of(Objects.requireNonNull(secretAccessKey));
            return this;
        }        public TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs build() {
            return new TransferJobTransferSpecAwsS3DataSourceAwsAccessKeyGetArgs(accessKeyId, secretAccessKey);
        }
    }
}
