// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The specifications of dynamically generated facets.
 * 
 */
public final class GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse Empty = new GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse();

    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
     * 
     */
    @InputImport(name="mode", required=true)
      private final String mode;

    public String getMode() {
        return this.mode;
    }

    public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse(String mode) {
        this.mode = Objects.requireNonNull(mode, "expected parameter 'mode' to be non-null");
    }

    private GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse() {
        this.mode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder setMode(String mode) {
            this.mode = Objects.requireNonNull(mode);
            return this;
        }
        public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse build() {
            return new GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecResponse(mode);
        }
    }
}
