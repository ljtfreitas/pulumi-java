// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TransferJobTransferSpecAwsS3DataSourceAwsAccessKey {
    /**
     * AWS Key ID.
     * 
     */
    private final String accessKeyId;
    /**
     * AWS Secret Access Key.
     * 
     */
    private final String secretAccessKey;

    @CustomType.Constructor
    private TransferJobTransferSpecAwsS3DataSourceAwsAccessKey(
        @CustomType.Parameter("accessKeyId") String accessKeyId,
        @CustomType.Parameter("secretAccessKey") String secretAccessKey) {
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
    }

    /**
     * AWS Key ID.
     * 
    */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }
    /**
     * AWS Secret Access Key.
     * 
    */
    public String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKey defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accessKeyId;
        private String secretAccessKey;

        public Builder() {
    	      // Empty
        }

        public Builder(TransferJobTransferSpecAwsS3DataSourceAwsAccessKey defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessKeyId = defaults.accessKeyId;
    	      this.secretAccessKey = defaults.secretAccessKey;
        }

        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = Objects.requireNonNull(accessKeyId);
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = Objects.requireNonNull(secretAccessKey);
            return this;
        }
        public TransferJobTransferSpecAwsS3DataSourceAwsAccessKey build() {
            return new TransferJobTransferSpecAwsS3DataSourceAwsAccessKey(accessKeyId, secretAccessKey);
        }
    }
}
