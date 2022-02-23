// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewayRedirectType;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Redirect configuration of an application gateway.
 * 
 */
public final class ApplicationGatewayRedirectConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayRedirectConfigurationArgs Empty = new ApplicationGatewayRedirectConfigurationArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
        private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Include path in the redirected url.
     * 
     */
    @InputImport(name="includePath")
        private final @Nullable Input<Boolean> includePath;

    public Input<Boolean> getIncludePath() {
        return this.includePath == null ? Input.empty() : this.includePath;
    }

    /**
     * Include query string in the redirected url.
     * 
     */
    @InputImport(name="includeQueryString")
        private final @Nullable Input<Boolean> includeQueryString;

    public Input<Boolean> getIncludeQueryString() {
        return this.includeQueryString == null ? Input.empty() : this.includeQueryString;
    }

    /**
     * Name of the redirect configuration that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
        private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Path rules specifying redirect configuration.
     * 
     */
    @InputImport(name="pathRules")
        private final @Nullable Input<List<SubResourceArgs>> pathRules;

    public Input<List<SubResourceArgs>> getPathRules() {
        return this.pathRules == null ? Input.empty() : this.pathRules;
    }

    /**
     * HTTP redirection type.
     * 
     */
    @InputImport(name="redirectType")
        private final @Nullable Input<Either<String,ApplicationGatewayRedirectType>> redirectType;

    public Input<Either<String,ApplicationGatewayRedirectType>> getRedirectType() {
        return this.redirectType == null ? Input.empty() : this.redirectType;
    }

    /**
     * Request routing specifying redirect configuration.
     * 
     */
    @InputImport(name="requestRoutingRules")
        private final @Nullable Input<List<SubResourceArgs>> requestRoutingRules;

    public Input<List<SubResourceArgs>> getRequestRoutingRules() {
        return this.requestRoutingRules == null ? Input.empty() : this.requestRoutingRules;
    }

    /**
     * Reference to a listener to redirect the request to.
     * 
     */
    @InputImport(name="targetListener")
        private final @Nullable Input<SubResourceArgs> targetListener;

    public Input<SubResourceArgs> getTargetListener() {
        return this.targetListener == null ? Input.empty() : this.targetListener;
    }

    /**
     * Url to redirect the request to.
     * 
     */
    @InputImport(name="targetUrl")
        private final @Nullable Input<String> targetUrl;

    public Input<String> getTargetUrl() {
        return this.targetUrl == null ? Input.empty() : this.targetUrl;
    }

    /**
     * Url path maps specifying default redirect configuration.
     * 
     */
    @InputImport(name="urlPathMaps")
        private final @Nullable Input<List<SubResourceArgs>> urlPathMaps;

    public Input<List<SubResourceArgs>> getUrlPathMaps() {
        return this.urlPathMaps == null ? Input.empty() : this.urlPathMaps;
    }

    public ApplicationGatewayRedirectConfigurationArgs(
        @Nullable Input<String> id,
        @Nullable Input<Boolean> includePath,
        @Nullable Input<Boolean> includeQueryString,
        @Nullable Input<String> name,
        @Nullable Input<List<SubResourceArgs>> pathRules,
        @Nullable Input<Either<String,ApplicationGatewayRedirectType>> redirectType,
        @Nullable Input<List<SubResourceArgs>> requestRoutingRules,
        @Nullable Input<SubResourceArgs> targetListener,
        @Nullable Input<String> targetUrl,
        @Nullable Input<List<SubResourceArgs>> urlPathMaps) {
        this.id = id;
        this.includePath = includePath;
        this.includeQueryString = includeQueryString;
        this.name = name;
        this.pathRules = pathRules;
        this.redirectType = redirectType;
        this.requestRoutingRules = requestRoutingRules;
        this.targetListener = targetListener;
        this.targetUrl = targetUrl;
        this.urlPathMaps = urlPathMaps;
    }

    private ApplicationGatewayRedirectConfigurationArgs() {
        this.id = Input.empty();
        this.includePath = Input.empty();
        this.includeQueryString = Input.empty();
        this.name = Input.empty();
        this.pathRules = Input.empty();
        this.redirectType = Input.empty();
        this.requestRoutingRules = Input.empty();
        this.targetListener = Input.empty();
        this.targetUrl = Input.empty();
        this.urlPathMaps = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRedirectConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<Boolean> includePath;
        private @Nullable Input<Boolean> includeQueryString;
        private @Nullable Input<String> name;
        private @Nullable Input<List<SubResourceArgs>> pathRules;
        private @Nullable Input<Either<String,ApplicationGatewayRedirectType>> redirectType;
        private @Nullable Input<List<SubResourceArgs>> requestRoutingRules;
        private @Nullable Input<SubResourceArgs> targetListener;
        private @Nullable Input<String> targetUrl;
        private @Nullable Input<List<SubResourceArgs>> urlPathMaps;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRedirectConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.includePath = defaults.includePath;
    	      this.includeQueryString = defaults.includeQueryString;
    	      this.name = defaults.name;
    	      this.pathRules = defaults.pathRules;
    	      this.redirectType = defaults.redirectType;
    	      this.requestRoutingRules = defaults.requestRoutingRules;
    	      this.targetListener = defaults.targetListener;
    	      this.targetUrl = defaults.targetUrl;
    	      this.urlPathMaps = defaults.urlPathMaps;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setIncludePath(@Nullable Input<Boolean> includePath) {
            this.includePath = includePath;
            return this;
        }

        public Builder setIncludePath(@Nullable Boolean includePath) {
            this.includePath = Input.ofNullable(includePath);
            return this;
        }

        public Builder setIncludeQueryString(@Nullable Input<Boolean> includeQueryString) {
            this.includeQueryString = includeQueryString;
            return this;
        }

        public Builder setIncludeQueryString(@Nullable Boolean includeQueryString) {
            this.includeQueryString = Input.ofNullable(includeQueryString);
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

        public Builder setPathRules(@Nullable Input<List<SubResourceArgs>> pathRules) {
            this.pathRules = pathRules;
            return this;
        }

        public Builder setPathRules(@Nullable List<SubResourceArgs> pathRules) {
            this.pathRules = Input.ofNullable(pathRules);
            return this;
        }

        public Builder setRedirectType(@Nullable Input<Either<String,ApplicationGatewayRedirectType>> redirectType) {
            this.redirectType = redirectType;
            return this;
        }

        public Builder setRedirectType(@Nullable Either<String,ApplicationGatewayRedirectType> redirectType) {
            this.redirectType = Input.ofNullable(redirectType);
            return this;
        }

        public Builder setRequestRoutingRules(@Nullable Input<List<SubResourceArgs>> requestRoutingRules) {
            this.requestRoutingRules = requestRoutingRules;
            return this;
        }

        public Builder setRequestRoutingRules(@Nullable List<SubResourceArgs> requestRoutingRules) {
            this.requestRoutingRules = Input.ofNullable(requestRoutingRules);
            return this;
        }

        public Builder setTargetListener(@Nullable Input<SubResourceArgs> targetListener) {
            this.targetListener = targetListener;
            return this;
        }

        public Builder setTargetListener(@Nullable SubResourceArgs targetListener) {
            this.targetListener = Input.ofNullable(targetListener);
            return this;
        }

        public Builder setTargetUrl(@Nullable Input<String> targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }

        public Builder setTargetUrl(@Nullable String targetUrl) {
            this.targetUrl = Input.ofNullable(targetUrl);
            return this;
        }

        public Builder setUrlPathMaps(@Nullable Input<List<SubResourceArgs>> urlPathMaps) {
            this.urlPathMaps = urlPathMaps;
            return this;
        }

        public Builder setUrlPathMaps(@Nullable List<SubResourceArgs> urlPathMaps) {
            this.urlPathMaps = Input.ofNullable(urlPathMaps);
            return this;
        }
        public ApplicationGatewayRedirectConfigurationArgs build() {
            return new ApplicationGatewayRedirectConfigurationArgs(id, includePath, includeQueryString, name, pathRules, redirectType, requestRoutingRules, targetListener, targetUrl, urlPathMaps);
        }
    }
}
