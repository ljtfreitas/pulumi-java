// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MyWorkbookUserAssignedIdentitiesResponse {
    /**
     * The principal ID of resource identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant ID of resource.
     * 
     */
    private final String tenantId;

    @OutputCustomType.Constructor({"principalId","tenantId"})
    private MyWorkbookUserAssignedIdentitiesResponse(
        String principalId,
        String tenantId) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
    }

    /**
     * The principal ID of resource identity.
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant ID of resource.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MyWorkbookUserAssignedIdentitiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(MyWorkbookUserAssignedIdentitiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public MyWorkbookUserAssignedIdentitiesResponse build() {
            return new MyWorkbookUserAssignedIdentitiesResponse(principalId, tenantId);
        }
    }
}
