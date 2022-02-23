// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53.inputs;

import io.pulumi.aws.route53.inputs.ZoneVpcGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ZoneState extends io.pulumi.resources.ResourceArgs {

    public static final ZoneState Empty = new ZoneState();

    /**
     * The Amazon Resource Name (ARN) of the Hosted Zone.
     * 
     */
    @InputImport(name="arn")
    private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
     * 
     */
    @InputImport(name="comment")
    private final @Nullable Input<String> comment;

    public Input<String> getComment() {
        return this.comment == null ? Input.empty() : this.comment;
    }

    /**
     * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     * 
     */
    @InputImport(name="delegationSetId")
    private final @Nullable Input<String> delegationSetId;

    public Input<String> getDelegationSetId() {
        return this.delegationSetId == null ? Input.empty() : this.delegationSetId;
    }

    /**
     * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     * 
     */
    @InputImport(name="forceDestroy")
    private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * This is the name of the hosted zone.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of name servers in associated (or default) delegation set.
     * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
     * 
     */
    @InputImport(name="nameServers")
    private final @Nullable Input<List<String>> nameServers;

    public Input<List<String>> getNameServers() {
        return this.nameServers == null ? Input.empty() : this.nameServers;
    }

    /**
     * A mapping of tags to assign to the zone.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
    private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegation_set_id` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * 
     */
    @InputImport(name="vpcs")
    private final @Nullable Input<List<ZoneVpcGetArgs>> vpcs;

    public Input<List<ZoneVpcGetArgs>> getVpcs() {
        return this.vpcs == null ? Input.empty() : this.vpcs;
    }

    /**
     * The Hosted Zone ID. This can be referenced by zone records.
     * 
     */
    @InputImport(name="zoneId")
    private final @Nullable Input<String> zoneId;

    public Input<String> getZoneId() {
        return this.zoneId == null ? Input.empty() : this.zoneId;
    }

    public ZoneState(
        @Nullable Input<String> arn,
        @Nullable Input<String> comment,
        @Nullable Input<String> delegationSetId,
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<String> name,
        @Nullable Input<List<String>> nameServers,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<List<ZoneVpcGetArgs>> vpcs,
        @Nullable Input<String> zoneId) {
        this.arn = arn;
        this.comment = comment == null ? Input.ofNullable("Managed by Pulumi") : comment;
        this.delegationSetId = delegationSetId;
        this.forceDestroy = forceDestroy;
        this.name = name;
        this.nameServers = nameServers;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcs = vpcs;
        this.zoneId = zoneId;
    }

    private ZoneState() {
        this.arn = Input.empty();
        this.comment = Input.empty();
        this.delegationSetId = Input.empty();
        this.forceDestroy = Input.empty();
        this.name = Input.empty();
        this.nameServers = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpcs = Input.empty();
        this.zoneId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZoneState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<String> comment;
        private @Nullable Input<String> delegationSetId;
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<String> name;
        private @Nullable Input<List<String>> nameServers;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<List<ZoneVpcGetArgs>> vpcs;
        private @Nullable Input<String> zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(ZoneState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.comment = defaults.comment;
    	      this.delegationSetId = defaults.delegationSetId;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.name = defaults.name;
    	      this.nameServers = defaults.nameServers;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcs = defaults.vpcs;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setComment(@Nullable Input<String> comment) {
            this.comment = comment;
            return this;
        }

        public Builder setComment(@Nullable String comment) {
            this.comment = Input.ofNullable(comment);
            return this;
        }

        public Builder setDelegationSetId(@Nullable Input<String> delegationSetId) {
            this.delegationSetId = delegationSetId;
            return this;
        }

        public Builder setDelegationSetId(@Nullable String delegationSetId) {
            this.delegationSetId = Input.ofNullable(delegationSetId);
            return this;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
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

        public Builder setNameServers(@Nullable Input<List<String>> nameServers) {
            this.nameServers = nameServers;
            return this;
        }

        public Builder setNameServers(@Nullable List<String> nameServers) {
            this.nameServers = Input.ofNullable(nameServers);
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

        public Builder setVpcs(@Nullable Input<List<ZoneVpcGetArgs>> vpcs) {
            this.vpcs = vpcs;
            return this;
        }

        public Builder setVpcs(@Nullable List<ZoneVpcGetArgs> vpcs) {
            this.vpcs = Input.ofNullable(vpcs);
            return this;
        }

        public Builder setZoneId(@Nullable Input<String> zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public Builder setZoneId(@Nullable String zoneId) {
            this.zoneId = Input.ofNullable(zoneId);
            return this;
        }
        public ZoneState build() {
            return new ZoneState(arn, comment, delegationSetId, forceDestroy, name, nameServers, tags, tagsAll, vpcs, zoneId);
        }
    }
}
