// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterControlPlaneReplicaPlacementGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneReplicaPlacementGetArgs Empty = new AzureClusterControlPlaneReplicaPlacementGetArgs();

    /**
     * For a given replica, the Azure availability zone where to provision the control plane VM and the ETCD disk.
     * 
     */
    @Import(name="azureAvailabilityZone", required=true)
      private final Output<String> azureAvailabilityZone;

    public Output<String> azureAvailabilityZone() {
        return this.azureAvailabilityZone;
    }

    /**
     * For a given replica, the ARM ID of the subnet where the control plane VM is deployed. Make sure it's a subnet under the virtual network in the cluster configuration.
     * 
     */
    @Import(name="subnetId", required=true)
      private final Output<String> subnetId;

    public Output<String> subnetId() {
        return this.subnetId;
    }

    public AzureClusterControlPlaneReplicaPlacementGetArgs(
        Output<String> azureAvailabilityZone,
        Output<String> subnetId) {
        this.azureAvailabilityZone = Objects.requireNonNull(azureAvailabilityZone, "expected parameter 'azureAvailabilityZone' to be non-null");
        this.subnetId = Objects.requireNonNull(subnetId, "expected parameter 'subnetId' to be non-null");
    }

    private AzureClusterControlPlaneReplicaPlacementGetArgs() {
        this.azureAvailabilityZone = Codegen.empty();
        this.subnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneReplicaPlacementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> azureAvailabilityZone;
        private Output<String> subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneReplicaPlacementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureAvailabilityZone = defaults.azureAvailabilityZone;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder azureAvailabilityZone(Output<String> azureAvailabilityZone) {
            this.azureAvailabilityZone = Objects.requireNonNull(azureAvailabilityZone);
            return this;
        }
        public Builder azureAvailabilityZone(String azureAvailabilityZone) {
            this.azureAvailabilityZone = Output.of(Objects.requireNonNull(azureAvailabilityZone));
            return this;
        }
        public Builder subnetId(Output<String> subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Output.of(Objects.requireNonNull(subnetId));
            return this;
        }        public AzureClusterControlPlaneReplicaPlacementGetArgs build() {
            return new AzureClusterControlPlaneReplicaPlacementGetArgs(azureAvailabilityZone, subnetId);
        }
    }
}
