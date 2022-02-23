// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PatchDeploymentPatchConfigApt {
    /**
     * List of KBs to exclude from update.
     * 
     */
    private final @Nullable List<String> excludes;
    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated.
     * If these packages are not installed, they will be ignored. This field cannot be specified with
     * any other patch configuration fields.
     * 
     */
    private final @Nullable List<String> exclusivePackages;
    /**
     * By changing the type to DIST, the patching is performed using apt-get dist-upgrade instead.
     * Possible values are `DIST` and `UPGRADE`.
     * 
     */
    private final @Nullable String type;

    @OutputCustomType.Constructor({"excludes","exclusivePackages","type"})
    private PatchDeploymentPatchConfigApt(
        @Nullable List<String> excludes,
        @Nullable List<String> exclusivePackages,
        @Nullable String type) {
        this.excludes = excludes;
        this.exclusivePackages = exclusivePackages;
        this.type = type;
    }

    /**
     * List of KBs to exclude from update.
     * 
     */
    public List<String> getExcludes() {
        return this.excludes == null ? List.of() : this.excludes;
    }
    /**
     * An exclusive list of packages to be updated. These are the only packages that will be updated.
     * If these packages are not installed, they will be ignored. This field cannot be specified with
     * any other patch configuration fields.
     * 
     */
    public List<String> getExclusivePackages() {
        return this.exclusivePackages == null ? List.of() : this.exclusivePackages;
    }
    /**
     * By changing the type to DIST, the patching is performed using apt-get dist-upgrade instead.
     * Possible values are `DIST` and `UPGRADE`.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentPatchConfigApt defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludes;
        private @Nullable List<String> exclusivePackages;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentPatchConfigApt defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludes = defaults.excludes;
    	      this.exclusivePackages = defaults.exclusivePackages;
    	      this.type = defaults.type;
        }

        public Builder setExcludes(@Nullable List<String> excludes) {
            this.excludes = excludes;
            return this;
        }

        public Builder setExclusivePackages(@Nullable List<String> exclusivePackages) {
            this.exclusivePackages = exclusivePackages;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }
        public PatchDeploymentPatchConfigApt build() {
            return new PatchDeploymentPatchConfigApt(excludes, exclusivePackages, type);
        }
    }
}
