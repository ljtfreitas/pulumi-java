// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GatewayApiRouteResponse {
    /**
     * A description, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private final @Nullable String description;
    /**
     * To modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    private final @Nullable List<String> filters;
    /**
     * Route processing order.
     * 
     */
    private final @Nullable Integer order;
    /**
     * A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    private final @Nullable List<String> predicates;
    /**
     * Enable sso validation.
     * 
     */
    private final @Nullable Boolean ssoEnabled;
    /**
     * Classification tags, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private final @Nullable List<String> tags;
    /**
     * A title, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    private final @Nullable String title;
    /**
     * Pass currently-authenticated user's identity token to application service, default is 'false'
     * 
     */
    private final @Nullable Boolean tokenRelay;
    /**
     * Full uri, will override `appName`.
     * 
     */
    private final @Nullable String uri;

    @OutputCustomType.Constructor({"description","filters","order","predicates","ssoEnabled","tags","title","tokenRelay","uri"})
    private GatewayApiRouteResponse(
        @Nullable String description,
        @Nullable List<String> filters,
        @Nullable Integer order,
        @Nullable List<String> predicates,
        @Nullable Boolean ssoEnabled,
        @Nullable List<String> tags,
        @Nullable String title,
        @Nullable Boolean tokenRelay,
        @Nullable String uri) {
        this.description = description;
        this.filters = filters;
        this.order = order;
        this.predicates = predicates;
        this.ssoEnabled = ssoEnabled;
        this.tags = tags;
        this.title = title;
        this.tokenRelay = tokenRelay;
        this.uri = uri;
    }

    /**
     * A description, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * To modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    public List<String> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * Route processing order.
     * 
     */
    public Optional<Integer> getOrder() {
        return Optional.ofNullable(this.order);
    }
    /**
     * A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    public List<String> getPredicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }
    /**
     * Enable sso validation.
     * 
     */
    public Optional<Boolean> getSsoEnabled() {
        return Optional.ofNullable(this.ssoEnabled);
    }
    /**
     * Classification tags, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * A title, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    public Optional<String> getTitle() {
        return Optional.ofNullable(this.title);
    }
    /**
     * Pass currently-authenticated user's identity token to application service, default is 'false'
     * 
     */
    public Optional<Boolean> getTokenRelay() {
        return Optional.ofNullable(this.tokenRelay);
    }
    /**
     * Full uri, will override `appName`.
     * 
     */
    public Optional<String> getUri() {
        return Optional.ofNullable(this.uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayApiRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> filters;
        private @Nullable Integer order;
        private @Nullable List<String> predicates;
        private @Nullable Boolean ssoEnabled;
        private @Nullable List<String> tags;
        private @Nullable String title;
        private @Nullable Boolean tokenRelay;
        private @Nullable String uri;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayApiRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.order = defaults.order;
    	      this.predicates = defaults.predicates;
    	      this.ssoEnabled = defaults.ssoEnabled;
    	      this.tags = defaults.tags;
    	      this.title = defaults.title;
    	      this.tokenRelay = defaults.tokenRelay;
    	      this.uri = defaults.uri;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFilters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setOrder(@Nullable Integer order) {
            this.order = order;
            return this;
        }

        public Builder setPredicates(@Nullable List<String> predicates) {
            this.predicates = predicates;
            return this;
        }

        public Builder setSsoEnabled(@Nullable Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }

        public Builder setTags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTitle(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder setTokenRelay(@Nullable Boolean tokenRelay) {
            this.tokenRelay = tokenRelay;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }

        public GatewayApiRouteResponse build() {
            return new GatewayApiRouteResponse(description, filters, order, predicates, ssoEnabled, tags, title, tokenRelay, uri);
        }
    }
}
