// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserArtifactManageResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserArtifactManageResponse Empty = new UserArtifactManageResponse();

    /**
     * Required. The path and arguments to install the gallery application. This is limited to 4096 characters.
     * 
     */
    @InputImport(name="install", required=true)
    private final String install;

    public String getInstall() {
        return this.install;
    }

    /**
     * Required. The path and arguments to remove the gallery application. This is limited to 4096 characters.
     * 
     */
    @InputImport(name="remove", required=true)
    private final String remove;

    public String getRemove() {
        return this.remove;
    }

    /**
     * Optional. The path and arguments to update the gallery application. If not present, then update operation will invoke remove command on the previous version and install command on the current version of the gallery application. This is limited to 4096 characters.
     * 
     */
    @InputImport(name="update")
    private final @Nullable String update;

    public Optional<String> getUpdate() {
        return this.update == null ? Optional.empty() : Optional.ofNullable(this.update);
    }

    public UserArtifactManageResponse(
        String install,
        String remove,
        @Nullable String update) {
        this.install = Objects.requireNonNull(install, "expected parameter 'install' to be non-null");
        this.remove = Objects.requireNonNull(remove, "expected parameter 'remove' to be non-null");
        this.update = update;
    }

    private UserArtifactManageResponse() {
        this.install = null;
        this.remove = null;
        this.update = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserArtifactManageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String install;
        private String remove;
        private @Nullable String update;

        public Builder() {
    	      // Empty
        }

        public Builder(UserArtifactManageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.install = defaults.install;
    	      this.remove = defaults.remove;
    	      this.update = defaults.update;
        }

        public Builder setInstall(String install) {
            this.install = Objects.requireNonNull(install);
            return this;
        }

        public Builder setRemove(String remove) {
            this.remove = Objects.requireNonNull(remove);
            return this;
        }

        public Builder setUpdate(@Nullable String update) {
            this.update = update;
            return this;
        }

        public UserArtifactManageResponse build() {
            return new UserArtifactManageResponse(install, remove, update);
        }
    }
}
