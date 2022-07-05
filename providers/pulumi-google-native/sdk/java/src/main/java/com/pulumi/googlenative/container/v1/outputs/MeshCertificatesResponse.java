// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class MeshCertificatesResponse {
    /**
     * @return enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    private final Boolean enableCertificates;

    @CustomType.Constructor
    private MeshCertificatesResponse(@CustomType.Parameter("enableCertificates") Boolean enableCertificates) {
        this.enableCertificates = enableCertificates;
    }

    /**
     * @return enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    public Boolean enableCertificates() {
        return this.enableCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshCertificatesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableCertificates;

        public Builder() {
    	      // Empty
        }

        public Builder(MeshCertificatesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableCertificates = defaults.enableCertificates;
        }

        public Builder enableCertificates(Boolean enableCertificates) {
            this.enableCertificates = Objects.requireNonNull(enableCertificates);
            return this;
        }        public MeshCertificatesResponse build() {
            return new MeshCertificatesResponse(enableCertificates);
        }
    }
}
