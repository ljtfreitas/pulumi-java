// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeliveryStreamAmazonopensearchserviceBufferingHints {
    private final @Nullable Integer intervalInSeconds;
    private final @Nullable Integer sizeInMBs;

    @CustomType.Constructor
    private DeliveryStreamAmazonopensearchserviceBufferingHints(
        @CustomType.Parameter("intervalInSeconds") @Nullable Integer intervalInSeconds,
        @CustomType.Parameter("sizeInMBs") @Nullable Integer sizeInMBs) {
        this.intervalInSeconds = intervalInSeconds;
        this.sizeInMBs = sizeInMBs;
    }

    public Optional<Integer> getIntervalInSeconds() {
        return Optional.ofNullable(this.intervalInSeconds);
    }
    public Optional<Integer> getSizeInMBs() {
        return Optional.ofNullable(this.sizeInMBs);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamAmazonopensearchserviceBufferingHints defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer intervalInSeconds;
        private @Nullable Integer sizeInMBs;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamAmazonopensearchserviceBufferingHints defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.intervalInSeconds = defaults.intervalInSeconds;
    	      this.sizeInMBs = defaults.sizeInMBs;
        }

        public Builder intervalInSeconds(@Nullable Integer intervalInSeconds) {
            this.intervalInSeconds = intervalInSeconds;
            return this;
        }

        public Builder sizeInMBs(@Nullable Integer sizeInMBs) {
            this.sizeInMBs = sizeInMBs;
            return this;
        }
        public DeliveryStreamAmazonopensearchserviceBufferingHints build() {
            return new DeliveryStreamAmazonopensearchserviceBufferingHints(intervalInSeconds, sizeInMBs);
        }
    }
}
