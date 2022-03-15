// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.policyinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAttestationAtResourceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAttestationAtResourceArgs Empty = new GetAttestationAtResourceArgs();

    /**
     * The name of the attestation.
     * 
     */
    @Import(name="attestationName", required=true)
      private final String attestationName;

    public String getAttestationName() {
        return this.attestationName;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    public GetAttestationAtResourceArgs(
        String attestationName,
        String resourceId) {
        this.attestationName = Objects.requireNonNull(attestationName, "expected parameter 'attestationName' to be non-null");
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private GetAttestationAtResourceArgs() {
        this.attestationName = null;
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestationAtResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String attestationName;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestationAtResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestationName = defaults.attestationName;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder attestationName(String attestationName) {
            this.attestationName = Objects.requireNonNull(attestationName);
            return this;
        }

        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public GetAttestationAtResourceArgs build() {
            return new GetAttestationAtResourceArgs(attestationName, resourceId);
        }
    }
}
