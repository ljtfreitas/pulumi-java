// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersState extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersState Empty = new ServicePerimetersState();

    /**
     * The AccessPolicy this ServicePerimeter lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @InputImport(name="parent")
        private final @Nullable Input<String> parent;

    public Input<String> getParent() {
        return this.parent == null ? Input.empty() : this.parent;
    }

    /**
     * The desired Service Perimeters that should replace all existing Service Perimeters in the Access Policy.
     * Structure is documented below.
     * 
     */
    @InputImport(name="servicePerimeters")
        private final @Nullable Input<List<ServicePerimetersServicePerimeterGetArgs>> servicePerimeters;

    public Input<List<ServicePerimetersServicePerimeterGetArgs>> getServicePerimeters() {
        return this.servicePerimeters == null ? Input.empty() : this.servicePerimeters;
    }

    public ServicePerimetersState(
        @Nullable Input<String> parent,
        @Nullable Input<List<ServicePerimetersServicePerimeterGetArgs>> servicePerimeters) {
        this.parent = parent;
        this.servicePerimeters = servicePerimeters;
    }

    private ServicePerimetersState() {
        this.parent = Input.empty();
        this.servicePerimeters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> parent;
        private @Nullable Input<List<ServicePerimetersServicePerimeterGetArgs>> servicePerimeters;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
    	      this.servicePerimeters = defaults.servicePerimeters;
        }

        public Builder setParent(@Nullable Input<String> parent) {
            this.parent = parent;
            return this;
        }

        public Builder setParent(@Nullable String parent) {
            this.parent = Input.ofNullable(parent);
            return this;
        }

        public Builder setServicePerimeters(@Nullable Input<List<ServicePerimetersServicePerimeterGetArgs>> servicePerimeters) {
            this.servicePerimeters = servicePerimeters;
            return this;
        }

        public Builder setServicePerimeters(@Nullable List<ServicePerimetersServicePerimeterGetArgs> servicePerimeters) {
            this.servicePerimeters = Input.ofNullable(servicePerimeters);
            return this;
        }
        public ServicePerimetersState build() {
            return new ServicePerimetersState(parent, servicePerimeters);
        }
    }
}
