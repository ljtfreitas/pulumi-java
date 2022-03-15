// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.osconfig.inputs.OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs Empty = new OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs();

    /**
     * A a file with this content. The size of the content is limited to 1024 characters.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    /**
     * A remote or local source.
     * 
     */
    @Import(name="file")
      private final @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGetArgs> file;

    public Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGetArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * Required. The absolute path of the file within the VM.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    /**
     * - 
     * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<String> permissions;

    public Output<String> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    /**
     * Required. Desired state of the file. Possible values: OS_POLICY_COMPLIANCE_STATE_UNSPECIFIED, COMPLIANT, NON_COMPLIANT, UNKNOWN, NO_OS_POLICIES_APPLICABLE
     * 
     */
    @Import(name="state", required=true)
      private final Output<String> state;

    public Output<String> getState() {
        return this.state;
    }

    public OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs(
        @Nullable Output<String> content,
        @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGetArgs> file,
        Output<String> path,
        @Nullable Output<String> permissions,
        Output<String> state) {
        this.content = content;
        this.file = file;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.permissions = permissions;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs() {
        this.content = Output.empty();
        this.file = Output.empty();
        this.path = Output.empty();
        this.permissions = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGetArgs> file;
        private Output<String> path;
        private @Nullable Output<String> permissions;
        private Output<String> state;

        public Builder() {
    	      // Empty
        }

        public Builder(OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.file = defaults.file;
    	      this.path = defaults.path;
    	      this.permissions = defaults.permissions;
    	      this.state = defaults.state;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }

        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
            return this;
        }

        public Builder file(@Nullable Output<OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGetArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable OsPolicyAssignmentOsPolicyResourceGroupResourceFileFileGetArgs file) {
            this.file = Output.ofNullable(file);
            return this;
        }

        public Builder path(Output<String> path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder path(String path) {
            this.path = Output.of(Objects.requireNonNull(path));
            return this;
        }

        public Builder permissions(@Nullable Output<String> permissions) {
            this.permissions = permissions;
            return this;
        }

        public Builder permissions(@Nullable String permissions) {
            this.permissions = Output.ofNullable(permissions);
            return this;
        }

        public Builder state(Output<String> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder state(String state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }
        public OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs build() {
            return new OsPolicyAssignmentOsPolicyResourceGroupResourceFileGetArgs(content, file, path, permissions, state);
        }
    }
}
