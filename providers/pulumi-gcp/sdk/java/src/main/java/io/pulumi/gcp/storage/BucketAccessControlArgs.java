// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketAccessControlArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketAccessControlArgs Empty = new BucketAccessControlArgs();

    /**
     * The name of the bucket.
     * 
     */
    @InputImport(name="bucket", required=true)
        private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * The entity holding the permission, in one of the following forms:
     * user-userId
     * user-email
     * group-groupId
     * group-email
     * domain-domain
     * project-team-projectId
     * allUsers
     * allAuthenticatedUsers
     * Examples:
     * The user liz@example.com would be user-liz@example.com.
     * The group example@googlegroups.com would be
     * group-example@googlegroups.com.
     * To refer to all members of the Google Apps for Business domain
     * example.com, the entity would be domain-example.com.
     * 
     */
    @InputImport(name="entity", required=true)
        private final Input<String> entity;

    public Input<String> getEntity() {
        return this.entity;
    }

    /**
     * The access permission for the entity.
     * Possible values are `OWNER`, `READER`, and `WRITER`.
     * 
     */
    @InputImport(name="role")
        private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public BucketAccessControlArgs(
        Input<String> bucket,
        Input<String> entity,
        @Nullable Input<String> role) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.entity = Objects.requireNonNull(entity, "expected parameter 'entity' to be non-null");
        this.role = role;
    }

    private BucketAccessControlArgs() {
        this.bucket = Input.empty();
        this.entity = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketAccessControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private Input<String> entity;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketAccessControlArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.entity = defaults.entity;
    	      this.role = defaults.role;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setEntity(Input<String> entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }

        public Builder setEntity(String entity) {
            this.entity = Input.of(Objects.requireNonNull(entity));
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public BucketAccessControlArgs build() {
            return new BucketAccessControlArgs(bucket, entity, role);
        }
    }
}
