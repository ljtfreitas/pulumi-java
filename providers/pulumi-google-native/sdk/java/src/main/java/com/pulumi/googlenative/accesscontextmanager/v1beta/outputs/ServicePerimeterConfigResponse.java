// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager.v1beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.accesscontextmanager.v1beta.outputs.VpcAccessibleServicesResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ServicePerimeterConfigResponse {
    /**
     * @return A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `&#34;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&#34;`. For Service Perimeter Bridge, must be empty.
     * 
     */
    private final List<String> accessLevels;
    /**
     * @return A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
     * 
     */
    private final List<String> resources;
    /**
     * @return Google Cloud services that are subject to the Service Perimeter restrictions. Must contain a list of services. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter&#39;s access restrictions.
     * 
     */
    private final List<String> restrictedServices;
    /**
     * @return Google Cloud services that are not subject to the Service Perimeter restrictions. Deprecated. Must be set to a single wildcard &#34;*&#34;. The wildcard means that unless explicitly specified by &#34;restricted_services&#34; list, any service is treated as unrestricted.
     * 
     * @deprecated
     * Google Cloud services that are not subject to the Service Perimeter restrictions. Deprecated. Must be set to a single wildcard &#34;*&#34;. The wildcard means that unless explicitly specified by &#34;restricted_services&#34; list, any service is treated as unrestricted.
     * 
     */
    @Deprecated /* Google Cloud services that are not subject to the Service Perimeter restrictions. Deprecated. Must be set to a single wildcard ""*"". The wildcard means that unless explicitly specified by ""restricted_services"" list, any service is treated as unrestricted. */
    private final List<String> unrestrictedServices;
    /**
     * @return Beta. Configuration for APIs allowed within Perimeter.
     * 
     */
    private final VpcAccessibleServicesResponse vpcAccessibleServices;

    @CustomType.Constructor
    private ServicePerimeterConfigResponse(
        @CustomType.Parameter("accessLevels") List<String> accessLevels,
        @CustomType.Parameter("resources") List<String> resources,
        @CustomType.Parameter("restrictedServices") List<String> restrictedServices,
        @CustomType.Parameter("unrestrictedServices") List<String> unrestrictedServices,
        @CustomType.Parameter("vpcAccessibleServices") VpcAccessibleServicesResponse vpcAccessibleServices) {
        this.accessLevels = accessLevels;
        this.resources = resources;
        this.restrictedServices = restrictedServices;
        this.unrestrictedServices = unrestrictedServices;
        this.vpcAccessibleServices = vpcAccessibleServices;
    }

    /**
     * @return A list of `AccessLevel` resource names that allow resources within the `ServicePerimeter` to be accessed from the internet. `AccessLevels` listed must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent `AccessLevel` is a syntax error. If no `AccessLevel` names are listed, resources within the perimeter can only be accessed via Google Cloud calls with request origins within the perimeter. Example: `&#34;accessPolicies/MY_POLICY/accessLevels/MY_LEVEL&#34;`. For Service Perimeter Bridge, must be empty.
     * 
     */
    public List<String> accessLevels() {
        return this.accessLevels;
    }
    /**
     * @return A list of Google Cloud resources that are inside of the service perimeter. Currently only projects are allowed. Format: `projects/{project_number}`
     * 
     */
    public List<String> resources() {
        return this.resources;
    }
    /**
     * @return Google Cloud services that are subject to the Service Perimeter restrictions. Must contain a list of services. For example, if `storage.googleapis.com` is specified, access to the storage buckets inside the perimeter must meet the perimeter&#39;s access restrictions.
     * 
     */
    public List<String> restrictedServices() {
        return this.restrictedServices;
    }
    /**
     * @return Google Cloud services that are not subject to the Service Perimeter restrictions. Deprecated. Must be set to a single wildcard &#34;*&#34;. The wildcard means that unless explicitly specified by &#34;restricted_services&#34; list, any service is treated as unrestricted.
     * 
     * @deprecated
     * Google Cloud services that are not subject to the Service Perimeter restrictions. Deprecated. Must be set to a single wildcard &#34;*&#34;. The wildcard means that unless explicitly specified by &#34;restricted_services&#34; list, any service is treated as unrestricted.
     * 
     */
    @Deprecated /* Google Cloud services that are not subject to the Service Perimeter restrictions. Deprecated. Must be set to a single wildcard ""*"". The wildcard means that unless explicitly specified by ""restricted_services"" list, any service is treated as unrestricted. */
    public List<String> unrestrictedServices() {
        return this.unrestrictedServices;
    }
    /**
     * @return Beta. Configuration for APIs allowed within Perimeter.
     * 
     */
    public VpcAccessibleServicesResponse vpcAccessibleServices() {
        return this.vpcAccessibleServices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> accessLevels;
        private List<String> resources;
        private List<String> restrictedServices;
        private List<String> unrestrictedServices;
        private VpcAccessibleServicesResponse vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.unrestrictedServices = defaults.unrestrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder accessLevels(List<String> accessLevels) {
            this.accessLevels = Objects.requireNonNull(accessLevels);
            return this;
        }
        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }
        public Builder resources(List<String> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder restrictedServices(List<String> restrictedServices) {
            this.restrictedServices = Objects.requireNonNull(restrictedServices);
            return this;
        }
        public Builder restrictedServices(String... restrictedServices) {
            return restrictedServices(List.of(restrictedServices));
        }
        public Builder unrestrictedServices(List<String> unrestrictedServices) {
            this.unrestrictedServices = Objects.requireNonNull(unrestrictedServices);
            return this;
        }
        public Builder unrestrictedServices(String... unrestrictedServices) {
            return unrestrictedServices(List.of(unrestrictedServices));
        }
        public Builder vpcAccessibleServices(VpcAccessibleServicesResponse vpcAccessibleServices) {
            this.vpcAccessibleServices = Objects.requireNonNull(vpcAccessibleServices);
            return this;
        }        public ServicePerimeterConfigResponse build() {
            return new ServicePerimeterConfigResponse(accessLevels, resources, restrictedServices, unrestrictedServices, vpcAccessibleServices);
        }
    }
}
