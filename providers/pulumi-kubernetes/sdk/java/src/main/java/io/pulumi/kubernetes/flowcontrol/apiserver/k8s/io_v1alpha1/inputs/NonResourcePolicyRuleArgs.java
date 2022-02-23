// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.flowcontrol.apiserver.k8s.io_v1alpha1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * NonResourcePolicyRule is a predicate that matches non-resource requests according to their verb and the target non-resource URL. A NonResourcePolicyRule matches a request if and only if both (a) at least one member of verbs matches the request and (b) at least one member of nonResourceURLs matches the request.
 * 
 */
public final class NonResourcePolicyRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final NonResourcePolicyRuleArgs Empty = new NonResourcePolicyRuleArgs();

    /**
     * `nonResourceURLs` is a set of url prefixes that a user should have access to and may not be empty. For example:
     *   - "/healthz" is legal
     *   - "/hea*" is illegal
     *   - "/hea" is legal but matches nothing
     *   - "/hea/*" also matches nothing
     *   - "/healthz/*" matches all per-component health checks.
     *     "*" matches all non-resource urls. if it is present, it must be the only entry. Required.
     * 
     */
    @InputImport(name="nonResourceURLs", required=true)
        private final Input<List<String>> nonResourceURLs;

    public Input<List<String>> getNonResourceURLs() {
        return this.nonResourceURLs;
    }

    /**
     * `verbs` is a list of matching verbs and may not be empty. "*" matches all verbs. If it is present, it must be the only entry. Required.
     * 
     */
    @InputImport(name="verbs", required=true)
        private final Input<List<String>> verbs;

    public Input<List<String>> getVerbs() {
        return this.verbs;
    }

    public NonResourcePolicyRuleArgs(
        Input<List<String>> nonResourceURLs,
        Input<List<String>> verbs) {
        this.nonResourceURLs = Objects.requireNonNull(nonResourceURLs, "expected parameter 'nonResourceURLs' to be non-null");
        this.verbs = Objects.requireNonNull(verbs, "expected parameter 'verbs' to be non-null");
    }

    private NonResourcePolicyRuleArgs() {
        this.nonResourceURLs = Input.empty();
        this.verbs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NonResourcePolicyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> nonResourceURLs;
        private Input<List<String>> verbs;

        public Builder() {
    	      // Empty
        }

        public Builder(NonResourcePolicyRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nonResourceURLs = defaults.nonResourceURLs;
    	      this.verbs = defaults.verbs;
        }

        public Builder setNonResourceURLs(Input<List<String>> nonResourceURLs) {
            this.nonResourceURLs = Objects.requireNonNull(nonResourceURLs);
            return this;
        }

        public Builder setNonResourceURLs(List<String> nonResourceURLs) {
            this.nonResourceURLs = Input.of(Objects.requireNonNull(nonResourceURLs));
            return this;
        }

        public Builder setVerbs(Input<List<String>> verbs) {
            this.verbs = Objects.requireNonNull(verbs);
            return this;
        }

        public Builder setVerbs(List<String> verbs) {
            this.verbs = Input.of(Objects.requireNonNull(verbs));
            return this;
        }
        public NonResourcePolicyRuleArgs build() {
            return new NonResourcePolicyRuleArgs(nonResourceURLs, verbs);
        }
    }
}
