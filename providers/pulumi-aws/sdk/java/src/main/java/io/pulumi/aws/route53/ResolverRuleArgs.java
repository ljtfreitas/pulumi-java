// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.aws.route53.inputs.ResolverRuleTargetIpArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverRuleArgs Empty = new ResolverRuleArgs();

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified using `target_ip`.
     * 
     */
    @InputImport(name="domainName", required=true)
    private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * A friendly name that lets you easily find a rule in the Resolver dashboard in the Route 53 console.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the outbound resolver endpoint that you want to use to route DNS queries to the IP addresses that you specify using `target_ip`.
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @InputImport(name="resolverEndpointId")
    private final @Nullable Input<String> resolverEndpointId;

    public Input<String> getResolverEndpointId() {
        return this.resolverEndpointId == null ? Input.empty() : this.resolverEndpointId;
    }

    /**
     * The rule type. Valid values are `FORWARD`, `SYSTEM` and `RECURSIVE`.
     * 
     */
    @InputImport(name="ruleType", required=true)
    private final Input<String> ruleType;

    public Input<String> getRuleType() {
        return this.ruleType;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * Configuration block(s) indicating the IPs that you want Resolver to forward DNS queries to (documented below).
     * This argument should only be specified for `FORWARD` type rules.
     * 
     */
    @InputImport(name="targetIps")
    private final @Nullable Input<List<ResolverRuleTargetIpArgs>> targetIps;

    public Input<List<ResolverRuleTargetIpArgs>> getTargetIps() {
        return this.targetIps == null ? Input.empty() : this.targetIps;
    }

    public ResolverRuleArgs(
        Input<String> domainName,
        @Nullable Input<String> name,
        @Nullable Input<String> resolverEndpointId,
        Input<String> ruleType,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<ResolverRuleTargetIpArgs>> targetIps) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.name = name;
        this.resolverEndpointId = resolverEndpointId;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.tags = tags;
        this.targetIps = targetIps;
    }

    private ResolverRuleArgs() {
        this.domainName = Input.empty();
        this.name = Input.empty();
        this.resolverEndpointId = Input.empty();
        this.ruleType = Input.empty();
        this.tags = Input.empty();
        this.targetIps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> resolverEndpointId;
        private Input<String> ruleType;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<ResolverRuleTargetIpArgs>> targetIps;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.name = defaults.name;
    	      this.resolverEndpointId = defaults.resolverEndpointId;
    	      this.ruleType = defaults.ruleType;
    	      this.tags = defaults.tags;
    	      this.targetIps = defaults.targetIps;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setResolverEndpointId(@Nullable Input<String> resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }

        public Builder setResolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = Input.ofNullable(resolverEndpointId);
            return this;
        }

        public Builder setRuleType(Input<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Input.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTargetIps(@Nullable Input<List<ResolverRuleTargetIpArgs>> targetIps) {
            this.targetIps = targetIps;
            return this;
        }

        public Builder setTargetIps(@Nullable List<ResolverRuleTargetIpArgs> targetIps) {
            this.targetIps = Input.ofNullable(targetIps);
            return this;
        }
        public ResolverRuleArgs build() {
            return new ResolverRuleArgs(domainName, name, resolverEndpointId, ruleType, tags, targetIps);
        }
    }
}
