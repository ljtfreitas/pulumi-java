// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v3beta1.inputs.GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A list of flow version variants.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1VersionVariantsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1VersionVariantsArgs Empty = new GoogleCloudDialogflowCxV3beta1VersionVariantsArgs();

    /**
     * A list of flow version variants.
     * 
     */
    @Import(name="variants")
      private final @Nullable Output<List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs>> variants;

    public Output<List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs>> getVariants() {
        return this.variants == null ? Output.empty() : this.variants;
    }

    public GoogleCloudDialogflowCxV3beta1VersionVariantsArgs(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs>> variants) {
        this.variants = variants;
    }

    private GoogleCloudDialogflowCxV3beta1VersionVariantsArgs() {
        this.variants = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1VersionVariantsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs>> variants;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1VersionVariantsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.variants = defaults.variants;
        }

        public Builder variants(@Nullable Output<List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs>> variants) {
            this.variants = variants;
            return this;
        }

        public Builder variants(@Nullable List<GoogleCloudDialogflowCxV3beta1VersionVariantsVariantArgs> variants) {
            this.variants = Output.ofNullable(variants);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1VersionVariantsArgs build() {
            return new GoogleCloudDialogflowCxV3beta1VersionVariantsArgs(variants);
        }
    }
}
