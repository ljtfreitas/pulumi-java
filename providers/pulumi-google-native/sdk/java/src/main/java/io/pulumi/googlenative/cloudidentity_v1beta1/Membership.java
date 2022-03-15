// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudidentity_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudidentity_v1beta1.MembershipArgs;
import io.pulumi.googlenative.cloudidentity_v1beta1.outputs.EntityKeyResponse;
import io.pulumi.googlenative.cloudidentity_v1beta1.outputs.MembershipRoleResponse;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a `Membership`.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:cloudidentity/v1beta1:Membership")
public class Membership extends io.pulumi.resources.CustomResource {
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
    public Output<String> getCreateTime() {
        return this.createTime;
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
    public Output<EntityKeyResponse> getMemberKey() {
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
    public Output<String> getName() {
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
    public Output<EntityKeyResponse> getPreferredMemberKey() {
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
    public Output<List<MembershipRoleResponse>> getRoles() {
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
    public Output<String> getType() {
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
    public Output<String> getUpdateTime() {
        return this.updateTime;
    }

    public interface BuilderApplicator {
        public void apply(MembershipArgs.Builder a);
    }
    private static io.pulumi.googlenative.cloudidentity_v1beta1.MembershipArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.cloudidentity_v1beta1.MembershipArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Membership(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
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
    public Membership(String name, MembershipArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1beta1:Membership", name, args == null ? MembershipArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Membership(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudidentity/v1beta1:Membership", name, null, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Membership get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Membership(name, id, options);
    }
}
