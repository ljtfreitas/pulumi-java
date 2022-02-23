// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedServiceIdentityResponseUserAssignedIdentities extends io.pulumi.resources.InvokeArgs {

    public static final ManagedServiceIdentityResponseUserAssignedIdentities Empty = new ManagedServiceIdentityResponseUserAssignedIdentities();

    /**
     * The client id of user assigned identity.
     * 
     */
    @InputImport(name="clientId", required=true)
        private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    /**
     * The principal id of user assigned identity.
     * 
     */
    @InputImport(name="principalId", required=true)
        private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    public ManagedServiceIdentityResponseUserAssignedIdentities(
        String clientId,
        String principalId) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private ManagedServiceIdentityResponseUserAssignedIdentities() {
        this.clientId = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponseUserAssignedIdentities defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public ManagedServiceIdentityResponseUserAssignedIdentities build() {
            return new ManagedServiceIdentityResponseUserAssignedIdentities(clientId, principalId);
        }
    }
}
