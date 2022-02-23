// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetInternetGatewayFilter;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInternetGatewayArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetInternetGatewayArgs Empty = new GetInternetGatewayArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @InputImport(name="filters")
    private final @Nullable List<GetInternetGatewayFilter> filters;

    public List<GetInternetGatewayFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * The id of the specific Internet Gateway to retrieve.
     * 
     */
    @InputImport(name="internetGatewayId")
    private final @Nullable String internetGatewayId;

    public Optional<String> getInternetGatewayId() {
        return this.internetGatewayId == null ? Optional.empty() : Optional.ofNullable(this.internetGatewayId);
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired Internet Gateway.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetInternetGatewayArgs(
        @Nullable List<GetInternetGatewayFilter> filters,
        @Nullable String internetGatewayId,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.internetGatewayId = internetGatewayId;
        this.tags = tags;
    }

    private GetInternetGatewayArgs() {
        this.filters = List.of();
        this.internetGatewayId = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInternetGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetInternetGatewayFilter> filters;
        private @Nullable String internetGatewayId;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInternetGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.internetGatewayId = defaults.internetGatewayId;
    	      this.tags = defaults.tags;
        }

        public Builder setFilters(@Nullable List<GetInternetGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setInternetGatewayId(@Nullable String internetGatewayId) {
            this.internetGatewayId = internetGatewayId;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetInternetGatewayArgs build() {
            return new GetInternetGatewayArgs(filters, internetGatewayId, tags);
        }
    }
}
