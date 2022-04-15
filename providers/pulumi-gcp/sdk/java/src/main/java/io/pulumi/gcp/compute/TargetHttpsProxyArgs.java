// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetHttpsProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetHttpsProxyArgs Empty = new TargetHttpsProxyArgs();

    /**
     * An optional description of this resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035. Specifically, the name must be 1-63 characters long and match
     * the regular expression `a-z?` which means the
     * first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the last
     * character, which cannot be a dash.
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
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="proxyBind")
      private final @Nullable Output<Boolean> proxyBind;

    public Output<Boolean> proxyBind() {
        return this.proxyBind == null ? Codegen.empty() : this.proxyBind;
    }

    /**
     * Specifies the QUIC override policy for this resource. This determines
     * whether the load balancer will attempt to negotiate QUIC with clients
     * or not. Can specify one of NONE, ENABLE, or DISABLE. If NONE is
     * specified, uses the QUIC policy with no user overrides, which is
     * equivalent to DISABLE.
     * Default value is `NONE`.
     * Possible values are `NONE`, `ENABLE`, and `DISABLE`.
     * 
     */
    @Import(name="quicOverride")
      private final @Nullable Output<String> quicOverride;

    public Output<String> quicOverride() {
        return this.quicOverride == null ? Codegen.empty() : this.quicOverride;
    }

    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one SSL
     * certificate must be specified.
     * 
     */
    @Import(name="sslCertificates", required=true)
      private final Output<List<String>> sslCertificates;

    public Output<List<String>> sslCertificates() {
        return this.sslCertificates;
    }

    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @Import(name="sslPolicy")
      private final @Nullable Output<String> sslPolicy;

    public Output<String> sslPolicy() {
        return this.sslPolicy == null ? Codegen.empty() : this.sslPolicy;
    }

    /**
     * A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    @Import(name="urlMap", required=true)
      private final Output<String> urlMap;

    public Output<String> urlMap() {
        return this.urlMap;
    }

    public TargetHttpsProxyArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<Boolean> proxyBind,
        @Nullable Output<String> quicOverride,
        Output<List<String>> sslCertificates,
        @Nullable Output<String> sslPolicy,
        Output<String> urlMap) {
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.quicOverride = quicOverride;
        this.sslCertificates = Objects.requireNonNull(sslCertificates, "expected parameter 'sslCertificates' to be non-null");
        this.sslPolicy = sslPolicy;
        this.urlMap = Objects.requireNonNull(urlMap, "expected parameter 'urlMap' to be non-null");
    }

    private TargetHttpsProxyArgs() {
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.proxyBind = Codegen.empty();
        this.quicOverride = Codegen.empty();
        this.sslCertificates = Codegen.empty();
        this.sslPolicy = Codegen.empty();
        this.urlMap = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<Boolean> proxyBind;
        private @Nullable Output<String> quicOverride;
        private Output<List<String>> sslCertificates;
        private @Nullable Output<String> sslPolicy;
        private Output<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.quicOverride = defaults.quicOverride;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
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
        public Builder proxyBind(@Nullable Output<Boolean> proxyBind) {
            this.proxyBind = proxyBind;
            return this;
        }
        public Builder proxyBind(@Nullable Boolean proxyBind) {
            this.proxyBind = Codegen.ofNullable(proxyBind);
            return this;
        }
        public Builder quicOverride(@Nullable Output<String> quicOverride) {
            this.quicOverride = quicOverride;
            return this;
        }
        public Builder quicOverride(@Nullable String quicOverride) {
            this.quicOverride = Codegen.ofNullable(quicOverride);
            return this;
        }
        public Builder sslCertificates(Output<List<String>> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }
        public Builder sslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Output.of(Objects.requireNonNull(sslCertificates));
            return this;
        }
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }
        public Builder sslPolicy(@Nullable Output<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }
        public Builder sslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Codegen.ofNullable(sslPolicy);
            return this;
        }
        public Builder urlMap(Output<String> urlMap) {
            this.urlMap = Objects.requireNonNull(urlMap);
            return this;
        }
        public Builder urlMap(String urlMap) {
            this.urlMap = Output.of(Objects.requireNonNull(urlMap));
            return this;
        }        public TargetHttpsProxyArgs build() {
            return new TargetHttpsProxyArgs(description, name, project, proxyBind, quicOverride, sslCertificates, sslPolicy, urlMap);
        }
    }
}
