// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotanalytics.outputs;

import io.pulumi.awsnative.iotanalytics.outputs.ChannelRetentionPeriod;
import io.pulumi.awsnative.iotanalytics.outputs.ChannelStorage;
import io.pulumi.awsnative.iotanalytics.outputs.ChannelTag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetChannelResult {
    private final @Nullable ChannelStorage channelStorage;
    private final @Nullable String id;
    private final @Nullable ChannelRetentionPeriod retentionPeriod;
    private final @Nullable List<ChannelTag> tags;

    @CustomType.Constructor
    private GetChannelResult(
        @CustomType.Parameter("channelStorage") @Nullable ChannelStorage channelStorage,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("retentionPeriod") @Nullable ChannelRetentionPeriod retentionPeriod,
        @CustomType.Parameter("tags") @Nullable List<ChannelTag> tags) {
        this.channelStorage = channelStorage;
        this.id = id;
        this.retentionPeriod = retentionPeriod;
        this.tags = tags;
    }

    public Optional<ChannelStorage> getChannelStorage() {
        return Optional.ofNullable(this.channelStorage);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<ChannelRetentionPeriod> getRetentionPeriod() {
        return Optional.ofNullable(this.retentionPeriod);
    }
    public List<ChannelTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ChannelStorage channelStorage;
        private @Nullable String id;
        private @Nullable ChannelRetentionPeriod retentionPeriod;
        private @Nullable List<ChannelTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelStorage = defaults.channelStorage;
    	      this.id = defaults.id;
    	      this.retentionPeriod = defaults.retentionPeriod;
    	      this.tags = defaults.tags;
        }

        public Builder channelStorage(@Nullable ChannelStorage channelStorage) {
            this.channelStorage = channelStorage;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder retentionPeriod(@Nullable ChannelRetentionPeriod retentionPeriod) {
            this.retentionPeriod = retentionPeriod;
            return this;
        }

        public Builder tags(@Nullable List<ChannelTag> tags) {
            this.tags = tags;
            return this;
        }
        public GetChannelResult build() {
            return new GetChannelResult(channelStorage, id, retentionPeriod, tags);
        }
    }
}
