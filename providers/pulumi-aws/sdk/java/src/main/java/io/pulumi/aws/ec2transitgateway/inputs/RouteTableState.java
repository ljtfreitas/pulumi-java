// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2transitgateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
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
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Boolean whether this is the default association route table for the EC2 Transit Gateway.
     * 
     */
    @InputImport(name="defaultAssociationRouteTable")
    private final @Nullable Input<Boolean> defaultAssociationRouteTable;

    public Input<Boolean> getDefaultAssociationRouteTable() {
        return this.defaultAssociationRouteTable == null ? Input.empty() : this.defaultAssociationRouteTable;
    }

    /**
     * Boolean whether this is the default propagation route table for the EC2 Transit Gateway.
     * 
     */
    @InputImport(name="defaultPropagationRouteTable")
    private final @Nullable Input<Boolean> defaultPropagationRouteTable;

    public Input<Boolean> getDefaultPropagationRouteTable() {
        return this.defaultPropagationRouteTable == null ? Input.empty() : this.defaultPropagationRouteTable;
    }

    /**
     * Key-value tags for the EC2 Transit Gateway Route Table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Identifier of EC2 Transit Gateway.
     * 
     */
    @InputImport(name="transitGatewayId")
    private final @Nullable Input<String> transitGatewayId;

    public Input<String> getTransitGatewayId() {
        return this.transitGatewayId == null ? Input.empty() : this.transitGatewayId;
    }

    public RouteTableState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> defaultAssociationRouteTable,
        @Nullable Input<Boolean> defaultPropagationRouteTable,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> transitGatewayId) {
        this.arn = arn;
        this.defaultAssociationRouteTable = defaultAssociationRouteTable;
        this.defaultPropagationRouteTable = defaultPropagationRouteTable;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.transitGatewayId = transitGatewayId;
    }

    private RouteTableState() {
        this.arn = Input.empty();
        this.defaultAssociationRouteTable = Input.empty();
        this.defaultPropagationRouteTable = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.transitGatewayId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> defaultAssociationRouteTable;
        private @Nullable Input<Boolean> defaultPropagationRouteTable;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> transitGatewayId;

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

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setDefaultAssociationRouteTable(@Nullable Input<Boolean> defaultAssociationRouteTable) {
            this.defaultAssociationRouteTable = defaultAssociationRouteTable;
            return this;
        }

        public Builder setDefaultAssociationRouteTable(@Nullable Boolean defaultAssociationRouteTable) {
            this.defaultAssociationRouteTable = Input.ofNullable(defaultAssociationRouteTable);
            return this;
        }

        public Builder setDefaultPropagationRouteTable(@Nullable Input<Boolean> defaultPropagationRouteTable) {
            this.defaultPropagationRouteTable = defaultPropagationRouteTable;
            return this;
        }

        public Builder setDefaultPropagationRouteTable(@Nullable Boolean defaultPropagationRouteTable) {
            this.defaultPropagationRouteTable = Input.ofNullable(defaultPropagationRouteTable);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setTransitGatewayId(@Nullable Input<String> transitGatewayId) {
            this.transitGatewayId = transitGatewayId;
            return this;
        }

        public Builder setTransitGatewayId(@Nullable String transitGatewayId) {
            this.transitGatewayId = Input.ofNullable(transitGatewayId);
            return this;
        }
        public RouteTableState build() {
            return new RouteTableState(arn, defaultAssociationRouteTable, defaultPropagationRouteTable, tags, tagsAll, transitGatewayId);
        }
    }
}
