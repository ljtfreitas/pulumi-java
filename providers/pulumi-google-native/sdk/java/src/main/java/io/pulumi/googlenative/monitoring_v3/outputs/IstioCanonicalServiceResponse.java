// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class IstioCanonicalServiceResponse {
    /**
     * The name of the canonical service underlying this service. Corresponds to the destination_canonical_service_name metric label in label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    private final String canonicalService;
    /**
     * The namespace of the canonical service underlying this service. Corresponds to the destination_canonical_service_namespace metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    private final String canonicalServiceNamespace;
    /**
     * Identifier for the Istio mesh in which this canonical service is defined. Corresponds to the mesh_uid metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    private final String meshUid;

    @OutputCustomType.Constructor({"canonicalService","canonicalServiceNamespace","meshUid"})
    private IstioCanonicalServiceResponse(
        String canonicalService,
        String canonicalServiceNamespace,
        String meshUid) {
        this.canonicalService = Objects.requireNonNull(canonicalService);
        this.canonicalServiceNamespace = Objects.requireNonNull(canonicalServiceNamespace);
        this.meshUid = Objects.requireNonNull(meshUid);
    }

    /**
     * The name of the canonical service underlying this service. Corresponds to the destination_canonical_service_name metric label in label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    public String getCanonicalService() {
        return this.canonicalService;
    }
    /**
     * The namespace of the canonical service underlying this service. Corresponds to the destination_canonical_service_namespace metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    public String getCanonicalServiceNamespace() {
        return this.canonicalServiceNamespace;
    }
    /**
     * Identifier for the Istio mesh in which this canonical service is defined. Corresponds to the mesh_uid metric label in Istio metrics (https://cloud.google.com/monitoring/api/metrics_istio).
     * 
     */
    public String getMeshUid() {
        return this.meshUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IstioCanonicalServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String canonicalService;
        private String canonicalServiceNamespace;
        private String meshUid;

        public Builder() {
    	      // Empty
        }

        public Builder(IstioCanonicalServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.canonicalService = defaults.canonicalService;
    	      this.canonicalServiceNamespace = defaults.canonicalServiceNamespace;
    	      this.meshUid = defaults.meshUid;
        }

        public Builder setCanonicalService(String canonicalService) {
            this.canonicalService = Objects.requireNonNull(canonicalService);
            return this;
        }

        public Builder setCanonicalServiceNamespace(String canonicalServiceNamespace) {
            this.canonicalServiceNamespace = Objects.requireNonNull(canonicalServiceNamespace);
            return this;
        }

        public Builder setMeshUid(String meshUid) {
            this.meshUid = Objects.requireNonNull(meshUid);
            return this;
        }
        public IstioCanonicalServiceResponse build() {
            return new IstioCanonicalServiceResponse(canonicalService, canonicalServiceNamespace, meshUid);
        }
    }
}
