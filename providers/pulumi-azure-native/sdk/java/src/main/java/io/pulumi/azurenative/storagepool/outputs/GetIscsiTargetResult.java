// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagepool.outputs;

import io.pulumi.azurenative.storagepool.outputs.TargetPortalGroupResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetIscsiTargetResult {
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * State of the operation on the resource.
     * 
     */
    private final String provisioningState;
    /**
     * Operational status of the iSCSI target.
     * 
     */
    private final String status;
    /**
     * iSCSI target IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:server".
     * 
     */
    private final String targetIqn;
    /**
     * List of iSCSI target portal groups. Can have 1 portal group at most.
     * 
     */
    private final List<TargetPortalGroupResponse> tpgs;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","name","provisioningState","status","targetIqn","tpgs","type"})
    private GetIscsiTargetResult(
        String id,
        String name,
        String provisioningState,
        String status,
        String targetIqn,
        List<TargetPortalGroupResponse> tpgs,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.status = Objects.requireNonNull(status);
        this.targetIqn = Objects.requireNonNull(targetIqn);
        this.tpgs = Objects.requireNonNull(tpgs);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * State of the operation on the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Operational status of the iSCSI target.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * iSCSI target IQN (iSCSI Qualified Name); example: "iqn.2005-03.org.iscsi:server".
     * 
     */
    public String getTargetIqn() {
        return this.targetIqn;
    }
    /**
     * List of iSCSI target portal groups. Can have 1 portal group at most.
     * 
     */
    public List<TargetPortalGroupResponse> getTpgs() {
        return this.tpgs;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIscsiTargetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String provisioningState;
        private String status;
        private String targetIqn;
        private List<TargetPortalGroupResponse> tpgs;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIscsiTargetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.status = defaults.status;
    	      this.targetIqn = defaults.targetIqn;
    	      this.tpgs = defaults.tpgs;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTargetIqn(String targetIqn) {
            this.targetIqn = Objects.requireNonNull(targetIqn);
            return this;
        }

        public Builder setTpgs(List<TargetPortalGroupResponse> tpgs) {
            this.tpgs = Objects.requireNonNull(tpgs);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetIscsiTargetResult build() {
            return new GetIscsiTargetResult(id, name, provisioningState, status, targetIqn, tpgs, type);
        }
    }
}
