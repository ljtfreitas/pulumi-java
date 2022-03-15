// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse;
import java.util.List;
import java.util.Objects;


/**
 * A list of flow version variants.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1VersionVariantsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1VersionVariantsResponse Empty = new GoogleCloudDialogflowCxV3beta1VersionVariantsResponse();

    /**
     * A list of flow version variants.
     * 
     */
    @Import(name="variants", required=true)
      private final List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants;

    public List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> getVariants() {
        return this.variants;
    }

    public GoogleCloudDialogflowCxV3beta1VersionVariantsResponse(List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants) {
        this.variants = Objects.requireNonNull(variants, "expected parameter 'variants' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1VersionVariantsResponse() {
        this.variants = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1VersionVariantsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1VersionVariantsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variants = defaults.variants;
        }

        public Builder variants(List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantResponse> variants) {
            this.variants = Objects.requireNonNull(variants);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1VersionVariantsResponse build() {
            return new GoogleCloudDialogflowCxV3beta1VersionVariantsResponse(variants);
        }
    }
}
