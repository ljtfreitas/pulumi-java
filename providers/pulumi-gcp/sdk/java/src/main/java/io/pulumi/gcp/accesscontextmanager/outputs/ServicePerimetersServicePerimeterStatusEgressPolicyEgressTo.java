// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo {
    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
     */
    private final @Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation> operations;
    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    private final @Nullable List<String> resources;

    @OutputCustomType.Constructor({"operations","resources"})
    private ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo(
        @Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation> operations,
        @Nullable List<String> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
     */
    public List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation> getOperations() {
        return this.operations == null ? List.of() : this.operations;
    }
    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    public List<String> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation> operations;
        private @Nullable List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder setOperations(@Nullable List<ServicePerimetersServicePerimeterStatusEgressPolicyEgressToOperation> operations) {
            this.operations = operations;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }
        public ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo build() {
            return new ServicePerimetersServicePerimeterStatusEgressPolicyEgressTo(operations, resources);
        }
    }
}
