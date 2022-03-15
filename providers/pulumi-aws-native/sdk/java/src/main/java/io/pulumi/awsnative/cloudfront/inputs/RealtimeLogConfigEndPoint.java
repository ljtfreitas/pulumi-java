// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.awsnative.cloudfront.inputs.RealtimeLogConfigKinesisStreamConfig;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigEndPoint extends io.pulumi.resources.InvokeArgs {

    public static final RealtimeLogConfigEndPoint Empty = new RealtimeLogConfigEndPoint();

    @Import(name="kinesisStreamConfig", required=true)
      private final RealtimeLogConfigKinesisStreamConfig kinesisStreamConfig;

    public RealtimeLogConfigKinesisStreamConfig getKinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    @Import(name="streamType", required=true)
      private final String streamType;

    public String getStreamType() {
        return this.streamType;
    }

    public RealtimeLogConfigEndPoint(
        RealtimeLogConfigKinesisStreamConfig kinesisStreamConfig,
        String streamType) {
        this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig, "expected parameter 'kinesisStreamConfig' to be non-null");
        this.streamType = Objects.requireNonNull(streamType, "expected parameter 'streamType' to be non-null");
    }

    private RealtimeLogConfigEndPoint() {
        this.kinesisStreamConfig = null;
        this.streamType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigEndPoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RealtimeLogConfigKinesisStreamConfig kinesisStreamConfig;
        private String streamType;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigEndPoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamConfig = defaults.kinesisStreamConfig;
    	      this.streamType = defaults.streamType;
        }

        public Builder kinesisStreamConfig(RealtimeLogConfigKinesisStreamConfig kinesisStreamConfig) {
            this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig);
            return this;
        }

        public Builder streamType(String streamType) {
            this.streamType = Objects.requireNonNull(streamType);
            return this;
        }
        public RealtimeLogConfigEndPoint build() {
            return new RealtimeLogConfigEndPoint(kinesisStreamConfig, streamType);
        }
    }
}
