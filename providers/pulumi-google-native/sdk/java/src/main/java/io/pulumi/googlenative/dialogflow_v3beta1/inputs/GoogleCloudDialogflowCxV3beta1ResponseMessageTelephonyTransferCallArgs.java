// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs Empty = new GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs();

    @InputImport(name="phoneNumber")
    private final @Nullable Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber == null ? Input.empty() : this.phoneNumber;
    }

    public GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs(@Nullable Input<String> phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs() {
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs defaults) {
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

        public GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs build() {
            return new GoogleCloudDialogflowCxV3beta1ResponseMessageTelephonyTransferCallArgs(phoneNumber);
        }
    }
}