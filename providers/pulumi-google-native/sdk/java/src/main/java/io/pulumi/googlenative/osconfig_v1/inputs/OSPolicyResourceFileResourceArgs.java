// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.osconfig_v1.enums.OSPolicyResourceFileResourceState;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A resource that manages the state of a file.
 * 
 */
public final class OSPolicyResourceFileResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceFileResourceArgs Empty = new OSPolicyResourceFileResourceArgs();

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
      private final @Nullable Output<OSPolicyResourceFileArgs> file;

    public Output<OSPolicyResourceFileArgs> getFile() {
        return this.file == null ? Output.empty() : this.file;
    }

    /**
     * The absolute path of the file within the VM.
     * 
     */
    @Import(name="path", required=true)
      private final Output<String> path;

    public Output<String> getPath() {
        return this.path;
    }

    /**
     * Consists of three octal digits which represent, in order, the permissions of the owner, group, and other users for the file (similarly to the numeric mode used in the linux chmod utility). Each digit represents a three bit number with the 4 bit corresponding to the read permissions, the 2 bit corresponds to the write bit, and the one bit corresponds to the execute permission. Default behavior is 755. Below are some examples of permissions and their associated values: read, write, and execute: 7 read and execute: 5 read and write: 6 read only: 4
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<String> permissions;

    public Output<String> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    /**
     * Desired state of the file.
     * 
     */
    @Import(name="state", required=true)
      private final Output<OSPolicyResourceFileResourceState> state;

    public Output<OSPolicyResourceFileResourceState> getState() {
        return this.state;
    }

    public OSPolicyResourceFileResourceArgs(
        @Nullable Output<String> content,
        @Nullable Output<OSPolicyResourceFileArgs> file,
        Output<String> path,
        @Nullable Output<String> permissions,
        Output<OSPolicyResourceFileResourceState> state) {
        this.content = content;
        this.file = file;
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.permissions = permissions;
        this.state = Objects.requireNonNull(state, "expected parameter 'state' to be non-null");
    }

    private OSPolicyResourceFileResourceArgs() {
        this.content = Output.empty();
        this.file = Output.empty();
        this.path = Output.empty();
        this.permissions = Output.empty();
        this.state = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceFileResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<OSPolicyResourceFileArgs> file;
        private Output<String> path;
        private @Nullable Output<String> permissions;
        private Output<OSPolicyResourceFileResourceState> state;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceFileResourceArgs defaults) {
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

        public Builder file(@Nullable Output<OSPolicyResourceFileArgs> file) {
            this.file = file;
            return this;
        }

        public Builder file(@Nullable OSPolicyResourceFileArgs file) {
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

        public Builder state(Output<OSPolicyResourceFileResourceState> state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder state(OSPolicyResourceFileResourceState state) {
            this.state = Output.of(Objects.requireNonNull(state));
            return this;
        }
        public OSPolicyResourceFileResourceArgs build() {
            return new OSPolicyResourceFileResourceArgs(content, file, path, permissions, state);
        }
    }
}
