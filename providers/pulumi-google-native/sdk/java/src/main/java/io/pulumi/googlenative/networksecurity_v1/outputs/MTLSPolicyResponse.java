// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.networksecurity_v1.outputs.ValidationCAResponse;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MTLSPolicyResponse {
    /**
     *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    private final List<ValidationCAResponse> clientValidationCa;

    @OutputCustomType.Constructor({"clientValidationCa"})
    private MTLSPolicyResponse(List<ValidationCAResponse> clientValidationCa) {
        this.clientValidationCa = Objects.requireNonNull(clientValidationCa);
    }

    /**
     *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    public List<ValidationCAResponse> getClientValidationCa() {
        return this.clientValidationCa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MTLSPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ValidationCAResponse> clientValidationCa;

        public Builder() {
    	      // Empty
        }

        public Builder(MTLSPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientValidationCa = defaults.clientValidationCa;
        }

        public Builder setClientValidationCa(List<ValidationCAResponse> clientValidationCa) {
            this.clientValidationCa = Objects.requireNonNull(clientValidationCa);
            return this;
        }
        public MTLSPolicyResponse build() {
            return new MTLSPolicyResponse(clientValidationCa);
        }
    }
}
