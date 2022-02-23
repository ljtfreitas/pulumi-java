// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents the signal that telles the client to transfer the phone call connected to the agent to a third-party endpoint.
 * 
 */
public final class GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs Empty = new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs();

    /**
     * Transfer the call to a phone number in [E.164 format](https://en.wikipedia.org/wiki/E.164).
     * 
     */
    @InputImport(name="phoneNumber")
      private final @Nullable Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber == null ? Input.empty() : this.phoneNumber;
    }

    public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs(@Nullable Input<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs() {
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setPhoneNumber(@Nullable Input<String> phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setPhoneNumber(@Nullable String phoneNumber) {
            this.phoneNumber = Input.ofNullable(phoneNumber);
            return this;
        }
        public GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs build() {
            return new GoogleCloudDialogflowCxV3ResponseMessageTelephonyTransferCallArgs(phoneNumber);
        }
    }
}
