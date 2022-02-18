// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * ManagementAssociation properties supported by the OperationsManagement resource provider.
 * 
 */
public final class ManagementAssociationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagementAssociationPropertiesArgs Empty = new ManagementAssociationPropertiesArgs();

    /**
     * The applicationId of the appliance for this association.
     * 
     */
    @InputImport(name="applicationId", required=true)
    private final Input<String> applicationId;

    public Input<String> getApplicationId() {
        return this.applicationId;
    }

    public ManagementAssociationPropertiesArgs(Input<String> applicationId) {
        this.applicationId = Objects.requireNonNull(applicationId, "expected parameter 'applicationId' to be non-null");
    }

    private ManagementAssociationPropertiesArgs() {
        this.applicationId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementAssociationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> applicationId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementAssociationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationId = defaults.applicationId;
        }

        public Builder setApplicationId(Input<String> applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Input.of(Objects.requireNonNull(applicationId));
            return this;
        }

        public ManagementAssociationPropertiesArgs build() {
            return new ManagementAssociationPropertiesArgs(applicationId);
        }
    }
}
