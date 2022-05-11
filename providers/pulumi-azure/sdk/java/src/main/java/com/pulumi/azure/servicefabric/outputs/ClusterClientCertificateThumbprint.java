// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicefabric.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ClusterClientCertificateThumbprint {
    /**
     * @return Does the Client Certificate have Admin Access to the cluster? Non-admin clients can only perform read only operations on the cluster.
     * 
     */
    private final Boolean isAdmin;
    /**
     * @return The Thumbprint associated with the Client Certificate.
     * 
     */
    private final String thumbprint;

    @CustomType.Constructor
    private ClusterClientCertificateThumbprint(
        @CustomType.Parameter("isAdmin") Boolean isAdmin,
        @CustomType.Parameter("thumbprint") String thumbprint) {
        this.isAdmin = isAdmin;
        this.thumbprint = thumbprint;
    }

    /**
     * @return Does the Client Certificate have Admin Access to the cluster? Non-admin clients can only perform read only operations on the cluster.
     * 
     */
    public Boolean isAdmin() {
        return this.isAdmin;
    }
    /**
     * @return The Thumbprint associated with the Client Certificate.
     * 
     */
    public String thumbprint() {
        return this.thumbprint;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientCertificateThumbprint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isAdmin;
        private String thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientCertificateThumbprint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isAdmin = defaults.isAdmin;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder isAdmin(Boolean isAdmin) {
            this.isAdmin = Objects.requireNonNull(isAdmin);
            return this;
        }
        public Builder thumbprint(String thumbprint) {
            this.thumbprint = Objects.requireNonNull(thumbprint);
            return this;
        }        public ClusterClientCertificateThumbprint build() {
            return new ClusterClientCertificateThumbprint(isAdmin, thumbprint);
        }
    }
}
