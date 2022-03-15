// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a phone number for telephony integration. It allows for connecting a particular conversation over telephony.
 * 
 */
public final class GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse Empty = new GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse();

    /**
     * The phone number to connect to this conversation.
     * 
     */
    @Import(name="phoneNumber", required=true)
      private final String phoneNumber;

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse(String phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse() {
        this.phoneNumber = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse build() {
            return new GoogleCloudDialogflowV2beta1ConversationPhoneNumberResponse(phoneNumber);
        }
    }
}
