// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDialogflowV2ConversationPhoneNumberResponse {
    /**
     * The phone number to connect to this conversation.
     * 
     */
    private final String phoneNumber;

    @CustomType.Constructor
    private GoogleCloudDialogflowV2ConversationPhoneNumberResponse(@CustomType.Parameter("phoneNumber") String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * The phone number to connect to this conversation.
     * 
    */
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2ConversationPhoneNumberResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2ConversationPhoneNumberResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }
        public GoogleCloudDialogflowV2ConversationPhoneNumberResponse build() {
            return new GoogleCloudDialogflowV2ConversationPhoneNumberResponse(phoneNumber);
        }
    }
}
