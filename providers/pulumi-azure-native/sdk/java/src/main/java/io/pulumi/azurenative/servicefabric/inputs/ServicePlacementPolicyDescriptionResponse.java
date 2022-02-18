// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes the policy to be used for placement of a Service Fabric service.
 * 
 */
public final class ServicePlacementPolicyDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServicePlacementPolicyDescriptionResponse Empty = new ServicePlacementPolicyDescriptionResponse();

    /**
     * The type of placement policy for a service fabric service. Following are the possible values.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    public ServicePlacementPolicyDescriptionResponse(String type) {
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ServicePlacementPolicyDescriptionResponse() {
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePlacementPolicyDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePlacementPolicyDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ServicePlacementPolicyDescriptionResponse build() {
            return new ServicePlacementPolicyDescriptionResponse(type);
        }
    }
}
