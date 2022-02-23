// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoindexer.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The media services details
 * 
 */
public final class MediaServicesForPutRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final MediaServicesForPutRequestArgs Empty = new MediaServicesForPutRequestArgs();

    /**
     * The media services resource id
     * 
     */
    @InputImport(name="resourceId")
        private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    /**
     * The user assigned identity to be used to grant permissions
     * 
     */
    @InputImport(name="userAssignedIdentity")
        private final @Nullable Input<String> userAssignedIdentity;

    public Input<String> getUserAssignedIdentity() {
        return this.userAssignedIdentity == null ? Input.empty() : this.userAssignedIdentity;
    }

    public MediaServicesForPutRequestArgs(
        @Nullable Input<String> resourceId,
        @Nullable Input<String> userAssignedIdentity) {
        this.resourceId = resourceId;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private MediaServicesForPutRequestArgs() {
        this.resourceId = Input.empty();
        this.userAssignedIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaServicesForPutRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceId;
        private @Nullable Input<String> userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaServicesForPutRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public Builder setUserAssignedIdentity(@Nullable Input<String> userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        public Builder setUserAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = Input.ofNullable(userAssignedIdentity);
            return this;
        }
        public MediaServicesForPutRequestArgs build() {
            return new MediaServicesForPutRequestArgs(resourceId, userAssignedIdentity);
        }
    }
}
