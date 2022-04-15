// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceLogConfigArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceArgs Empty = new EdgeCacheServiceArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * HTTP/3 (IETF QUIC) and Google QUIC are enabled by default.
     * 
     */
    @Import(name="disableQuic")
      private final @Nullable Output<Boolean> disableQuic;

    public Output<Boolean> disableQuic() {
        return this.disableQuic == null ? Codegen.empty() : this.disableQuic;
    }

    /**
     * Resource URL that points at the Cloud Armor edge security policy that is applied on each request against the EdgeCacheService.
     * 
     */
    @Import(name="edgeSecurityPolicy")
      private final @Nullable Output<String> edgeSecurityPolicy;

    public Output<String> edgeSecurityPolicy() {
        return this.edgeSecurityPolicy == null ? Codegen.empty() : this.edgeSecurityPolicy;
    }

    /**
     * URLs to sslCertificate resources that are used to authenticate connections between users and the EdgeCacheService.
     * Note that only "global" certificates with a "scope" of "EDGE_CACHE" can be attached to an EdgeCacheService.
     * 
     */
    @Import(name="edgeSslCertificates")
      private final @Nullable Output<List<String>> edgeSslCertificates;

    public Output<List<String>> edgeSslCertificates() {
        return this.edgeSslCertificates == null ? Codegen.empty() : this.edgeSslCertificates;
    }

    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Specifies the logging options for the traffic served by this service. If logging is enabled, logs will be exported to Cloud Logging.
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<EdgeCacheServiceLogConfigArgs> logConfig;

    public Output<EdgeCacheServiceLogConfigArgs> logConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Require TLS (HTTPS) for all clients connecting to this service.
     * Clients who connect over HTTP (port 80) will receive a HTTP 301 to the same URL over HTTPS (port 443).
     * You must have at least one (1) edgeSslCertificate specified to enable this.
     * 
     */
    @Import(name="requireTls")
      private final @Nullable Output<Boolean> requireTls;

    public Output<Boolean> requireTls() {
        return this.requireTls == null ? Codegen.empty() : this.requireTls;
    }

    /**
     * Defines how requests are routed, modified, cached and/or which origin content is filled from.
     * Structure is documented below.
     * 
     */
    @Import(name="routing", required=true)
      private final Output<EdgeCacheServiceRoutingArgs> routing;

    public Output<EdgeCacheServiceRoutingArgs> routing() {
        return this.routing;
    }

    /**
     * URL of the SslPolicy resource that will be associated with the EdgeCacheService.
     * If not set, the EdgeCacheService has no SSL policy configured, and will default to the "COMPATIBLE" policy.
     * 
     */
    @Import(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> sslPolicy() {
        return this.sslPolicy == null ? Codegen.empty() : this.sslPolicy;
    }

    public EdgeCacheServiceArgs(
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disableQuic,
        @Nullable Output<String> edgeSecurityPolicy,
        @Nullable Output<List<String>> edgeSslCertificates,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<EdgeCacheServiceLogConfigArgs> logConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> requireTls,
        Output<EdgeCacheServiceRoutingArgs> routing,
        @Nullable Output<String> sslPolicy) {
        this.description = description;
        this.disableQuic = disableQuic;
        this.edgeSecurityPolicy = edgeSecurityPolicy;
        this.edgeSslCertificates = edgeSslCertificates;
        this.labels = labels;
        this.logConfig = logConfig;
        this.name = name;
        this.project = project;
        this.requireTls = requireTls;
        this.routing = Objects.requireNonNull(routing, "expected parameter 'routing' to be non-null");
        this.sslPolicy = sslPolicy;
    }

    private EdgeCacheServiceArgs() {
        this.description = Codegen.empty();
        this.disableQuic = Codegen.empty();
        this.edgeSecurityPolicy = Codegen.empty();
        this.edgeSslCertificates = Codegen.empty();
        this.labels = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requireTls = Codegen.empty();
        this.routing = Codegen.empty();
        this.sslPolicy = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disableQuic;
        private @Nullable Output<String> edgeSecurityPolicy;
        private @Nullable Output<List<String>> edgeSslCertificates;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<EdgeCacheServiceLogConfigArgs> logConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> requireTls;
        private Output<EdgeCacheServiceRoutingArgs> routing;
        private @Nullable Output<String> sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disableQuic = defaults.disableQuic;
    	      this.edgeSecurityPolicy = defaults.edgeSecurityPolicy;
    	      this.edgeSslCertificates = defaults.edgeSslCertificates;
    	      this.labels = defaults.labels;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requireTls = defaults.requireTls;
    	      this.routing = defaults.routing;
    	      this.sslPolicy = defaults.sslPolicy;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder disableQuic(@Nullable Output<Boolean> disableQuic) {
            this.disableQuic = disableQuic;
            return this;
        }
        public Builder disableQuic(@Nullable Boolean disableQuic) {
            this.disableQuic = Codegen.ofNullable(disableQuic);
            return this;
        }
        public Builder edgeSecurityPolicy(@Nullable Output<String> edgeSecurityPolicy) {
            this.edgeSecurityPolicy = edgeSecurityPolicy;
            return this;
        }
        public Builder edgeSecurityPolicy(@Nullable String edgeSecurityPolicy) {
            this.edgeSecurityPolicy = Codegen.ofNullable(edgeSecurityPolicy);
            return this;
        }
        public Builder edgeSslCertificates(@Nullable Output<List<String>> edgeSslCertificates) {
            this.edgeSslCertificates = edgeSslCertificates;
            return this;
        }
        public Builder edgeSslCertificates(@Nullable List<String> edgeSslCertificates) {
            this.edgeSslCertificates = Codegen.ofNullable(edgeSslCertificates);
            return this;
        }
        public Builder edgeSslCertificates(String... edgeSslCertificates) {
            return edgeSslCertificates(List.of(edgeSslCertificates));
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder logConfig(@Nullable Output<EdgeCacheServiceLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable EdgeCacheServiceLogConfigArgs logConfig) {
            this.logConfig = Codegen.ofNullable(logConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requireTls(@Nullable Output<Boolean> requireTls) {
            this.requireTls = requireTls;
            return this;
        }
        public Builder requireTls(@Nullable Boolean requireTls) {
            this.requireTls = Codegen.ofNullable(requireTls);
            return this;
        }
        public Builder routing(Output<EdgeCacheServiceRoutingArgs> routing) {
            this.routing = Objects.requireNonNull(routing);
            return this;
        }
        public Builder routing(EdgeCacheServiceRoutingArgs routing) {
            this.routing = Output.of(Objects.requireNonNull(routing));
            return this;
        }
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }
        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Codegen.ofNullable(sslPolicy);
            return this;
        }        public EdgeCacheServiceArgs build() {
            return new EdgeCacheServiceArgs(description, disableQuic, edgeSecurityPolicy, edgeSslCertificates, labels, logConfig, name, project, requireTls, routing, sslPolicy);
        }
    }
}
