// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetHttpsProxyState extends io.pulumi.resources.ResourceArgs {

    public static final TargetHttpsProxyState Empty = new TargetHttpsProxyState();

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @InputImport(name="creationTimestamp")
        private final @Nullable Input<String> creationTimestamp;

    public Input<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Input.empty() : this.creationTimestamp;
    }

    /**
     * An optional description of this resource.
     * 
     */
    @InputImport(name="description")
        private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
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
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
        private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * This field only applies when the forwarding rule that references
     * this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="proxyBind")
        private final @Nullable Input<Boolean> proxyBind;

    public Input<Boolean> getProxyBind() {
        return this.proxyBind == null ? Input.empty() : this.proxyBind;
    }

    /**
     * The unique identifier for the resource.
     * 
     */
    @InputImport(name="proxyId")
        private final @Nullable Input<Integer> proxyId;

    public Input<Integer> getProxyId() {
        return this.proxyId == null ? Input.empty() : this.proxyId;
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
    @InputImport(name="quicOverride")
        private final @Nullable Input<String> quicOverride;

    public Input<String> getQuicOverride() {
        return this.quicOverride == null ? Input.empty() : this.quicOverride;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @InputImport(name="selfLink")
        private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    /**
     * A list of SslCertificate resources that are used to authenticate
     * connections between users and the load balancer. At least one SSL
     * certificate must be specified.
     * 
     */
    @InputImport(name="sslCertificates")
        private final @Nullable Input<List<String>> sslCertificates;

    public Input<List<String>> getSslCertificates() {
        return this.sslCertificates == null ? Input.empty() : this.sslCertificates;
    }

    /**
     * A reference to the SslPolicy resource that will be associated with
     * the TargetHttpsProxy resource. If not set, the TargetHttpsProxy
     * resource will not have any SSL policy configured.
     * 
     */
    @InputImport(name="sslPolicy")
        private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    /**
     * A reference to the UrlMap resource that defines the mapping from URL
     * to the BackendService.
     * 
     */
    @InputImport(name="urlMap")
        private final @Nullable Input<String> urlMap;

    public Input<String> getUrlMap() {
        return this.urlMap == null ? Input.empty() : this.urlMap;
    }

    public TargetHttpsProxyState(
        @Nullable Input<String> creationTimestamp,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> proxyBind,
        @Nullable Input<Integer> proxyId,
        @Nullable Input<String> quicOverride,
        @Nullable Input<String> selfLink,
        @Nullable Input<List<String>> sslCertificates,
        @Nullable Input<String> sslPolicy,
        @Nullable Input<String> urlMap) {
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.proxyId = proxyId;
        this.quicOverride = quicOverride;
        this.selfLink = selfLink;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
        this.urlMap = urlMap;
    }

    private TargetHttpsProxyState() {
        this.creationTimestamp = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.proxyBind = Input.empty();
        this.proxyId = Input.empty();
        this.quicOverride = Input.empty();
        this.selfLink = Input.empty();
        this.sslCertificates = Input.empty();
        this.sslPolicy = Input.empty();
        this.urlMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetHttpsProxyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> creationTimestamp;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> proxyBind;
        private @Nullable Input<Integer> proxyId;
        private @Nullable Input<String> quicOverride;
        private @Nullable Input<String> selfLink;
        private @Nullable Input<List<String>> sslCertificates;
        private @Nullable Input<String> sslPolicy;
        private @Nullable Input<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetHttpsProxyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.proxyId = defaults.proxyId;
    	      this.quicOverride = defaults.quicOverride;
    	      this.selfLink = defaults.selfLink;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder setCreationTimestamp(@Nullable Input<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }

        public Builder setCreationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Input.ofNullable(creationTimestamp);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setProxyBind(@Nullable Input<Boolean> proxyBind) {
            this.proxyBind = proxyBind;
            return this;
        }

        public Builder setProxyBind(@Nullable Boolean proxyBind) {
            this.proxyBind = Input.ofNullable(proxyBind);
            return this;
        }

        public Builder setProxyId(@Nullable Input<Integer> proxyId) {
            this.proxyId = proxyId;
            return this;
        }

        public Builder setProxyId(@Nullable Integer proxyId) {
            this.proxyId = Input.ofNullable(proxyId);
            return this;
        }

        public Builder setQuicOverride(@Nullable Input<String> quicOverride) {
            this.quicOverride = quicOverride;
            return this;
        }

        public Builder setQuicOverride(@Nullable String quicOverride) {
            this.quicOverride = Input.ofNullable(quicOverride);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public Builder setSslCertificates(@Nullable Input<List<String>> sslCertificates) {
            this.sslCertificates = sslCertificates;
            return this;
        }

        public Builder setSslCertificates(@Nullable List<String> sslCertificates) {
            this.sslCertificates = Input.ofNullable(sslCertificates);
            return this;
        }

        public Builder setSslPolicy(@Nullable Input<String> sslPolicy) {
            this.sslPolicy = sslPolicy;
            return this;
        }

        public Builder setSslPolicy(@Nullable String sslPolicy) {
            this.sslPolicy = Input.ofNullable(sslPolicy);
            return this;
        }

        public Builder setUrlMap(@Nullable Input<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }

        public Builder setUrlMap(@Nullable String urlMap) {
            this.urlMap = Input.ofNullable(urlMap);
            return this;
        }
        public TargetHttpsProxyState build() {
            return new TargetHttpsProxyState(creationTimestamp, description, name, project, proxyBind, proxyId, quicOverride, selfLink, sslCertificates, sslPolicy, urlMap);
        }
    }
}
