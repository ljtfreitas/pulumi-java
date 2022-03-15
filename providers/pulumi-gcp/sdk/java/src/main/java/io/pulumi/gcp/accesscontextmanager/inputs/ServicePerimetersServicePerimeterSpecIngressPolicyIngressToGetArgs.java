// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs Empty = new ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs();

    /**
     * A list of `ApiOperations` that this egress rule applies to. A request matches
     * if it contains an operation/service in this list.
     * Structure is documented below.
     * 
     */
    @Import(name="operations")
      private final @Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationGetArgs>> operations;

    public Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationGetArgs>> getOperations() {
        return this.operations == null ? Output.empty() : this.operations;
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    public ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs(
        @Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationGetArgs>> operations,
        @Nullable Output<List<String>> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    private ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs() {
        this.operations = Output.empty();
        this.resources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationGetArgs>> operations;
        private @Nullable Output<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(@Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationGetArgs>> operations) {
            this.operations = operations;
            return this;
        }

        public Builder operations(@Nullable List<ServicePerimetersServicePerimeterSpecIngressPolicyIngressToOperationGetArgs> operations) {
            this.operations = Output.ofNullable(operations);
            return this;
        }

        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable List<String> resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }
        public ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs build() {
            return new ServicePerimetersServicePerimeterSpecIngressPolicyIngressToGetArgs(operations, resources);
        }
    }
}
