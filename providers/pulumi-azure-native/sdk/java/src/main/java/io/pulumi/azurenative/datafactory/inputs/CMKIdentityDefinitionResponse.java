// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed Identity used for CMK.
 * 
 */
public final class CMKIdentityDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final CMKIdentityDefinitionResponse Empty = new CMKIdentityDefinitionResponse();

    /**
     * The resource id of the user assigned identity to authenticate to customer's key vault.
     * 
     */
    @InputImport(name="userAssignedIdentity")
        private final @Nullable String userAssignedIdentity;

    public Optional<String> getUserAssignedIdentity() {
        return this.userAssignedIdentity == null ? Optional.empty() : Optional.ofNullable(this.userAssignedIdentity);
    }

    public CMKIdentityDefinitionResponse(@Nullable String userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private CMKIdentityDefinitionResponse() {
        this.userAssignedIdentity = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CMKIdentityDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(CMKIdentityDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder setUserAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }
        public CMKIdentityDefinitionResponse build() {
            return new CMKIdentityDefinitionResponse(userAssignedIdentity);
        }
    }
}
