// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.Access;
import io.pulumi.azurenative.network.enums.RouteFilterRuleType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Route Filter Rule Resource.
 * 
 */
public final class RouteFilterRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteFilterRuleArgs Empty = new RouteFilterRuleArgs();

    /**
     * The access type of the rule.
     * 
     */
    @InputImport(name="access", required=true)
    private final Input<Either<String,Access>> access;

    public Input<Either<String,Access>> getAccess() {
        return this.access;
    }

    /**
     * The collection for bgp community values to filter on. e.g. ['12076:5010','12076:5020'].
     * 
     */
    @InputImport(name="communities", required=true)
    private final Input<List<String>> communities;

    public Input<List<String>> getCommunities() {
        return this.communities;
    }

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
     * Resource location.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The rule type of the rule.
     * 
     */
    @InputImport(name="routeFilterRuleType", required=true)
    private final Input<Either<String,RouteFilterRuleType>> routeFilterRuleType;

    public Input<Either<String,RouteFilterRuleType>> getRouteFilterRuleType() {
        return this.routeFilterRuleType;
    }

    public RouteFilterRuleArgs(
        Input<Either<String,Access>> access,
        Input<List<String>> communities,
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        Input<Either<String,RouteFilterRuleType>> routeFilterRuleType) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.communities = Objects.requireNonNull(communities, "expected parameter 'communities' to be non-null");
        this.id = id;
        this.location = location;
        this.name = name;
        this.routeFilterRuleType = Objects.requireNonNull(routeFilterRuleType, "expected parameter 'routeFilterRuleType' to be non-null");
    }

    private RouteFilterRuleArgs() {
        this.access = Input.empty();
        this.communities = Input.empty();
        this.id = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.routeFilterRuleType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteFilterRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,Access>> access;
        private Input<List<String>> communities;
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private Input<Either<String,RouteFilterRuleType>> routeFilterRuleType;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteFilterRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.communities = defaults.communities;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.routeFilterRuleType = defaults.routeFilterRuleType;
        }

        public Builder setAccess(Input<Either<String,Access>> access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setAccess(Either<String,Access> access) {
            this.access = Input.of(Objects.requireNonNull(access));
            return this;
        }

        public Builder setCommunities(Input<List<String>> communities) {
            this.communities = Objects.requireNonNull(communities);
            return this;
        }

        public Builder setCommunities(List<String> communities) {
            this.communities = Input.of(Objects.requireNonNull(communities));
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setRouteFilterRuleType(Input<Either<String,RouteFilterRuleType>> routeFilterRuleType) {
            this.routeFilterRuleType = Objects.requireNonNull(routeFilterRuleType);
            return this;
        }

        public Builder setRouteFilterRuleType(Either<String,RouteFilterRuleType> routeFilterRuleType) {
            this.routeFilterRuleType = Input.of(Objects.requireNonNull(routeFilterRuleType));
            return this;
        }

        public RouteFilterRuleArgs build() {
            return new RouteFilterRuleArgs(access, communities, id, location, name, routeFilterRuleType);
        }
    }
}
