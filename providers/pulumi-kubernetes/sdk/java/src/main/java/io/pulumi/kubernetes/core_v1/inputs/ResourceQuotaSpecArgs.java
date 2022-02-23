// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.ScopeSelectorArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceQuotaSpec defines the desired hard limits to enforce for Quota.
 * 
 */
public final class ResourceQuotaSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceQuotaSpecArgs Empty = new ResourceQuotaSpecArgs();

    /**
     * hard is the set of desired hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
     * 
     */
    @InputImport(name="hard")
        private final @Nullable Input<Map<String,String>> hard;

    public Input<Map<String,String>> getHard() {
        return this.hard == null ? Input.empty() : this.hard;
    }

    /**
     * scopeSelector is also a collection of filters like scopes that must match each object tracked by a quota but expressed using ScopeSelectorOperator in combination with possible values. For a resource to match, both scopes AND scopeSelector (if specified in spec), must be matched.
     * 
     */
    @InputImport(name="scopeSelector")
        private final @Nullable Input<ScopeSelectorArgs> scopeSelector;

    public Input<ScopeSelectorArgs> getScopeSelector() {
        return this.scopeSelector == null ? Input.empty() : this.scopeSelector;
    }

    /**
     * A collection of filters that must match each object tracked by a quota. If not specified, the quota matches all objects.
     * 
     */
    @InputImport(name="scopes")
        private final @Nullable Input<List<String>> scopes;

    public Input<List<String>> getScopes() {
        return this.scopes == null ? Input.empty() : this.scopes;
    }

    public ResourceQuotaSpecArgs(
        @Nullable Input<Map<String,String>> hard,
        @Nullable Input<ScopeSelectorArgs> scopeSelector,
        @Nullable Input<List<String>> scopes) {
        this.hard = hard;
        this.scopeSelector = scopeSelector;
        this.scopes = scopes;
    }

    private ResourceQuotaSpecArgs() {
        this.hard = Input.empty();
        this.scopeSelector = Input.empty();
        this.scopes = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceQuotaSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> hard;
        private @Nullable Input<ScopeSelectorArgs> scopeSelector;
        private @Nullable Input<List<String>> scopes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceQuotaSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hard = defaults.hard;
    	      this.scopeSelector = defaults.scopeSelector;
    	      this.scopes = defaults.scopes;
        }

        public Builder setHard(@Nullable Input<Map<String,String>> hard) {
            this.hard = hard;
            return this;
        }

        public Builder setHard(@Nullable Map<String,String> hard) {
            this.hard = Input.ofNullable(hard);
            return this;
        }

        public Builder setScopeSelector(@Nullable Input<ScopeSelectorArgs> scopeSelector) {
            this.scopeSelector = scopeSelector;
            return this;
        }

        public Builder setScopeSelector(@Nullable ScopeSelectorArgs scopeSelector) {
            this.scopeSelector = Input.ofNullable(scopeSelector);
            return this;
        }

        public Builder setScopes(@Nullable Input<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder setScopes(@Nullable List<String> scopes) {
            this.scopes = Input.ofNullable(scopes);
            return this;
        }
        public ResourceQuotaSpecArgs build() {
            return new ResourceQuotaSpecArgs(hard, scopeSelector, scopes);
        }
    }
}
