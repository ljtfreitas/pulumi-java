// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class StreamStreamModeDetails {
    /**
     * Specifies the capacity mode of the stream. Must be either `PROVISIONED` or `ON_DEMAND`.
     * 
     */
    private final String streamMode;

    @CustomType.Constructor
    private StreamStreamModeDetails(@CustomType.Parameter("streamMode") String streamMode) {
        this.streamMode = streamMode;
    }

    /**
     * Specifies the capacity mode of the stream. Must be either `PROVISIONED` or `ON_DEMAND`.
     * 
    */
    public String getStreamMode() {
        return this.streamMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamStreamModeDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String streamMode;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamStreamModeDetails defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.streamMode = defaults.streamMode;
        }

        public Builder streamMode(String streamMode) {
            this.streamMode = Objects.requireNonNull(streamMode);
            return this;
        }
        public StreamStreamModeDetails build() {
            return new StreamStreamModeDetails(streamMode);
        }
    }
}
