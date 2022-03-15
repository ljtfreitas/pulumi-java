// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * An access policy entry.
 * 
 */
public final class FhirServiceAccessPolicyEntryArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirServiceAccessPolicyEntryArgs Empty = new FhirServiceAccessPolicyEntryArgs();

    /**
     * An Azure AD object ID (User or Apps) that is allowed access to the FHIR service.
     * 
     */
    @Import(name="objectId", required=true)
      private final Output<String> objectId;

    public Output<String> getObjectId() {
        return this.objectId;
    }

    public FhirServiceAccessPolicyEntryArgs(Output<String> objectId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
    }

    private FhirServiceAccessPolicyEntryArgs() {
        this.objectId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirServiceAccessPolicyEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirServiceAccessPolicyEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder objectId(Output<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder objectId(String objectId) {
            this.objectId = Output.of(Objects.requireNonNull(objectId));
            return this;
        }
        public FhirServiceAccessPolicyEntryArgs build() {
            return new FhirServiceAccessPolicyEntryArgs(objectId);
        }
    }
}
