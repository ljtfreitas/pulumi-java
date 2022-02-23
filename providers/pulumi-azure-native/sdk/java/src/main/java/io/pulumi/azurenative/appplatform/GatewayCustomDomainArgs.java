// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform;

import io.pulumi.azurenative.appplatform.inputs.GatewayCustomDomainPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayCustomDomainArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayCustomDomainArgs Empty = new GatewayCustomDomainArgs();

    /**
     * The name of the Spring Cloud Gateway custom domain.
     * 
     */
    @InputImport(name="domainName")
        private final @Nullable Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName == null ? Input.empty() : this.domainName;
    }

    /**
     * The name of Spring Cloud Gateway.
     * 
     */
    @InputImport(name="gatewayName", required=true)
        private final Input<String> gatewayName;

    public Input<String> getGatewayName() {
        return this.gatewayName;
    }

    /**
     * The properties of custom domain for Spring Cloud Gateway
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<GatewayCustomDomainPropertiesArgs> properties;

    public Input<GatewayCustomDomainPropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Service resource.
     * 
     */
    @InputImport(name="serviceName", required=true)
        private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public GatewayCustomDomainArgs(
        @Nullable Input<String> domainName,
        Input<String> gatewayName,
        @Nullable Input<GatewayCustomDomainPropertiesArgs> properties,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.domainName = domainName;
        this.gatewayName = Objects.requireNonNull(gatewayName, "expected parameter 'gatewayName' to be non-null");
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GatewayCustomDomainArgs() {
        this.domainName = Input.empty();
        this.gatewayName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> domainName;
        private Input<String> gatewayName;
        private @Nullable Input<GatewayCustomDomainPropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayCustomDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.gatewayName = defaults.gatewayName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setDomainName(@Nullable Input<String> domainName) {
            this.domainName = domainName;
            return this;
        }

        public Builder setDomainName(@Nullable String domainName) {
            this.domainName = Input.ofNullable(domainName);
            return this;
        }

        public Builder setGatewayName(Input<String> gatewayName) {
            this.gatewayName = Objects.requireNonNull(gatewayName);
            return this;
        }

        public Builder setGatewayName(String gatewayName) {
            this.gatewayName = Input.of(Objects.requireNonNull(gatewayName));
            return this;
        }

        public Builder setProperties(@Nullable Input<GatewayCustomDomainPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable GatewayCustomDomainPropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public GatewayCustomDomainArgs build() {
            return new GatewayCustomDomainArgs(domainName, gatewayName, properties, resourceGroupName, serviceName);
        }
    }
}
