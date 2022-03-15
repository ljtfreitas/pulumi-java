// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetDisasterRecoveryConfigResult {
    /**
     * Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    private final @Nullable String alternateName;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
     */
    private final @Nullable String partnerNamespace;
    /**
     * Number of entities pending to be replicated.
     * 
     */
    private final Double pendingReplicationOperationsCount;
    /**
     * Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
     */
    private final String provisioningState;
    /**
     * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
     */
    private final String role;
    /**
     * Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetDisasterRecoveryConfigResult(
        @CustomType.Parameter("alternateName") @Nullable String alternateName,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("partnerNamespace") @Nullable String partnerNamespace,
        @CustomType.Parameter("pendingReplicationOperationsCount") Double pendingReplicationOperationsCount,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("type") String type) {
        this.alternateName = alternateName;
        this.id = id;
        this.name = name;
        this.partnerNamespace = partnerNamespace;
        this.pendingReplicationOperationsCount = pendingReplicationOperationsCount;
        this.provisioningState = provisioningState;
        this.role = role;
        this.type = type;
    }

    /**
     * Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
    */
    public Optional<String> getAlternateName() {
        return Optional.ofNullable(this.alternateName);
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * ARM Id of the Primary/Secondary eventhub namespace name, which is part of GEO DR pairing
     * 
    */
    public Optional<String> getPartnerNamespace() {
        return Optional.ofNullable(this.partnerNamespace);
    }
    /**
     * Number of entities pending to be replicated.
     * 
    */
    public Double getPendingReplicationOperationsCount() {
        return this.pendingReplicationOperationsCount;
    }
    /**
     * Provisioning state of the Alias(Disaster Recovery configuration) - possible values 'Accepted' or 'Succeeded' or 'Failed'
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * role of namespace in GEO DR - possible values 'Primary' or 'PrimaryNotReplicating' or 'Secondary'
     * 
    */
    public String getRole() {
        return this.role;
    }
    /**
     * Resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDisasterRecoveryConfigResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String alternateName;
        private String id;
        private String name;
        private @Nullable String partnerNamespace;
        private Double pendingReplicationOperationsCount;
        private String provisioningState;
        private String role;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDisasterRecoveryConfigResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alternateName = defaults.alternateName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.partnerNamespace = defaults.partnerNamespace;
    	      this.pendingReplicationOperationsCount = defaults.pendingReplicationOperationsCount;
    	      this.provisioningState = defaults.provisioningState;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
        }

        public Builder alternateName(@Nullable String alternateName) {
            this.alternateName = alternateName;
            return this;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder partnerNamespace(@Nullable String partnerNamespace) {
            this.partnerNamespace = partnerNamespace;
            return this;
        }

        public Builder pendingReplicationOperationsCount(Double pendingReplicationOperationsCount) {
            this.pendingReplicationOperationsCount = Objects.requireNonNull(pendingReplicationOperationsCount);
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetDisasterRecoveryConfigResult build() {
            return new GetDisasterRecoveryConfigResult(alternateName, id, name, partnerNamespace, pendingReplicationOperationsCount, provisioningState, role, type);
        }
    }
}
