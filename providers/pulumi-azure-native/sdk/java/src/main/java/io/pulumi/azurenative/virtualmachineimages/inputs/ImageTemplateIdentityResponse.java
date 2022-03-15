// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.virtualmachineimages.inputs;

import io.pulumi.azurenative.virtualmachineimages.inputs.ImageTemplateIdentityResponseUserAssignedIdentities;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Identity for the image template.
 * 
 */
public final class ImageTemplateIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageTemplateIdentityResponse Empty = new ImageTemplateIdentityResponse();

    /**
     * The type of identity used for the image template. The type 'None' will remove any identities from the image template.
     * 
     */
    @Import(name="type")
      private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The list of user identities associated with the image template. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    @Import(name="userAssignedIdentities")
      private final @Nullable Map<String,ImageTemplateIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    public Map<String,ImageTemplateIdentityResponseUserAssignedIdentities> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public ImageTemplateIdentityResponse(
        @Nullable String type,
        @Nullable Map<String,ImageTemplateIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ImageTemplateIdentityResponse() {
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageTemplateIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable Map<String,ImageTemplateIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageTemplateIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder userAssignedIdentities(@Nullable Map<String,ImageTemplateIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }
        public ImageTemplateIdentityResponse build() {
            return new ImageTemplateIdentityResponse(type, userAssignedIdentities);
        }
    }
}
