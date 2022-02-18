// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.inputs;

import io.pulumi.azurenative.databoxedge.inputs.MountPointMapArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Kubernetes role storage resource
 * 
 */
public final class KubernetesRoleStorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final KubernetesRoleStorageArgs Empty = new KubernetesRoleStorageArgs();

    /**
     * Mount points of shares in role(s).
     * 
     */
    @InputImport(name="endpoints")
    private final @Nullable Input<List<MountPointMapArgs>> endpoints;

    public Input<List<MountPointMapArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    public KubernetesRoleStorageArgs(@Nullable Input<List<MountPointMapArgs>> endpoints) {
        this.endpoints = endpoints;
    }

    private KubernetesRoleStorageArgs() {
        this.endpoints = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesRoleStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<MountPointMapArgs>> endpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesRoleStorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoints = defaults.endpoints;
        }

        public Builder setEndpoints(@Nullable Input<List<MountPointMapArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<MountPointMapArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public KubernetesRoleStorageArgs build() {
            return new KubernetesRoleStorageArgs(endpoints);
        }
    }
}
