// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StreamConsumerArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamConsumerArgs Empty = new StreamConsumerArgs();

    /**
     * Name of the stream consumer.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    @InputImport(name="streamArn", required=true)
    private final Input<String> streamArn;

    public Input<String> getStreamArn() {
        return this.streamArn;
    }

    public StreamConsumerArgs(
        @Nullable Input<String> name,
        Input<String> streamArn) {
        this.name = name;
        this.streamArn = Objects.requireNonNull(streamArn, "expected parameter 'streamArn' to be non-null");
    }

    private StreamConsumerArgs() {
        this.name = Input.empty();
        this.streamArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private Input<String> streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamConsumerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setStreamArn(Input<String> streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }

        public Builder setStreamArn(String streamArn) {
            this.streamArn = Input.of(Objects.requireNonNull(streamArn));
            return this;
        }
        public StreamConsumerArgs build() {
            return new StreamConsumerArgs(name, streamArn);
        }
    }
}
