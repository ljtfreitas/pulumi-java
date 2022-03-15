// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dialogflow_v2beta1.outputs.GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse {
    /**
     * Carousel items.
     * 
     */
    private final List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse> items;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse(@CustomType.Parameter("items") List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse> items) {
        this.items = items;
    }

    /**
     * Carousel items.
     * 
    */
    public List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse> getItems() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemResponse> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectResponse(items);
        }
    }
}
