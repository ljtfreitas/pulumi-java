// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class QuickConnectQuickConnectConfigPhoneConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectQuickConnectConfigPhoneConfigGetArgs Empty = new QuickConnectQuickConnectConfigPhoneConfigGetArgs();

    /**
     * Specifies the phone number in in E.164 format.
     * 
     */
    @InputImport(name="phoneNumber", required=true)
    private final Input<String> phoneNumber;

    public Input<String> getPhoneNumber() {
        return this.phoneNumber;
    }

    public QuickConnectQuickConnectConfigPhoneConfigGetArgs(Input<String> phoneNumber) {
        this.phoneNumber = Objects.requireNonNull(phoneNumber, "expected parameter 'phoneNumber' to be non-null");
    }

    private QuickConnectQuickConnectConfigPhoneConfigGetArgs() {
        this.phoneNumber = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectQuickConnectConfigPhoneConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> phoneNumber;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectQuickConnectConfigPhoneConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.phoneNumber = defaults.phoneNumber;
        }

        public Builder setPhoneNumber(Input<String> phoneNumber) {
            this.phoneNumber = Objects.requireNonNull(phoneNumber);
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = Input.of(Objects.requireNonNull(phoneNumber));
            return this;
        }
        public QuickConnectQuickConnectConfigPhoneConfigGetArgs build() {
            return new QuickConnectQuickConnectConfigPhoneConfigGetArgs(phoneNumber);
        }
    }
}
