// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.notificationhubs.inputs.SharedAccessAuthorizationRulePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceAuthorizationRuleArgs Empty = new NamespaceAuthorizationRuleArgs();

    /**
     * Authorization Rule Name.
     * 
     */
    @InputImport(name="authorizationRuleName")
    private final @Nullable Input<String> authorizationRuleName;

    public Input<String> getAuthorizationRuleName() {
        return this.authorizationRuleName == null ? Input.empty() : this.authorizationRuleName;
    }

    /**
     * The namespace name.
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Properties of the Namespace AuthorizationRules.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<SharedAccessAuthorizationRulePropertiesArgs> properties;

    public Input<SharedAccessAuthorizationRulePropertiesArgs> getProperties() {
        return this.properties;
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

    public NamespaceAuthorizationRuleArgs(
        @Nullable Input<String> authorizationRuleName,
        Input<String> namespaceName,
        Input<SharedAccessAuthorizationRulePropertiesArgs> properties,
        Input<String> resourceGroupName) {
        this.authorizationRuleName = authorizationRuleName;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private NamespaceAuthorizationRuleArgs() {
        this.authorizationRuleName = Input.empty();
        this.namespaceName = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationRuleName;
        private Input<String> namespaceName;
        private Input<SharedAccessAuthorizationRulePropertiesArgs> properties;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAuthorizationRuleName(@Nullable Input<String> authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder setAuthorizationRuleName(@Nullable String authorizationRuleName) {
            this.authorizationRuleName = Input.ofNullable(authorizationRuleName);
            return this;
        }

        public Builder setNamespaceName(Input<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Input.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder setProperties(Input<SharedAccessAuthorizationRulePropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(SharedAccessAuthorizationRulePropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
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

        public NamespaceAuthorizationRuleArgs build() {
            return new NamespaceAuthorizationRuleArgs(authorizationRuleName, namespaceName, properties, resourceGroupName);
        }
    }
}
