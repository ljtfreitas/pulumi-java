// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.operationsmanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ManagementAssociationPropertiesResponse {
    /**
     * The applicationId of the appliance for this association.
     * 
     */
    private final String applicationId;

    @OutputCustomType.Constructor({"applicationId"})
    private ManagementAssociationPropertiesResponse(String applicationId) {
        this.applicationId = Objects.requireNonNull(applicationId);
    }

    /**
     * The applicationId of the appliance for this association.
     * 
     */
    public String getApplicationId() {
        return this.applicationId;
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

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public ManagementAssociationPropertiesResponse build() {
            return new ManagementAssociationPropertiesResponse(applicationId);
        }
    }
}
