// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NotificationRecipientEmailArgs extends io.pulumi.resources.ResourceArgs {

    public static final NotificationRecipientEmailArgs Empty = new NotificationRecipientEmailArgs();

    /**
     * Email identifier.
     * 
     */
    @InputImport(name="email")
        private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * Notification Name Identifier.
     * 
     */
    @InputImport(name="notificationName", required=true)
        private final Input<String> notificationName;

    public Input<String> getNotificationName() {
        return this.notificationName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @InputImport(name="serviceName", required=true)
        private final Input<String> serviceName;

    public Input<String> getServiceName() {
        return this.serviceName;
    }

    public NotificationRecipientEmailArgs(
        @Nullable Input<String> email,
        Input<String> notificationName,
        Input<String> resourceGroupName,
        Input<String> serviceName) {
        this.email = email;
        this.notificationName = Objects.requireNonNull(notificationName, "expected parameter 'notificationName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private NotificationRecipientEmailArgs() {
        this.email = Input.empty();
        this.notificationName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationRecipientEmailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private Input<String> notificationName;
        private Input<String> resourceGroupName;
        private Input<String> serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(NotificationRecipientEmailArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.notificationName = defaults.notificationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setNotificationName(Input<String> notificationName) {
            this.notificationName = Objects.requireNonNull(notificationName);
            return this;
        }

        public Builder setNotificationName(String notificationName) {
            this.notificationName = Input.of(Objects.requireNonNull(notificationName));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServiceName(Input<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Input.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public NotificationRecipientEmailArgs build() {
            return new NotificationRecipientEmailArgs(email, notificationName, resourceGroupName, serviceName);
        }
    }
}
