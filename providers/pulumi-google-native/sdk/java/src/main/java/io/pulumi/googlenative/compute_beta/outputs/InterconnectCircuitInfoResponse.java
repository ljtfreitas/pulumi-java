// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class InterconnectCircuitInfoResponse {
    /**
     * Customer-side demarc ID for this circuit.
     * 
     */
    private final String customerDemarcId;
    /**
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * 
     */
    private final String googleCircuitId;
    /**
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * 
     */
    private final String googleDemarcId;

    @CustomType.Constructor
    private InterconnectCircuitInfoResponse(
        @CustomType.Parameter("customerDemarcId") String customerDemarcId,
        @CustomType.Parameter("googleCircuitId") String googleCircuitId,
        @CustomType.Parameter("googleDemarcId") String googleDemarcId) {
        this.customerDemarcId = customerDemarcId;
        this.googleCircuitId = googleCircuitId;
        this.googleDemarcId = googleDemarcId;
    }

    /**
     * Customer-side demarc ID for this circuit.
     * 
    */
    public String getCustomerDemarcId() {
        return this.customerDemarcId;
    }
    /**
     * Google-assigned unique ID for this circuit. Assigned at circuit turn-up.
     * 
    */
    public String getGoogleCircuitId() {
        return this.googleCircuitId;
    }
    /**
     * Google-side demarc ID for this circuit. Assigned at circuit turn-up and provided by Google to the customer in the LOA.
     * 
    */
    public String getGoogleDemarcId() {
        return this.googleDemarcId;
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

        public Builder customerDemarcId(String customerDemarcId) {
            this.customerDemarcId = Objects.requireNonNull(customerDemarcId);
            return this;
        }

        public Builder googleCircuitId(String googleCircuitId) {
            this.googleCircuitId = Objects.requireNonNull(googleCircuitId);
            return this;
        }

        public Builder googleDemarcId(String googleDemarcId) {
            this.googleDemarcId = Objects.requireNonNull(googleDemarcId);
            return this;
        }
        public InterconnectCircuitInfoResponse build() {
            return new InterconnectCircuitInfoResponse(customerDemarcId, googleCircuitId, googleDemarcId);
        }
    }
}
