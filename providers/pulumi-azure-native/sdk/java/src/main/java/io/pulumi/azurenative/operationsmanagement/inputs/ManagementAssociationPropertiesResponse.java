// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * ManagementAssociation properties supported by the OperationsManagement resource provider.
 * 
 */
public final class ManagementAssociationPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementAssociationPropertiesResponse Empty = new ManagementAssociationPropertiesResponse();

    /**
     * The applicationId of the appliance for this association.
     * 
     */
    @Import(name="applicationId", required=true)
      private final String applicationId;

    public String getApplicationId() {
        return this.applicationId;
    }

    public ManagementAssociationPropertiesResponse(String applicationId) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
    }

    private ManagementAssociationPropertiesResponse() {
        this.applicationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementAssociationPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementAssociationPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
        }

        public Builder applicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }
        public ManagementAssociationPropertiesResponse build() {
            return new ManagementAssociationPropertiesResponse(applicationId);
        }
    }
}
