// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.storage.v1.inputs.ObjectAccessControlProjectTeamArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * An access-control entry.
 * 
 */
public final class ObjectAccessControlArgs extends com.pulumi.resources.ResourceArgs {

    public static final ObjectAccessControlArgs Empty = new ObjectAccessControlArgs();

    /**
     * The name of the bucket.
     * 
     */
    @Import(name="bucket")
    private @Nullable Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Optional<Output<String>> bucket() {
        return Optional.ofNullable(this.bucket);
    }

    /**
     * The domain associated with the entity, if any.
     * 
     */
    @Import(name="domain")
    private @Nullable Output<String> domain;

    /**
     * @return The domain associated with the entity, if any.
     * 
     */
    public Optional<Output<String>> domain() {
        return Optional.ofNullable(this.domain);
    }

    /**
     * The email address associated with the entity, if any.
     * 
     */
    @Import(name="email")
    private @Nullable Output<String> email;

    /**
     * @return The email address associated with the entity, if any.
     * 
     */
    public Optional<Output<String>> email() {
        return Optional.ofNullable(this.email);
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
    @Import(name="entity")
    private @Nullable Output<String> entity;

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
    public Optional<Output<String>> entity() {
        return Optional.ofNullable(this.entity);
    }

    /**
     * The ID for the entity, if any.
     * 
     */
    @Import(name="entityId")
    private @Nullable Output<String> entityId;

    /**
     * @return The ID for the entity, if any.
     * 
     */
    public Optional<Output<String>> entityId() {
        return Optional.ofNullable(this.entityId);
    }

    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    @Import(name="etag")
    private @Nullable Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @Import(name="generation")
    private @Nullable Output<String> generation;

    /**
     * @return The content generation of the object, if applied to an object.
     * 
     */
    public Optional<Output<String>> generation() {
        return Optional.ofNullable(this.generation);
    }

    /**
     * The ID of the access-control entry.
     * 
     */
    @Import(name="id")
    private @Nullable Output<String> id;

    /**
     * @return The ID of the access-control entry.
     * 
     */
    public Optional<Output<String>> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
     */
    @Import(name="kind")
    private @Nullable Output<String> kind;

    /**
     * @return The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
     */
    public Optional<Output<String>> kind() {
        return Optional.ofNullable(this.kind);
    }

    /**
     * The name of the object, if applied to an object.
     * 
     */
    @Import(name="object")
    private @Nullable Output<String> object;

    /**
     * @return The name of the object, if applied to an object.
     * 
     */
    public Optional<Output<String>> object() {
        return Optional.ofNullable(this.object);
    }

    /**
     * The project team associated with the entity, if any.
     * 
     */
    @Import(name="projectTeam")
    private @Nullable Output<ObjectAccessControlProjectTeamArgs> projectTeam;

    /**
     * @return The project team associated with the entity, if any.
     * 
     */
    public Optional<Output<ObjectAccessControlProjectTeamArgs>> projectTeam() {
        return Optional.ofNullable(this.projectTeam);
    }

    /**
     * The access permission for the entity.
     * 
     */
    @Import(name="role")
    private @Nullable Output<String> role;

    /**
     * @return The access permission for the entity.
     * 
     */
    public Optional<Output<String>> role() {
        return Optional.ofNullable(this.role);
    }

    /**
     * The link to this access-control entry.
     * 
     */
    @Import(name="selfLink")
    private @Nullable Output<String> selfLink;

    /**
     * @return The link to this access-control entry.
     * 
     */
    public Optional<Output<String>> selfLink() {
        return Optional.ofNullable(this.selfLink);
    }

    private ObjectAccessControlArgs() {}

    private ObjectAccessControlArgs(ObjectAccessControlArgs $) {
        this.bucket = $.bucket;
        this.domain = $.domain;
        this.email = $.email;
        this.entity = $.entity;
        this.entityId = $.entityId;
        this.etag = $.etag;
        this.generation = $.generation;
        this.id = $.id;
        this.kind = $.kind;
        this.object = $.object;
        this.projectTeam = $.projectTeam;
        this.role = $.role;
        this.selfLink = $.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObjectAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObjectAccessControlArgs $;

        public Builder() {
            $ = new ObjectAccessControlArgs();
        }

        public Builder(ObjectAccessControlArgs defaults) {
            $ = new ObjectAccessControlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(@Nullable Output<String> bucket) {
            $.bucket = bucket;
            return this;
        }

        /**
         * @param bucket The name of the bucket.
         * 
         * @return builder
         * 
         */
        public Builder bucket(String bucket) {
            return bucket(Output.of(bucket));
        }

        /**
         * @param domain The domain associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder domain(@Nullable Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param email The email address associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder email(@Nullable Output<String> email) {
            $.email = email;
            return this;
        }

        /**
         * @param email The email address associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder email(String email) {
            return email(Output.of(email));
        }

        /**
         * @param entity The entity holding the permission, in one of the following forms:
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
         * @return builder
         * 
         */
        public Builder entity(@Nullable Output<String> entity) {
            $.entity = entity;
            return this;
        }

        /**
         * @param entity The entity holding the permission, in one of the following forms:
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
         * @return builder
         * 
         */
        public Builder entity(String entity) {
            return entity(Output.of(entity));
        }

        /**
         * @param entityId The ID for the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder entityId(@Nullable Output<String> entityId) {
            $.entityId = entityId;
            return this;
        }

        /**
         * @param entityId The ID for the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder entityId(String entityId) {
            return entityId(Output.of(entityId));
        }

        /**
         * @param etag HTTP 1.1 Entity tag for the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        /**
         * @param etag HTTP 1.1 Entity tag for the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param generation The content generation of the object, if applied to an object.
         * 
         * @return builder
         * 
         */
        public Builder generation(@Nullable Output<String> generation) {
            $.generation = generation;
            return this;
        }

        /**
         * @param generation The content generation of the object, if applied to an object.
         * 
         * @return builder
         * 
         */
        public Builder generation(String generation) {
            return generation(Output.of(generation));
        }

        /**
         * @param id The ID of the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The ID of the access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param kind The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
         * 
         * @return builder
         * 
         */
        public Builder kind(@Nullable Output<String> kind) {
            $.kind = kind;
            return this;
        }

        /**
         * @param kind The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
         * 
         * @return builder
         * 
         */
        public Builder kind(String kind) {
            return kind(Output.of(kind));
        }

        /**
         * @param object The name of the object, if applied to an object.
         * 
         * @return builder
         * 
         */
        public Builder object(@Nullable Output<String> object) {
            $.object = object;
            return this;
        }

        /**
         * @param object The name of the object, if applied to an object.
         * 
         * @return builder
         * 
         */
        public Builder object(String object) {
            return object(Output.of(object));
        }

        /**
         * @param projectTeam The project team associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder projectTeam(@Nullable Output<ObjectAccessControlProjectTeamArgs> projectTeam) {
            $.projectTeam = projectTeam;
            return this;
        }

        /**
         * @param projectTeam The project team associated with the entity, if any.
         * 
         * @return builder
         * 
         */
        public Builder projectTeam(ObjectAccessControlProjectTeamArgs projectTeam) {
            return projectTeam(Output.of(projectTeam));
        }

        /**
         * @param role The access permission for the entity.
         * 
         * @return builder
         * 
         */
        public Builder role(@Nullable Output<String> role) {
            $.role = role;
            return this;
        }

        /**
         * @param role The access permission for the entity.
         * 
         * @return builder
         * 
         */
        public Builder role(String role) {
            return role(Output.of(role));
        }

        /**
         * @param selfLink The link to this access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(@Nullable Output<String> selfLink) {
            $.selfLink = selfLink;
            return this;
        }

        /**
         * @param selfLink The link to this access-control entry.
         * 
         * @return builder
         * 
         */
        public Builder selfLink(String selfLink) {
            return selfLink(Output.of(selfLink));
        }

        public ObjectAccessControlArgs build() {
            return $;
        }
    }

}
