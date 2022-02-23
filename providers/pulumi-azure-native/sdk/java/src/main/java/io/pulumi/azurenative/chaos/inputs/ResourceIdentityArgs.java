// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.azurenative.chaos.enums.ResourceIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;


/**
 * The managed identity of a resource.
 * 
 */
public final class ResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    /**
     * String of the resource identity type.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type;
    }

    public ResourceIdentityArgs(Input<ResourceIdentityType> type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResourceIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<ResourceIdentityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ResourceIdentityType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public ResourceIdentityArgs build() {
            return new ResourceIdentityArgs(type);
        }
    }
}
