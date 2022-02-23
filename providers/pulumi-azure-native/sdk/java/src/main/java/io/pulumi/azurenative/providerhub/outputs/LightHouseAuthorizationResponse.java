// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LightHouseAuthorizationResponse {
    private final String principalId;
    private final String roleDefinitionId;

    @OutputCustomType.Constructor({"principalId","roleDefinitionId"})
    private LightHouseAuthorizationResponse(
        String principalId,
        String roleDefinitionId) {
        this.principalId = Objects.requireNonNull(principalId);
        this.roleDefinitionId = Objects.requireNonNull(roleDefinitionId);
    }

    public String getPrincipalId() {
        return this.principalId;
    }
    public String getRoleDefinitionId() {
        return this.roleDefinitionId;
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
