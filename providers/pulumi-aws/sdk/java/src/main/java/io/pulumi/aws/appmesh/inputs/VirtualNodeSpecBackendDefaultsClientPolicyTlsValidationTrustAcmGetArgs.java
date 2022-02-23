// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs Empty = new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs();

    /**
     * One or more ACM Amazon Resource Name (ARN)s.
     * 
     */
    @InputImport(name="certificateAuthorityArns", required=true)
    private final Input<List<String>> certificateAuthorityArns;

    public Input<List<String>> getCertificateAuthorityArns() {
        return this.certificateAuthorityArns;
    }

    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs(Input<List<String>> certificateAuthorityArns) {
        this.certificateAuthorityArns = Objects.requireNonNull(certificateAuthorityArns, "expected parameter 'certificateAuthorityArns' to be non-null");
    }

    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs() {
        this.certificateAuthorityArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> certificateAuthorityArns;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArns = defaults.certificateAuthorityArns;
        }

        public Builder setCertificateAuthorityArns(Input<List<String>> certificateAuthorityArns) {
            this.certificateAuthorityArns = Objects.requireNonNull(certificateAuthorityArns);
            return this;
        }

        public Builder setCertificateAuthorityArns(List<String> certificateAuthorityArns) {
            this.certificateAuthorityArns = Input.of(Objects.requireNonNull(certificateAuthorityArns));
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationTrustAcmGetArgs(certificateAuthorityArns);
        }
    }
}