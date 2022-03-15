// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PolicyRule holds information that describes a policy rule, but does not contain information about who the rule applies to or which namespace the rule applies to.
 * 
 */
public final class PolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyRuleArgs Empty = new PolicyRuleArgs();

    /**
     * APIGroups is the name of the APIGroup that contains the resources.  If multiple API groups are specified, any action requested against one of the enumerated resources in any API group will be allowed.
     * 
     */
    @Import(name="apiGroups")
      private final @Nullable Output<List<String>> apiGroups;

    public Output<List<String>> getApiGroups() {
        return this.apiGroups == null ? Output.empty() : this.apiGroups;
    }

    /**
     * NonResourceURLs is a set of partial urls that a user should have access to.  *s are allowed, but only as the full, final step in the path This name is intentionally different than the internal type so that the DefaultConvert works nicely and because the ordering may be different. Since non-resource URLs are not namespaced, this field is only applicable for ClusterRoles referenced from a ClusterRoleBinding. Rules can either apply to API resources (such as "pods" or "secrets") or non-resource URL paths (such as "/api"),  but not both.
     * 
     */
    @Import(name="nonResourceURLs")
      private final @Nullable Output<List<String>> nonResourceURLs;

    public Output<List<String>> getNonResourceURLs() {
        return this.nonResourceURLs == null ? Output.empty() : this.nonResourceURLs;
    }

    /**
     * ResourceNames is an optional white list of names that the rule applies to.  An empty set means that everything is allowed.
     * 
     */
    @Import(name="resourceNames")
      private final @Nullable Output<List<String>> resourceNames;

    public Output<List<String>> getResourceNames() {
        return this.resourceNames == null ? Output.empty() : this.resourceNames;
    }

    /**
     * Resources is a list of resources this rule applies to.  ResourceAll represents all resources.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    /**
     * Verbs is a list of Verbs that apply to ALL the ResourceKinds and AttributeRestrictions contained in this rule.  VerbAll represents all kinds.
     * 
     */
    @Import(name="verbs", required=true)
      private final Output<List<String>> verbs;

    public Output<List<String>> getVerbs() {
        return this.verbs;
    }

    public PolicyRuleArgs(
        @Nullable Output<List<String>> apiGroups,
        @Nullable Output<List<String>> nonResourceURLs,
        @Nullable Output<List<String>> resourceNames,
        @Nullable Output<List<String>> resources,
        Output<List<String>> verbs) {
        this.apiGroups = apiGroups;
        this.nonResourceURLs = nonResourceURLs;
        this.resourceNames = resourceNames;
        this.resources = resources;
        this.verbs = Objects.requireNonNull(verbs, "expected parameter 'verbs' to be non-null");
    }

    private PolicyRuleArgs() {
        this.apiGroups = Output.empty();
        this.nonResourceURLs = Output.empty();
        this.resourceNames = Output.empty();
        this.resources = Output.empty();
        this.verbs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> apiGroups;
        private @Nullable Output<List<String>> nonResourceURLs;
        private @Nullable Output<List<String>> resourceNames;
        private @Nullable Output<List<String>> resources;
        private Output<List<String>> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiGroups = defaults.apiGroups;
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.resourceNames = defaults.resourceNames;
    	      this.resources = defaults.resources;
    	      this.verbs = defaults.verbs;
        }

        public Builder apiGroups(@Nullable Output<List<String>> apiGroups) {
            this.apiGroups = apiGroups;
            return this;
        }

        public Builder apiGroups(@Nullable List<String> apiGroups) {
            this.apiGroups = Output.ofNullable(apiGroups);
            return this;
        }

        public Builder nonResourceURLs(@Nullable Output<List<String>> nonResourceURLs) {
            this.nonResourceURLs = nonResourceURLs;
            return this;
        }

        public Builder nonResourceURLs(@Nullable List<String> nonResourceURLs) {
            this.nonResourceURLs = Output.ofNullable(nonResourceURLs);
            return this;
        }

        public Builder resourceNames(@Nullable Output<List<String>> resourceNames) {
            this.resourceNames = resourceNames;
            return this;
        }

        public Builder resourceNames(@Nullable List<String> resourceNames) {
            this.resourceNames = Output.ofNullable(resourceNames);
            return this;
        }

        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable List<String> resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }

        public Builder verbs(Output<List<String>> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public Builder verbs(List<String> verbs) {
            this.verbs = Output.of(Objects.requireNonNull(verbs));
            return this;
        }
        public PolicyRuleArgs build() {
            return new PolicyRuleArgs(apiGroups, nonResourceURLs, resourceNames, resources, verbs);
        }
    }
}
