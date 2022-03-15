// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API route config of the Spring Cloud Gateway
 * 
 */
public final class GatewayApiRouteResponse extends io.pulumi.resources.InvokeArgs {

    public static final GatewayApiRouteResponse Empty = new GatewayApiRouteResponse();

    /**
     * A description, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * To modify the request before sending it to the target endpoint, or the received response.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<String> filters;

    public List<String> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * Route processing order.
     * 
     */
    @Import(name="order")
      private final @Nullable Integer order;

    public Optional<Integer> getOrder() {
        return this.order == null ? Optional.empty() : Optional.ofNullable(this.order);
    }

    /**
     * A number of conditions to evaluate a route for each request. Each predicate may be evaluated against request headers and parameter values. All of the predicates associated with a route must evaluate to true for the route to be matched to the request.
     * 
     */
    @Import(name="predicates")
      private final @Nullable List<String> predicates;

    public List<String> getPredicates() {
        return this.predicates == null ? List.of() : this.predicates;
    }

    /**
     * Enable sso validation.
     * 
     */
    @Import(name="ssoEnabled")
      private final @Nullable Boolean ssoEnabled;

    public Optional<Boolean> getSsoEnabled() {
        return this.ssoEnabled == null ? Optional.empty() : Optional.ofNullable(this.ssoEnabled);
    }

    /**
     * Classification tags, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    @Import(name="tags")
      private final @Nullable List<String> tags;

    public List<String> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    /**
     * A title, will be applied to methods in the generated OpenAPI documentation.
     * 
     */
    @Import(name="title")
      private final @Nullable String title;

    public Optional<String> getTitle() {
        return this.title == null ? Optional.empty() : Optional.ofNullable(this.title);
    }

    /**
     * Pass currently-authenticated user's identity token to application service, default is 'false'
     * 
     */
    @Import(name="tokenRelay")
      private final @Nullable Boolean tokenRelay;

    public Optional<Boolean> getTokenRelay() {
        return this.tokenRelay == null ? Optional.empty() : Optional.ofNullable(this.tokenRelay);
    }

    /**
     * Full uri, will override `appName`.
     * 
     */
    @Import(name="uri")
      private final @Nullable String uri;

    public Optional<String> getUri() {
        return this.uri == null ? Optional.empty() : Optional.ofNullable(this.uri);
    }

    public GatewayApiRouteResponse(
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

    private GatewayApiRouteResponse() {
        this.description = null;
        this.filters = List.of();
        this.order = null;
        this.predicates = List.of();
        this.ssoEnabled = null;
        this.tags = List.of();
        this.title = null;
        this.tokenRelay = null;
        this.uri = null;
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

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder filters(@Nullable List<String> filters) {
            this.filters = filters;
            return this;
        }

        public Builder order(@Nullable Integer order) {
            this.order = order;
            return this;
        }

        public Builder predicates(@Nullable List<String> predicates) {
            this.predicates = predicates;
            return this;
        }

        public Builder ssoEnabled(@Nullable Boolean ssoEnabled) {
            this.ssoEnabled = ssoEnabled;
            return this;
        }

        public Builder tags(@Nullable List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }

        public Builder tokenRelay(@Nullable Boolean tokenRelay) {
            this.tokenRelay = tokenRelay;
            return this;
        }

        public Builder uri(@Nullable String uri) {
            this.uri = uri;
            return this;
        }
        public GatewayApiRouteResponse build() {
            return new GatewayApiRouteResponse(description, filters, order, predicates, ssoEnabled, tags, title, tokenRelay, uri);
        }
    }
}
