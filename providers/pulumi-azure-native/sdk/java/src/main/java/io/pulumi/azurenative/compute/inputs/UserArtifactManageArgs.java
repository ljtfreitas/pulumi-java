// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserArtifactManageArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserArtifactManageArgs Empty = new UserArtifactManageArgs();

    /**
     * Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
     * 
     */
    @Import(name="install", required=true)
      private final Output<String> install;

    public Output<String> getInstall() {
        return this.install;
    }

    /**
     * Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
     * 
     */
    @Import(name="remove", required=true)
      private final Output<String> remove;

    public Output<String> getRemove() {
        return this.remove;
    }

    /**
     * Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
     * 
     */
    @Import(name="update")
      private final @Nullable Output<String> update;

    public Output<String> getUpdate() {
        return this.update == null ? Output.empty() : this.update;
    }

    public UserArtifactManageArgs(
        Output<String> install,
        Output<String> remove,
        @Nullable Output<String> update) {
        this.install = Objects.requireNonNull(install, "expected parameter 'install' to be non-null");
        this.remove = Objects.requireNonNull(remove, "expected parameter 'remove' to be non-null");
        this.update = update;
    }

    private UserArtifactManageArgs() {
        this.install = Output.empty();
        this.remove = Output.empty();
        this.update = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArtifactManageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> install;
        private Output<String> remove;
        private @Nullable Output<String> update;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArtifactManageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.install = defaults.install;
    	      this.remove = defaults.remove;
    	      this.update = defaults.update;
        }

        public Builder install(Output<String> install) {
            this.install = Objects.requireNonNull(install);
            return this;
        }

        public Builder install(String install) {
            this.install = Output.of(Objects.requireNonNull(install));
            return this;
        }

        public Builder remove(Output<String> remove) {
            this.remove = Objects.requireNonNull(remove);
            return this;
        }

        public Builder remove(String remove) {
            this.remove = Output.of(Objects.requireNonNull(remove));
            return this;
        }

        public Builder update(@Nullable Output<String> update) {
            this.update = update;
            return this;
        }

        public Builder update(@Nullable String update) {
            this.update = Output.ofNullable(update);
            return this;
        }
        public UserArtifactManageArgs build() {
            return new UserArtifactManageArgs(install, remove, update);
        }
    }
}
