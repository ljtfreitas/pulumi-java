// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay;

import io.pulumi.azurenative.relay.enums.AccessRights;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridConnectionAuthorizationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridConnectionAuthorizationRuleArgs Empty = new HybridConnectionAuthorizationRuleArgs();

    /**
     * The authorization rule name.
     * 
     */
    @InputImport(name="authorizationRuleName")
    private final @Nullable Input<String> authorizationRuleName;

    public Input<String> getAuthorizationRuleName() {
        return this.authorizationRuleName == null ? Input.empty() : this.authorizationRuleName;
    }

    /**
     * The hybrid connection name.
     * 
     */
    @InputImport(name="hybridConnectionName", required=true)
    private final Input<String> hybridConnectionName;

    public Input<String> getHybridConnectionName() {
        return this.hybridConnectionName;
    }

    /**
     * The namespace name
     * 
     */
    @InputImport(name="namespaceName", required=true)
    private final Input<String> namespaceName;

    public Input<String> getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The rights associated with the rule.
     * 
     */
    @InputImport(name="rights", required=true)
    private final Input<List<AccessRights>> rights;

    public Input<List<AccessRights>> getRights() {
        return this.rights;
    }

    public HybridConnectionAuthorizationRuleArgs(
        @Nullable Input<String> authorizationRuleName,
        Input<String> hybridConnectionName,
        Input<String> namespaceName,
        Input<String> resourceGroupName,
        Input<List<AccessRights>> rights) {
        this.authorizationRuleName = authorizationRuleName;
        this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName, "expected parameter 'hybridConnectionName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rights = Objects.requireNonNull(rights, "expected parameter 'rights' to be non-null");
    }

    private HybridConnectionAuthorizationRuleArgs() {
        this.authorizationRuleName = Input.empty();
        this.hybridConnectionName = Input.empty();
        this.namespaceName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.rights = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridConnectionAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationRuleName;
        private Input<String> hybridConnectionName;
        private Input<String> namespaceName;
        private Input<String> resourceGroupName;
        private Input<List<AccessRights>> rights;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridConnectionAuthorizationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationRuleName = defaults.authorizationRuleName;
    	      this.hybridConnectionName = defaults.hybridConnectionName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rights = defaults.rights;
        }

        public Builder setAuthorizationRuleName(@Nullable Input<String> authorizationRuleName) {
            this.authorizationRuleName = authorizationRuleName;
            return this;
        }

        public Builder setAuthorizationRuleName(@Nullable String authorizationRuleName) {
            this.authorizationRuleName = Input.ofNullable(authorizationRuleName);
            return this;
        }

        public Builder setHybridConnectionName(Input<String> hybridConnectionName) {
            this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName);
            return this;
        }

        public Builder setHybridConnectionName(String hybridConnectionName) {
            this.hybridConnectionName = Input.of(Objects.requireNonNull(hybridConnectionName));
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

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRights(Input<List<AccessRights>> rights) {
            this.rights = Objects.requireNonNull(rights);
            return this;
        }

        public Builder setRights(List<AccessRights> rights) {
            this.rights = Input.of(Objects.requireNonNull(rights));
            return this;
        }

        public HybridConnectionAuthorizationRuleArgs build() {
            return new HybridConnectionAuthorizationRuleArgs(authorizationRuleName, hybridConnectionName, namespaceName, resourceGroupName, rights);
        }
    }
}
