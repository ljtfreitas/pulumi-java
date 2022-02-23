// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames {
    /**
     * The criteria for determining a SAN's match.
     * 
     */
    private final VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match;

    @OutputCustomType.Constructor({"match"})
    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match) {
        this.match = Objects.requireNonNull(match);
    }

    /**
     * The criteria for determining a SAN's match.
     * 
     */
    public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch getMatch() {
        return this.match;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.match = defaults.match;
        }

        public Builder setMatch(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNames(match);
        }
    }
}
