// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch {
    /**
     * The values sent must match the specified values exactly.
     * 
     */
    private final List<String> exacts;

    @CustomType.Constructor
    private VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch(@CustomType.Parameter("exacts") List<String> exacts) {
        this.exacts = exacts;
    }

    /**
     * The values sent must match the specified values exactly.
     * 
    */
    public List<String> getExacts() {
        return this.exacts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> exacts;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exacts = defaults.exacts;
        }

        public Builder exacts(List<String> exacts) {
            this.exacts = Objects.requireNonNull(exacts);
            return this;
        }
        public VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch build() {
            return new VirtualNodeSpecBackendDefaultsClientPolicyTlsValidationSubjectAlternativeNamesMatch(exacts);
        }
    }
}
