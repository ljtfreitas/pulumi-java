// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.networksecurity_v1.inputs.ValidationCAResponse;
import java.util.List;
import java.util.Objects;


/**
 * Specification of the MTLSPolicy.
 * 
 */
public final class MTLSPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final MTLSPolicyResponse Empty = new MTLSPolicyResponse();

    /**
     *  Defines the mechanism to obtain the Certificate Authority certificate to validate the client certificate.
     * 
     */
    @InputImport(name="clientValidationCa", required=true)
      private final List<ValidationCAResponse> clientValidationCa;

    public List<ValidationCAResponse> getClientValidationCa() {
        return this.clientValidationCa;
    }

    public MTLSPolicyResponse(List<ValidationCAResponse> clientValidationCa) {
        this.clientValidationCa = Objects.requireNonNull(clientValidationCa, "expected parameter 'clientValidationCa' to be non-null");
    }

    private MTLSPolicyResponse() {
        this.clientValidationCa = List.of();
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
