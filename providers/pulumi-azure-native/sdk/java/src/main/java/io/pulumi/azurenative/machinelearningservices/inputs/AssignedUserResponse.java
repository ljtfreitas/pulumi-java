// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A user that can be assigned to a compute instance.
 * 
 */
public final class AssignedUserResponse extends io.pulumi.resources.InvokeArgs {

    public static final AssignedUserResponse Empty = new AssignedUserResponse();

    /**
     * User’s AAD Object Id.
     * 
     */
    @InputImport(name="objectId", required=true)
        private final String objectId;

    public String getObjectId() {
        return this.objectId;
    }

    /**
     * User’s AAD Tenant Id.
     * 
     */
    @InputImport(name="tenantId", required=true)
        private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    public AssignedUserResponse(
        String objectId,
        String tenantId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private AssignedUserResponse() {
        this.objectId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssignedUserResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(AssignedUserResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public AssignedUserResponse build() {
            return new AssignedUserResponse(objectId, tenantId);
        }
    }
}
