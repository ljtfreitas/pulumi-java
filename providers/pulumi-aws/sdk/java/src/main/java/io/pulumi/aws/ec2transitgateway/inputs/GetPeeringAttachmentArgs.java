// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.aws.ec2transitgateway.inputs.GetPeeringAttachmentFilter;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetPeeringAttachmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPeeringAttachmentArgs Empty = new GetPeeringAttachmentArgs();

    /**
     * One or more configuration blocks containing name-values filters. Detailed below.
     * 
     */
    @Import(name="filters")
      private final @Nullable List<GetPeeringAttachmentFilter> filters;

    public List<GetPeeringAttachmentFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }

    /**
     * Identifier of the EC2 Transit Gateway Peering Attachment.
     * 
     */
    @Import(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * A mapping of tags, each pair of which must exactly match
     * a pair on the specific EC2 Transit Gateway Peering Attachment to retrieve.
     * 
     */
    @Import(name="tags")
      private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public GetPeeringAttachmentArgs(
        @Nullable List<GetPeeringAttachmentFilter> filters,
        @Nullable String id,
        @Nullable Map<String,String> tags) {
        this.filters = filters;
        this.id = id;
        this.tags = tags;
    }

    private GetPeeringAttachmentArgs() {
        this.filters = List.of();
        this.id = null;
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetPeeringAttachmentFilter> filters;
        private @Nullable String id;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.tags = defaults.tags;
        }

        public Builder filters(@Nullable List<GetPeeringAttachmentFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public GetPeeringAttachmentArgs build() {
            return new GetPeeringAttachmentArgs(filters, id, tags);
        }
    }
}
