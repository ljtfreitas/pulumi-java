// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Indicates that the conversation should be handed off to a live agent. Dialogflow only uses this to determine which conversations were handed off to a human agent for measurement purposes. What else to do with this signal is up to you and your handoff procedures. You may set this, for example: * In the entry_fulfillment of a Page if entering the page indicates something went extremely wrong in the conversation. * In a webhook response when you determine that the customer issue can only be handled by a human.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs();

    /**
     * Custom metadata for your handoff procedure. Dialogflow doesn't impose any structure on this.
     * 
     */
    @InputImport(name="metadata")
      private final @Nullable Input<Map<String,String>> metadata;

    public Input<Map<String,String>> getMetadata() {
        return this.metadata == null ? Input.empty() : this.metadata;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs(@Nullable Input<Map<String,String>> metadata) {
        this.metadata = metadata;
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs() {
        this.metadata = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> metadata;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
        }

        public Builder setMetadata(@Nullable Input<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = Input.ofNullable(metadata);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageLiveAgentHandoffArgs(metadata);
        }
    }
}
