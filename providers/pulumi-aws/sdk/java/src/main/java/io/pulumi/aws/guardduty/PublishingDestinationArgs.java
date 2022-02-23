// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublishingDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublishingDestinationArgs Empty = new PublishingDestinationArgs();

    /**
     * The bucket arn and prefix under which the findings get exported. Bucket-ARN is required, the prefix is optional and will be `AWSLogs/[Account-ID]/GuardDuty/[Region]/` if not provided
     * 
     */
    @InputImport(name="destinationArn", required=true)
    private final Input<String> destinationArn;

    public Input<String> getDestinationArn() {
        return this.destinationArn;
    }

    /**
     * Currently there is only "S3" available as destination type which is also the default value
     * 
     */
    @InputImport(name="destinationType")
    private final @Nullable Input<String> destinationType;

    public Input<String> getDestinationType() {
        return this.destinationType == null ? Input.empty() : this.destinationType;
    }

    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @InputImport(name="detectorId", required=true)
    private final Input<String> detectorId;

    public Input<String> getDetectorId() {
        return this.detectorId;
    }

    /**
     * The ARN of the KMS key used to encrypt GuardDuty findings. GuardDuty enforces this to be encrypted.
     * 
     */
    @InputImport(name="kmsKeyArn", required=true)
    private final Input<String> kmsKeyArn;

    public Input<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public PublishingDestinationArgs(
        Input<String> destinationArn,
        @Nullable Input<String> destinationType,
        Input<String> detectorId,
        Input<String> kmsKeyArn) {
        this.destinationArn = Objects.requireNonNull(destinationArn, "expected parameter 'destinationArn' to be non-null");
        this.destinationType = destinationType;
        this.detectorId = Objects.requireNonNull(detectorId, "expected parameter 'detectorId' to be non-null");
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn, "expected parameter 'kmsKeyArn' to be non-null");
    }

    private PublishingDestinationArgs() {
        this.destinationArn = Input.empty();
        this.destinationType = Input.empty();
        this.detectorId = Input.empty();
        this.kmsKeyArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublishingDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> destinationArn;
        private @Nullable Input<String> destinationType;
        private Input<String> detectorId;
        private Input<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(PublishingDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationArn = defaults.destinationArn;
    	      this.destinationType = defaults.destinationType;
    	      this.detectorId = defaults.detectorId;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder setDestinationArn(Input<String> destinationArn) {
            this.destinationArn = Objects.requireNonNull(destinationArn);
            return this;
        }

        public Builder setDestinationArn(String destinationArn) {
            this.destinationArn = Input.of(Objects.requireNonNull(destinationArn));
            return this;
        }

        public Builder setDestinationType(@Nullable Input<String> destinationType) {
            this.destinationType = destinationType;
            return this;
        }

        public Builder setDestinationType(@Nullable String destinationType) {
            this.destinationType = Input.ofNullable(destinationType);
            return this;
        }

        public Builder setDetectorId(Input<String> detectorId) {
            this.detectorId = Objects.requireNonNull(detectorId);
            return this;
        }

        public Builder setDetectorId(String detectorId) {
            this.detectorId = Input.of(Objects.requireNonNull(detectorId));
            return this;
        }

        public Builder setKmsKeyArn(Input<String> kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }

        public Builder setKmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Input.of(Objects.requireNonNull(kmsKeyArn));
            return this;
        }
        public PublishingDestinationArgs build() {
            return new PublishingDestinationArgs(destinationArn, destinationType, detectorId, kmsKeyArn);
        }
    }
}
