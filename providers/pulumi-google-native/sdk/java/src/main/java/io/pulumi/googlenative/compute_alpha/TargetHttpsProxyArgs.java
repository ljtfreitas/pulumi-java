// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.TargetHttpsProxyQuicOverride;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetHttpsProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetHttpsProxyArgs Empty = new TargetHttpsProxyArgs();

    /**
     * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
     * 
     */
    @InputImport(name="authorizationPolicy")
      private final @Nullable Input<String> authorizationPolicy;

    public Input<String> getAuthorizationPolicy() {
        return this.authorizationPolicy == null ? Input.empty() : this.authorizationPolicy;
    }

    /**
     * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for global target proxies. If set, sslCertificates will be ignored.
     * 
     */
    @InputImport(name="certificateMap")
      private final @Nullable Input<String> certificateMap;

    public Input<String> getCertificateMap() {
        return this.certificateMap == null ? Input.empty() : this.certificateMap;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/beta/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
     * 
     */
    @InputImport(name="httpFilters")
      private final @Nullable Input<List<String>> httpFilters;

    public Input<List<String>> getHttpFilters() {
        return this.httpFilters == null ? Input.empty() : this.httpFilters;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    @InputImport(name="proxyBind")
      private final @Nullable Input<Boolean> proxyBind;

    public Input<Boolean> getProxyBind() {
        return this.proxyBind == null ? Input.empty() : this.proxyBind;
    }

    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
     */
    @InputImport(name="quicOverride")
      private final @Nullable Input<TargetHttpsProxyQuicOverride> quicOverride;

    public Input<TargetHttpsProxyQuicOverride> getQuicOverride() {
        return this.quicOverride == null ? Input.empty() : this.quicOverride;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    @InputImport(name="serverTlsPolicy")
      private final @Nullable Input<String> serverTlsPolicy;

    public Input<String> getServerTlsPolicy() {
        return this.serverTlsPolicy == null ? Input.empty() : this.serverTlsPolicy;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="sslCertificates")
      private final @Nullable Input<List<String>> sslCertificates;

    public Input<List<String>> getSslCertificates() {
        return this.sslCertificates == null ? Input.empty() : this.sslCertificates;
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    /**
     * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
     * 
     */
    @InputImport(name="urlMap")
      private final @Nullable Input<String> urlMap;

    public Input<String> getUrlMap() {
        return this.urlMap == null ? Input.empty() : this.urlMap;
    }

    public TargetHttpsProxyArgs(
        @Nullable Input<String> authorizationPolicy,
        @Nullable Input<String> certificateMap,
        @Nullable Input<String> description,
        @Nullable Input<List<String>> httpFilters,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> proxyBind,
        @Nullable Input<TargetHttpsProxyQuicOverride> quicOverride,
        @Nullable Input<String> requestId,
        @Nullable Input<String> serverTlsPolicy,
        @Nullable Input<List<String>> sslCertificates,
        @Nullable Input<String> sslPolicy,
        @Nullable Input<String> urlMap) {
        this.authorizationPolicy = authorizationPolicy;
        this.certificateMap = certificateMap;
        this.description = description;
        this.httpFilters = httpFilters;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.quicOverride = quicOverride;
        this.requestId = requestId;
        this.serverTlsPolicy = serverTlsPolicy;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
        this.urlMap = urlMap;
    }

    private TargetHttpsProxyArgs() {
        this.authorizationPolicy = Input.empty();
        this.certificateMap = Input.empty();
        this.description = Input.empty();
        this.httpFilters = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.proxyBind = Input.empty();
        this.quicOverride = Input.empty();
        this.requestId = Input.empty();
        this.serverTlsPolicy = Input.empty();
        this.sslCertificates = Input.empty();
        this.sslPolicy = Input.empty();
        this.urlMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetHttpsProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> authorizationPolicy;
        private @Nullable Input<String> certificateMap;
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> httpFilters;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> proxyBind;
        private @Nullable Input<TargetHttpsProxyQuicOverride> quicOverride;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> serverTlsPolicy;
        private @Nullable Input<List<String>> sslCertificates;
        private @Nullable Input<String> sslPolicy;
        private @Nullable Input<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetHttpsProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicy = defaults.authorizationPolicy;
    	      this.certificateMap = defaults.certificateMap;
    	      this.description = defaults.description;
    	      this.httpFilters = defaults.httpFilters;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.quicOverride = defaults.quicOverride;
    	      this.requestId = defaults.requestId;
    	      this.serverTlsPolicy = defaults.serverTlsPolicy;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder setAuthorizationPolicy(@Nullable Input<String> authorizationPolicy) {
            this.authorizationPolicy = authorizationPolicy;
            return this;
        }

        public Builder setAuthorizationPolicy(@Nullable String authorizationPolicy) {
            this.authorizationPolicy = Input.ofNullable(authorizationPolicy);
            return this;
        }

        public Builder setCertificateMap(@Nullable Input<String> certificateMap) {
            this.certificateMap = certificateMap;
            return this;
        }

        public Builder setCertificateMap(@Nullable String certificateMap) {
            this.certificateMap = Input.ofNullable(certificateMap);
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

        public Builder setHttpFilters(@Nullable Input<List<String>> httpFilters) {
            this.httpFilters = httpFilters;
            return this;
        }

        public Builder setHttpFilters(@Nullable List<String> httpFilters) {
            this.httpFilters = Input.ofNullable(httpFilters);
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

        public Builder setQuicOverride(@Nullable Input<TargetHttpsProxyQuicOverride> quicOverride) {
            this.quicOverride = quicOverride;
            return this;
        }

        public Builder setQuicOverride(@Nullable TargetHttpsProxyQuicOverride quicOverride) {
            this.quicOverride = Input.ofNullable(quicOverride);
            return this;
        }

        public Builder setRequestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder setRequestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder setServerTlsPolicy(@Nullable Input<String> serverTlsPolicy) {
            this.serverTlsPolicy = serverTlsPolicy;
            return this;
        }

        public Builder setServerTlsPolicy(@Nullable String serverTlsPolicy) {
            this.serverTlsPolicy = Input.ofNullable(serverTlsPolicy);
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
        public TargetHttpsProxyArgs build() {
            return new TargetHttpsProxyArgs(authorizationPolicy, certificateMap, description, httpFilters, name, project, proxyBind, quicOverride, requestId, serverTlsPolicy, sslCertificates, sslPolicy, urlMap);
        }
    }
}
