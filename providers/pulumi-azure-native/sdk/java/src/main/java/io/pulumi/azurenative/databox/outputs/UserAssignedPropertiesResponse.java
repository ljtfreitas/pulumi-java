// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class UserAssignedPropertiesResponse {
    /**
     * Arm resource id for user assigned identity to be used to fetch MSI token.
     * 
     */
    private final @Nullable String resourceId;

    @OutputCustomType.Constructor({"resourceId"})
    private UserAssignedPropertiesResponse(@Nullable String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * Arm resource id for user assigned identity to be used to fetch MSI token.
     * 
     */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public UserAssignedPropertiesResponse build() {
            return new UserAssignedPropertiesResponse(resourceId);
        }
    }
}
