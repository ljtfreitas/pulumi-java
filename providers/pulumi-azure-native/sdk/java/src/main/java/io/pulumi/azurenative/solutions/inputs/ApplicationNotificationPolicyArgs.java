// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.azurenative.solutions.inputs.ApplicationNotificationEndpointArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Managed application notification policy.
 * 
 */
public final class ApplicationNotificationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationNotificationPolicyArgs Empty = new ApplicationNotificationPolicyArgs();

    /**
     * The managed application notification endpoint.
     * 
     */
    @Import(name="notificationEndpoints", required=true)
      private final Output<List<ApplicationNotificationEndpointArgs>> notificationEndpoints;

    public Output<List<ApplicationNotificationEndpointArgs>> getNotificationEndpoints() {
        return this.notificationEndpoints;
    }

    public ApplicationNotificationPolicyArgs(Output<List<ApplicationNotificationEndpointArgs>> notificationEndpoints) {
        this.notificationEndpoints = Objects.requireNonNull(notificationEndpoints, "expected parameter 'notificationEndpoints' to be non-null");
    }

    private ApplicationNotificationPolicyArgs() {
        this.notificationEndpoints = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationNotificationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<ApplicationNotificationEndpointArgs>> notificationEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationNotificationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationEndpoints = defaults.notificationEndpoints;
        }

        public Builder notificationEndpoints(Output<List<ApplicationNotificationEndpointArgs>> notificationEndpoints) {
            this.notificationEndpoints = Objects.requireNonNull(notificationEndpoints);
            return this;
        }

        public Builder notificationEndpoints(List<ApplicationNotificationEndpointArgs> notificationEndpoints) {
            this.notificationEndpoints = Output.of(Objects.requireNonNull(notificationEndpoints));
            return this;
        }
        public ApplicationNotificationPolicyArgs build() {
            return new ApplicationNotificationPolicyArgs(notificationEndpoints);
        }
    }
}
