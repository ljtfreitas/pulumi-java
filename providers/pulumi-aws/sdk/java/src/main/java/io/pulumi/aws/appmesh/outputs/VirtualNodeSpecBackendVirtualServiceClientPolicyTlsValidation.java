// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames;
import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation {
    /**
     * The SANs for a TLS validation context.
     * 
     */
    private final @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
    /**
     * The TLS validation context trust.
     * 
     */
    private final VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust;

    @CustomType.Constructor
    private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation(
        @CustomType.Parameter("subjectAlternativeNames") @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames,
        @CustomType.Parameter("trust") VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.trust = trust;
    }

    /**
     * The SANs for a TLS validation context.
     * 
    */
    public Optional<VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames> getSubjectAlternativeNames() {
        return Optional.ofNullable(this.subjectAlternativeNames);
    }
    /**
     * The TLS validation context trust.
     * 
    */
    public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust getTrust() {
        return this.trust;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames;
        private VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.trust = defaults.trust;
        }

        public Builder subjectAlternativeNames(@Nullable VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationSubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public Builder trust(VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidationTrust trust) {
            this.trust = Objects.requireNonNull(trust);
            return this;
        }
        public VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation build() {
            return new VirtualNodeSpecBackendVirtualServiceClientPolicyTlsValidation(subjectAlternativeNames, trust);
        }
    }
}
