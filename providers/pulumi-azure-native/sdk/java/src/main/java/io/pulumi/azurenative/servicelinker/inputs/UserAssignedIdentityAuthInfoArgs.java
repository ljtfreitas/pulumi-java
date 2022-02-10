// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class UserAssignedIdentityAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityAuthInfoArgs Empty = new UserAssignedIdentityAuthInfoArgs();

    @InputImport(name="authType", required=true)
    private final Input<String> authType;

    public Input<String> getAuthType() {
        return this.authType;
    }

    @InputImport(name="clientId", required=true)
    private final Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId;
    }

    @InputImport(name="subscriptionId", required=true)
    private final Input<String> subscriptionId;

    public Input<String> getSubscriptionId() {
        return this.subscriptionId;
    }

    public UserAssignedIdentityAuthInfoArgs(
        Input<String> authType,
        Input<String> clientId,
        Input<String> subscriptionId) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
    }

    private UserAssignedIdentityAuthInfoArgs() {
        this.authType = Input.empty();
        this.clientId = Input.empty();
        this.subscriptionId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> authType;
        private Input<String> clientId;
        private Input<String> subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setAuthType(Input<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public Builder setAuthType(String authType) {
            this.authType = Input.of(Objects.requireNonNull(authType));
            return this;
        }

        public Builder setClientId(Input<String> clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Input.of(Objects.requireNonNull(clientId));
            return this;
        }

        public Builder setSubscriptionId(Input<String> subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Input.of(Objects.requireNonNull(subscriptionId));
            return this;
        }

        public UserAssignedIdentityAuthInfoArgs build() {
            return new UserAssignedIdentityAuthInfoArgs(authType, clientId, subscriptionId);
        }
    }
}