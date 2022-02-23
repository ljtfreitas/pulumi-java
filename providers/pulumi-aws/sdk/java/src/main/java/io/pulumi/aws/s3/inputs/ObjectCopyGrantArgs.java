// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectCopyGrantArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectCopyGrantArgs Empty = new ObjectCopyGrantArgs();

    /**
     * Email address of the grantee. Used only when `type` is `AmazonCustomerByEmail`.
     * 
     */
    @InputImport(name="email")
    private final @Nullable Input<String> email;

    public Input<String> getEmail() {
        return this.email == null ? Input.empty() : this.email;
    }

    /**
     * The canonical user ID of the grantee. Used only when `type` is `CanonicalUser`.
     * 
     */
    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * List of permissions to grant to grantee. Valid values are `READ`, `READ_ACP`, `WRITE_ACP`, `FULL_CONTROL`.
     * 
     */
    @InputImport(name="permissions", required=true)
    private final Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions;
    }

    /**
     * - Type of grantee. Valid values are `CanonicalUser`, `Group`, and `AmazonCustomerByEmail`.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    /**
     * URI of the grantee group. Used only when `type` is `Group`.
     * 
     */
    @InputImport(name="uri")
    private final @Nullable Input<String> uri;

    public Input<String> getUri() {
        return this.uri == null ? Input.empty() : this.uri;
    }

    public ObjectCopyGrantArgs(
        @Nullable Input<String> email,
        @Nullable Input<String> id,
        Input<List<String>> permissions,
        Input<String> type,
        @Nullable Input<String> uri) {
        this.email = email;
        this.id = id;
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.uri = uri;
    }

    private ObjectCopyGrantArgs() {
        this.email = Input.empty();
        this.id = Input.empty();
        this.permissions = Input.empty();
        this.type = Input.empty();
        this.uri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectCopyGrantArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> email;
        private @Nullable Input<String> id;
        private Input<List<String>> permissions;
        private Input<String> type;
        private @Nullable Input<String> uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectCopyGrantArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.id = defaults.id;
    	      this.permissions = defaults.permissions;
    	      this.type = defaults.type;
    	      this.uri = defaults.uri;
        }

        public Builder setEmail(@Nullable Input<String> email) {
            this.email = email;
            return this;
        }

        public Builder setEmail(@Nullable String email) {
            this.email = Input.ofNullable(email);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setPermissions(Input<List<String>> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Input.of(Objects.requireNonNull(permissions));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setUri(@Nullable Input<String> uri) {
            this.uri = uri;
            return this;
        }

        public Builder setUri(@Nullable String uri) {
            this.uri = Input.ofNullable(uri);
            return this;
        }
        public ObjectCopyGrantArgs build() {
            return new ObjectCopyGrantArgs(email, id, permissions, type, uri);
        }
    }
}
