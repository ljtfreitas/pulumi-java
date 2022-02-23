// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedZonePrivateVisibilityConfigGKEClusterResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedZonePrivateVisibilityConfigGKEClusterResponse Empty = new ManagedZonePrivateVisibilityConfigGKEClusterResponse();

    /**
     * The resource name of the cluster to bind this ManagedZone to. This should be specified in the format like: projects/*{@literal /}locations/*{@literal /}clusters/*. This is referenced from GKE projects.locations.clusters.get API: https://cloud.google.com/kubernetes-engine/docs/reference/rest/v1/projects.locations.clusters/get
     * 
     */
    @InputImport(name="gkeClusterName", required=true)
      private final String gkeClusterName;

    public String getGkeClusterName() {
        return this.gkeClusterName;
    }

    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    public ManagedZonePrivateVisibilityConfigGKEClusterResponse(
        String gkeClusterName,
        String kind) {
        this.gkeClusterName = Objects.requireNonNull(gkeClusterName, "expected parameter 'gkeClusterName' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private ManagedZonePrivateVisibilityConfigGKEClusterResponse() {
        this.gkeClusterName = null;
        this.kind = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedZonePrivateVisibilityConfigGKEClusterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gkeClusterName;
        private String kind;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedZonePrivateVisibilityConfigGKEClusterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gkeClusterName = defaults.gkeClusterName;
    	      this.kind = defaults.kind;
        }

        public Builder setGkeClusterName(String gkeClusterName) {
            this.gkeClusterName = Objects.requireNonNull(gkeClusterName);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public ManagedZonePrivateVisibilityConfigGKEClusterResponse build() {
            return new ManagedZonePrivateVisibilityConfigGKEClusterResponse(gkeClusterName, kind);
        }
    }
}
