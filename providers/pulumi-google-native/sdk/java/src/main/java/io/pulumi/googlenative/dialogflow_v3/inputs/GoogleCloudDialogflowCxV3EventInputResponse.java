// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents the event to trigger.
 * 
 */
public final class GoogleCloudDialogflowCxV3EventInputResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3EventInputResponse Empty = new GoogleCloudDialogflowCxV3EventInputResponse();

    /**
     * Name of the event.
     * 
     */
    @InputImport(name="event", required=true)
      private final String event;

    public String getEvent() {
        return this.event;
    }

    public GoogleCloudDialogflowCxV3EventInputResponse(String event) {
        this.event = Objects.requireNonNull(event, "expected parameter 'event' to be non-null");
    }

    private GoogleCloudDialogflowCxV3EventInputResponse() {
        this.event = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3EventInputResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String event;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3EventInputResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.event = defaults.event;
        }

        public Builder setEvent(String event) {
            this.event = Objects.requireNonNull(event);
            return this;
        }
        public GoogleCloudDialogflowCxV3EventInputResponse build() {
            return new GoogleCloudDialogflowCxV3EventInputResponse(event);
        }
    }
}
