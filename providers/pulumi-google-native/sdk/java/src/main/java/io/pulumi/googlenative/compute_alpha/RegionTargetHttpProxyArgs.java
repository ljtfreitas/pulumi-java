// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionTargetHttpProxyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionTargetHttpProxyArgs Empty = new RegionTargetHttpProxyArgs();

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
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/v1alpha1/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
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

    @InputImport(name="region", required=true)
      private final Input<String> region;

    public Input<String> getRegion() {
        return this.region;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * URL to the UrlMap resource that defines the mapping from URL to the BackendService.
     * 
     */
    @InputImport(name="urlMap")
      private final @Nullable Input<String> urlMap;

    public Input<String> getUrlMap() {
        return this.urlMap == null ? Input.empty() : this.urlMap;
    }

    public RegionTargetHttpProxyArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> httpFilters,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<Boolean> proxyBind,
        Input<String> region,
        @Nullable Input<String> requestId,
        @Nullable Input<String> urlMap) {
        this.description = description;
        this.httpFilters = httpFilters;
        this.name = name;
        this.project = project;
        this.proxyBind = proxyBind;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.urlMap = urlMap;
    }

    private RegionTargetHttpProxyArgs() {
        this.description = Input.empty();
        this.httpFilters = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.proxyBind = Input.empty();
        this.region = Input.empty();
        this.requestId = Input.empty();
        this.urlMap = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionTargetHttpProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> httpFilters;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<Boolean> proxyBind;
        private Input<String> region;
        private @Nullable Input<String> requestId;
        private @Nullable Input<String> urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionTargetHttpProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.httpFilters = defaults.httpFilters;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.proxyBind = defaults.proxyBind;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.urlMap = defaults.urlMap;
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

        public Builder setRegion(Input<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Input.of(Objects.requireNonNull(region));
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

        public Builder setUrlMap(@Nullable Input<String> urlMap) {
            this.urlMap = urlMap;
            return this;
        }

        public Builder setUrlMap(@Nullable String urlMap) {
            this.urlMap = Input.ofNullable(urlMap);
            return this;
        }
        public RegionTargetHttpProxyArgs build() {
            return new RegionTargetHttpProxyArgs(description, httpFilters, name, project, proxyBind, region, requestId, urlMap);
        }
    }
}
