// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteTableState extends io.pulumi.resources.ResourceArgs {

    public static final RouteTableState Empty = new RouteTableState();

    /**
     * EC2 Transit Gateway Route Table Amazon Resource Name (ARN).
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Boolean whether this is the default association route table for the EC2 Transit Gateway.
     * 
     */
    @Import(name="defaultAssociationRouteTable")
      private final @Nullable Output<Boolean> defaultAssociationRouteTable;

    public Output<Boolean> getDefaultAssociationRouteTable() {
        return this.defaultAssociationRouteTable == null ? Output.empty() : this.defaultAssociationRouteTable;
    }

    /**
     * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
     * 
     */
    @Import(name="defaultPropagationRouteTable")
      private final @Nullable Output<Boolean> defaultPropagationRouteTable;

    public Output<Boolean> getDefaultPropagationRouteTable() {
        return this.defaultPropagationRouteTable == null ? Output.empty() : this.defaultPropagationRouteTable;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Route Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @Import(name="transitGatewayId")
      private final @Nullable Output<String> transitGatewayId;

    public Output<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Output.empty() : this.transitGatewayId;
    }

    public RouteTableState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> defaultAssociationRouteTable,
        @Nullable Output<Boolean> defaultPropagationRouteTable,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> transitGatewayId) {
        this.arn = arn;
        this.defaultAssociationRouteTable = defaultAssociationRouteTable;
        this.defaultPropagationRouteTable = defaultPropagationRouteTable;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.transitGatewayId = transitGatewayId;
    }

    private RouteTableState() {
        this.arn = Output.empty();
        this.defaultAssociationRouteTable = Output.empty();
        this.defaultPropagationRouteTable = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.transitGatewayId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> defaultAssociationRouteTable;
        private @Nullable Output<Boolean> defaultPropagationRouteTable;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> transitGatewayId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.defaultAssociationRouteTable = defaults.defaultAssociationRouteTable;
    	      this.defaultPropagationRouteTable = defaults.defaultPropagationRouteTable;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.transitGatewayId = defaults.transitGatewayId;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder defaultAssociationRouteTable(@Nullable Output<Boolean> defaultAssociationRouteTable) {
            this.defaultAssociationRouteTable = defaultAssociationRouteTable;
            return this;
        }

        public Builder defaultAssociationRouteTable(@Nullable Boolean defaultAssociationRouteTable) {
            this.defaultAssociationRouteTable = Output.ofNullable(defaultAssociationRouteTable);
            return this;
        }

        public Builder defaultPropagationRouteTable(@Nullable Output<Boolean> defaultPropagationRouteTable) {
            this.defaultPropagationRouteTable = defaultPropagationRouteTable;
            return this;
        }

        public Builder defaultPropagationRouteTable(@Nullable Boolean defaultPropagationRouteTable) {
            this.defaultPropagationRouteTable = Output.ofNullable(defaultPropagationRouteTable);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder transitGatewayId(@Nullable Output<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder transitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Output.ofNullable(transitGatewayId);
            return this;
        }
        public RouteTableState build() {
            return new RouteTableState(arn, defaultAssociationRouteTable, defaultPropagationRouteTable, tags, tagsAll, transitGatewayId);
        }
    }
}
