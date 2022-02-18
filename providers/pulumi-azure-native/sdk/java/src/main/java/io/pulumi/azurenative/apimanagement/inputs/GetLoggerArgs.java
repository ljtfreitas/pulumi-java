// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLoggerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLoggerArgs Empty = new GetLoggerArgs();

    /**
     * Logger identifier. Must be unique in the API Management service instance.
     * 
     */
    @InputImport(name="loggerId", required=true)
    private final String loggerId;

    public String getLoggerId() {
        return this.loggerId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetLoggerArgs(
        String loggerId,
        String resourceGroupName,
        String serviceName) {
        this.loggerId = Objects.requireNonNull(loggerId, "expected parameter 'loggerId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetLoggerArgs() {
        this.loggerId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoggerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String loggerId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoggerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loggerId = defaults.loggerId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setLoggerId(String loggerId) {
            this.loggerId = Objects.requireNonNull(loggerId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetLoggerArgs build() {
            return new GetLoggerArgs(loggerId, resourceGroupName, serviceName);
        }
    }
}
