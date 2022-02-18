// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Redirect configuration of an application gateway.
 * 
 */
public final class ApplicationGatewayRedirectConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayRedirectConfigurationResponse Empty = new ApplicationGatewayRedirectConfigurationResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Include path in the redirected url.
     * 
     */
    @InputImport(name="includePath")
    private final @Nullable Boolean includePath;

    public Optional<Boolean> getIncludePath() {
        return this.includePath == null ? Optional.empty() : Optional.ofNullable(this.includePath);
    }

    /**
     * Include query string in the redirected url.
     * 
     */
    @InputImport(name="includeQueryString")
    private final @Nullable Boolean includeQueryString;

    public Optional<Boolean> getIncludeQueryString() {
        return this.includeQueryString == null ? Optional.empty() : Optional.ofNullable(this.includeQueryString);
    }

    /**
     * Name of the redirect configuration that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Path rules specifying redirect configuration.
     * 
     */
    @InputImport(name="pathRules")
    private final @Nullable List<SubResourceResponse> pathRules;

    public List<SubResourceResponse> getPathRules() {
        return this.pathRules == null ? List.of() : this.pathRules;
    }

    /**
     * HTTP redirection type.
     * 
     */
    @InputImport(name="redirectType")
    private final @Nullable String redirectType;

    public Optional<String> getRedirectType() {
        return this.redirectType == null ? Optional.empty() : Optional.ofNullable(this.redirectType);
    }

    /**
     * Request routing specifying redirect configuration.
     * 
     */
    @InputImport(name="requestRoutingRules")
    private final @Nullable List<SubResourceResponse> requestRoutingRules;

    public List<SubResourceResponse> getRequestRoutingRules() {
        return this.requestRoutingRules == null ? List.of() : this.requestRoutingRules;
    }

    /**
     * Reference to a listener to redirect the request to.
     * 
     */
    @InputImport(name="targetListener")
    private final @Nullable SubResourceResponse targetListener;

    public Optional<SubResourceResponse> getTargetListener() {
        return this.targetListener == null ? Optional.empty() : Optional.ofNullable(this.targetListener);
    }

    /**
     * Url to redirect the request to.
     * 
     */
    @InputImport(name="targetUrl")
    private final @Nullable String targetUrl;

    public Optional<String> getTargetUrl() {
        return this.targetUrl == null ? Optional.empty() : Optional.ofNullable(this.targetUrl);
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Url path maps specifying default redirect configuration.
     * 
     */
    @InputImport(name="urlPathMaps")
    private final @Nullable List<SubResourceResponse> urlPathMaps;

    public List<SubResourceResponse> getUrlPathMaps() {
        return this.urlPathMaps == null ? List.of() : this.urlPathMaps;
    }

    public ApplicationGatewayRedirectConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable Boolean includePath,
        @Nullable Boolean includeQueryString,
        @Nullable String name,
        @Nullable List<SubResourceResponse> pathRules,
        @Nullable String redirectType,
        @Nullable List<SubResourceResponse> requestRoutingRules,
        @Nullable SubResourceResponse targetListener,
        @Nullable String targetUrl,
        String type,
        @Nullable List<SubResourceResponse> urlPathMaps) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.includePath = includePath;
        this.includeQueryString = includeQueryString;
        this.name = name;
        this.pathRules = pathRules;
        this.redirectType = redirectType;
        this.requestRoutingRules = requestRoutingRules;
        this.targetListener = targetListener;
        this.targetUrl = targetUrl;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.urlPathMaps = urlPathMaps;
    }

    private ApplicationGatewayRedirectConfigurationResponse() {
        this.etag = null;
        this.id = null;
        this.includePath = null;
        this.includeQueryString = null;
        this.name = null;
        this.pathRules = List.of();
        this.redirectType = null;
        this.requestRoutingRules = List.of();
        this.targetListener = null;
        this.targetUrl = null;
        this.type = null;
        this.urlPathMaps = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRedirectConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable Boolean includePath;
        private @Nullable Boolean includeQueryString;
        private @Nullable String name;
        private @Nullable List<SubResourceResponse> pathRules;
        private @Nullable String redirectType;
        private @Nullable List<SubResourceResponse> requestRoutingRules;
        private @Nullable SubResourceResponse targetListener;
        private @Nullable String targetUrl;
        private String type;
        private @Nullable List<SubResourceResponse> urlPathMaps;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRedirectConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.includePath = defaults.includePath;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.redirectType = defaults.redirectType;
    	      this.requestRoutingRules = defaults.requestRoutingRules;
    	      this.targetListener = defaults.targetListener;
    	      this.targetUrl = defaults.targetUrl;
    	      this.type = defaults.type;
    	      this.urlPathMaps = defaults.urlPathMaps;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setIncludePath(@Nullable Boolean includePath) {
            this.includePath = includePath;
            return this;
        }

        public Builder setIncludeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPathRules(@Nullable List<SubResourceResponse> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setRedirectType(@Nullable String redirectType) {
            this.redirectType = redirectType;
            return this;
        }

        public Builder setRequestRoutingRules(@Nullable List<SubResourceResponse> requestRoutingRules) {
            this.requestRoutingRules = requestRoutingRules;
            return this;
        }

        public Builder setTargetListener(@Nullable SubResourceResponse targetListener) {
            this.targetListener = targetListener;
            return this;
        }

        public Builder setTargetUrl(@Nullable String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrlPathMaps(@Nullable List<SubResourceResponse> urlPathMaps) {
            this.urlPathMaps = urlPathMaps;
            return this;
        }

        public ApplicationGatewayRedirectConfigurationResponse build() {
            return new ApplicationGatewayRedirectConfigurationResponse(etag, id, includePath, includeQueryString, name, pathRules, redirectType, requestRoutingRules, targetListener, targetUrl, type, urlPathMaps);
        }
    }
}
