// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs Empty = new ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs();

    /**
     * The list of APIs usable within the Service Perimeter.
     * Must be empty unless `enableRestriction` is True.
     * 
     */
    @InputImport(name="allowedServices")
        private final @Nullable Input<List<String>> allowedServices;

    public Input<List<String>> getAllowedServices() {
        return this.allowedServices == null ? Input.empty() : this.allowedServices;
    }

    /**
     * Whether to restrict API calls within the Service Perimeter to the
     * list of APIs specified in 'allowedServices'.
     * 
     */
    @InputImport(name="enableRestriction")
        private final @Nullable Input<Boolean> enableRestriction;

    public Input<Boolean> getEnableRestriction() {
        return this.enableRestriction == null ? Input.empty() : this.enableRestriction;
    }

    public ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs(
        @Nullable Input<List<String>> allowedServices,
        @Nullable Input<Boolean> enableRestriction) {
        this.allowedServices = allowedServices;
        this.enableRestriction = enableRestriction;
    }

    private ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs() {
        this.allowedServices = Input.empty();
        this.enableRestriction = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedServices;
        private @Nullable Input<Boolean> enableRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.enableRestriction = defaults.enableRestriction;
        }

        public Builder setAllowedServices(@Nullable Input<List<String>> allowedServices) {
            this.allowedServices = allowedServices;
            return this;
        }

        public Builder setAllowedServices(@Nullable List<String> allowedServices) {
            this.allowedServices = Input.ofNullable(allowedServices);
            return this;
        }

        public Builder setEnableRestriction(@Nullable Input<Boolean> enableRestriction) {
            this.enableRestriction = enableRestriction;
            return this;
        }

        public Builder setEnableRestriction(@Nullable Boolean enableRestriction) {
            this.enableRestriction = Input.ofNullable(enableRestriction);
            return this;
        }
        public ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs build() {
            return new ServicePerimetersServicePerimeterStatusVpcAccessibleServicesGetArgs(allowedServices, enableRestriction);
        }
    }
}
