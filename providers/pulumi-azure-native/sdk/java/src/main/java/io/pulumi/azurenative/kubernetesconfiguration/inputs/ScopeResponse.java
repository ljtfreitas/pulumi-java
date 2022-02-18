// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeClusterResponse;
import io.pulumi.azurenative.kubernetesconfiguration.inputs.ScopeNamespaceResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Scope of the extensionInstance. It can be either Cluster or Namespace; but not both.
 * 
 */
public final class ScopeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ScopeResponse Empty = new ScopeResponse();

    /**
     * Specifies that the scope of the extensionInstance is Cluster
     * 
     */
    @InputImport(name="cluster")
    private final @Nullable ScopeClusterResponse cluster;

    public Optional<ScopeClusterResponse> getCluster() {
        return this.cluster == null ? Optional.empty() : Optional.ofNullable(this.cluster);
    }

    /**
     * Specifies that the scope of the extensionInstance is Namespace
     * 
     */
    @InputImport(name="namespace")
    private final @Nullable ScopeNamespaceResponse namespace;

    public Optional<ScopeNamespaceResponse> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    public ScopeResponse(
        @Nullable ScopeClusterResponse cluster,
        @Nullable ScopeNamespaceResponse namespace) {
        this.cluster = cluster;
        this.namespace = namespace;
    }

    private ScopeResponse() {
        this.cluster = null;
        this.namespace = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScopeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ScopeClusterResponse cluster;
        private @Nullable ScopeNamespaceResponse namespace;

        public Builder() {
    	      // Empty
        }

        public Builder(ScopeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cluster = defaults.cluster;
    	      this.namespace = defaults.namespace;
        }

        public Builder setCluster(@Nullable ScopeClusterResponse cluster) {
            this.cluster = cluster;
            return this;
        }

        public Builder setNamespace(@Nullable ScopeNamespaceResponse namespace) {
            this.namespace = namespace;
            return this;
        }

        public ScopeResponse build() {
            return new ScopeResponse(cluster, namespace);
        }
    }
}
