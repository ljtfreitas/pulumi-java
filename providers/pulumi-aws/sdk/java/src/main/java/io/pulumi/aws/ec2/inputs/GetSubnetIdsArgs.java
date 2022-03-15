// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.GetSubnetIdsFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetIdsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubnetIdsArgs Empty = new GetSubnetIdsArgs();

    /**
     * Custom filter block as described below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetSubnetIdsFilter> filters;

    public List<GetSubnetIdsFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * A map of tags, each pair of which must exactly match
     * a pair on the desired subnets.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    /**
     * The VPC ID that you want to filter from.
     * 
     */
    @Import(name="vpcId", required=true)
      private final String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public GetSubnetIdsArgs(
        @Nullable List<GetSubnetIdsFilter> filters,
        @Nullable Map<String,String> tags,
        String vpcId) {
        this.filters = filters;
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private GetSubnetIdsArgs() {
        this.filters = List.of();
        this.tags = Map.of();
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetIdsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetSubnetIdsFilter> filters;
        private @Nullable Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetIdsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder filters(@Nullable List<GetSubnetIdsFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetSubnetIdsArgs build() {
            return new GetSubnetIdsArgs(filters, tags, vpcId);
        }
    }
}
