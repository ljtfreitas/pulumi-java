// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
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

    @OutputCustomType.Constructor({"customerDemarcId","googleCircuitId","googleDemarcId"})
    private InterconnectCircuitInfoResponse(
        String customerDemarcId,
        String googleCircuitId,
        String googleDemarcId) {
        this.customerDemarcId = Objects.requireNonNull(customerDemarcId);
        this.googleCircuitId = Objects.requireNonNull(googleCircuitId);
        this.googleDemarcId = Objects.requireNonNull(googleDemarcId);
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
