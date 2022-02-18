// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetWebAppSiteExtensionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWebAppSiteExtensionArgs Empty = new GetWebAppSiteExtensionArgs();

    /**
     * Site name.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Site extension name.
     * 
     */
    @InputImport(name="siteExtensionId", required=true)
    private final String siteExtensionId;

    public String getSiteExtensionId() {
        return this.siteExtensionId;
    }

    public GetWebAppSiteExtensionArgs(
        String name,
        String resourceGroupName,
        String siteExtensionId) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteExtensionId = Objects.requireNonNull(siteExtensionId, "expected parameter 'siteExtensionId' to be non-null");
    }

    private GetWebAppSiteExtensionArgs() {
        this.name = null;
        this.resourceGroupName = null;
        this.siteExtensionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSiteExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroupName;
        private String siteExtensionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWebAppSiteExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteExtensionId = defaults.siteExtensionId;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSiteExtensionId(String siteExtensionId) {
            this.siteExtensionId = Objects.requireNonNull(siteExtensionId);
            return this;
        }

        public GetWebAppSiteExtensionArgs build() {
            return new GetWebAppSiteExtensionArgs(name, resourceGroupName, siteExtensionId);
        }
    }
}
