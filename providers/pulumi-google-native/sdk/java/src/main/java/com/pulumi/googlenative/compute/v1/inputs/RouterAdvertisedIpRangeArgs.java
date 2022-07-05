// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Description-tagged IP ranges for the router to advertise.
 * 
 */
public final class RouterAdvertisedIpRangeArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterAdvertisedIpRangeArgs Empty = new RouterAdvertisedIpRangeArgs();

    /**
     * User-specified description for the IP range.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return User-specified description for the IP range.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    @Import(name="range")
    private @Nullable Output<String> range;

    /**
     * @return The IP range to advertise. The value must be a CIDR-formatted string.
     * 
     */
    public Optional<Output<String>> range() {
        return Optional.ofNullable(this.range);
    }

    private RouterAdvertisedIpRangeArgs() {}

    private RouterAdvertisedIpRangeArgs(RouterAdvertisedIpRangeArgs $) {
        this.description = $.description;
        this.range = $.range;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterAdvertisedIpRangeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterAdvertisedIpRangeArgs $;

        public Builder() {
            $ = new RouterAdvertisedIpRangeArgs();
        }

        public Builder(RouterAdvertisedIpRangeArgs defaults) {
            $ = new RouterAdvertisedIpRangeArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description User-specified description for the IP range.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description User-specified description for the IP range.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param range The IP range to advertise. The value must be a CIDR-formatted string.
         * 
         * @return builder
         * 
         */
        public Builder range(@Nullable Output<String> range) {
            $.range = range;
            return this;
        }

        /**
         * @param range The IP range to advertise. The value must be a CIDR-formatted string.
         * 
         * @return builder
         * 
         */
        public Builder range(String range) {
            return range(Output.of(range));
        }

        public RouterAdvertisedIpRangeArgs build() {
            return $;
        }
    }

}
