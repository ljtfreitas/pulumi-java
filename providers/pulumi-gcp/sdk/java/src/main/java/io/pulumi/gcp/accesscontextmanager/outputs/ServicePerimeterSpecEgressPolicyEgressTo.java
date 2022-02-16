// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterSpecEgressPolicyEgressToOperation;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServicePerimeterSpecEgressPolicyEgressTo {
    private final @Nullable List<ServicePerimeterSpecEgressPolicyEgressToOperation> operations;
    private final @Nullable List<String> resources;

    @OutputCustomType.Constructor({"operations","resources"})
    private ServicePerimeterSpecEgressPolicyEgressTo(
        @Nullable List<ServicePerimeterSpecEgressPolicyEgressToOperation> operations,
        @Nullable List<String> resources) {
        this.operations = operations;
        this.resources = resources;
    }

    public List<ServicePerimeterSpecEgressPolicyEgressToOperation> getOperations() {
        return this.operations == null ? List.of() : this.operations;
    }
    public List<String> getResources() {
        return this.resources == null ? List.of() : this.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyEgressTo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServicePerimeterSpecEgressPolicyEgressToOperation> operations;
        private @Nullable List<String> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyEgressTo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.operations = defaults.operations;
    	      this.resources = defaults.resources;
        }

        public Builder setOperations(@Nullable List<ServicePerimeterSpecEgressPolicyEgressToOperation> operations) {
            this.operations = operations;
            return this;
        }

        public Builder setResources(@Nullable List<String> resources) {
            this.resources = resources;
            return this;
        }

        public ServicePerimeterSpecEgressPolicyEgressTo build() {
            return new ServicePerimeterSpecEgressPolicyEgressTo(operations, resources);
        }
    }
}