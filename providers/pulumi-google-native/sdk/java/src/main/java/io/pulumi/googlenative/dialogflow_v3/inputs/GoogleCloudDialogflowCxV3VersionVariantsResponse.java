// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dialogflow_v3.inputs.GoogleCloudDialogflowCxV3VersionVariantsVariantResponse;
import java.util.List;
import java.util.Objects;


/**
 * A list of flow version variants.
 * 
 */
public final class GoogleCloudDialogflowCxV3VersionVariantsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3VersionVariantsResponse Empty = new GoogleCloudDialogflowCxV3VersionVariantsResponse();

    /**
     * A list of flow version variants.
     * 
     */
    @InputImport(name="variants", required=true)
      private final List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants;

    public List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> getVariants() {
        return this.variants;
    }

    public GoogleCloudDialogflowCxV3VersionVariantsResponse(List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants) {
        this.variants = Objects.requireNonNull(variants, "expected parameter 'variants' to be non-null");
    }

    private GoogleCloudDialogflowCxV3VersionVariantsResponse() {
        this.variants = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3VersionVariantsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3VersionVariantsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variants = defaults.variants;
        }

        public Builder setVariants(List<GoogleCloudDialogflowCxV3VersionVariantsVariantResponse> variants) {
            this.variants = Objects.requireNonNull(variants);
            return this;
        }
        public GoogleCloudDialogflowCxV3VersionVariantsResponse build() {
            return new GoogleCloudDialogflowCxV3VersionVariantsResponse(variants);
        }
    }
}
