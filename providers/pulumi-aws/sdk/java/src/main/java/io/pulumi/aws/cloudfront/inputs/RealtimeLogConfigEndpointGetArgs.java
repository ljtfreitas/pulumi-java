// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.RealtimeLogConfigEndpointKinesisStreamConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RealtimeLogConfigEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RealtimeLogConfigEndpointGetArgs Empty = new RealtimeLogConfigEndpointGetArgs();

    /**
     * The Amazon Kinesis data stream configuration.
     * 
     */
    @Import(name="kinesisStreamConfig", required=true)
      private final Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig;

    public Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> getKinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    /**
     * The type of data stream where real-time log data is sent. The only valid value is `Kinesis`.
     * 
     */
    @Import(name="streamType", required=true)
      private final Output<String> streamType;

    public Output<String> getStreamType() {
        return this.streamType;
    }

    public RealtimeLogConfigEndpointGetArgs(
        Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig,
        Output<String> streamType) {
        this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig, "expected parameter 'kinesisStreamConfig' to be non-null");
        this.streamType = Objects.requireNonNull(streamType, "expected parameter 'streamType' to be non-null");
    }

    private RealtimeLogConfigEndpointGetArgs() {
        this.kinesisStreamConfig = Output.empty();
        this.streamType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RealtimeLogConfigEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig;
        private Output<String> streamType;

        public Builder() {
    	      // Empty
        }

        public Builder(RealtimeLogConfigEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kinesisStreamConfig = defaults.kinesisStreamConfig;
    	      this.streamType = defaults.streamType;
        }

        public Builder kinesisStreamConfig(Output<RealtimeLogConfigEndpointKinesisStreamConfigGetArgs> kinesisStreamConfig) {
            this.kinesisStreamConfig = Objects.requireNonNull(kinesisStreamConfig);
            return this;
        }

        public Builder kinesisStreamConfig(RealtimeLogConfigEndpointKinesisStreamConfigGetArgs kinesisStreamConfig) {
            this.kinesisStreamConfig = Output.of(Objects.requireNonNull(kinesisStreamConfig));
            return this;
        }

        public Builder streamType(Output<String> streamType) {
            this.streamType = Objects.requireNonNull(streamType);
            return this;
        }

        public Builder streamType(String streamType) {
            this.streamType = Output.of(Objects.requireNonNull(streamType));
            return this;
        }
        public RealtimeLogConfigEndpointGetArgs build() {
            return new RealtimeLogConfigEndpointGetArgs(kinesisStreamConfig, streamType);
        }
    }
}
