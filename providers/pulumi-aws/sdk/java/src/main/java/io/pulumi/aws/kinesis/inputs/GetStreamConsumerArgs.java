// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetStreamConsumerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStreamConsumerArgs Empty = new GetStreamConsumerArgs();

    /**
     * Amazon Resource Name (ARN) of the stream consumer.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable String arn;

    public Optional<String> getArn() {
        return this.arn == null ? Optional.empty() : Optional.ofNullable(this.arn);
    }

    /**
     * Name of the stream consumer.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Amazon Resource Name (ARN) of the data stream the consumer is registered with.
     * 
     */
    @InputImport(name="streamArn", required=true)
    private final String streamArn;

    public String getStreamArn() {
        return this.streamArn;
    }

    public GetStreamConsumerArgs(
        @Nullable String arn,
        @Nullable String name,
        String streamArn) {
        this.arn = arn;
        this.name = name;
        this.streamArn = Objects.requireNonNull(streamArn, "expected parameter 'streamArn' to be non-null");
    }

    private GetStreamConsumerArgs() {
        this.arn = null;
        this.name = null;
        this.streamArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamConsumerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        private String streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamConsumerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStreamArn(String streamArn) {
            this.streamArn = Objects.requireNonNull(streamArn);
            return this;
        }
        public GetStreamConsumerArgs build() {
            return new GetStreamConsumerArgs(arn, name, streamArn);
        }
    }
}
