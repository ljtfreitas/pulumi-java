// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterPeerAdvertisedIpRangeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterPeerAdvertisedIpRangeGetArgs Empty = new RouterPeerAdvertisedIpRangeGetArgs();

    /**
     * User-specified description for the IP range.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The IP range to advertise. The value must be a
     * CIDR-formatted string.
     * 
     */
    @InputImport(name="range", required=true)
        private final Input<String> range;

    public Input<String> getRange() {
        return this.range;
    }

    public RouterPeerAdvertisedIpRangeGetArgs(
        @Nullable Input<String> description,
        Input<String> range) {
        this.description = description;
        this.range = Objects.requireNonNull(range, "expected parameter 'range' to be non-null");
    }

    private RouterPeerAdvertisedIpRangeGetArgs() {
        this.description = Input.empty();
        this.range = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterPeerAdvertisedIpRangeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> range;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterPeerAdvertisedIpRangeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.range = defaults.range;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setRange(Input<String> range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder setRange(String range) {
            this.range = Input.of(Objects.requireNonNull(range));
            return this;
        }
        public RouterPeerAdvertisedIpRangeGetArgs build() {
            return new RouterPeerAdvertisedIpRangeGetArgs(description, range);
        }
    }
}
