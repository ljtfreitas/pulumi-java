// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudidentity;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudidentity.inputs.GroupMembershipMemberKeyArgs;
import io.pulumi.gcp.cloudidentity.inputs.GroupMembershipPreferredMemberKeyArgs;
import io.pulumi.gcp.cloudidentity.inputs.GroupMembershipRoleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupMembershipArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupMembershipArgs Empty = new GroupMembershipArgs();

    /**
     * The name of the Group to create this membership in.
     * 
     */
    @InputImport(name="group", required=true)
        private final Input<String> group;

    public Input<String> getGroup() {
        return this.group;
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @InputImport(name="memberKey")
        private final @Nullable Input<GroupMembershipMemberKeyArgs> memberKey;

    public Input<GroupMembershipMemberKeyArgs> getMemberKey() {
        return this.memberKey == null ? Input.empty() : this.memberKey;
    }

    /**
     * EntityKey of the member.
     * Structure is documented below.
     * 
     */
    @InputImport(name="preferredMemberKey")
        private final @Nullable Input<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey;

    public Input<GroupMembershipPreferredMemberKeyArgs> getPreferredMemberKey() {
        return this.preferredMemberKey == null ? Input.empty() : this.preferredMemberKey;
    }

    /**
     * The MembershipRoles that apply to the Membership.
     * Must not contain duplicate MembershipRoles with the same name.
     * Structure is documented below.
     * 
     */
    @InputImport(name="roles", required=true)
        private final Input<List<GroupMembershipRoleArgs>> roles;

    public Input<List<GroupMembershipRoleArgs>> getRoles() {
        return this.roles;
    }

    public GroupMembershipArgs(
        Input<String> group,
        @Nullable Input<GroupMembershipMemberKeyArgs> memberKey,
        @Nullable Input<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey,
        Input<List<GroupMembershipRoleArgs>> roles) {
        this.group = Objects.requireNonNull(group, "expected parameter 'group' to be non-null");
        this.memberKey = memberKey;
        this.preferredMemberKey = preferredMemberKey;
        this.roles = Objects.requireNonNull(roles, "expected parameter 'roles' to be non-null");
    }

    private GroupMembershipArgs() {
        this.group = Input.empty();
        this.memberKey = Input.empty();
        this.preferredMemberKey = Input.empty();
        this.roles = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembershipArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> group;
        private @Nullable Input<GroupMembershipMemberKeyArgs> memberKey;
        private @Nullable Input<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey;
        private Input<List<GroupMembershipRoleArgs>> roles;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembershipArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.memberKey = defaults.memberKey;
    	      this.preferredMemberKey = defaults.preferredMemberKey;
    	      this.roles = defaults.roles;
        }

        public Builder setGroup(Input<String> group) {
            this.group = Objects.requireNonNull(group);
            return this;
        }

        public Builder setGroup(String group) {
            this.group = Input.of(Objects.requireNonNull(group));
            return this;
        }

        public Builder setMemberKey(@Nullable Input<GroupMembershipMemberKeyArgs> memberKey) {
            this.memberKey = memberKey;
            return this;
        }

        public Builder setMemberKey(@Nullable GroupMembershipMemberKeyArgs memberKey) {
            this.memberKey = Input.ofNullable(memberKey);
            return this;
        }

        public Builder setPreferredMemberKey(@Nullable Input<GroupMembershipPreferredMemberKeyArgs> preferredMemberKey) {
            this.preferredMemberKey = preferredMemberKey;
            return this;
        }

        public Builder setPreferredMemberKey(@Nullable GroupMembershipPreferredMemberKeyArgs preferredMemberKey) {
            this.preferredMemberKey = Input.ofNullable(preferredMemberKey);
            return this;
        }

        public Builder setRoles(Input<List<GroupMembershipRoleArgs>> roles) {
            this.roles = Objects.requireNonNull(roles);
            return this;
        }

        public Builder setRoles(List<GroupMembershipRoleArgs> roles) {
            this.roles = Input.of(Objects.requireNonNull(roles));
            return this;
        }
        public GroupMembershipArgs build() {
            return new GroupMembershipArgs(group, memberKey, preferredMemberKey, roles);
        }
    }
}
