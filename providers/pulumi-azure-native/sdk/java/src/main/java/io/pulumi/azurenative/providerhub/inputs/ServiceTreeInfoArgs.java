// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTreeInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTreeInfoArgs Empty = new ServiceTreeInfoArgs();

    @InputImport(name="componentId")
    private final @Nullable Input<String> componentId;

    public Input<String> getComponentId() {
        return this.componentId == null ? Input.empty() : this.componentId;
    }

    @InputImport(name="serviceId")
    private final @Nullable Input<String> serviceId;

    public Input<String> getServiceId() {
        return this.serviceId == null ? Input.empty() : this.serviceId;
    }

    public ServiceTreeInfoArgs(
        @Nullable Input<String> componentId,
        @Nullable Input<String> serviceId) {
        this.componentId = componentId;
        this.serviceId = serviceId;
    }

    private ServiceTreeInfoArgs() {
        this.componentId = Input.empty();
        this.serviceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTreeInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> componentId;
        private @Nullable Input<String> serviceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTreeInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.componentId = defaults.componentId;
    	      this.serviceId = defaults.serviceId;
        }

        public Builder setComponentId(@Nullable Input<String> componentId) {
            this.componentId = componentId;
            return this;
        }

        public Builder setComponentId(@Nullable String componentId) {
            this.componentId = Input.ofNullable(componentId);
            return this;
        }

        public Builder setServiceId(@Nullable Input<String> serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public Builder setServiceId(@Nullable String serviceId) {
            this.serviceId = Input.ofNullable(serviceId);
            return this;
        }

        public ServiceTreeInfoArgs build() {
            return new ServiceTreeInfoArgs(componentId, serviceId);
        }
    }
}
