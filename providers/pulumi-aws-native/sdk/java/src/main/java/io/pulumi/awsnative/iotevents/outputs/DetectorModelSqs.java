// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelPayload;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelSqs {
    private final @Nullable DetectorModelPayload payload;
    /**
     * The URL of the SQS queue where the data is written.
     * 
     */
    private final String queueUrl;
    /**
     * Set this to `TRUE` if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set this to `FALSE`.
     * 
     */
    private final @Nullable Boolean useBase64;

    @OutputCustomType.Constructor({"payload","queueUrl","useBase64"})
    private DetectorModelSqs(
        @Nullable DetectorModelPayload payload,
        String queueUrl,
        @Nullable Boolean useBase64) {
        this.payload = payload;
        this.queueUrl = Objects.requireNonNull(queueUrl);
        this.useBase64 = useBase64;
    }

    public Optional<DetectorModelPayload> getPayload() {
        return Optional.ofNullable(this.payload);
    }
    /**
     * The URL of the SQS queue where the data is written.
     * 
     */
    public String getQueueUrl() {
        return this.queueUrl;
    }
    /**
     * Set this to `TRUE` if you want the data to be base-64 encoded before it is written to the queue. Otherwise, set this to `FALSE`.
     * 
     */
    public Optional<Boolean> getUseBase64() {
        return Optional.ofNullable(this.useBase64);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSqs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelPayload payload;
        private String queueUrl;
        private @Nullable Boolean useBase64;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSqs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.queueUrl = defaults.queueUrl;
    	      this.useBase64 = defaults.useBase64;
        }

        public Builder setPayload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public Builder setQueueUrl(String queueUrl) {
            this.queueUrl = Objects.requireNonNull(queueUrl);
            return this;
        }

        public Builder setUseBase64(@Nullable Boolean useBase64) {
            this.useBase64 = useBase64;
            return this;
        }
        public DetectorModelSqs build() {
            return new DetectorModelSqs(payload, queueUrl, useBase64);
        }
    }
}
