// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class LightHouseAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final LightHouseAuthorizationResponse Empty = new LightHouseAuthorizationResponse();

    @InputImport(name="principalId", required=true)
        private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    @InputImport(name="roleDefinitionId", required=true)
        private final String roleDefinitionId;

    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
    }

    public LightHouseAuthorizationResponse(
        String principalId,
        String roleDefinitionId) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId, "expected parameter 'roleDefinitionId' to be non-null");
    }

    private LightHouseAuthorizationResponse() {
        this.principalId = null;
        this.roleDefinitionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LightHouseAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String roleDefinitionId;

        public Builder() {
    	      // Empty
        }

        public Builder(LightHouseAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.roleDefinitionId = defaults.roleDefinitionId;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setRoleDefinitionId(String roleDefinitionId) {
            this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
            return this;
        }
        public LightHouseAuthorizationResponse build() {
            return new LightHouseAuthorizationResponse(principalId, roleDefinitionId);
        }
    }
}
