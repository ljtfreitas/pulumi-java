// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.codeguruprofiler.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProfilingGroupChannel {
    private final @Nullable String channelId;
    private final String channelUri;

    @OutputCustomType.Constructor({"channelId","channelUri"})
    private ProfilingGroupChannel(
        @Nullable String channelId,
        String channelUri) {
        this.channelId = channelId;
        this.channelUri = Objects.requireNonNull(channelUri);
    }

    public Optional<String> getChannelId() {
        return Optional.ofNullable(this.channelId);
    }
    public String getChannelUri() {
        return this.channelUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProfilingGroupChannel defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelId;
        private String channelUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ProfilingGroupChannel defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelId = defaults.channelId;
    	      this.channelUri = defaults.channelUri;
        }

        public Builder setChannelId(@Nullable String channelId) {
            this.channelId = channelId;
            return this;
        }

        public Builder setChannelUri(String channelUri) {
            this.channelUri = Objects.requireNonNull(channelUri);
            return this;
        }

        public ProfilingGroupChannel build() {
            return new ProfilingGroupChannel(channelId, channelUri);
        }
    }
}