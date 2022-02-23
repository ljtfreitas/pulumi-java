// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.storage_v1.inputs.ObjectAccessControlProjectTeamResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An access-control entry.
 * 
 */
public final class ObjectAccessControlResponse extends io.pulumi.resources.InvokeArgs {

    public static final ObjectAccessControlResponse Empty = new ObjectAccessControlResponse();

    /**
     * The name of the bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
      private final String bucket;

    public String getBucket() {
        return this.bucket;
    }

    /**
     * The domain associated with the entity, if any.
     * 
     */
    @InputImport(name="domain", required=true)
      private final String domain;

    public String getDomain() {
        return this.domain;
    }

    /**
     * The email address associated with the entity, if any.
     * 
     */
    @InputImport(name="email", required=true)
      private final String email;

    public String getEmail() {
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
    @InputImport(name="entity", required=true)
      private final String entity;

    public String getEntity() {
        return this.entity;
    }

    /**
     * The ID for the entity, if any.
     * 
     */
    @InputImport(name="entityId", required=true)
      private final String entityId;

    public String getEntityId() {
        return this.entityId;
    }

    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @InputImport(name="generation", required=true)
      private final String generation;

    public String getGeneration() {
        return this.generation;
    }

    /**
     * The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
     */
    @InputImport(name="kind", required=true)
      private final String kind;

    public String getKind() {
        return this.kind;
    }

    /**
     * The name of the object, if applied to an object.
     * 
     */
    @InputImport(name="object", required=true)
      private final String object;

    public String getObject() {
        return this.object;
    }

    /**
     * The project team associated with the entity, if any.
     * 
     */
    @InputImport(name="projectTeam", required=true)
      private final ObjectAccessControlProjectTeamResponse projectTeam;

    public ObjectAccessControlProjectTeamResponse getProjectTeam() {
        return this.projectTeam;
    }

    /**
     * The access permission for the entity.
     * 
     */
    @InputImport(name="role", required=true)
      private final String role;

    public String getRole() {
        return this.role;
    }

    /**
     * The link to this access-control entry.
     * 
     */
    @InputImport(name="selfLink", required=true)
      private final String selfLink;

    public String getSelfLink() {
        return this.selfLink;
    }

    public ObjectAccessControlResponse(
        String bucket,
        String domain,
        String email,
        String entity,
        String entityId,
        String etag,
        String generation,
        String kind,
        String object,
        ObjectAccessControlProjectTeamResponse projectTeam,
        String role,
        String selfLink) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.domain = Objects.requireNonNull(domain, "expected parameter 'domain' to be non-null");
        this.email = Objects.requireNonNull(email, "expected parameter 'email' to be non-null");
        this.entity = Objects.requireNonNull(entity, "expected parameter 'entity' to be non-null");
        this.entityId = Objects.requireNonNull(entityId, "expected parameter 'entityId' to be non-null");
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.generation = Objects.requireNonNull(generation, "expected parameter 'generation' to be non-null");
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
        this.object = Objects.requireNonNull(object, "expected parameter 'object' to be non-null");
        this.projectTeam = Objects.requireNonNull(projectTeam, "expected parameter 'projectTeam' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
        this.selfLink = Objects.requireNonNull(selfLink, "expected parameter 'selfLink' to be non-null");
    }

    private ObjectAccessControlResponse() {
        this.bucket = null;
        this.domain = null;
        this.email = null;
        this.entity = null;
        this.entityId = null;
        this.etag = null;
        this.generation = null;
        this.kind = null;
        this.object = null;
        this.projectTeam = null;
        this.role = null;
        this.selfLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String domain;
        private String email;
        private String entity;
        private String entityId;
        private String etag;
        private String generation;
        private String kind;
        private String object;
        private ObjectAccessControlProjectTeamResponse projectTeam;
        private String role;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.domain = defaults.domain;
    	      this.email = defaults.email;
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
    	      this.etag = defaults.etag;
    	      this.generation = defaults.generation;
    	      this.kind = defaults.kind;
    	      this.object = defaults.object;
    	      this.projectTeam = defaults.projectTeam;
    	      this.role = defaults.role;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setDomain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }

        public Builder setEmail(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }

        public Builder setEntity(String entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }

        public Builder setEntityId(String entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setGeneration(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setObject(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }

        public Builder setProjectTeam(ObjectAccessControlProjectTeamResponse projectTeam) {
            this.projectTeam = Objects.requireNonNull(projectTeam);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public ObjectAccessControlResponse build() {
            return new ObjectAccessControlResponse(bucket, domain, email, entity, entityId, etag, generation, kind, object, projectTeam, role, selfLink);
        }
    }
}
