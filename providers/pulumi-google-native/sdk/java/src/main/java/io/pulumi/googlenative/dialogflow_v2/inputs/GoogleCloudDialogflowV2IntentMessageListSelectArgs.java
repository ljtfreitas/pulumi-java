// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2.inputs.GoogleCloudDialogflowV2IntentMessageListSelectItemArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The card for presenting a list of options to select from.
 * 
 */
public final class GoogleCloudDialogflowV2IntentMessageListSelectArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2IntentMessageListSelectArgs Empty = new GoogleCloudDialogflowV2IntentMessageListSelectArgs();

    /**
     * List items.
     * 
     */
    @Import(name="items", required=true)
      private final Output<List<GoogleCloudDialogflowV2IntentMessageListSelectItemArgs>> items;

    public Output<List<GoogleCloudDialogflowV2IntentMessageListSelectItemArgs>> getItems() {
        return this.items;
    }

    /**
     * Optional. Subtitle of the list.
     * 
     */
    @Import(name="subtitle")
      private final @Nullable Output<String> subtitle;

    public Output<String> getSubtitle() {
        return this.subtitle == null ? Output.empty() : this.subtitle;
    }

    /**
     * Optional. The overall title of the list.
     * 
     */
    @Import(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    public GoogleCloudDialogflowV2IntentMessageListSelectArgs(
        Output<List<GoogleCloudDialogflowV2IntentMessageListSelectItemArgs>> items,
        @Nullable Output<String> subtitle,
        @Nullable Output<String> title) {
        this.items = Objects.requireNonNull(items, "expected parameter 'items' to be non-null");
        this.subtitle = subtitle;
        this.title = title;
    }

    private GoogleCloudDialogflowV2IntentMessageListSelectArgs() {
        this.items = Output.empty();
        this.subtitle = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2IntentMessageListSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GoogleCloudDialogflowV2IntentMessageListSelectItemArgs>> items;
        private @Nullable Output<String> subtitle;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2IntentMessageListSelectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
    	      this.subtitle = defaults.subtitle;
    	      this.title = defaults.title;
        }

        public Builder items(Output<List<GoogleCloudDialogflowV2IntentMessageListSelectItemArgs>> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }

        public Builder items(List<GoogleCloudDialogflowV2IntentMessageListSelectItemArgs> items) {
            this.items = Output.of(Objects.requireNonNull(items));
            return this;
        }

        public Builder subtitle(@Nullable Output<String> subtitle) {
            this.subtitle = subtitle;
            return this;
        }

        public Builder subtitle(@Nullable String subtitle) {
            this.subtitle = Output.ofNullable(subtitle);
            return this;
        }

        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public GoogleCloudDialogflowV2IntentMessageListSelectArgs build() {
            return new GoogleCloudDialogflowV2IntentMessageListSelectArgs(items, subtitle, title);
        }
    }
}
