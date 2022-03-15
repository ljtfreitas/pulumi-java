// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The suggestion chip message that allows the user to jump out to the app or website associated with this agent.
 * 
 */
public final class GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs Empty = new GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs();

    /**
     * The name of the app or site this chip is linking to.
     * 
     */
    @Import(name="destinationName", required=true)
      private final Output<String> destinationName;

    public Output<String> getDestinationName() {
        return this.destinationName;
    }

    /**
     * The URI of the app or site to open when the user taps the suggestion chip.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs(
        Output<String> destinationName,
        Output<String> uri) {
        this.destinationName = Objects.requireNonNull(destinationName, "expected parameter 'destinationName' to be non-null");
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs() {
        this.destinationName = Output.empty();
        this.uri = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> destinationName;
        private Output<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationName = defaults.destinationName;
    	      this.uri = defaults.uri;
        }

        public Builder destinationName(Output<String> destinationName) {
            this.destinationName = Objects.requireNonNull(destinationName);
            return this;
        }

        public Builder destinationName(String destinationName) {
            this.destinationName = Output.of(Objects.requireNonNull(destinationName));
            return this;
        }

        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }

        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }
        public GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs build() {
            return new GoogleCloudDialogflowV2beta1IntentMessageLinkOutSuggestionArgs(destinationName, uri);
        }
    }
}
