// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.inputs.ServiceProviderParameterResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Object used to describe a Service Provider supported by Bot Service
 * 
 */
public final class ServiceProviderPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServiceProviderPropertiesResponse Empty = new ServiceProviderPropertiesResponse();

    /**
     * Display Name of the Service Provider
     * 
     */
    @InputImport(name="devPortalUrl", required=true)
        private final String devPortalUrl;

    public String getDevPortalUrl() {
        return this.devPortalUrl;
    }

    /**
     * Display Name of the Service Provider
     * 
     */
    @InputImport(name="displayName", required=true)
        private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * Display Name of the Service Provider
     * 
     */
    @InputImport(name="iconUrl", required=true)
        private final String iconUrl;

    public String getIconUrl() {
        return this.iconUrl;
    }

    /**
     * Id for Service Provider
     * 
     */
    @InputImport(name="id", required=true)
        private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The list of parameters for the Service Provider
     * 
     */
    @InputImport(name="parameters")
        private final @Nullable List<ServiceProviderParameterResponse> parameters;

    public List<ServiceProviderParameterResponse> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    /**
     * Display Name of the Service Provider
     * 
     */
    @InputImport(name="serviceProviderName", required=true)
        private final String serviceProviderName;

    public String getServiceProviderName() {
        return this.serviceProviderName;
    }

    public ServiceProviderPropertiesResponse(
        String devPortalUrl,
        String displayName,
        String iconUrl,
        String id,
        @Nullable List<ServiceProviderParameterResponse> parameters,
        String serviceProviderName) {
        this.devPortalUrl = Objects.requireNonNull(devPortalUrl, "expected parameter 'devPortalUrl' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.iconUrl = Objects.requireNonNull(iconUrl, "expected parameter 'iconUrl' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.parameters = parameters;
        this.serviceProviderName = Objects.requireNonNull(serviceProviderName, "expected parameter 'serviceProviderName' to be non-null");
    }

    private ServiceProviderPropertiesResponse() {
        this.devPortalUrl = null;
        this.displayName = null;
        this.iconUrl = null;
        this.id = null;
        this.parameters = List.of();
        this.serviceProviderName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceProviderPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devPortalUrl;
        private String displayName;
        private String iconUrl;
        private String id;
        private @Nullable List<ServiceProviderParameterResponse> parameters;
        private String serviceProviderName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceProviderPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devPortalUrl = defaults.devPortalUrl;
    	      this.displayName = defaults.displayName;
    	      this.iconUrl = defaults.iconUrl;
    	      this.id = defaults.id;
    	      this.parameters = defaults.parameters;
    	      this.serviceProviderName = defaults.serviceProviderName;
        }

        public Builder setDevPortalUrl(String devPortalUrl) {
            this.devPortalUrl = Objects.requireNonNull(devPortalUrl);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setIconUrl(String iconUrl) {
            this.iconUrl = Objects.requireNonNull(iconUrl);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setParameters(@Nullable List<ServiceProviderParameterResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setServiceProviderName(String serviceProviderName) {
            this.serviceProviderName = Objects.requireNonNull(serviceProviderName);
            return this;
        }
        public ServiceProviderPropertiesResponse build() {
            return new ServiceProviderPropertiesResponse(devPortalUrl, displayName, iconUrl, id, parameters, serviceProviderName);
        }
    }
}
