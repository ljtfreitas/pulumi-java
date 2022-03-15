// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.solutions.inputs;

import io.pulumi.azurenative.solutions.inputs.ApplicationNotificationEndpointResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * Managed application notification policy.
 * 
 */
public final class ApplicationNotificationPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationNotificationPolicyResponse Empty = new ApplicationNotificationPolicyResponse();

    /**
     * The managed application notification endpoint.
     * 
     */
    @Import(name="notificationEndpoints", required=true)
      private final List<ApplicationNotificationEndpointResponse> notificationEndpoints;

    public List<ApplicationNotificationEndpointResponse> getNotificationEndpoints() {
        return this.notificationEndpoints;
    }

    public ApplicationNotificationPolicyResponse(List<ApplicationNotificationEndpointResponse> notificationEndpoints) {
        this.notificationEndpoints = Objects.requireNonNull(notificationEndpoints, "expected parameter 'notificationEndpoints' to be non-null");
    }

    private ApplicationNotificationPolicyResponse() {
        this.notificationEndpoints = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationNotificationPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ApplicationNotificationEndpointResponse> notificationEndpoints;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationNotificationPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.notificationEndpoints = defaults.notificationEndpoints;
        }

        public Builder notificationEndpoints(List<ApplicationNotificationEndpointResponse> notificationEndpoints) {
            this.notificationEndpoints = Objects.requireNonNull(notificationEndpoints);
            return this;
        }
        public ApplicationNotificationPolicyResponse build() {
            return new ApplicationNotificationPolicyResponse(notificationEndpoints);
        }
    }
}
