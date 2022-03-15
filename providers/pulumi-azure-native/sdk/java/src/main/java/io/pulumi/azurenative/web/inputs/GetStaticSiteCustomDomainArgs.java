// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStaticSiteCustomDomainArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStaticSiteCustomDomainArgs Empty = new GetStaticSiteCustomDomainArgs();

    /**
     * The custom domain name.
     * 
     */
    @Import(name="domainName", required=true)
      private final String domainName;

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * Name of the static site resource to search in.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetStaticSiteCustomDomainArgs(
        String domainName,
        String name,
        String resourceGroupName) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetStaticSiteCustomDomainArgs() {
        this.domainName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStaticSiteCustomDomainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStaticSiteCustomDomainArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder domainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetStaticSiteCustomDomainArgs build() {
            return new GetStaticSiteCustomDomainArgs(domainName, name, resourceGroupName);
        }
    }
}
