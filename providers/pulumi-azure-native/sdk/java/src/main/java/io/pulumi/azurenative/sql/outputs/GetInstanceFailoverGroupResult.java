// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.InstanceFailoverGroupReadOnlyEndpointResponse;
import io.pulumi.azurenative.sql.outputs.InstanceFailoverGroupReadWriteEndpointResponse;
import io.pulumi.azurenative.sql.outputs.ManagedInstancePairInfoResponse;
import io.pulumi.azurenative.sql.outputs.PartnerRegionInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInstanceFailoverGroupResult {
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * List of managed instance pairs in the failover group.
     * 
     */
    private final List<ManagedInstancePairInfoResponse> managedInstancePairs;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Partner region information for the failover group.
     * 
     */
    private final List<PartnerRegionInfoResponse> partnerRegions;
    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    private final @Nullable InstanceFailoverGroupReadOnlyEndpointResponse readOnlyEndpoint;
    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    private final InstanceFailoverGroupReadWriteEndpointResponse readWriteEndpoint;
    /**
     * Local replication role of the failover group instance.
     * 
     */
    private final String replicationRole;
    /**
     * Replication state of the failover group instance.
     * 
     */
    private final String replicationState;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","managedInstancePairs","name","partnerRegions","readOnlyEndpoint","readWriteEndpoint","replicationRole","replicationState","type"})
    private GetInstanceFailoverGroupResult(
        String id,
        List<ManagedInstancePairInfoResponse> managedInstancePairs,
        String name,
        List<PartnerRegionInfoResponse> partnerRegions,
        @Nullable InstanceFailoverGroupReadOnlyEndpointResponse readOnlyEndpoint,
        InstanceFailoverGroupReadWriteEndpointResponse readWriteEndpoint,
        String replicationRole,
        String replicationState,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.managedInstancePairs = Objects.requireNonNull(managedInstancePairs);
        this.name = Objects.requireNonNull(name);
        this.partnerRegions = Objects.requireNonNull(partnerRegions);
        this.readOnlyEndpoint = readOnlyEndpoint;
        this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint);
        this.replicationRole = Objects.requireNonNull(replicationRole);
        this.replicationState = Objects.requireNonNull(replicationState);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * List of managed instance pairs in the failover group.
     * 
     */
    public List<ManagedInstancePairInfoResponse> getManagedInstancePairs() {
        return this.managedInstancePairs;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Partner region information for the failover group.
     * 
     */
    public List<PartnerRegionInfoResponse> getPartnerRegions() {
        return this.partnerRegions;
    }
    /**
     * Read-only endpoint of the failover group instance.
     * 
     */
    public Optional<InstanceFailoverGroupReadOnlyEndpointResponse> getReadOnlyEndpoint() {
        return Optional.ofNullable(this.readOnlyEndpoint);
    }
    /**
     * Read-write endpoint of the failover group instance.
     * 
     */
    public InstanceFailoverGroupReadWriteEndpointResponse getReadWriteEndpoint() {
        return this.readWriteEndpoint;
    }
    /**
     * Local replication role of the failover group instance.
     * 
     */
    public String getReplicationRole() {
        return this.replicationRole;
    }
    /**
     * Replication state of the failover group instance.
     * 
     */
    public String getReplicationState() {
        return this.replicationState;
    }
    /**
     * Resource type.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceFailoverGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<ManagedInstancePairInfoResponse> managedInstancePairs;
        private String name;
        private List<PartnerRegionInfoResponse> partnerRegions;
        private @Nullable InstanceFailoverGroupReadOnlyEndpointResponse readOnlyEndpoint;
        private InstanceFailoverGroupReadWriteEndpointResponse readWriteEndpoint;
        private String replicationRole;
        private String replicationState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceFailoverGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.managedInstancePairs = defaults.managedInstancePairs;
    	      this.name = defaults.name;
    	      this.partnerRegions = defaults.partnerRegions;
    	      this.readOnlyEndpoint = defaults.readOnlyEndpoint;
    	      this.readWriteEndpoint = defaults.readWriteEndpoint;
    	      this.replicationRole = defaults.replicationRole;
    	      this.replicationState = defaults.replicationState;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setManagedInstancePairs(List<ManagedInstancePairInfoResponse> managedInstancePairs) {
            this.managedInstancePairs = Objects.requireNonNull(managedInstancePairs);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPartnerRegions(List<PartnerRegionInfoResponse> partnerRegions) {
            this.partnerRegions = Objects.requireNonNull(partnerRegions);
            return this;
        }

        public Builder setReadOnlyEndpoint(@Nullable InstanceFailoverGroupReadOnlyEndpointResponse readOnlyEndpoint) {
            this.readOnlyEndpoint = readOnlyEndpoint;
            return this;
        }

        public Builder setReadWriteEndpoint(InstanceFailoverGroupReadWriteEndpointResponse readWriteEndpoint) {
            this.readWriteEndpoint = Objects.requireNonNull(readWriteEndpoint);
            return this;
        }

        public Builder setReplicationRole(String replicationRole) {
            this.replicationRole = Objects.requireNonNull(replicationRole);
            return this;
        }

        public Builder setReplicationState(String replicationState) {
            this.replicationState = Objects.requireNonNull(replicationState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetInstanceFailoverGroupResult build() {
            return new GetInstanceFailoverGroupResult(id, managedInstancePairs, name, partnerRegions, readOnlyEndpoint, readWriteEndpoint, replicationRole, replicationState, type);
        }
    }
}
