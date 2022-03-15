// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeviceFleetEdgeOutputConfig {
    /**
     * The KMS key id used for encryption on the S3 bucket
     * 
     */
    private final @Nullable String kmsKeyId;
    /**
     * The Amazon Simple Storage (S3) bucket URI
     * 
     */
    private final String s3OutputLocation;

    @CustomType.Constructor
    private DeviceFleetEdgeOutputConfig(
        @CustomType.Parameter("kmsKeyId") @Nullable String kmsKeyId,
        @CustomType.Parameter("s3OutputLocation") String s3OutputLocation) {
        this.kmsKeyId = kmsKeyId;
        this.s3OutputLocation = s3OutputLocation;
    }

    /**
     * The KMS key id used for encryption on the S3 bucket
     * 
    */
    public Optional<String> getKmsKeyId() {
        return Optional.ofNullable(this.kmsKeyId);
    }
    /**
     * The Amazon Simple Storage (S3) bucket URI
     * 
    */
    public String getS3OutputLocation() {
        return this.s3OutputLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceFleetEdgeOutputConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String kmsKeyId;
        private String s3OutputLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceFleetEdgeOutputConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyId = defaults.kmsKeyId;
    	      this.s3OutputLocation = defaults.s3OutputLocation;
        }

        public Builder kmsKeyId(@Nullable String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            return this;
        }

        public Builder s3OutputLocation(String s3OutputLocation) {
            this.s3OutputLocation = Objects.requireNonNull(s3OutputLocation);
            return this;
        }
        public DeviceFleetEdgeOutputConfig build() {
            return new DeviceFleetEdgeOutputConfig(kmsKeyId, s3OutputLocation);
        }
    }
}
