// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.KubernetesRoleComputeResponse;
import io.pulumi.azurenative.databoxedge.outputs.KubernetesRoleNetworkResponse;
import io.pulumi.azurenative.databoxedge.outputs.KubernetesRoleStorageResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KubernetesRoleResourcesResponse {
    /**
     * Kubernetes role compute resource
     * 
     */
    private final KubernetesRoleComputeResponse compute;
    /**
     * Kubernetes role network resource
     * 
     */
    private final KubernetesRoleNetworkResponse network;
    /**
     * Kubernetes role storage resource
     * 
     */
    private final @Nullable KubernetesRoleStorageResponse storage;

    @OutputCustomType.Constructor({"compute","network","storage"})
    private KubernetesRoleResourcesResponse(
        KubernetesRoleComputeResponse compute,
        KubernetesRoleNetworkResponse network,
        @Nullable KubernetesRoleStorageResponse storage) {
        this.compute = Objects.requireNonNull(compute);
        this.network = Objects.requireNonNull(network);
        this.storage = storage;
    }

    /**
     * Kubernetes role compute resource
     * 
     */
    public KubernetesRoleComputeResponse getCompute() {
        return this.compute;
    }
    /**
     * Kubernetes role network resource
     * 
     */
    public KubernetesRoleNetworkResponse getNetwork() {
        return this.network;
    }
    /**
     * Kubernetes role storage resource
     * 
     */
    public Optional<KubernetesRoleStorageResponse> getStorage() {
        return Optional.ofNullable(this.storage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleResourcesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesRoleComputeResponse compute;
        private KubernetesRoleNetworkResponse network;
        private @Nullable KubernetesRoleStorageResponse storage;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleResourcesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compute = defaults.compute;
    	      this.network = defaults.network;
    	      this.storage = defaults.storage;
        }

        public Builder setCompute(KubernetesRoleComputeResponse compute) {
            this.compute = Objects.requireNonNull(compute);
            return this;
        }

        public Builder setNetwork(KubernetesRoleNetworkResponse network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setStorage(@Nullable KubernetesRoleStorageResponse storage) {
            this.storage = storage;
            return this;
        }

        public KubernetesRoleResourcesResponse build() {
            return new KubernetesRoleResourcesResponse(compute, network, storage);
        }
    }
}
