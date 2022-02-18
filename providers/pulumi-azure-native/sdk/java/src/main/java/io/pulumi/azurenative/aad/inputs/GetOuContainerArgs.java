// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aad.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetOuContainerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetOuContainerArgs Empty = new GetOuContainerArgs();

    /**
     * The name of the domain service.
     * 
     */
    @InputImport(name="domainServiceName", required=true)
    private final String domainServiceName;

    public String getDomainServiceName() {
        return this.domainServiceName;
    }

    /**
     * The name of the OuContainer.
     * 
     */
    @InputImport(name="ouContainerName", required=true)
    private final String ouContainerName;

    public String getOuContainerName() {
        return this.ouContainerName;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetOuContainerArgs(
        String domainServiceName,
        String ouContainerName,
        String resourceGroupName) {
        this.domainServiceName = Objects.requireNonNull(domainServiceName, "expected parameter 'domainServiceName' to be non-null");
        this.ouContainerName = Objects.requireNonNull(ouContainerName, "expected parameter 'ouContainerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetOuContainerArgs() {
        this.domainServiceName = null;
        this.ouContainerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOuContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainServiceName;
        private String ouContainerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOuContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainServiceName = defaults.domainServiceName;
    	      this.ouContainerName = defaults.ouContainerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setDomainServiceName(String domainServiceName) {
            this.domainServiceName = Objects.requireNonNull(domainServiceName);
            return this;
        }

        public Builder setOuContainerName(String ouContainerName) {
            this.ouContainerName = Objects.requireNonNull(ouContainerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetOuContainerArgs build() {
            return new GetOuContainerArgs(domainServiceName, ouContainerName, resourceGroupName);
        }
    }
}
