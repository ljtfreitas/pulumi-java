// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudidentity.v1beta1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.cloudidentity.v1beta1.MembershipArgs;
import com.pulumi.googlenative.cloudidentity.v1beta1.outputs.EntityKeyResponse;
import com.pulumi.googlenative.cloudidentity.v1beta1.outputs.MembershipRoleResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a `Membership`.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudidentity/v1beta1:Membership")
public class Membership extends com.pulumi.resources.CustomResource {
    /**
     * The time when the `Membership` was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return The time when the `Membership` was created.
     * 
     */
    public Output<String> createTime() {
        return this.createTime;
    }
    @Export(name="groupId", type=String.class, parameters={})
    private Output<String> groupId;

    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
     */
    @Export(name="memberKey", type=EntityKeyResponse.class, parameters={})
    private Output<EntityKeyResponse> memberKey;

    /**
     * @return Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
     */
    public Output<EntityKeyResponse> memberKey() {
        return this.memberKey;
    }
    /**
     * The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership`. Shall be of the form `groups/{group_id}/memberships/{membership_id}`.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The [resource name](https://cloud.google.com/apis/design/resource_names) of the `Membership`. Shall be of the form `groups/{group_id}/memberships/{membership_id}`.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
     */
    @Export(name="preferredMemberKey", type=EntityKeyResponse.class, parameters={})
    private Output<EntityKeyResponse> preferredMemberKey;

    /**
     * @return Immutable. The `EntityKey` of the member. Either `member_key` or `preferred_member_key` must be set when calling MembershipsService.CreateMembership but not both; both shall be set when returned.
     * 
     */
    public Output<EntityKeyResponse> preferredMemberKey() {
        return this.preferredMemberKey;
    }
    /**
     * The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with the same `name`.
     * 
     */
    @Export(name="roles", type=List.class, parameters={MembershipRoleResponse.class})
    private Output<List<MembershipRoleResponse>> roles;

    /**
     * @return The `MembershipRole`s that apply to the `Membership`. If unspecified, defaults to a single `MembershipRole` with `name` `MEMBER`. Must not contain duplicate `MembershipRole`s with the same `name`.
     * 
     */
    public Output<List<MembershipRoleResponse>> roles() {
        return this.roles;
    }
    /**
     * The type of the membership.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the membership.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * The time when the `Membership` was last updated.
     * 
     */
    @Export(name="updateTime", type=String.class, parameters={})
    private Output<String> updateTime;

    /**
     * @return The time when the `Membership` was last updated.
     * 
     */
    public Output<String> updateTime() {
        return this.updateTime;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Membership(String name) {
        this(name, MembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Membership(String name, MembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Membership(String name, MembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1beta1:Membership", name, args == null ? MembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Membership(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1beta1:Membership", name, null, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Membership get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Membership(name, id, options);
    }
}
