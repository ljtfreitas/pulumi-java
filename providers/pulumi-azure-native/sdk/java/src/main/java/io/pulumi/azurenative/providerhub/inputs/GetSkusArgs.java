// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSkusArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSkusArgs Empty = new GetSkusArgs();

    /**
     * The name of the resource provider hosted within ProviderHub.
     * 
     */
    @InputImport(name="providerNamespace", required=true)
        private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    /**
     * The resource type.
     * 
     */
    @InputImport(name="resourceType", required=true)
        private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    /**
     * The SKU.
     * 
     */
    @InputImport(name="sku", required=true)
        private final String sku;

    public String getSku() {
        return this.sku;
    }

    public GetSkusArgs(
        String providerNamespace,
        String resourceType,
        String sku) {
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GetSkusArgs() {
        this.providerNamespace = null;
        this.resourceType = null;
        this.sku = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSkusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String providerNamespace;
        private String resourceType;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSkusArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public GetSkusArgs build() {
            return new GetSkusArgs(providerNamespace, resourceType, sku);
        }
    }
}
