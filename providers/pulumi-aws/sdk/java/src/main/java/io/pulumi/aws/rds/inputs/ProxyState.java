// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.aws.rds.inputs.ProxyAuthGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProxyState extends io.pulumi.resources.ResourceArgs {

    public static final ProxyState Empty = new ProxyState();

    /**
     * The Amazon Resource Name (ARN) for the proxy.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Configuration block(s) with authorization mechanisms to connect to the associated instances or clusters. Described below.
     * 
     */
    @Import(name="auths")
      private final @Nullable Output<List<ProxyAuthGetArgs>> auths;

    public Output<List<ProxyAuthGetArgs>> getAuths() {
        return this.auths == null ? Output.empty() : this.auths;
    }

    /**
     * Whether the proxy includes detailed information about SQL statements in its logs. This information helps you to debug issues involving SQL behavior or the performance and scalability of the proxy connections. The debug information includes the text of SQL statements that you submit through the proxy. Thus, only enable this setting when needed for debugging, and only when you have security measures in place to safeguard any sensitive information that appears in the logs.
     * 
     */
    @Import(name="debugLogging")
      private final @Nullable Output<Boolean> debugLogging;

    public Output<Boolean> getDebugLogging() {
        return this.debugLogging == null ? Output.empty() : this.debugLogging;
    }

    /**
     * The endpoint that you can use to connect to the proxy. You include the endpoint value in the connection string for a database client application.
     * 
     */
    @Import(name="endpoint")
      private final @Nullable Output<String> endpoint;

    public Output<String> getEndpoint() {
        return this.endpoint == null ? Output.empty() : this.endpoint;
    }

    /**
     * The kinds of databases that the proxy can connect to. This value determines which database network protocol the proxy recognizes when it interprets network traffic to and from the database. The engine family applies to MySQL and PostgreSQL for both RDS and Aurora. Valid values are `MYSQL` and `POSTGRESQL`.
     * 
     */
    @Import(name="engineFamily")
      private final @Nullable Output<String> engineFamily;

    public Output<String> getEngineFamily() {
        return this.engineFamily == null ? Output.empty() : this.engineFamily;
    }

    /**
     * The number of seconds that a connection to the proxy can be inactive before the proxy disconnects it. You can set this value higher or lower than the connection timeout limit for the associated database.
     * 
     */
    @Import(name="idleClientTimeout")
      private final @Nullable Output<Integer> idleClientTimeout;

    public Output<Integer> getIdleClientTimeout() {
        return this.idleClientTimeout == null ? Output.empty() : this.idleClientTimeout;
    }

    /**
     * The identifier for the proxy. This name must be unique for all proxies owned by your AWS account in the specified AWS Region. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A Boolean parameter that specifies whether Transport Layer Security (TLS) encryption is required for connections to the proxy. By enabling this setting, you can enforce encrypted TLS connections to the proxy.
     * 
     */
    @Import(name="requireTls")
      private final @Nullable Output<Boolean> requireTls;

    public Output<Boolean> getRequireTls() {
        return this.requireTls == null ? Output.empty() : this.requireTls;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that the proxy uses to access secrets in AWS Secrets Manager.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    /**
     * A mapping of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

    /**
     * One or more VPC security group IDs to associate with the new proxy.
     * 
     */
    @Import(name="vpcSecurityGroupIds")
      private final @Nullable Output<List<String>> vpcSecurityGroupIds;

    public Output<List<String>> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds == null ? Output.empty() : this.vpcSecurityGroupIds;
    }

    /**
     * One or more VPC subnet IDs to associate with the new proxy.
     * 
     */
    @Import(name="vpcSubnetIds")
      private final @Nullable Output<List<String>> vpcSubnetIds;

    public Output<List<String>> getVpcSubnetIds() {
        return this.vpcSubnetIds == null ? Output.empty() : this.vpcSubnetIds;
    }

    public ProxyState(
        @Nullable Output<String> arn,
        @Nullable Output<List<ProxyAuthGetArgs>> auths,
        @Nullable Output<Boolean> debugLogging,
        @Nullable Output<String> endpoint,
        @Nullable Output<String> engineFamily,
        @Nullable Output<Integer> idleClientTimeout,
        @Nullable Output<String> name,
        @Nullable Output<Boolean> requireTls,
        @Nullable Output<String> roleArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<List<String>> vpcSecurityGroupIds,
        @Nullable Output<List<String>> vpcSubnetIds) {
        this.arn = arn;
        this.auths = auths;
        this.debugLogging = debugLogging;
        this.endpoint = endpoint;
        this.engineFamily = engineFamily;
        this.idleClientTimeout = idleClientTimeout;
        this.name = name;
        this.requireTls = requireTls;
        this.roleArn = roleArn;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        this.vpcSubnetIds = vpcSubnetIds;
    }

    private ProxyState() {
        this.arn = Output.empty();
        this.auths = Output.empty();
        this.debugLogging = Output.empty();
        this.endpoint = Output.empty();
        this.engineFamily = Output.empty();
        this.idleClientTimeout = Output.empty();
        this.name = Output.empty();
        this.requireTls = Output.empty();
        this.roleArn = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.vpcSecurityGroupIds = Output.empty();
        this.vpcSubnetIds = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProxyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<ProxyAuthGetArgs>> auths;
        private @Nullable Output<Boolean> debugLogging;
        private @Nullable Output<String> endpoint;
        private @Nullable Output<String> engineFamily;
        private @Nullable Output<Integer> idleClientTimeout;
        private @Nullable Output<String> name;
        private @Nullable Output<Boolean> requireTls;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<List<String>> vpcSecurityGroupIds;
        private @Nullable Output<List<String>> vpcSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(ProxyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.auths = defaults.auths;
    	      this.debugLogging = defaults.debugLogging;
    	      this.endpoint = defaults.endpoint;
    	      this.engineFamily = defaults.engineFamily;
    	      this.idleClientTimeout = defaults.idleClientTimeout;
    	      this.name = defaults.name;
    	      this.requireTls = defaults.requireTls;
    	      this.roleArn = defaults.roleArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder auths(@Nullable Output<List<ProxyAuthGetArgs>> auths) {
            this.auths = auths;
            return this;
        }

        public Builder auths(@Nullable List<ProxyAuthGetArgs> auths) {
            this.auths = Output.ofNullable(auths);
            return this;
        }

        public Builder debugLogging(@Nullable Output<Boolean> debugLogging) {
            this.debugLogging = debugLogging;
            return this;
        }

        public Builder debugLogging(@Nullable Boolean debugLogging) {
            this.debugLogging = Output.ofNullable(debugLogging);
            return this;
        }

        public Builder endpoint(@Nullable Output<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder endpoint(@Nullable String endpoint) {
            this.endpoint = Output.ofNullable(endpoint);
            return this;
        }

        public Builder engineFamily(@Nullable Output<String> engineFamily) {
            this.engineFamily = engineFamily;
            return this;
        }

        public Builder engineFamily(@Nullable String engineFamily) {
            this.engineFamily = Output.ofNullable(engineFamily);
            return this;
        }

        public Builder idleClientTimeout(@Nullable Output<Integer> idleClientTimeout) {
            this.idleClientTimeout = idleClientTimeout;
            return this;
        }

        public Builder idleClientTimeout(@Nullable Integer idleClientTimeout) {
            this.idleClientTimeout = Output.ofNullable(idleClientTimeout);
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

        public Builder requireTls(@Nullable Output<Boolean> requireTls) {
            this.requireTls = requireTls;
            return this;
        }

        public Builder requireTls(@Nullable Boolean requireTls) {
            this.requireTls = Output.ofNullable(requireTls);
            return this;
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
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

        public Builder vpcSecurityGroupIds(@Nullable Output<List<String>> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = vpcSecurityGroupIds;
            return this;
        }

        public Builder vpcSecurityGroupIds(@Nullable List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Output.ofNullable(vpcSecurityGroupIds);
            return this;
        }

        public Builder vpcSubnetIds(@Nullable Output<List<String>> vpcSubnetIds) {
            this.vpcSubnetIds = vpcSubnetIds;
            return this;
        }

        public Builder vpcSubnetIds(@Nullable List<String> vpcSubnetIds) {
            this.vpcSubnetIds = Output.ofNullable(vpcSubnetIds);
            return this;
        }
        public ProxyState build() {
            return new ProxyState(arn, auths, debugLogging, endpoint, engineFamily, idleClientTimeout, name, requireTls, roleArn, tags, tagsAll, vpcSecurityGroupIds, vpcSubnetIds);
        }
    }
}
