// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceExecResourceArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceFileResourceArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourcePackageResourceArgs;
import io.pulumi.googlenative.osconfig_v1.inputs.OSPolicyResourceRepositoryResourceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An OS policy resource is used to define the desired state configuration and provides a specific functionality like installing/removing packages, executing a script etc. The system ensures that resources are always in their desired state by taking necessary actions if they have drifted from their desired state.
 * 
 */
public final class OSPolicyResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final OSPolicyResourceArgs Empty = new OSPolicyResourceArgs();

    /**
     * Exec resource
     * 
     */
    @InputImport(name="exec")
      private final @Nullable Input<OSPolicyResourceExecResourceArgs> exec;

    public Input<OSPolicyResourceExecResourceArgs> getExec() {
        return this.exec == null ? Input.empty() : this.exec;
    }

    /**
     * File resource
     * 
     */
    @InputImport(name="file")
      private final @Nullable Input<OSPolicyResourceFileResourceArgs> file;

    public Input<OSPolicyResourceFileResourceArgs> getFile() {
        return this.file == null ? Input.empty() : this.file;
    }

    /**
     * The id of the resource with the following restrictions: * Must contain only lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63 characters. * Must end with a number or a letter. * Must be unique within the OS policy.
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    /**
     * Package resource
     * 
     */
    @InputImport(name="pkg")
      private final @Nullable Input<OSPolicyResourcePackageResourceArgs> pkg;

    public Input<OSPolicyResourcePackageResourceArgs> getPkg() {
        return this.pkg == null ? Input.empty() : this.pkg;
    }

    /**
     * Package repository resource
     * 
     */
    @InputImport(name="repository")
      private final @Nullable Input<OSPolicyResourceRepositoryResourceArgs> repository;

    public Input<OSPolicyResourceRepositoryResourceArgs> getRepository() {
        return this.repository == null ? Input.empty() : this.repository;
    }

    public OSPolicyResourceArgs(
        @Nullable Input<OSPolicyResourceExecResourceArgs> exec,
        @Nullable Input<OSPolicyResourceFileResourceArgs> file,
        Input<String> id,
        @Nullable Input<OSPolicyResourcePackageResourceArgs> pkg,
        @Nullable Input<OSPolicyResourceRepositoryResourceArgs> repository) {
        this.exec = exec;
        this.file = file;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.pkg = pkg;
        this.repository = repository;
    }

    private OSPolicyResourceArgs() {
        this.exec = Input.empty();
        this.file = Input.empty();
        this.id = Input.empty();
        this.pkg = Input.empty();
        this.repository = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OSPolicyResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OSPolicyResourceExecResourceArgs> exec;
        private @Nullable Input<OSPolicyResourceFileResourceArgs> file;
        private Input<String> id;
        private @Nullable Input<OSPolicyResourcePackageResourceArgs> pkg;
        private @Nullable Input<OSPolicyResourceRepositoryResourceArgs> repository;

        public Builder() {
    	      // Empty
        }

        public Builder(OSPolicyResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exec = defaults.exec;
    	      this.file = defaults.file;
    	      this.id = defaults.id;
    	      this.pkg = defaults.pkg;
    	      this.repository = defaults.repository;
        }

        public Builder setExec(@Nullable Input<OSPolicyResourceExecResourceArgs> exec) {
            this.exec = exec;
            return this;
        }

        public Builder setExec(@Nullable OSPolicyResourceExecResourceArgs exec) {
            this.exec = Input.ofNullable(exec);
            return this;
        }

        public Builder setFile(@Nullable Input<OSPolicyResourceFileResourceArgs> file) {
            this.file = file;
            return this;
        }

        public Builder setFile(@Nullable OSPolicyResourceFileResourceArgs file) {
            this.file = Input.ofNullable(file);
            return this;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public Builder setPkg(@Nullable Input<OSPolicyResourcePackageResourceArgs> pkg) {
            this.pkg = pkg;
            return this;
        }

        public Builder setPkg(@Nullable OSPolicyResourcePackageResourceArgs pkg) {
            this.pkg = Input.ofNullable(pkg);
            return this;
        }

        public Builder setRepository(@Nullable Input<OSPolicyResourceRepositoryResourceArgs> repository) {
            this.repository = repository;
            return this;
        }

        public Builder setRepository(@Nullable OSPolicyResourceRepositoryResourceArgs repository) {
            this.repository = Input.ofNullable(repository);
            return this;
        }
        public OSPolicyResourceArgs build() {
            return new OSPolicyResourceArgs(exec, file, id, pkg, repository);
        }
    }
}
