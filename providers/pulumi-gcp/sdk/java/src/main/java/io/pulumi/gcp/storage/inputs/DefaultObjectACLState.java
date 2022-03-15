// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultObjectACLState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultObjectACLState Empty = new DefaultObjectACLState();

    /**
     * The name of the bucket it applies to.
     * 
     */
    @Import(name="bucket")
      private final @Nullable Output<String> bucket;

    public Output<String> getBucket() {
        return this.bucket == null ? Output.empty() : this.bucket;
    }

    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     * 
     */
    @Import(name="roleEntities")
      private final @Nullable Output<List<String>> roleEntities;

    public Output<List<String>> getRoleEntities() {
        return this.roleEntities == null ? Output.empty() : this.roleEntities;
    }

    public DefaultObjectACLState(
        @Nullable Output<String> bucket,
        @Nullable Output<List<String>> roleEntities) {
        this.bucket = bucket;
        this.roleEntities = roleEntities;
    }

    private DefaultObjectACLState() {
        this.bucket = Output.empty();
        this.roleEntities = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectACLState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> bucket;
        private @Nullable Output<List<String>> roleEntities;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectACLState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.roleEntities = defaults.roleEntities;
        }

        public Builder bucket(@Nullable Output<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder bucket(@Nullable String bucket) {
            this.bucket = Output.ofNullable(bucket);
            return this;
        }

        public Builder roleEntities(@Nullable Output<List<String>> roleEntities) {
            this.roleEntities = roleEntities;
            return this;
        }

        public Builder roleEntities(@Nullable List<String> roleEntities) {
            this.roleEntities = Output.ofNullable(roleEntities);
            return this;
        }
        public DefaultObjectACLState build() {
            return new DefaultObjectACLState(bucket, roleEntities);
        }
    }
}
