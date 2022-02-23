// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ReplicationSubnetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final ReplicationSubnetGroupArgs Empty = new ReplicationSubnetGroupArgs();

    /**
     * The description for the subnet group.
     * 
     */
    @InputImport(name="replicationSubnetGroupDescription", required=true)
    private final Input<String> replicationSubnetGroupDescription;

    public Input<String> getReplicationSubnetGroupDescription() {
        return this.replicationSubnetGroupDescription;
    }

    /**
     * The name for the replication subnet group. This value is stored as a lowercase string.
     * 
     */
    @InputImport(name="replicationSubnetGroupId", required=true)
    private final Input<String> replicationSubnetGroupId;

    public Input<String> getReplicationSubnetGroupId() {
        return this.replicationSubnetGroupId;
    }

    /**
     * A list of the EC2 subnet IDs for the subnet group.
     * 
     */
    @InputImport(name="subnetIds", required=true)
    private final Input<List<String>> subnetIds;

    public Input<List<String>> getSubnetIds() {
        return this.subnetIds;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ReplicationSubnetGroupArgs(
        Input<String> replicationSubnetGroupDescription,
        Input<String> replicationSubnetGroupId,
        Input<List<String>> subnetIds,
        @Nullable Input<Map<String,String>> tags) {
        this.replicationSubnetGroupDescription = Objects.requireNonNull(replicationSubnetGroupDescription, "expected parameter 'replicationSubnetGroupDescription' to be non-null");
        this.replicationSubnetGroupId = Objects.requireNonNull(replicationSubnetGroupId, "expected parameter 'replicationSubnetGroupId' to be non-null");
        this.subnetIds = Objects.requireNonNull(subnetIds, "expected parameter 'subnetIds' to be non-null");
        this.tags = tags;
    }

    private ReplicationSubnetGroupArgs() {
        this.replicationSubnetGroupDescription = Input.empty();
        this.replicationSubnetGroupId = Input.empty();
        this.subnetIds = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReplicationSubnetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> replicationSubnetGroupDescription;
        private Input<String> replicationSubnetGroupId;
        private Input<List<String>> subnetIds;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ReplicationSubnetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationSubnetGroupDescription = defaults.replicationSubnetGroupDescription;
    	      this.replicationSubnetGroupId = defaults.replicationSubnetGroupId;
    	      this.subnetIds = defaults.subnetIds;
    	      this.tags = defaults.tags;
        }

        public Builder setReplicationSubnetGroupDescription(Input<String> replicationSubnetGroupDescription) {
            this.replicationSubnetGroupDescription = Objects.requireNonNull(replicationSubnetGroupDescription);
            return this;
        }

        public Builder setReplicationSubnetGroupDescription(String replicationSubnetGroupDescription) {
            this.replicationSubnetGroupDescription = Input.of(Objects.requireNonNull(replicationSubnetGroupDescription));
            return this;
        }

        public Builder setReplicationSubnetGroupId(Input<String> replicationSubnetGroupId) {
            this.replicationSubnetGroupId = Objects.requireNonNull(replicationSubnetGroupId);
            return this;
        }

        public Builder setReplicationSubnetGroupId(String replicationSubnetGroupId) {
            this.replicationSubnetGroupId = Input.of(Objects.requireNonNull(replicationSubnetGroupId));
            return this;
        }

        public Builder setSubnetIds(Input<List<String>> subnetIds) {
            this.subnetIds = Objects.requireNonNull(subnetIds);
            return this;
        }

        public Builder setSubnetIds(List<String> subnetIds) {
            this.subnetIds = Input.of(Objects.requireNonNull(subnetIds));
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
        public ReplicationSubnetGroupArgs build() {
            return new ReplicationSubnetGroupArgs(replicationSubnetGroupDescription, replicationSubnetGroupId, subnetIds, tags);
        }
    }
}
