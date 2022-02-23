// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LinkedWorkspacePropsResponse {
    /**
     * ResourceId of the link target of the linked workspace.
     * 
     */
    private final @Nullable String linkedWorkspaceResourceId;
    /**
     * ResourceId of the user assigned identity for the linked workspace.
     * 
     */
    private final @Nullable String userAssignedIdentityResourceId;

    @OutputCustomType.Constructor({"linkedWorkspaceResourceId","userAssignedIdentityResourceId"})
    private LinkedWorkspacePropsResponse(
        @Nullable String linkedWorkspaceResourceId,
        @Nullable String userAssignedIdentityResourceId) {
        this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
        this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
    }

    /**
     * ResourceId of the link target of the linked workspace.
     * 
     */
    public Optional<String> getLinkedWorkspaceResourceId() {
        return Optional.ofNullable(this.linkedWorkspaceResourceId);
    }
    /**
     * ResourceId of the user assigned identity for the linked workspace.
     * 
     */
    public Optional<String> getUserAssignedIdentityResourceId() {
        return Optional.ofNullable(this.userAssignedIdentityResourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedWorkspacePropsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String linkedWorkspaceResourceId;
        private @Nullable String userAssignedIdentityResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedWorkspacePropsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linkedWorkspaceResourceId = defaults.linkedWorkspaceResourceId;
    	      this.userAssignedIdentityResourceId = defaults.userAssignedIdentityResourceId;
        }

        public Builder setLinkedWorkspaceResourceId(@Nullable String linkedWorkspaceResourceId) {
            this.linkedWorkspaceResourceId = linkedWorkspaceResourceId;
            return this;
        }

        public Builder setUserAssignedIdentityResourceId(@Nullable String userAssignedIdentityResourceId) {
            this.userAssignedIdentityResourceId = userAssignedIdentityResourceId;
            return this;
        }
        public LinkedWorkspacePropsResponse build() {
            return new LinkedWorkspacePropsResponse(linkedWorkspaceResourceId, userAssignedIdentityResourceId);
        }
    }
}
