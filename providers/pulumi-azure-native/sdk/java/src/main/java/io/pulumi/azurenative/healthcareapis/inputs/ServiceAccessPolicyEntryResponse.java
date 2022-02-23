// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * An access policy entry.
 * 
 */
public final class ServiceAccessPolicyEntryResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAccessPolicyEntryResponse Empty = new ServiceAccessPolicyEntryResponse();

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    @InputImport(name="objectId", required=true)
        private final String objectId;

    public String getObjectId() {
        return this.objectId;
    }

    public ServiceAccessPolicyEntryResponse(String objectId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
    }

    private ServiceAccessPolicyEntryResponse() {
        this.objectId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAccessPolicyEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAccessPolicyEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }
        public ServiceAccessPolicyEntryResponse build() {
            return new ServiceAccessPolicyEntryResponse(objectId);
        }
    }
}
