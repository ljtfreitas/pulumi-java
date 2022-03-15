// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.storage_v1.BucketAccessControlArgs;
import io.pulumi.googlenative.storage_v1.outputs.BucketAccessControlProjectTeamResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new ACL entry on the specified bucket.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:storage/v1:BucketAccessControl")
public class BucketAccessControl extends io.pulumi.resources.CustomResource {
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> getBucket() {
        return this.bucket;
    }
    /**
     * The domain associated with the entity, if any.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain associated with the entity, if any.
     * 
     */
    public Output<String> getDomain() {
        return this.domain;
    }
    /**
     * The email address associated with the entity, if any.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address associated with the entity, if any.
     * 
     */
    public Output<String> getEmail() {
        return this.email;
    }
    /**
     * The entity holding the permission, in one of the following forms:
     * - user-userId
     * - user-email
     * - group-groupId
     * - group-email
     * - domain-domain
     * - project-team-projectId
     * - allUsers
     * - allAuthenticatedUsers Examples:
     * - The user liz@example.com would be user-liz@example.com.
     * - The group example@googlegroups.com would be group-example@googlegroups.com.
     * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
     * 
     */
    @Export(name="entity", type=String.class, parameters={})
    private Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * - user-userId
     * - user-email
     * - group-groupId
     * - group-email
     * - domain-domain
     * - project-team-projectId
     * - allUsers
     * - allAuthenticatedUsers Examples:
     * - The user liz@example.com would be user-liz@example.com.
     * - The group example@googlegroups.com would be group-example@googlegroups.com.
     * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
     * 
     */
    public Output<String> getEntity() {
        return this.entity;
    }
    /**
     * The ID for the entity, if any.
     * 
     */
    @Export(name="entityId", type=String.class, parameters={})
    private Output<String> entityId;

    /**
     * @return The ID for the entity, if any.
     * 
     */
    public Output<String> getEntityId() {
        return this.entityId;
    }
    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    public Output<String> getEtag() {
        return this.etag;
    }
    /**
     * The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For bucket access control entries, this is always storage#bucketAccessControl.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * The project team associated with the entity, if any.
     * 
     */
    @Export(name="projectTeam", type=BucketAccessControlProjectTeamResponse.class, parameters={})
    private Output<BucketAccessControlProjectTeamResponse> projectTeam;

    /**
     * @return The project team associated with the entity, if any.
     * 
     */
    public Output<BucketAccessControlProjectTeamResponse> getProjectTeam() {
        return this.projectTeam;
    }
    /**
     * The access permission for the entity.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The access permission for the entity.
     * 
     */
    public Output<String> getRole() {
        return this.role;
    }
    /**
     * The link to this access-control entry.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The link to this access-control entry.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }

    public interface BuilderApplicator {
        public void apply(BucketAccessControlArgs.Builder a);
    }
    private static io.pulumi.googlenative.storage_v1.BucketAccessControlArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.storage_v1.BucketAccessControlArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BucketAccessControl(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketAccessControl(String name) {
        this(name, BucketAccessControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketAccessControl(String name, BucketAccessControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketAccessControl(String name, BucketAccessControlArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketAccessControl", name, args == null ? BucketAccessControlArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BucketAccessControl(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:BucketAccessControl", name, null, makeResourceOptions(options, id));
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
    public static BucketAccessControl get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BucketAccessControl(name, id, options);
    }
}
