// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.VirtualNetworkPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of private link resources
 * 
 */
public final class VirtualNetworkPropertiesListArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkPropertiesListArgs Empty = new VirtualNetworkPropertiesListArgs();

    /**
     * Next page link if any.
     * 
     */
    @InputImport(name="nextLink")
        private final @Nullable Input<String> nextLink;

    public Input<String> getNextLink() {
        return this.nextLink == null ? Input.empty() : this.nextLink;
    }

    /**
     * Array of virtual networks.
     * 
     */
    @InputImport(name="value")
        private final @Nullable Input<List<VirtualNetworkPropertiesArgs>> value;

    public Input<List<VirtualNetworkPropertiesArgs>> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public VirtualNetworkPropertiesListArgs(
        @Nullable Input<String> nextLink,
        @Nullable Input<List<VirtualNetworkPropertiesArgs>> value) {
        this.nextLink = nextLink;
        this.value = value;
    }

    private VirtualNetworkPropertiesListArgs() {
        this.nextLink = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPropertiesListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> nextLink;
        private @Nullable Input<List<VirtualNetworkPropertiesArgs>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPropertiesListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nextLink = defaults.nextLink;
    	      this.value = defaults.value;
        }

        public Builder setNextLink(@Nullable Input<String> nextLink) {
            this.nextLink = nextLink;
            return this;
        }

        public Builder setNextLink(@Nullable String nextLink) {
            this.nextLink = Input.ofNullable(nextLink);
            return this;
        }

        public Builder setValue(@Nullable Input<List<VirtualNetworkPropertiesArgs>> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable List<VirtualNetworkPropertiesArgs> value) {
            this.value = Input.ofNullable(value);
            return this;
        }
        public VirtualNetworkPropertiesListArgs build() {
            return new VirtualNetworkPropertiesListArgs(nextLink, value);
        }
    }
}
