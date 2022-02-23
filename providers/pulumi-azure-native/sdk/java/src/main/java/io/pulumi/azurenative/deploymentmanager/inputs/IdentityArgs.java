// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The list of identities.
     * 
     */
    @InputImport(name="identityIds", required=true)
        private final Input<List<String>> identityIds;

    public Input<List<String>> getIdentityIds() {
        return this.identityIds;
    }

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type", required=true)
        private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public IdentityArgs(
        Input<List<String>> identityIds,
        Input<String> type) {
        this.identityIds = Objects.requireNonNull(identityIds, "expected parameter 'identityIds' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IdentityArgs() {
        this.identityIds = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> identityIds;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityIds = defaults.identityIds;
    	      this.type = defaults.type;
        }

        public Builder setIdentityIds(Input<List<String>> identityIds) {
            this.identityIds = Objects.requireNonNull(identityIds);
            return this;
        }

        public Builder setIdentityIds(List<String> identityIds) {
            this.identityIds = Input.of(Objects.requireNonNull(identityIds));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public IdentityArgs build() {
            return new IdentityArgs(identityIds, type);
        }
    }
}
