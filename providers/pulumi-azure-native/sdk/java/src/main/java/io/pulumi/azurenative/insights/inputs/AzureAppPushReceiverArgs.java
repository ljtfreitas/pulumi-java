// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Azure mobile App push notification receiver.
 * 
 */
public final class AzureAppPushReceiverArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureAppPushReceiverArgs Empty = new AzureAppPushReceiverArgs();

    /**
     * The email address registered for the Azure mobile app.
     * 
     */
    @Import(name="emailAddress", required=true)
      private final Output<String> emailAddress;

    public Output<String> getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * The name of the Azure mobile app push receiver. Names must be unique across all receivers within an action group.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public AzureAppPushReceiverArgs(
        Output<String> emailAddress,
        Output<String> name) {
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AzureAppPushReceiverArgs() {
        this.emailAddress = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureAppPushReceiverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> emailAddress;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureAppPushReceiverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.name = defaults.name;
        }

        public Builder emailAddress(Output<String> emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Output.of(Objects.requireNonNull(emailAddress));
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public AzureAppPushReceiverArgs build() {
            return new AzureAppPushReceiverArgs(emailAddress, name);
        }
    }
}
