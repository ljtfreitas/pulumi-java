// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.outputs;

import io.pulumi.aws.rds.outputs.GetProxyAuth;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetProxyResult {
    /**
     * The ARN of the DB Proxy.
     * 
     */
    private final String arn;
    /**
     * The configuration(s) with authorization mechanisms to connect to the associated instance or cluster.
     * 
     */
    private final List<GetProxyAuth> auths;
    /**
     * Whether the proxy includes detailed information about SQL statements in its logs.
     * 
     */
    private final Boolean debugLogging;
    /**
     * The endpoint that you can use to connect to the DB proxy.
     * 
     */
    private final String endpoint;
    /**
     * The kinds of databases that the proxy can connect to.
     * 
     */
    private final String engineFamily;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The number of seconds a connection to the proxy can have no activity before the proxy drops the client connection.
     * 
     */
    private final Integer idleClientTimeout;
    private final String name;
    /**
     * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * 
     */
    private final Boolean requireTls;
    /**
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * 
     */
    private final String roleArn;
    /**
     * Provides the VPC ID of the DB proxy.
     * 
     */
    private final String vpcId;
    /**
     * Provides a list of VPC security groups that the proxy belongs to.
     * 
     */
    private final List<String> vpcSecurityGroupIds;
    /**
     * The EC2 subnet IDs for the proxy.
     * 
     */
    private final List<String> vpcSubnetIds;

    @OutputCustomType.Constructor({"arn","auths","debugLogging","endpoint","engineFamily","id","idleClientTimeout","name","requireTls","roleArn","vpcId","vpcSecurityGroupIds","vpcSubnetIds"})
    private GetProxyResult(
        String arn,
        List<GetProxyAuth> auths,
        Boolean debugLogging,
        String endpoint,
        String engineFamily,
        String id,
        Integer idleClientTimeout,
        String name,
        Boolean requireTls,
        String roleArn,
        String vpcId,
        List<String> vpcSecurityGroupIds,
        List<String> vpcSubnetIds) {
        this.arn = Objects.requireNonNull(arn);
        this.auths = Objects.requireNonNull(auths);
        this.debugLogging = Objects.requireNonNull(debugLogging);
        this.endpoint = Objects.requireNonNull(endpoint);
        this.engineFamily = Objects.requireNonNull(engineFamily);
        this.id = Objects.requireNonNull(id);
        this.idleClientTimeout = Objects.requireNonNull(idleClientTimeout);
        this.name = Objects.requireNonNull(name);
        this.requireTls = Objects.requireNonNull(requireTls);
        this.roleArn = Objects.requireNonNull(roleArn);
        this.vpcId = Objects.requireNonNull(vpcId);
        this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
        this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds);
    }

    /**
     * The ARN of the DB Proxy.
     * 
     */
    public String getArn() {
        return this.arn;
    }
    /**
     * The configuration(s) with authorization mechanisms to connect to the associated instance or cluster.
     * 
     */
    public List<GetProxyAuth> getAuths() {
        return this.auths;
    }
    /**
     * Whether the proxy includes detailed information about SQL statements in its logs.
     * 
     */
    public Boolean getDebugLogging() {
        return this.debugLogging;
    }
    /**
     * The endpoint that you can use to connect to the DB proxy.
     * 
     */
    public String getEndpoint() {
        return this.endpoint;
    }
    /**
     * The kinds of databases that the proxy can connect to.
     * 
     */
    public String getEngineFamily() {
        return this.engineFamily;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The number of seconds a connection to the proxy can have no activity before the proxy drops the client connection.
     * 
     */
    public Integer getIdleClientTimeout() {
        return this.idleClientTimeout;
    }
    public String getName() {
        return this.name;
    }
    /**
     * Indicates whether Transport Layer Security (TLS) encryption is required for connections to the proxy.
     * 
     */
    public Boolean getRequireTls() {
        return this.requireTls;
    }
    /**
     * The Amazon Resource Name (ARN) for the IAM role that the proxy uses to access Amazon Secrets Manager.
     * 
     */
    public String getRoleArn() {
        return this.roleArn;
    }
    /**
     * Provides the VPC ID of the DB proxy.
     * 
     */
    public String getVpcId() {
        return this.vpcId;
    }
    /**
     * Provides a list of VPC security groups that the proxy belongs to.
     * 
     */
    public List<String> getVpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }
    /**
     * The EC2 subnet IDs for the proxy.
     * 
     */
    public List<String> getVpcSubnetIds() {
        return this.vpcSubnetIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProxyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private List<GetProxyAuth> auths;
        private Boolean debugLogging;
        private String endpoint;
        private String engineFamily;
        private String id;
        private Integer idleClientTimeout;
        private String name;
        private Boolean requireTls;
        private String roleArn;
        private String vpcId;
        private List<String> vpcSecurityGroupIds;
        private List<String> vpcSubnetIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.auths = defaults.auths;
    	      this.debugLogging = defaults.debugLogging;
    	      this.endpoint = defaults.endpoint;
    	      this.engineFamily = defaults.engineFamily;
    	      this.id = defaults.id;
    	      this.idleClientTimeout = defaults.idleClientTimeout;
    	      this.name = defaults.name;
    	      this.requireTls = defaults.requireTls;
    	      this.roleArn = defaults.roleArn;
    	      this.vpcId = defaults.vpcId;
    	      this.vpcSecurityGroupIds = defaults.vpcSecurityGroupIds;
    	      this.vpcSubnetIds = defaults.vpcSubnetIds;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAuths(List<GetProxyAuth> auths) {
            this.auths = Objects.requireNonNull(auths);
            return this;
        }

        public Builder setDebugLogging(Boolean debugLogging) {
            this.debugLogging = Objects.requireNonNull(debugLogging);
            return this;
        }

        public Builder setEndpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }

        public Builder setEngineFamily(String engineFamily) {
            this.engineFamily = Objects.requireNonNull(engineFamily);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdleClientTimeout(Integer idleClientTimeout) {
            this.idleClientTimeout = Objects.requireNonNull(idleClientTimeout);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setRequireTls(Boolean requireTls) {
            this.requireTls = Objects.requireNonNull(requireTls);
            return this;
        }

        public Builder setRoleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
            this.vpcSecurityGroupIds = Objects.requireNonNull(vpcSecurityGroupIds);
            return this;
        }

        public Builder setVpcSubnetIds(List<String> vpcSubnetIds) {
            this.vpcSubnetIds = Objects.requireNonNull(vpcSubnetIds);
            return this;
        }
        public GetProxyResult build() {
            return new GetProxyResult(arn, auths, debugLogging, endpoint, engineFamily, id, idleClientTimeout, name, requireTls, roleArn, vpcId, vpcSecurityGroupIds, vpcSubnetIds);
        }
    }
}
