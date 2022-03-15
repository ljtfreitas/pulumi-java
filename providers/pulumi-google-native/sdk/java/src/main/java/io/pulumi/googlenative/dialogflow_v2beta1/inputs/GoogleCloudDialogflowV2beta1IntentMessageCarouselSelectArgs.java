// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.inputs.GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs;
import java.util.List;
import java.util.Objects;


/**
 * The card for presenting a carousel of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs();

    /**
     * Carousel items.
     * 
     */
    @Import(name="items", required=true)
      private final Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> items;

    public Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> getItems() {
        return this.items;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs(Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> items) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs() {
        this.items = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(Output<List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectItemArgs> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageCarouselSelectArgs(items);
        }
    }
}
