// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.GoogleCloudDialogflowV2beta1SuggestionFeatureType;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The type of Human Agent Assistant API suggestion to perform, and the maximum number of results to return for that type. Multiple `Feature` objects can be specified in the `features` list.
 * 
 */
public final class GoogleCloudDialogflowV2beta1SuggestionFeatureArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1SuggestionFeatureArgs Empty = new GoogleCloudDialogflowV2beta1SuggestionFeatureArgs();

    /**
     * Type of Human Agent Assistant API feature to request.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<GoogleCloudDialogflowV2beta1SuggestionFeatureType> type;

    public Output<GoogleCloudDialogflowV2beta1SuggestionFeatureType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public GoogleCloudDialogflowV2beta1SuggestionFeatureArgs(@Nullable Output<GoogleCloudDialogflowV2beta1SuggestionFeatureType> type) {
        this.type = type;
    }

    private GoogleCloudDialogflowV2beta1SuggestionFeatureArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1SuggestionFeatureArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudDialogflowV2beta1SuggestionFeatureType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1SuggestionFeatureArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<GoogleCloudDialogflowV2beta1SuggestionFeatureType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable GoogleCloudDialogflowV2beta1SuggestionFeatureType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public GoogleCloudDialogflowV2beta1SuggestionFeatureArgs build() {
            return new GoogleCloudDialogflowV2beta1SuggestionFeatureArgs(type);
        }
    }
}
