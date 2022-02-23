// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Represents the health policy used to evaluate the health of services belonging to a service type.
 * 
 */
public final class ArmServiceTypeHealthPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArmServiceTypeHealthPolicyResponse Empty = new ArmServiceTypeHealthPolicyResponse();

    /**
     * The maximum percentage of partitions per service allowed to be unhealthy before your application is considered in error.
     * 
     */
    @InputImport(name="maxPercentUnhealthyPartitionsPerService")
        private final @Nullable Integer maxPercentUnhealthyPartitionsPerService;

    public Optional<Integer> getMaxPercentUnhealthyPartitionsPerService() {
        return this.maxPercentUnhealthyPartitionsPerService == null ? Optional.empty() : Optional.ofNullable(this.maxPercentUnhealthyPartitionsPerService);
    }

    /**
     * The maximum percentage of replicas per partition allowed to be unhealthy before your application is considered in error.
     * 
     */
    @InputImport(name="maxPercentUnhealthyReplicasPerPartition")
        private final @Nullable Integer maxPercentUnhealthyReplicasPerPartition;

    public Optional<Integer> getMaxPercentUnhealthyReplicasPerPartition() {
        return this.maxPercentUnhealthyReplicasPerPartition == null ? Optional.empty() : Optional.ofNullable(this.maxPercentUnhealthyReplicasPerPartition);
    }

    /**
     * The maximum percentage of services allowed to be unhealthy before your application is considered in error.
     * 
     */
    @InputImport(name="maxPercentUnhealthyServices")
        private final @Nullable Integer maxPercentUnhealthyServices;

    public Optional<Integer> getMaxPercentUnhealthyServices() {
        return this.maxPercentUnhealthyServices == null ? Optional.empty() : Optional.ofNullable(this.maxPercentUnhealthyServices);
    }

    public ArmServiceTypeHealthPolicyResponse(
        @Nullable Integer maxPercentUnhealthyPartitionsPerService,
        @Nullable Integer maxPercentUnhealthyReplicasPerPartition,
        @Nullable Integer maxPercentUnhealthyServices) {
        this.maxPercentUnhealthyPartitionsPerService = maxPercentUnhealthyPartitionsPerService == null ? 0 : maxPercentUnhealthyPartitionsPerService;
        this.maxPercentUnhealthyReplicasPerPartition = maxPercentUnhealthyReplicasPerPartition == null ? 0 : maxPercentUnhealthyReplicasPerPartition;
        this.maxPercentUnhealthyServices = maxPercentUnhealthyServices == null ? 0 : maxPercentUnhealthyServices;
    }

    private ArmServiceTypeHealthPolicyResponse() {
        this.maxPercentUnhealthyPartitionsPerService = null;
        this.maxPercentUnhealthyReplicasPerPartition = null;
        this.maxPercentUnhealthyServices = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArmServiceTypeHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxPercentUnhealthyPartitionsPerService;
        private @Nullable Integer maxPercentUnhealthyReplicasPerPartition;
        private @Nullable Integer maxPercentUnhealthyServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ArmServiceTypeHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxPercentUnhealthyPartitionsPerService = defaults.maxPercentUnhealthyPartitionsPerService;
    	      this.maxPercentUnhealthyReplicasPerPartition = defaults.maxPercentUnhealthyReplicasPerPartition;
    	      this.maxPercentUnhealthyServices = defaults.maxPercentUnhealthyServices;
        }

        public Builder setMaxPercentUnhealthyPartitionsPerService(@Nullable Integer maxPercentUnhealthyPartitionsPerService) {
            this.maxPercentUnhealthyPartitionsPerService = maxPercentUnhealthyPartitionsPerService;
            return this;
        }

        public Builder setMaxPercentUnhealthyReplicasPerPartition(@Nullable Integer maxPercentUnhealthyReplicasPerPartition) {
            this.maxPercentUnhealthyReplicasPerPartition = maxPercentUnhealthyReplicasPerPartition;
            return this;
        }

        public Builder setMaxPercentUnhealthyServices(@Nullable Integer maxPercentUnhealthyServices) {
            this.maxPercentUnhealthyServices = maxPercentUnhealthyServices;
            return this;
        }
        public ArmServiceTypeHealthPolicyResponse build() {
            return new ArmServiceTypeHealthPolicyResponse(maxPercentUnhealthyPartitionsPerService, maxPercentUnhealthyReplicasPerPartition, maxPercentUnhealthyServices);
        }
    }
}
