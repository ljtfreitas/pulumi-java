// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.storage;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultObjectACLArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefaultObjectACLArgs Empty = new DefaultObjectACLArgs();

    /**
     * The name of the bucket it applies to.
     * 
     */
    @Import(name="bucket", required=true)
      private final Output<String> bucket;

    public Output<String> bucket() {
        return this.bucket;
    }

    /**
     * List of role/entity pairs in the form `ROLE:entity`.
     * See [GCS Object ACL documentation](https://cloud.google.com/storage/docs/json_api/v1/objectAccessControls) for more details.
     * Omitting the field is the same as providing an empty list.
     * 
     */
    @Import(name="roleEntities")
      private final @Nullable Output<List<String>> roleEntities;

    public Output<List<String>> roleEntities() {
        return this.roleEntities == null ? Codegen.empty() : this.roleEntities;
    }

    public DefaultObjectACLArgs(
        Output<String> bucket,
        @Nullable Output<List<String>> roleEntities) {
        this.bucket = Objects.requireNonNull(bucket, "expected parameter 'bucket' to be non-null");
        this.roleEntities = roleEntities;
    }

    private DefaultObjectACLArgs() {
        this.bucket = Codegen.empty();
        this.roleEntities = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultObjectACLArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> bucket;
        private @Nullable Output<List<String>> roleEntities;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultObjectACLArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.roleEntities = defaults.roleEntities;
        }

        public Builder bucket(Output<String> bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder bucket(String bucket) {
            this.bucket = Output.of(Objects.requireNonNull(bucket));
            return this;
        }
        public Builder roleEntities(@Nullable Output<List<String>> roleEntities) {
            this.roleEntities = roleEntities;
            return this;
        }
        public Builder roleEntities(@Nullable List<String> roleEntities) {
            this.roleEntities = Codegen.ofNullable(roleEntities);
            return this;
        }
        public Builder roleEntities(String... roleEntities) {
            return roleEntities(List.of(roleEntities));
        }        public DefaultObjectACLArgs build() {
            return new DefaultObjectACLArgs(bucket, roleEntities);
        }
    }
}
