// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.accesscontextmanager_v1.inputs.ApiOperationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the conditions under which an EgressPolicy matches a request. Conditions are based on information about the ApiOperation intended to be performed on the `resources` specified. Note that if the destination of the request is also protected by a ServicePerimeter, then that ServicePerimeter must have an IngressPolicy which allows access in order for this request to succeed. The request must match `operations` AND `resources` fields in order to be allowed egress out of the perimeter.
 * 
 */
public final class EgressToArgs extends io.pulumi.resources.ResourceArgs {

    public static final EgressToArgs Empty = new EgressToArgs();

    /**
     * A list of ApiOperations allowed to be performed by the sources specified in the corresponding EgressFrom. A request matches if it uses an operation/service in this list.
     * 
     */
    @Import(name="operations")
      private final @Nullable Output<List<ApiOperationArgs>> operations;

    public Output<List<ApiOperationArgs>> getOperations() {
        return this.operations == null ? Output.empty() : this.operations;
    }

    /**
     * A list of resources, currently only projects in the form `projects/`, that are allowed to be accessed by sources defined in the corresponding EgressFrom. A request matches if it contains a resource in this list. If `*` is specified for `resources`, then this EgressTo rule will authorize access to all resources outside the perimeter.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    public EgressToArgs(
        @Nullable Output<List<ApiOperationArgs>> operations,
        @Nullable Output<List<String>> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    private EgressToArgs() {
        this.operations = Output.empty();
        this.resources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EgressToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ApiOperationArgs>> operations;
        private @Nullable Output<List<String>> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(EgressToArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder operations(@Nullable Output<List<ApiOperationArgs>> operations) {
            this.operations = operations;
            return this;
        }

        public Builder operations(@Nullable List<ApiOperationArgs> operations) {
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
        public EgressToArgs build() {
            return new EgressToArgs(operations, resources);
        }
    }
}
