// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyGetArgs;
import io.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyGetArgs;
import io.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipState extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipState Empty = new GroupMembershipState();

    /**
     * The time when the Membership was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * The name of the Group to create this membership in.
     * 
     */
    @Import(name="group")
      private final @Nullable Output<String> group;

    public Output<String> getGroup() {
        return this.group == null ? Output.empty() : this.group;
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Import(name="memberKey")
      private final @Nullable Output<GroupMembershipMemberKeyGetArgs> memberKey;

    public Output<GroupMembershipMemberKeyGetArgs> getMemberKey() {
        return this.memberKey == null ? Output.empty() : this.memberKey;
    }

    /**
     * The name of the MembershipRole. Must be one of OWNER, MANAGER, MEMBER.
     * Possible values are `OWNER`, `MANAGER`, and `MEMBER`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @Import(name="preferredMemberKey")
      private final @Nullable Output<GroupMembershipPreferredMemberKeyGetArgs> preferredMemberKey;

    public Output<GroupMembershipPreferredMemberKeyGetArgs> getPreferredMemberKey() {
        return this.preferredMemberKey == null ? Output.empty() : this.preferredMemberKey;
    }

    /**
     * The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    @Import(name="roles")
      private final @Nullable Output<List<GroupMembershipRoleGetArgs>> roles;

    public Output<List<GroupMembershipRoleGetArgs>> getRoles() {
        return this.roles == null ? Output.empty() : this.roles;
    }

    /**
     * The type of the membership.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    /**
     * The time when the Membership was last updated.
     * 
     */
    @Import(name="updateTime")
      private final @Nullable Output<String> updateTime;

    public Output<String> getUpdateTime() {
        return this.updateTime == null ? Output.empty() : this.updateTime;
    }

    public GroupMembershipState(
        @Nullable Output<String> createTime,
        @Nullable Output<String> group,
        @Nullable Output<GroupMembershipMemberKeyGetArgs> memberKey,
        @Nullable Output<String> name,
        @Nullable Output<GroupMembershipPreferredMemberKeyGetArgs> preferredMemberKey,
        @Nullable Output<List<GroupMembershipRoleGetArgs>> roles,
        @Nullable Output<String> type,
        @Nullable Output<String> updateTime) {
        this.createTime = createTime;
        this.group = group;
        this.memberKey = memberKey;
        this.name = name;
        this.preferredMemberKey = preferredMemberKey;
        this.roles = roles;
        this.type = type;
        this.updateTime = updateTime;
    }

    private GroupMembershipState() {
        this.createTime = Output.empty();
        this.group = Output.empty();
        this.memberKey = Output.empty();
        this.name = Output.empty();
        this.preferredMemberKey = Output.empty();
        this.roles = Output.empty();
        this.type = Output.empty();
        this.updateTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> group;
        private @Nullable Output<GroupMembershipMemberKeyGetArgs> memberKey;
        private @Nullable Output<String> name;
        private @Nullable Output<GroupMembershipPreferredMemberKeyGetArgs> preferredMemberKey;
        private @Nullable Output<List<GroupMembershipRoleGetArgs>> roles;
        private @Nullable Output<String> type;
        private @Nullable Output<String> updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.group = defaults.group;
    	      this.memberKey = defaults.memberKey;
    	      this.name = defaults.name;
    	      this.preferredMemberKey = defaults.preferredMemberKey;
    	      this.roles = defaults.roles;
    	      this.type = defaults.type;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
            return this;
        }

        public Builder group(@Nullable Output<String> group) {
            this.group = group;
            return this;
        }

        public Builder group(@Nullable String group) {
            this.group = Output.ofNullable(group);
            return this;
        }

        public Builder memberKey(@Nullable Output<GroupMembershipMemberKeyGetArgs> memberKey) {
            this.memberKey = memberKey;
            return this;
        }

        public Builder memberKey(@Nullable GroupMembershipMemberKeyGetArgs memberKey) {
            this.memberKey = Output.ofNullable(memberKey);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder preferredMemberKey(@Nullable Output<GroupMembershipPreferredMemberKeyGetArgs> preferredMemberKey) {
            this.preferredMemberKey = preferredMemberKey;
            return this;
        }

        public Builder preferredMemberKey(@Nullable GroupMembershipPreferredMemberKeyGetArgs preferredMemberKey) {
            this.preferredMemberKey = Output.ofNullable(preferredMemberKey);
            return this;
        }

        public Builder roles(@Nullable Output<List<GroupMembershipRoleGetArgs>> roles) {
            this.roles = roles;
            return this;
        }

        public Builder roles(@Nullable List<GroupMembershipRoleGetArgs> roles) {
            this.roles = Output.ofNullable(roles);
            return this;
        }

        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }

        public Builder updateTime(@Nullable Output<String> updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public Builder updateTime(@Nullable String updateTime) {
            this.updateTime = Output.ofNullable(updateTime);
            return this;
        }
        public GroupMembershipState build() {
            return new GroupMembershipState(createTime, group, memberKey, name, preferredMemberKey, roles, type, updateTime);
        }
    }
}
