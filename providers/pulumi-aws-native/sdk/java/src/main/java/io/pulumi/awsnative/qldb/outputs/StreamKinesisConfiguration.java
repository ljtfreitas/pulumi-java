// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.qldb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StreamKinesisConfiguration {
    private final @Nullable Boolean aggregationEnabled;
    private final @Nullable String streamArn;

    @CustomType.Constructor
    private StreamKinesisConfiguration(
        @CustomType.Parameter("aggregationEnabled") @Nullable Boolean aggregationEnabled,
        @CustomType.Parameter("streamArn") @Nullable String streamArn) {
        this.aggregationEnabled = aggregationEnabled;
        this.streamArn = streamArn;
    }

    public Optional<Boolean> getAggregationEnabled() {
        return Optional.ofNullable(this.aggregationEnabled);
    }
    public Optional<String> getStreamArn() {
        return Optional.ofNullable(this.streamArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamKinesisConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean aggregationEnabled;
        private @Nullable String streamArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamKinesisConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationEnabled = defaults.aggregationEnabled;
    	      this.streamArn = defaults.streamArn;
        }

        public Builder aggregationEnabled(@Nullable Boolean aggregationEnabled) {
            this.aggregationEnabled = aggregationEnabled;
            return this;
        }

        public Builder streamArn(@Nullable String streamArn) {
            this.streamArn = streamArn;
            return this;
        }
        public StreamKinesisConfiguration build() {
            return new StreamKinesisConfiguration(aggregationEnabled, streamArn);
        }
    }
}
