// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpSetState extends io.pulumi.resources.ResourceArgs {

    public static final IpSetState Empty = new IpSetState();

    /**
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * 
     */
    @Import(name="addresses")
      private final @Nullable Output<List<String>> addresses;

    public Output<List<String>> getAddresses() {
        return this.addresses == null ? Output.empty() : this.addresses;
    }

    /**
     * The Amazon Resource Name (ARN) that identifies the cluster.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A friendly description of the IP set.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    @Import(name="ipAddressVersion")
      private final @Nullable Output<String> ipAddressVersion;

    public Output<String> getIpAddressVersion() {
        return this.ipAddressVersion == null ? Output.empty() : this.ipAddressVersion;
    }

    @Import(name="lockToken")
      private final @Nullable Output<String> lockToken;

    public Output<String> getLockToken() {
        return this.lockToken == null ? Output.empty() : this.lockToken;
    }

    /**
     * A friendly name of the IP set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> getScope() {
        return this.scope == null ? Output.empty() : this.scope;
    }

    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public IpSetState(
        @Nullable Output<List<String>> addresses,
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<String> ipAddressVersion,
        @Nullable Output<String> lockToken,
        @Nullable Output<String> name,
        @Nullable Output<String> scope,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.addresses = addresses;
        this.arn = arn;
        this.description = description;
        this.ipAddressVersion = ipAddressVersion;
        this.lockToken = lockToken;
        this.name = name;
        this.scope = scope;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private IpSetState() {
        this.addresses = Output.empty();
        this.arn = Output.empty();
        this.description = Output.empty();
        this.ipAddressVersion = Output.empty();
        this.lockToken = Output.empty();
        this.name = Output.empty();
        this.scope = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> addresses;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<String> ipAddressVersion;
        private @Nullable Output<String> lockToken;
        private @Nullable Output<String> name;
        private @Nullable Output<String> scope;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.ipAddressVersion = defaults.ipAddressVersion;
    	      this.lockToken = defaults.lockToken;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder addresses(@Nullable Output<List<String>> addresses) {
            this.addresses = addresses;
            return this;
        }

        public Builder addresses(@Nullable List<String> addresses) {
            this.addresses = Output.ofNullable(addresses);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder ipAddressVersion(@Nullable Output<String> ipAddressVersion) {
            this.ipAddressVersion = ipAddressVersion;
            return this;
        }

        public Builder ipAddressVersion(@Nullable String ipAddressVersion) {
            this.ipAddressVersion = Output.ofNullable(ipAddressVersion);
            return this;
        }

        public Builder lockToken(@Nullable Output<String> lockToken) {
            this.lockToken = lockToken;
            return this;
        }

        public Builder lockToken(@Nullable String lockToken) {
            this.lockToken = Output.ofNullable(lockToken);
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

        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }

        public Builder scope(@Nullable String scope) {
            this.scope = Output.ofNullable(scope);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public IpSetState build() {
            return new IpSetState(addresses, arn, description, ipAddressVersion, lockToken, name, scope, tags, tagsAll);
        }
    }
}
