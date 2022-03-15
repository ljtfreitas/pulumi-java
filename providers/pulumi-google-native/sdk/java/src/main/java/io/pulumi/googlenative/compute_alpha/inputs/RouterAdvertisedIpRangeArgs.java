// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description-tagged IP ranges for the router to advertise.
 * 
 */
public final class RouterAdvertisedIpRangeArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterAdvertisedIpRangeArgs Empty = new RouterAdvertisedIpRangeArgs();

    /**
     * User-specified description for the IP range.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<String> range;

    public Output<String> getRange() {
        return this.range == null ? Output.empty() : this.range;
    }

    public RouterAdvertisedIpRangeArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> range) {
        this.description = description;
        this.range = range;
    }

    private RouterAdvertisedIpRangeArgs() {
        this.description = Output.empty();
        this.range = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterAdvertisedIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterAdvertisedIpRangeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder range(@Nullable Output<String> range) {
            this.range = range;
            return this;
        }

        public Builder range(@Nullable String range) {
            this.range = Output.ofNullable(range);
            return this;
        }
        public RouterAdvertisedIpRangeArgs build() {
            return new RouterAdvertisedIpRangeArgs(description, range);
        }
    }
}
