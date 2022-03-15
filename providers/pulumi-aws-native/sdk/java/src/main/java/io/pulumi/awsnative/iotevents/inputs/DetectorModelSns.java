// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.inputs;

import io.pulumi.awsnative.iotevents.inputs.DetectorModelPayload;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Information required to publish the Amazon SNS message.
 * 
 */
public final class DetectorModelSns extends io.pulumi.resources.InvokeArgs {

    public static final DetectorModelSns Empty = new DetectorModelSns();

    @Import(name="payload")
      private final @Nullable DetectorModelPayload payload;

    public Optional<DetectorModelPayload> getPayload() {
        return this.payload == null ? Optional.empty() : Optional.ofNullable(this.payload);
    }

    /**
     * The ARN of the Amazon SNS target where the message is sent.
     * 
     */
    @Import(name="targetArn", required=true)
      private final String targetArn;

    public String getTargetArn() {
        return this.targetArn;
    }

    public DetectorModelSns(
        @Nullable DetectorModelPayload payload,
        String targetArn) {
        this.payload = payload;
        this.targetArn = Objects.requireNonNull(targetArn, "expected parameter 'targetArn' to be non-null");
    }

    private DetectorModelSns() {
        this.payload = null;
        this.targetArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelSns defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DetectorModelPayload payload;
        private String targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelSns defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payload = defaults.payload;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder payload(@Nullable DetectorModelPayload payload) {
            this.payload = payload;
            return this;
        }

        public Builder targetArn(String targetArn) {
            this.targetArn = Objects.requireNonNull(targetArn);
            return this;
        }
        public DetectorModelSns build() {
            return new DetectorModelSns(payload, targetArn);
        }
    }
}
