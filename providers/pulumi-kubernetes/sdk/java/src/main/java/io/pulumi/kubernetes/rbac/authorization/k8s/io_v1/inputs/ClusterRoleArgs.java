// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.kubernetes.meta_v1.inputs.ObjectMetaArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.inputs.AggregationRuleArgs;
import io.pulumi.kubernetes.rbac.authorization.k8s.io_v1.inputs.PolicyRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ClusterRole is a cluster level, logical grouping of PolicyRules that can be referenced as a unit by a RoleBinding or ClusterRoleBinding.
 * 
 */
public final class ClusterRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterRoleArgs Empty = new ClusterRoleArgs();

    /**
     * AggregationRule is an optional field that describes how to build the Rules for this ClusterRole. If AggregationRule is set, then the Rules are controller managed and direct changes to Rules will be stomped by the controller.
     * 
     */
    @Import(name="aggregationRule")
      private final @Nullable Output<AggregationRuleArgs> aggregationRule;

    public Output<AggregationRuleArgs> getAggregationRule() {
        return this.aggregationRule == null ? Output.empty() : this.aggregationRule;
    }

    /**
     * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
     * 
     */
    @Import(name="apiVersion")
      private final @Nullable Output<String> apiVersion;

    public Output<String> getApiVersion() {
        return this.apiVersion == null ? Output.empty() : this.apiVersion;
    }

    /**
     * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Standard object's metadata.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<ObjectMetaArgs> metadata;

    public Output<ObjectMetaArgs> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * Rules holds all the PolicyRules for this ClusterRole
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<PolicyRuleArgs>> rules;

    public Output<List<PolicyRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    public ClusterRoleArgs(
        @Nullable Output<AggregationRuleArgs> aggregationRule,
        @Nullable Output<String> apiVersion,
        @Nullable Output<String> kind,
        @Nullable Output<ObjectMetaArgs> metadata,
        @Nullable Output<List<PolicyRuleArgs>> rules) {
        this.aggregationRule = aggregationRule;
        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.rules = rules;
    }

    private ClusterRoleArgs() {
        this.aggregationRule = Output.empty();
        this.apiVersion = Output.empty();
        this.kind = Output.empty();
        this.metadata = Output.empty();
        this.rules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AggregationRuleArgs> aggregationRule;
        private @Nullable Output<String> apiVersion;
        private @Nullable Output<String> kind;
        private @Nullable Output<ObjectMetaArgs> metadata;
        private @Nullable Output<List<PolicyRuleArgs>> rules;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aggregationRule = defaults.aggregationRule;
    	      this.apiVersion = defaults.apiVersion;
    	      this.kind = defaults.kind;
    	      this.metadata = defaults.metadata;
    	      this.rules = defaults.rules;
        }

        public Builder aggregationRule(@Nullable Output<AggregationRuleArgs> aggregationRule) {
            this.aggregationRule = aggregationRule;
            return this;
        }

        public Builder aggregationRule(@Nullable AggregationRuleArgs aggregationRule) {
            this.aggregationRule = Output.ofNullable(aggregationRule);
            return this;
        }

        public Builder apiVersion(@Nullable Output<String> apiVersion) {
            this.apiVersion = apiVersion;
            return this;
        }

        public Builder apiVersion(@Nullable String apiVersion) {
            this.apiVersion = Output.ofNullable(apiVersion);
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder metadata(@Nullable Output<ObjectMetaArgs> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder metadata(@Nullable ObjectMetaArgs metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }

        public Builder rules(@Nullable Output<List<PolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<PolicyRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public ClusterRoleArgs build() {
            return new ClusterRoleArgs(aggregationRule, apiVersion, kind, metadata, rules);
        }
    }
}
