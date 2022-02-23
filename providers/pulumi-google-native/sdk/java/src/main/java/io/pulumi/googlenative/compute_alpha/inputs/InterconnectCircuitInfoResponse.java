// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a single physical circuit between the Customer and Google. CircuitInfo objects are created by Google, so all fields are output only.
 * 
 */
public final class InterconnectCircuitInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final InterconnectCircuitInfoResponse Empty = new InterconnectCircuitInfoResponse();

    /**
     * Customer-side demarc ID for this circuit.
     * 
     */
    @InputImport(name="customerDemarcId", required=true)
      private final String customerDemarcId;

    public String getCustomerDemarcId() {
        return this.customerDemarcId;
    }

    /**
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * 
     */
    @InputImport(name="googleCircuitId", required=true)
      private final String googleCircuitId;

    public String getGoogleCircuitId() {
        return this.googleCircuitId;
    }

    /**
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * 
     */
    @InputImport(name="googleDemarcId", required=true)
      private final String googleDemarcId;

    public String getGoogleDemarcId() {
        return this.googleDemarcId;
    }

    public InterconnectCircuitInfoResponse(
        String customerDemarcId,
        String googleCircuitId,
        String googleDemarcId) {
        this.customerDemarcId = Objects.requireNonNull(customerDemarcId, "expected parameter 'customerDemarcId' to be non-null");
        this.googleCircuitId = Objects.requireNonNull(googleCircuitId, "expected parameter 'googleCircuitId' to be non-null");
        this.googleDemarcId = Objects.requireNonNull(googleDemarcId, "expected parameter 'googleDemarcId' to be non-null");
    }

    private InterconnectCircuitInfoResponse() {
        this.customerDemarcId = null;
        this.googleCircuitId = null;
        this.googleDemarcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectCircuitInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customerDemarcId;
        private String googleCircuitId;
        private String googleDemarcId;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectCircuitInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerDemarcId = defaults.customerDemarcId;
    	      this.googleCircuitId = defaults.googleCircuitId;
    	      this.googleDemarcId = defaults.googleDemarcId;
        }

        public Builder setCustomerDemarcId(String customerDemarcId) {
            this.customerDemarcId = Objects.requireNonNull(customerDemarcId);
            return this;
        }

        public Builder setGoogleCircuitId(String googleCircuitId) {
            this.googleCircuitId = Objects.requireNonNull(googleCircuitId);
            return this;
        }

        public Builder setGoogleDemarcId(String googleDemarcId) {
            this.googleDemarcId = Objects.requireNonNull(googleDemarcId);
            return this;
        }
        public InterconnectCircuitInfoResponse build() {
            return new InterconnectCircuitInfoResponse(customerDemarcId, googleCircuitId, googleDemarcId);
        }
    }
}
