// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticache.outputs;

import io.pulumi.awsnative.elasticache.enums.GlobalReplicationGroupMemberRole;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GlobalReplicationGroupMember {
    /**
     * Regionally unique identifier for the member i.e. ReplicationGroupId.
     * 
     */
    private final @Nullable String replicationGroupId;
    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    private final @Nullable String replicationGroupRegion;
    /**
     * Indicates the role of the member, primary or secondary.
     * 
     */
    private final @Nullable GlobalReplicationGroupMemberRole role;

    @OutputCustomType.Constructor({"replicationGroupId","replicationGroupRegion","role"})
    private GlobalReplicationGroupMember(
        @Nullable String replicationGroupId,
        @Nullable String replicationGroupRegion,
        @Nullable GlobalReplicationGroupMemberRole role) {
        this.replicationGroupId = replicationGroupId;
        this.replicationGroupRegion = replicationGroupRegion;
        this.role = role;
    }

    /**
     * Regionally unique identifier for the member i.e. ReplicationGroupId.
     * 
     */
    public Optional<String> getReplicationGroupId() {
        return Optional.ofNullable(this.replicationGroupId);
    }
    /**
     * The AWS region of the Global Datastore member.
     * 
     */
    public Optional<String> getReplicationGroupRegion() {
        return Optional.ofNullable(this.replicationGroupRegion);
    }
    /**
     * Indicates the role of the member, primary or secondary.
     * 
     */
    public Optional<GlobalReplicationGroupMemberRole> getRole() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalReplicationGroupMember defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String replicationGroupId;
        private @Nullable String replicationGroupRegion;
        private @Nullable GlobalReplicationGroupMemberRole role;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalReplicationGroupMember defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.replicationGroupId = defaults.replicationGroupId;
    	      this.replicationGroupRegion = defaults.replicationGroupRegion;
    	      this.role = defaults.role;
        }

        public Builder setReplicationGroupId(@Nullable String replicationGroupId) {
            this.replicationGroupId = replicationGroupId;
            return this;
        }

        public Builder setReplicationGroupRegion(@Nullable String replicationGroupRegion) {
            this.replicationGroupRegion = replicationGroupRegion;
            return this;
        }

        public Builder setRole(@Nullable GlobalReplicationGroupMemberRole role) {
            this.role = role;
            return this;
        }
        public GlobalReplicationGroupMember build() {
            return new GlobalReplicationGroupMember(replicationGroupId, replicationGroupRegion, role);
        }
    }
}
