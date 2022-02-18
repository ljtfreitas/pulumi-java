// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetNotificationHubAuthorizationRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNotificationHubAuthorizationRuleArgs Empty = new GetNotificationHubAuthorizationRuleArgs();

    /**
     * authorization rule name.
     * 
     */
    @InputImport(name="authorizationRuleName", required=true)
    private final String authorizationRuleName;

    public String getAuthorizationRuleName() {
        return this.authorizationRuleName;
    }

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * The notification hub name.
     * 
     */
    @InputImport(name="notificationHubName", required=true)
    private final String notificationHubName;

    public String getNotificationHubName() {
        return this.notificationHubName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetNotificationHubAuthorizationRuleArgs(
        String authorizationRuleName,
        String namespaceName,
        String notificationHubName,
        String resourceGroupName) {
        this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName, "expected parameter 'authorizationRuleName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.notificationHubName = Objects.requireNonNull(notificationHubName, "expected parameter 'notificationHubName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetNotificationHubAuthorizationRuleArgs() {
        this.authorizationRuleName = null;
        this.namespaceName = null;
        this.notificationHubName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNotificationHubAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationRuleName;
        private String namespaceName;
        private String notificationHubName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNotificationHubAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.notificationHubName = defaults.notificationHubName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAuthorizationRuleName(String authorizationRuleName) {
            this.authorizationRuleName = Objects.requireNonNull(authorizationRuleName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNotificationHubName(String notificationHubName) {
            this.notificationHubName = Objects.requireNonNull(notificationHubName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetNotificationHubAuthorizationRuleArgs build() {
            return new GetNotificationHubAuthorizationRuleArgs(authorizationRuleName, namespaceName, notificationHubName, resourceGroupName);
        }
    }
}
