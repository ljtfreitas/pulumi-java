// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs;

import io.pulumi.azurenative.notificationhubs.inputs.SharedAccessAuthorizationRulePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceAuthorizationRuleArgs Empty = new NamespaceAuthorizationRuleArgs();

    /**
     * Authorization Rule Name.
     * 
     */
    @Import(name="authorizationRuleName")
      private final @Nullable Output<String> authorizationRuleName;

    public Output<String> getAuthorizationRuleName() {
        return this.authorizationRuleName == null ? Output.empty() : this.authorizationRuleName;
    }

    /**
     * The namespace name.
     * 
     */
    @Import(name="namespaceName", required=true)
      private final Output<String> namespaceName;

    public Output<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Properties of the Namespace AuthorizationRules.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<SharedAccessAuthorizationRulePropertiesArgs> properties;

    public Output<SharedAccessAuthorizationRulePropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public NamespaceAuthorizationRuleArgs(
        @Nullable Output<String> authorizationRuleName,
        Output<String> namespaceName,
        Output<SharedAccessAuthorizationRulePropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.authorizationRuleName = authorizationRuleName;
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private NamespaceAuthorizationRuleArgs() {
        this.authorizationRuleName = Output.empty();
        this.namespaceName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authorizationRuleName;
        private Output<String> namespaceName;
        private Output<SharedAccessAuthorizationRulePropertiesArgs> properties;
        private Output<String> resourceGroupName;

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

        public Builder authorizationRuleName(@Nullable Output<String> authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder authorizationRuleName(@Nullable String authorizationRuleName) {
            this.authorizationRuleName = Output.ofNullable(authorizationRuleName);
            return this;
        }

        public Builder namespaceName(Output<String> namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Output.of(Objects.requireNonNull(namespaceName));
            return this;
        }

        public Builder properties(Output<SharedAccessAuthorizationRulePropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(SharedAccessAuthorizationRulePropertiesArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public NamespaceAuthorizationRuleArgs build() {
            return new NamespaceAuthorizationRuleArgs(authorizationRuleName, namespaceName, properties, resourceGroupName);
        }
    }
}
