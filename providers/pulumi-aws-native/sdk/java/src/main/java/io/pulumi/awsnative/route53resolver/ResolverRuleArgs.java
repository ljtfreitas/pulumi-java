// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver;

import io.pulumi.awsnative.route53resolver.enums.ResolverRuleRuleType;
import io.pulumi.awsnative.route53resolver.inputs.ResolverRuleTagArgs;
import io.pulumi.awsnative.route53resolver.inputs.ResolverRuleTargetAddressArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverRuleArgs Empty = new ResolverRuleArgs();

    /**
     * DNS queries for this domain name are forwarded to the IP addresses that are specified in TargetIps
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * The name for the Resolver rule
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    @Import(name="resolverEndpointId")
      private final @Nullable Output<String> resolverEndpointId;

    public Output<String> getResolverEndpointId() {
        return this.resolverEndpointId == null ? Output.empty() : this.resolverEndpointId;
    }

    /**
     * When you want to forward DNS queries for specified domain name to resolvers on your network, specify FORWARD. When you have a forwarding rule to forward DNS queries for a domain to your network and you want Resolver to process queries for a subdomain of that domain, specify SYSTEM.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<ResolverRuleRuleType> ruleType;

    public Output<ResolverRuleRuleType> getRuleType() {
        return this.ruleType;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ResolverRuleTagArgs>> tags;

    public Output<List<ResolverRuleTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * An array that contains the IP addresses and ports that an outbound endpoint forwards DNS queries to. Typically, these are the IP addresses of DNS resolvers on your network. Specify IPv4 addresses. IPv6 is not supported.
     * 
     */
    @Import(name="targetIps")
      private final @Nullable Output<List<ResolverRuleTargetAddressArgs>> targetIps;

    public Output<List<ResolverRuleTargetAddressArgs>> getTargetIps() {
        return this.targetIps == null ? Output.empty() : this.targetIps;
    }

    public ResolverRuleArgs(
        Output<String> domainName,
        @Nullable Output<String> name,
        @Nullable Output<String> resolverEndpointId,
        Output<ResolverRuleRuleType> ruleType,
        @Nullable Output<List<ResolverRuleTagArgs>> tags,
        @Nullable Output<List<ResolverRuleTargetAddressArgs>> targetIps) {
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.name = name;
        this.resolverEndpointId = resolverEndpointId;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.tags = tags;
        this.targetIps = targetIps;
    }

    private ResolverRuleArgs() {
        this.domainName = Output.empty();
        this.name = Output.empty();
        this.resolverEndpointId = Output.empty();
        this.ruleType = Output.empty();
        this.tags = Output.empty();
        this.targetIps = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> domainName;
        private @Nullable Output<String> name;
        private @Nullable Output<String> resolverEndpointId;
        private Output<ResolverRuleRuleType> ruleType;
        private @Nullable Output<List<ResolverRuleTagArgs>> tags;
        private @Nullable Output<List<ResolverRuleTargetAddressArgs>> targetIps;

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

        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder resolverEndpointId(@Nullable Output<String> resolverEndpointId) {
            this.resolverEndpointId = resolverEndpointId;
            return this;
        }

        public Builder resolverEndpointId(@Nullable String resolverEndpointId) {
            this.resolverEndpointId = Output.ofNullable(resolverEndpointId);
            return this;
        }

        public Builder ruleType(Output<ResolverRuleRuleType> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder ruleType(ResolverRuleRuleType ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public Builder tags(@Nullable Output<List<ResolverRuleTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<ResolverRuleTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder targetIps(@Nullable Output<List<ResolverRuleTargetAddressArgs>> targetIps) {
            this.targetIps = targetIps;
            return this;
        }

        public Builder targetIps(@Nullable List<ResolverRuleTargetAddressArgs> targetIps) {
            this.targetIps = Output.ofNullable(targetIps);
            return this;
        }
        public ResolverRuleArgs build() {
            return new ResolverRuleArgs(domainName, name, resolverEndpointId, ruleType, tags, targetIps);
        }
    }
}
