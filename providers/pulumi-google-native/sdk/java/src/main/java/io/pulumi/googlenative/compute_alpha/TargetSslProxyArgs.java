// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.TargetSslProxyProxyHeader;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetSslProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetSslProxyArgs Empty = new TargetSslProxyArgs();

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
     * Specifies the type of proxy header to append before sending data to the backend, either NONE or PROXY_V1. The default is NONE.
     * 
     */
    @InputImport(name="proxyHeader")
      private final @Nullable Input<TargetSslProxyProxyHeader> proxyHeader;

    public Input<TargetSslProxyProxyHeader> getProxyHeader() {
        return this.proxyHeader == null ? Input.empty() : this.proxyHeader;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * URL to the BackendService resource.
     * 
     */
    @InputImport(name="service")
      private final @Nullable Input<String> service;

    public Input<String> getService() {
        return this.service == null ? Input.empty() : this.service;
    }

    /**
     * URLs to SslCertificate resources that are used to authenticate connections to Backends. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @InputImport(name="sslCertificates")
      private final @Nullable Input<List<String>> sslCertificates;

    public Input<List<String>> getSslCertificates() {
        return this.sslCertificates == null ? Input.empty() : this.sslCertificates;
    }

    /**
     * URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not set, the TargetSslProxy resource will not have any SSL policy configured.
     * 
     */
    @InputImport(name="sslPolicy")
      private final @Nullable Input<String> sslPolicy;

    public Input<String> getSslPolicy() {
        return this.sslPolicy == null ? Input.empty() : this.sslPolicy;
    }

    public TargetSslProxyArgs(
        @Nullable Input<String> certificateMap,
        @Nullable Input<String> description,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<TargetSslProxyProxyHeader> proxyHeader,
        @Nullable Input<String> requestId,
        @Nullable Input<String> service,
        @Nullable Input<List<String>> sslCertificates,
        @Nullable Input<String> sslPolicy) {
        this.certificateMap = certificateMap;
        this.description = description;
        this.name = name;
        this.project = project;
        this.proxyHeader = proxyHeader;
        this.requestId = requestId;
        this.service = service;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
    }

    private TargetSslProxyArgs() {
        this.certificateMap = Input.empty();
        this.description = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.proxyHeader = Input.empty();
        this.requestId = Input.empty();
        this.service = Input.empty();
        this.sslCertificates = Input.empty();
        this.sslPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetSslProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> certificateMap;
        private @Nullable Input<String> description;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<TargetSslProxyProxyHeader> proxyHeader;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> service;
        private @Nullable Input<List<String>> sslCertificates;
        private @Nullable Input<String> sslPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetSslProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateMap = defaults.certificateMap;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyHeader = defaults.proxyHeader;
    	      this.requestId = defaults.requestId;
    	      this.service = defaults.service;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
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

        public Builder setProxyHeader(@Nullable Input<TargetSslProxyProxyHeader> proxyHeader) {
            this.proxyHeader = proxyHeader;
            return this;
        }

        public Builder setProxyHeader(@Nullable TargetSslProxyProxyHeader proxyHeader) {
            this.proxyHeader = Input.ofNullable(proxyHeader);
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

        public Builder setService(@Nullable Input<String> service) {
            this.service = service;
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = Input.ofNullable(service);
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
        public TargetSslProxyArgs build() {
            return new TargetSslProxyArgs(certificateMap, description, name, project, proxyHeader, requestId, service, sslCertificates, sslPolicy);
        }
    }
}
