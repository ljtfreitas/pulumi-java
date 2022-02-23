// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BucketACLArgs extends io.pulumi.resources.ResourceArgs {

    public static final BucketACLArgs Empty = new BucketACLArgs();

    /**
     * The name of the bucket it applies to.
     * 
     */
    @InputImport(name="bucket", required=true)
        private final Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket;
    }

    /**
     * Configure this ACL to be the default ACL.
     * 
     */
    @InputImport(name="defaultAcl")
        private final @Nullable Input<String> defaultAcl;

    public Input<String> getDefaultAcl() {
        return this.defaultAcl == null ? Input.empty() : this.defaultAcl;
    }

    /**
     * The [canned GCS ACL](https://cloud.google.com/storage/docs/access-control/lists#predefined-acl) to apply. Must be set if `role_entity` is not.
     * 
     */
    @InputImport(name="predefinedAcl")
        private final @Nullable Input<String> predefinedAcl;

    public Input<String> getPredefinedAcl() {
        return this.predefinedAcl == null ? Input.empty() : this.predefinedAcl;
    }

    /**
     * List of role/entity pairs in the form `ROLE:entity`. See [GCS Bucket ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/bucketAccessControls)  for more details. Must be set if `predefined_acl` is not.
     * 
     */
    @InputImport(name="roleEntities")
        private final @Nullable Input<List<String>> roleEntities;

    public Input<List<String>> getRoleEntities() {
        return this.roleEntities == null ? Input.empty() : this.roleEntities;
    }

    public BucketACLArgs(
        Input<String> bucket,
        @Nullable Input<String> defaultAcl,
        @Nullable Input<String> predefinedAcl,
        @Nullable Input<List<String>> roleEntities) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.defaultAcl = defaultAcl;
        this.predefinedAcl = predefinedAcl;
        this.roleEntities = roleEntities;
    }

    private BucketACLArgs() {
        this.bucket = Input.empty();
        this.defaultAcl = Input.empty();
        this.predefinedAcl = Input.empty();
        this.roleEntities = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> bucket;
        private @Nullable Input<String> defaultAcl;
        private @Nullable Input<String> predefinedAcl;
        private @Nullable Input<List<String>> roleEntities;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.defaultAcl = defaults.defaultAcl;
    	      this.predefinedAcl = defaults.predefinedAcl;
    	      this.roleEntities = defaults.roleEntities;
        }

        public Builder setBucket(Input<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }

        public Builder setBucket(String bucket) {
            this.bucket = Input.of(Objects.requireNonNull(bucket));
            return this;
        }

        public Builder setDefaultAcl(@Nullable Input<String> defaultAcl) {
            this.defaultAcl = defaultAcl;
            return this;
        }

        public Builder setDefaultAcl(@Nullable String defaultAcl) {
            this.defaultAcl = Input.ofNullable(defaultAcl);
            return this;
        }

        public Builder setPredefinedAcl(@Nullable Input<String> predefinedAcl) {
            this.predefinedAcl = predefinedAcl;
            return this;
        }

        public Builder setPredefinedAcl(@Nullable String predefinedAcl) {
            this.predefinedAcl = Input.ofNullable(predefinedAcl);
            return this;
        }

        public Builder setRoleEntities(@Nullable Input<List<String>> roleEntities) {
            this.roleEntities = roleEntities;
            return this;
        }

        public Builder setRoleEntities(@Nullable List<String> roleEntities) {
            this.roleEntities = Input.ofNullable(roleEntities);
            return this;
        }
        public BucketACLArgs build() {
            return new BucketACLArgs(bucket, defaultAcl, predefinedAcl, roleEntities);
        }
    }
}
