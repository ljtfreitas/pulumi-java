// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm {
    /**
     * One or more ACM Amazon Resource Name (ARN)s.
     * 
     */
    private final List<String> certificateAuthorityArns;

    @CustomType.Constructor
    private VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm(@CustomType.Parameter("certificateAuthorityArns") List<String> certificateAuthorityArns) {
        this.certificateAuthorityArns = certificateAuthorityArns;
    }

    /**
     * One or more ACM Amazon Resource Name (ARN)s.
     * 
    */
    public List<String> getCertificateAuthorityArns() {
        return this.certificateAuthorityArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certificateAuthorityArns;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArns = defaults.certificateAuthorityArns;
        }

        public Builder certificateAuthorityArns(List<String> certificateAuthorityArns) {
            this.certificateAuthorityArns = Objects.requireNonNull(certificateAuthorityArns);
            return this;
        }
        public VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm build() {
            return new VirtualGatewaySpecBackendDefaultsClientPolicyTlsValidationTrustAcm(certificateAuthorityArns);
        }
    }
}
