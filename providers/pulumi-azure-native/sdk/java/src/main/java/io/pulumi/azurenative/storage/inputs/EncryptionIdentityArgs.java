// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Encryption identity for the storage account.
 * 
 */
public final class EncryptionIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final EncryptionIdentityArgs Empty = new EncryptionIdentityArgs();

    /**
     * Resource identifier of the UserAssigned identity to be associated with server-side encryption on the storage account.
     * 
     */
    @InputImport(name="encryptionUserAssignedIdentity")
    private final @Nullable Input<String> encryptionUserAssignedIdentity;

    public Input<String> getEncryptionUserAssignedIdentity() {
        return this.encryptionUserAssignedIdentity == null ? Input.empty() : this.encryptionUserAssignedIdentity;
    }

    public EncryptionIdentityArgs(@Nullable Input<String> encryptionUserAssignedIdentity) {
        this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
    }

    private EncryptionIdentityArgs() {
        this.encryptionUserAssignedIdentity = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> encryptionUserAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptionUserAssignedIdentity = defaults.encryptionUserAssignedIdentity;
        }

        public Builder setEncryptionUserAssignedIdentity(@Nullable Input<String> encryptionUserAssignedIdentity) {
            this.encryptionUserAssignedIdentity = encryptionUserAssignedIdentity;
            return this;
        }

        public Builder setEncryptionUserAssignedIdentity(@Nullable String encryptionUserAssignedIdentity) {
            this.encryptionUserAssignedIdentity = Input.ofNullable(encryptionUserAssignedIdentity);
            return this;
        }

        public EncryptionIdentityArgs build() {
            return new EncryptionIdentityArgs(encryptionUserAssignedIdentity);
        }
    }
}
